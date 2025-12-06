package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraScelidosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelScelidosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer hipsOsteoderms;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer hipsOsteoderms2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tailOsteoderms;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer tailOsteoderms2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail2Osteoderms;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer tail2Osteoderms2;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail3Osteoderms;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer tail3Osteoderms2;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail4Osteoderms;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer tail4Osteoderms2;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail5Osteoderms;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer tail5Osteoderms2;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer bodyOsteoderms;
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
    private final AdvancedModelRenderer bodyOsteoderms2;
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
    private final AdvancedModelRenderer cube_r83;
    private final AdvancedModelRenderer cube_r84;
    private final AdvancedModelRenderer cube_r85;
    private final AdvancedModelRenderer cube_r86;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r87;
    private final AdvancedModelRenderer cube_r88;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer cube_r89;
    private final AdvancedModelRenderer cube_r90;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r91;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer cube_r92;
    private final AdvancedModelRenderer cube_r93;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r94;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer chestOsteoderms;
    private final AdvancedModelRenderer cube_r95;
    private final AdvancedModelRenderer cube_r96;
    private final AdvancedModelRenderer cube_r97;
    private final AdvancedModelRenderer cube_r98;
    private final AdvancedModelRenderer cube_r99;
    private final AdvancedModelRenderer cube_r100;
    private final AdvancedModelRenderer cube_r101;
    private final AdvancedModelRenderer chestOsteoderms2;
    private final AdvancedModelRenderer cube_r102;
    private final AdvancedModelRenderer cube_r103;
    private final AdvancedModelRenderer cube_r104;
    private final AdvancedModelRenderer cube_r105;
    private final AdvancedModelRenderer cube_r106;
    private final AdvancedModelRenderer cube_r107;
    private final AdvancedModelRenderer cube_r108;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r109;
    private final AdvancedModelRenderer cube_r110;
    private final AdvancedModelRenderer bipartiteOsteoderm3;
    private final AdvancedModelRenderer cube_r111;
    private final AdvancedModelRenderer cube_r112;
    private final AdvancedModelRenderer bipartiteOsteoderm4;
    private final AdvancedModelRenderer cube_r113;
    private final AdvancedModelRenderer cube_r114;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r115;
    private final AdvancedModelRenderer cube_r116;
    private final AdvancedModelRenderer cube_r117;
    private final AdvancedModelRenderer bipartiteOsteoderm2;
    private final AdvancedModelRenderer cube_r118;
    private final AdvancedModelRenderer cube_r119;
    private final AdvancedModelRenderer bipartiteOsteoderm5;
    private final AdvancedModelRenderer cube_r120;
    private final AdvancedModelRenderer cube_r121;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r122;
    private final AdvancedModelRenderer bipartiteOsteoderm;
    private final AdvancedModelRenderer cube_r123;
    private final AdvancedModelRenderer cube_r124;
    private final AdvancedModelRenderer cube_r125;
    private final AdvancedModelRenderer cube_r126;
    private final AdvancedModelRenderer cube_r127;
    private final AdvancedModelRenderer cube_r128;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r129;
    private final AdvancedModelRenderer cube_r130;
    private final AdvancedModelRenderer cube_r131;
    private final AdvancedModelRenderer cube_r132;
    private final AdvancedModelRenderer cube_r133;
    private final AdvancedModelRenderer cube_r134;
    private final AdvancedModelRenderer cube_r135;
    private final AdvancedModelRenderer cube_r136;
    private final AdvancedModelRenderer occipitalhorn;
    private final AdvancedModelRenderer cube_r137;
    private final AdvancedModelRenderer cube_r138;
    private final AdvancedModelRenderer occipitalhorn2;
    private final AdvancedModelRenderer cube_r139;
    private final AdvancedModelRenderer cube_r140;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r141;
    private final AdvancedModelRenderer cube_r142;

    private ModelAnimator animator;

    public ModelScelidosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.setRotateAngle(hips, 0.0305F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 25, -5.0F, -1.0F, -1.0F, 10, 13, 11, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(6.0F, 3.7F, 3.7F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.432F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 62, -2.0F, -3.0F, -2.9F, 3, 11, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.2381F, -0.4822F, 0.8768F);
        this.leftLeg.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0007F, -0.0013F, -0.4648F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 99, 98, -0.2F, 0.0F, -3.5F, 1, 0, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.1F, 2.0F, 0.6F);
        this.leftLeg.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.1745F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 73, 86, -0.4F, -0.9F, -3.5F, 1, 0, 7, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 66, 96, -0.3F, 2.1F, -1.5F, 1, 0, 5, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 72, 18, -0.2F, 0.4F, -2.5F, 1, 0, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.8906F, 5.5548F, 1.3705F);
        this.leftLeg.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0734F, -0.01F, 0.4749F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 89, 45, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.0004F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.1649F, 5.0868F, -1.6221F);
        this.leftLeg.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0139F, -0.01F, 0.4749F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 89, 49, -0.5F, 0.0F, -1.0F, 1, 1, 2, -0.0004F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(-0.6F, 8.0F, -2.4F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.8508F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 44, 86, -3.0F, 0.0F, -0.3F, 4, 10, 4, 0.0F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 29, 50, 0.7412F, 2.2062F, 0.7769F, 1, 6, 0, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.2412F, 5.0F, -0.2659F);
        this.leftLeg2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.6981F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 78, 5, -0.5F, -5.0F, 0.0F, 1, 8, 0, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.5F, 9.6F, 3.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.0472F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 38, 57, -2.0F, 0.0075F, -2.3807F, 3, 6, 3, 0.0F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 5.5075F, -0.3807F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.5934F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 21, 85, -3.0F, -0.6F, -5.0F, 5, 2, 6, 0.003F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-6.0F, 3.7F, 3.7F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.432F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 62, -1.0F, -3.0F, -2.9F, 3, 11, 7, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.2381F, -0.4822F, 0.8768F);
        this.rightLeg.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0007F, 0.0013F, 0.4648F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 99, 98, -0.8F, 0.0F, -3.5F, 1, 0, 6, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.1F, 2.0F, 0.6F);
        this.rightLeg.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.1745F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 73, 86, -0.6F, -0.9F, -3.5F, 1, 0, 7, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 66, 96, -0.7F, 2.1F, -1.5F, 1, 0, 5, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 72, 18, -0.8F, 0.4F, -2.5F, 1, 0, 6, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.8906F, 5.5548F, 1.3705F);
        this.rightLeg.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0734F, 0.01F, -0.4749F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 89, 45, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.0004F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.1649F, 5.0868F, -1.6221F);
        this.rightLeg.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0139F, 0.01F, -0.4749F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 89, 49, -0.5F, 0.0F, -1.0F, 1, 1, 2, -0.0004F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.6F, 8.0F, -2.4F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.8508F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 44, 86, -1.0F, 0.0F, -0.3F, 4, 10, 4, 0.0F, true));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 29, 50, -1.7412F, 2.2062F, 0.7769F, 1, 6, 0, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.2412F, 5.0F, -0.2659F);
        this.rightLeg2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.6981F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 78, 5, -0.5F, -5.0F, 0.0F, 1, 8, 0, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.5F, 9.6F, 3.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.0472F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 38, 57, -1.0F, 0.0075F, -2.3807F, 3, 6, 3, 0.0F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 5.5075F, -0.3807F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.5934F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 21, 85, -2.0F, -0.6F, -5.0F, 5, 2, 6, 0.003F, true));

        this.hipsOsteoderms = new AdvancedModelRenderer(this);
        this.hipsOsteoderms.setRotationPoint(1.4F, -0.9589F, 5.103F);
        this.hips.addChild(hipsOsteoderms);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hipsOsteoderms.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0524F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 78, 23, 0.0F, -0.7F, -5.0F, 0, 2, 10, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.0844F, 0.6505F, -5.0341F);
        this.hipsOsteoderms.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.118F, -0.0342F, 0.3052F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 84, 58, -0.0787F, -1.3105F, -0.0268F, 0, 1, 10, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(4.1235F, 0.7023F, -0.7064F);
        this.hipsOsteoderms.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0714F, -0.1243F, -0.465F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 56, 33, -2.1F, 0.4F, -4.0F, 2, 0, 5, 0.0F, false));

        this.hipsOsteoderms2 = new AdvancedModelRenderer(this);
        this.hipsOsteoderms2.setRotationPoint(-1.4F, -0.9589F, 5.103F);
        this.hips.addChild(hipsOsteoderms2);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hipsOsteoderms2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0524F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 78, 23, 0.0F, -0.7F, -5.0F, 0, 2, 10, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.0844F, 0.6505F, -5.0341F);
        this.hipsOsteoderms2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.118F, 0.0342F, -0.3052F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 84, 58, 0.0787F, -1.3105F, -0.0268F, 0, 1, 10, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-4.1235F, 0.7023F, -0.7064F);
        this.hipsOsteoderms2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0714F, 0.1243F, 0.465F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 56, 33, 0.1F, 0.4F, -4.0F, 2, 0, 5, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 2.0F, 9.5F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.2182F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 52, 57, -4.0F, -2.0632F, -0.9231F, 8, 9, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 46, 73, -3.0F, -2.0632F, 5.0769F, 6, 6, 6, 0.0F, false));

        this.tailOsteoderms = new AdvancedModelRenderer(this);
        this.tailOsteoderms.setRotationPoint(1.4F, -2.2632F, 0.0769F);
        this.tail.addChild(tailOsteoderms);
        this.tailOsteoderms.cubeList.add(new ModelBox(tailOsteoderms, 86, 98, -0.4F, -0.8F, 5.0F, 0, 2, 6, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailOsteoderms.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.0873F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 25, 0.0F, -1.0F, 0.0F, 0, 2, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.6447F, 6.0323F, 1.8055F);
        this.tailOsteoderms.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0151F, 0.5853F, 0.4205F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 65, 74, -7.0041F, -2.0517F, 3.2848F, 2, 1, 3, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 64, 39, -4.6219F, -1.658F, 0.9782F, 2, 1, 3, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 69, 104, -1.2F, -0.5F, -1.0F, 2, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0546F, 1.3971F, 9.6323F);
        this.tailOsteoderms.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0211F, 0.603F, -0.5243F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 57, 86, -1.0338F, -0.2816F, -0.9661F, 2, 1, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(2.2474F, 2.2863F, 2.4897F);
        this.tailOsteoderms.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.093F, 0.6524F, -0.4572F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 105, 64, -3.6515F, -1.2811F, 0.9532F, 2, 1, 3, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 104, 54, -1.3F, -1.1F, -1.5F, 3, 1, 3, 0.0F, false));

        this.tailOsteoderms2 = new AdvancedModelRenderer(this);
        this.tailOsteoderms2.setRotationPoint(-1.4F, -2.2632F, 0.0769F);
        this.tail.addChild(tailOsteoderms2);
        this.tailOsteoderms2.cubeList.add(new ModelBox(tailOsteoderms2, 86, 98, 0.4F, -0.8F, 5.0F, 0, 2, 6, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailOsteoderms2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0873F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 25, 0.0F, -1.0F, 0.0F, 0, 2, 5, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-2.6447F, 6.0323F, 1.8055F);
        this.tailOsteoderms2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0151F, -0.5853F, -0.4205F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 65, 74, 5.0041F, -2.0517F, 3.2848F, 2, 1, 3, 0.0F, true));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 64, 39, 2.6219F, -1.658F, 0.9782F, 2, 1, 3, 0.0F, true));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 69, 104, -0.8F, -0.5F, -1.0F, 2, 1, 3, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0546F, 1.3971F, 9.6323F);
        this.tailOsteoderms2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0211F, -0.603F, 0.5243F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 57, 86, -0.9662F, -0.2816F, -0.9661F, 2, 1, 2, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.2474F, 2.2863F, 2.4897F);
        this.tailOsteoderms2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.093F, -0.6524F, 0.4572F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 105, 64, 1.6515F, -1.2811F, 0.9532F, 2, 1, 3, 0.0F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 104, 54, -1.7F, -1.1F, -1.5F, 3, 1, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.8632F, 11.0769F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 21, 72, -2.0F, -1.0906F, -0.8564F, 4, 4, 8, 0.0F, false));

        this.tail2Osteoderms = new AdvancedModelRenderer(this);
        this.tail2Osteoderms.setRotationPoint(1.2F, -1.3906F, 7.1436F);
        this.tail2.addChild(tail2Osteoderms);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail2Osteoderms.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.0349F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 11, 81, -0.4F, -0.5F, -7.0F, 0, 1, 7, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.4565F, 1.681F, -3.5905F);
        this.tail2Osteoderms.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.0873F, -0.48F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 91, 70, -1.4099F, -0.1767F, -3.5254F, 3, 0, 7, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.4565F, 3.3718F, -3.561F);
        this.tail2Osteoderms.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.0873F, 0.48F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 19, 94, -1.5F, 0.0F, -3.5F, 3, 0, 7, 0.0F, false));

        this.tail2Osteoderms2 = new AdvancedModelRenderer(this);
        this.tail2Osteoderms2.setRotationPoint(-1.2F, -1.3906F, 7.1436F);
        this.tail2.addChild(tail2Osteoderms2);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail2Osteoderms2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0349F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 11, 81, 0.4F, -0.5F, -7.0F, 0, 1, 7, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.4565F, 1.681F, -3.5905F);
        this.tail2Osteoderms2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0873F, 0.48F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 91, 70, -1.5901F, -0.1767F, -3.5254F, 3, 0, 7, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.4565F, 3.3718F, -3.561F);
        this.tail2Osteoderms2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0873F, -0.48F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 19, 94, -1.5F, 0.0F, -3.5F, 3, 0, 7, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0094F, 6.8436F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 72, 5, -1.5F, -1.1297F, -0.8461F, 3, 3, 9, 0.0F, false));

        this.tail3Osteoderms = new AdvancedModelRenderer(this);
        this.tail3Osteoderms.setRotationPoint(0.8072F, -1.3298F, 0.1345F);
        this.tail3.addChild(tail3Osteoderms);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail3Osteoderms.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, -0.0262F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 95, 88, 0.0148F, -0.5F, 0.0112F, 0, 1, 8, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5326F, 0.7708F, 4.0835F);
        this.tail3Osteoderms.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0233F, -0.0561F, -0.4818F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 73, 96, -1.1758F, 0.3482F, -3.4115F, 2, 0, 7, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.9928F, 2.7119F, 4.4111F);
        this.tail3Osteoderms.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, -0.0873F, 0.3927F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 78, 36, -1.5F, 0.0F, -3.5F, 2, 0, 7, 0.0F, false));

        this.tail3Osteoderms2 = new AdvancedModelRenderer(this);
        this.tail3Osteoderms2.setRotationPoint(-0.8072F, -1.3298F, 0.1345F);
        this.tail3.addChild(tail3Osteoderms2);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail3Osteoderms2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.0262F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 95, 88, -0.0148F, -0.5F, 0.0112F, 0, 1, 8, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5326F, 0.7708F, 4.0835F);
        this.tail3Osteoderms2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0233F, 0.0561F, 0.4818F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 73, 96, -0.8242F, 0.3482F, -3.4115F, 2, 0, 7, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.9928F, 2.7119F, 4.4111F);
        this.tail3Osteoderms2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.0873F, -0.3927F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 78, 36, -0.5F, 0.0F, -3.5F, 2, 0, 7, 0.0F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.3298F, 7.9539F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 75, 46, -1.0F, -0.8144F, -0.8705F, 2, 2, 9, 0.0F, false));

        this.tail4Osteoderms = new AdvancedModelRenderer(this);
        this.tail4Osteoderms.setRotationPoint(1.5F, 0.8856F, 4.6295F);
        this.tail4.addChild(tail4Osteoderms);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail4Osteoderms.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, -0.0873F, 0.3054F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 32, 94, -0.9F, 0.0F, -4.3F, 1, 0, 8, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.3218F, -1.1749F, -0.2418F);
        this.tail4Osteoderms.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0435F, -0.035F, -0.3031F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 94, 78, -0.5F, 0.0F, -4.0F, 1, 0, 8, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-1.2F, -1.7F, 3.5F);
        this.tail4Osteoderms.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, -0.0349F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 95, 54, 0.0F, -0.5F, -8.0F, 0, 1, 8, 0.0F, false));

        this.tail4Osteoderms2 = new AdvancedModelRenderer(this);
        this.tail4Osteoderms2.setRotationPoint(-1.5F, 0.8856F, 4.6295F);
        this.tail4.addChild(tail4Osteoderms2);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail4Osteoderms2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.0873F, -0.3054F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 32, 94, -0.1F, 0.0F, -4.3F, 1, 0, 8, 0.0F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.3218F, -1.1749F, -0.2418F);
        this.tail4Osteoderms2.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0435F, 0.035F, 0.3031F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 94, 78, -0.5F, 0.0F, -4.0F, 1, 0, 8, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(1.2F, -1.7F, 3.5F);
        this.tail4Osteoderms2.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0349F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 95, 54, 0.0F, -0.5F, -8.0F, 0, 1, 8, 0.0F, true));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.4144F, 7.9295F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1745F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 64, 33, -0.5F, -0.4287F, -0.8725F, 1, 1, 11, 0.0F, false));

        this.tail5Osteoderms = new AdvancedModelRenderer(this);
        this.tail5Osteoderms.setRotationPoint(0.1F, -0.3286F, 10.0275F);
        this.tail5.addChild(tail5Osteoderms);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail5Osteoderms.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, -0.0175F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 81, 0.0F, -0.5F, -9.9F, 0, 1, 10, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.8741F, 0.0034F, -4.4F);
        this.tail5Osteoderms.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, -0.0873F, -0.2618F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 82, 86, -1.0F, 0.1F, -5.0F, 1, 0, 9, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.5127F, 0.4108F, -4.9417F);
        this.tail5Osteoderms.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0341F, -0.0692F, 0.3945F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 61, 86, -0.5F, 0.2F, -4.5F, 1, 0, 9, 0.0F, false));

        this.tail5Osteoderms2 = new AdvancedModelRenderer(this);
        this.tail5Osteoderms2.setRotationPoint(-0.1F, -0.3286F, 10.0275F);
        this.tail5.addChild(tail5Osteoderms2);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail5Osteoderms2.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, 0.0175F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 81, 0.0F, -0.5F, -9.9F, 0, 1, 10, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.8741F, 0.0034F, -4.4F);
        this.tail5Osteoderms2.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, 0.0873F, 0.2618F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 82, 86, 0.0F, 0.1F, -5.0F, 1, 0, 9, 0.0F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.5127F, 0.4108F, -4.9417F);
        this.tail5Osteoderms2.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0341F, 0.0692F, -0.3945F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 61, 86, -0.5F, 0.2F, -4.5F, 1, 0, 9, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 2.0F, -0.4F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0349F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 37, 0, -5.5F, -3.108F, -8.5865F, 11, 4, 9, -0.004F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -5.5F, 0.4F, -13.6F, 11, 10, 14, 0.005F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.5F, -2.6F, -14.5F);
        this.body.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.1833F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 51, -6.0F, 0.6F, -0.1F, 11, 4, 6, 0.0F, false));

        this.bodyOsteoderms = new AdvancedModelRenderer(this);
        this.bodyOsteoderms.setRotationPoint(5.0681F, 6.6016F, -2.5836F);
        this.body.addChild(bodyOsteoderms);
        this.bodyOsteoderms.cubeList.add(new ModelBox(bodyOsteoderms, 88, 10, -3.5681F, -10.5096F, -6.0029F, 0, 1, 9, -0.004F, false));
        this.bodyOsteoderms.cubeList.add(new ModelBox(bodyOsteoderms, 84, 62, -1.1681F, -5.9017F, -2.5164F, 2, 1, 2, 0.005F, false));
        this.bodyOsteoderms.cubeList.add(new ModelBox(bodyOsteoderms, 0, 85, -1.1681F, -5.8016F, -5.6164F, 2, 1, 2, 0.005F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.4447F, 0.2286F, 0.005F);
        this.bodyOsteoderms.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.117F, -0.01F, 0.4749F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 74, 51, -1.0F, -0.7F, -1.0F, 2, 1, 2, -0.0004F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0977F, 0.0155F, -3.4998F);
        this.bodyOsteoderms.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0297F, -0.01F, 0.4749F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 75, 58, -0.5F, -0.5F, -0.5F, 2, 1, 2, -0.0004F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.2976F, 0.0155F, -5.4998F);
        this.bodyOsteoderms.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0297F, -0.01F, 0.4749F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 81, -0.5F, -0.5F, -1.5F, 2, 1, 2, -0.0004F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.6423F, 0.0441F, -9.4947F);
        this.bodyOsteoderms.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.0577F, 0.0771F, 0.4698F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 104, 87, -1.0F, -0.5F, -1.5F, 2, 1, 3, -0.0004F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.6319F, -1.1016F, -4.0164F);
        this.bodyOsteoderms.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0421F, -0.0113F, 0.2616F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 88, 0, -0.5F, 0.0F, -2.0F, 1, 0, 9, 0.0F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.6319F, -2.3016F, -4.0164F);
        this.bodyOsteoderms.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0421F, -0.0113F, 0.2616F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 70, 62, -0.5F, 0.0F, -4.0F, 1, 0, 11, 0.0F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.6319F, -3.5016F, -4.0164F);
        this.bodyOsteoderms.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0421F, -0.0113F, 0.2616F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 21, 57, -0.5F, 0.0F, -7.0F, 1, 0, 14, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.1681F, -4.8016F, -7.7164F);
        this.bodyOsteoderms.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0873F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 81, 19, -1.0F, -0.9F, -3.4F, 2, 1, 2, 0.005F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(-0.1681F, -5.2176F, -7.552F);
        this.bodyOsteoderms.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0436F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 64, 46, -1.0F, -0.5F, -0.8F, 2, 1, 2, 0.005F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-0.1681F, -5.5391F, 1.6158F);
        this.bodyOsteoderms.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0436F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 84, 58, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.005F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(0.1409F, -6.769F, -0.7849F);
        this.bodyOsteoderms.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.0178F, 0.0216F, 0.1801F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 89, 21, -1.0F, 0.0F, -4.0F, 2, 0, 8, 0.0F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(0.1612F, -7.136F, -6.6946F);
        this.bodyOsteoderms.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.1267F, 0.3479F, -0.4397F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 0, 33, -1.2F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(1.8819F, -6.4805F, -1.599F);
        this.bodyOsteoderms.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0164F, 0.0063F, -0.4743F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 89, 36, -2.1F, -1.6F, -4.0F, 2, 0, 8, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(2.1819F, -7.7805F, -1.599F);
        this.bodyOsteoderms.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0164F, 0.0063F, -0.4743F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 89, 45, -2.1F, -1.6F, -4.0F, 2, 0, 8, 0.0F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(0.6319F, -8.3536F, -8.8098F);
        this.bodyOsteoderms.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.1195F, 0.088F, -0.4725F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 45, 33, -1.3F, 0.1F, -2.9F, 2, 0, 6, 0.0F, false));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(-1.3681F, -9.4352F, -9.0103F);
        this.bodyOsteoderms.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.175F, -0.0548F, 0.3006F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 102, 18, -0.1F, -0.1F, -2.8F, 0, 1, 6, 0.0F, false));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(-4.5681F, -9.2017F, -11.9164F);
        this.bodyOsteoderms.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.1833F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 102, 30, 1.0F, -0.2F, -0.1F, 0, 1, 6, 0.0F, false));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(-1.4681F, -9.7096F, -1.5029F);
        this.bodyOsteoderms.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.0F, 0.0F, 0.3054F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 32, 25, 0.0F, -0.5F, -4.5F, 0, 1, 9, -0.004F, false));

        this.bodyOsteoderms2 = new AdvancedModelRenderer(this);
        this.bodyOsteoderms2.setRotationPoint(-5.0681F, 6.6016F, -2.5836F);
        this.body.addChild(bodyOsteoderms2);
        this.bodyOsteoderms2.cubeList.add(new ModelBox(bodyOsteoderms2, 88, 10, 3.5681F, -10.5096F, -6.0029F, 0, 1, 9, -0.004F, true));
        this.bodyOsteoderms2.cubeList.add(new ModelBox(bodyOsteoderms2, 84, 62, -0.8319F, -5.9017F, -2.5164F, 2, 1, 2, 0.005F, true));
        this.bodyOsteoderms2.cubeList.add(new ModelBox(bodyOsteoderms2, 0, 85, -0.8319F, -5.8016F, -5.6164F, 2, 1, 2, 0.005F, true));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(-0.4447F, 0.2286F, 0.005F);
        this.bodyOsteoderms2.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.117F, 0.01F, -0.4749F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 74, 51, -1.0F, -0.7F, -1.0F, 2, 1, 2, -0.0004F, true));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(-0.0977F, 0.0155F, -3.4998F);
        this.bodyOsteoderms2.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.0297F, 0.01F, -0.4749F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 75, 58, -1.5F, -0.5F, -0.5F, 2, 1, 2, -0.0004F, true));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(-0.2976F, 0.0155F, -5.4998F);
        this.bodyOsteoderms2.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.0297F, 0.01F, -0.4749F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 0, 81, -1.5F, -0.5F, -1.5F, 2, 1, 2, -0.0004F, true));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(-0.6423F, 0.0441F, -9.4947F);
        this.bodyOsteoderms2.addChild(cube_r72);
        this.setRotateAngle(cube_r72, -0.0577F, -0.0771F, -0.4698F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 104, 87, -1.0F, -0.5F, -1.5F, 2, 1, 3, -0.0004F, true));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(-0.6319F, -1.1016F, -4.0164F);
        this.bodyOsteoderms2.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.0421F, 0.0113F, -0.2616F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 88, 0, -0.5F, 0.0F, -2.0F, 1, 0, 9, 0.0F, true));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(-0.6319F, -2.3016F, -4.0164F);
        this.bodyOsteoderms2.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.0421F, 0.0113F, -0.2616F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 70, 62, -0.5F, 0.0F, -4.0F, 1, 0, 11, 0.0F, true));

        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(-0.6319F, -3.5016F, -4.0164F);
        this.bodyOsteoderms2.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.0421F, 0.0113F, -0.2616F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 21, 57, -0.5F, 0.0F, -7.0F, 1, 0, 14, 0.0F, true));

        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(0.1681F, -4.8016F, -7.7164F);
        this.bodyOsteoderms2.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.0873F, 0.0F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 81, 19, -1.0F, -0.9F, -3.4F, 2, 1, 2, 0.005F, true));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(0.1681F, -5.2176F, -7.552F);
        this.bodyOsteoderms2.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.0436F, 0.0F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 64, 46, -1.0F, -0.5F, -0.8F, 2, 1, 2, 0.005F, true));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(0.1681F, -5.5391F, 1.6158F);
        this.bodyOsteoderms2.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.0436F, 0.0F, 0.0F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 84, 58, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.005F, true));

        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(-0.1409F, -6.769F, -0.7849F);
        this.bodyOsteoderms2.addChild(cube_r79);
        this.setRotateAngle(cube_r79, -0.0178F, -0.0216F, -0.1801F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 89, 21, -1.0F, 0.0F, -4.0F, 2, 0, 8, 0.0F, true));

        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(-0.1612F, -7.136F, -6.6946F);
        this.bodyOsteoderms2.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.1267F, -0.3479F, 0.4397F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 0, 33, -0.8F, 0.0F, -1.0F, 2, 0, 2, 0.0F, true));

        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(-1.8819F, -6.4805F, -1.599F);
        this.bodyOsteoderms2.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.0164F, -0.0063F, 0.4743F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 89, 36, 0.1F, -1.6F, -4.0F, 2, 0, 8, 0.0F, true));

        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(-2.1819F, -7.7805F, -1.599F);
        this.bodyOsteoderms2.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.0164F, -0.0063F, 0.4743F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 89, 45, 0.1F, -1.6F, -4.0F, 2, 0, 8, 0.0F, true));

        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(-0.6319F, -8.3536F, -8.8098F);
        this.bodyOsteoderms2.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.1195F, -0.088F, 0.4725F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 45, 33, -0.7F, 0.1F, -2.9F, 2, 0, 6, 0.0F, true));

        this.cube_r84 = new AdvancedModelRenderer(this);
        this.cube_r84.setRotationPoint(1.3681F, -9.4352F, -9.0103F);
        this.bodyOsteoderms2.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.175F, 0.0548F, -0.3006F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 102, 18, 0.1F, -0.1F, -2.8F, 0, 1, 6, 0.0F, true));

        this.cube_r85 = new AdvancedModelRenderer(this);
        this.cube_r85.setRotationPoint(4.5681F, -9.2017F, -11.9164F);
        this.bodyOsteoderms2.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.1833F, 0.0F, 0.0F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 102, 30, -1.0F, -0.2F, -0.1F, 0, 1, 6, 0.0F, true));

        this.cube_r86 = new AdvancedModelRenderer(this);
        this.cube_r86.setRotationPoint(1.4681F, -9.7096F, -1.5029F);
        this.bodyOsteoderms2.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.0F, 0.0F, -0.3054F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 32, 25, 0.0F, -0.5F, -4.5F, 0, 1, 9, -0.004F, true));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.3F, -13.8F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0654F, 0.0F, 0.0F);


        this.cube_r87 = new AdvancedModelRenderer(this);
        this.cube_r87.setRotationPoint(0.0F, 6.3727F, -8.3365F);
        this.chest.addChild(cube_r87);
        this.setRotateAngle(cube_r87, -0.3054F, 0.0F, 0.0F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 33, 40, -5.0F, -5.096F, -0.5154F, 10, 6, 10, -0.004F, false));

        this.cube_r88 = new AdvancedModelRenderer(this);
        this.cube_r88.setRotationPoint(0.0F, -2.2F, -0.6F);
        this.chest.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.3665F, 0.0F, 0.0F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 43, 17, -5.0F, 0.0109F, -7.7197F, 10, 7, 8, 0.004F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-4.0F, 7.1F, -6.1F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.3345F, -0.045F, 0.258F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 0, 0, -1.5F, -1.0F, -1.5F, 3, 7, 3, 0.0F, true));

        this.cube_r89 = new AdvancedModelRenderer(this);
        this.cube_r89.setRotationPoint(-1.259F, 1.2416F, -1.6126F);
        this.rightArm.addChild(cube_r89);
        this.setRotateAngle(cube_r89, 0.1876F, -0.6219F, -0.2156F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 0, 25, -1.0F, -2.0F, 0.3F, 2, 4, 0, 0.0F, true));

        this.cube_r90 = new AdvancedModelRenderer(this);
        this.cube_r90.setRotationPoint(-2.0F, 3.0F, 0.5F);
        this.rightArm.addChild(cube_r90);
        this.setRotateAngle(cube_r90, 0.2505F, 0.3452F, -0.0147F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 0, 50, -0.6087F, -3.283F, 0.0242F, 2, 6, 0, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 5.8403F, 0.9069F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.6622F, -0.1239F, -0.1943F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 32, 25, -1.0F, -0.0868F, -1.4924F, 2, 6, 2, 0.0F, true));

        this.cube_r91 = new AdvancedModelRenderer(this);
        this.cube_r91.setRotationPoint(-1.4535F, 2.2388F, -0.0736F);
        this.rightArm2.addChild(cube_r91);
        this.setRotateAngle(cube_r91, -0.1442F, 0.3293F, -0.1524F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 56, 33, -0.3F, -2.0F, 0.0F, 1, 4, 0, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.0307F, 5.5678F, -0.3862F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.192F, 0.0F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 14, 62, -1.4F, 0.0F, -3.1F, 3, 2, 4, 0.0F, true));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(4.0F, 7.1F, -6.1F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.3345F, 0.045F, -0.258F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 0, 0, -1.5F, -1.0F, -1.5F, 3, 7, 3, 0.0F, false));

        this.cube_r92 = new AdvancedModelRenderer(this);
        this.cube_r92.setRotationPoint(1.259F, 1.2416F, -1.6126F);
        this.leftArm.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.1876F, 0.6219F, 0.2156F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 0, 25, -1.0F, -2.0F, 0.3F, 2, 4, 0, 0.0F, false));

        this.cube_r93 = new AdvancedModelRenderer(this);
        this.cube_r93.setRotationPoint(2.0F, 3.0F, 0.5F);
        this.leftArm.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 0.2505F, -0.3452F, 0.0147F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 0, 50, -1.3913F, -3.283F, 0.0242F, 2, 6, 0, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 5.8403F, 0.9069F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.6622F, 0.1239F, 0.1943F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 32, 25, -1.0F, -0.0868F, -1.4924F, 2, 6, 2, 0.0F, false));

        this.cube_r94 = new AdvancedModelRenderer(this);
        this.cube_r94.setRotationPoint(1.4535F, 2.2388F, -0.0736F);
        this.leftArm2.addChild(cube_r94);
        this.setRotateAngle(cube_r94, -0.1442F, -0.3293F, 0.1524F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 56, 33, -0.7F, -2.0F, 0.0F, 1, 4, 0, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0307F, 5.5678F, -0.3862F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.192F, 0.0F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 14, 62, -1.6F, 0.0F, -3.1F, 3, 2, 4, 0.0F, false));

        this.chestOsteoderms = new AdvancedModelRenderer(this);
        this.chestOsteoderms.setRotationPoint(0.0F, -2.2F, -0.6F);
        this.chest.addChild(chestOsteoderms);


        this.cube_r95 = new AdvancedModelRenderer(this);
        this.cube_r95.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chestOsteoderms.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.3665F, 0.0F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 102, 45, 1.5F, -0.7891F, -6.7197F, 0, 1, 6, 0.0F, false));

        this.cube_r96 = new AdvancedModelRenderer(this);
        this.cube_r96.setRotationPoint(3.5399F, 0.8111F, -2.3876F);
        this.chestOsteoderms.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.4382F, -0.108F, 0.2863F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 24, 64, 0.0F, -0.2F, -2.5F, 0, 1, 5, 0.0F, false));

        this.cube_r97 = new AdvancedModelRenderer(this);
        this.cube_r97.setRotationPoint(5.25F, 2.2175F, -3.3474F);
        this.chestOsteoderms.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.3313F, 0.3042F, -0.4512F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 54, 96, -1.2F, 0.0F, -3.5F, 2, 0, 7, 0.0F, false));

        this.cube_r98 = new AdvancedModelRenderer(this);
        this.cube_r98.setRotationPoint(5.2822F, 4.5614F, -2.365F);
        this.chestOsteoderms.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.0775F, -0.0588F, -0.0266F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 90, 36, -0.5F, -1.2F, 0.7F, 1, 1, 2, 0.0F, false));

        this.cube_r99 = new AdvancedModelRenderer(this);
        this.cube_r99.setRotationPoint(6.3682F, 4.248F, -2.5147F);
        this.chestOsteoderms.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.0778F, 0.1152F, -0.0131F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 73, 86, -1.6F, -0.5F, -4.3F, 1, 1, 2, 0.0F, false));
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 61, 90, -1.6F, -0.6F, -1.9F, 1, 1, 2, 0.0F, false));

        this.cube_r100 = new AdvancedModelRenderer(this);
        this.cube_r100.setRotationPoint(4.863F, 6.5264F, -5.4021F);
        this.chestOsteoderms.addChild(cube_r100);
        this.setRotateAngle(cube_r100, -0.0369F, 0.2432F, 0.3818F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 38, 67, -1.0F, -0.5F, -1.0F, 2, 1, 2, -0.0004F, false));

        this.cube_r101 = new AdvancedModelRenderer(this);
        this.cube_r101.setRotationPoint(4.9657F, 7.4172F, -1.6834F);
        this.chestOsteoderms.addChild(cube_r101);
        this.setRotateAngle(cube_r101, -0.237F, 0.2022F, 0.424F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 69, 0, -1.5F, -0.5F, -1.5F, 3, 1, 3, -0.0004F, false));

        this.chestOsteoderms2 = new AdvancedModelRenderer(this);
        this.chestOsteoderms2.setRotationPoint(0.0F, -2.2F, -0.6F);
        this.chest.addChild(chestOsteoderms2);


        this.cube_r102 = new AdvancedModelRenderer(this);
        this.cube_r102.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chestOsteoderms2.addChild(cube_r102);
        this.setRotateAngle(cube_r102, 0.3665F, 0.0F, 0.0F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 102, 45, -1.5F, -0.7891F, -6.7197F, 0, 1, 6, 0.0F, true));

        this.cube_r103 = new AdvancedModelRenderer(this);
        this.cube_r103.setRotationPoint(-3.5399F, 0.8111F, -2.3876F);
        this.chestOsteoderms2.addChild(cube_r103);
        this.setRotateAngle(cube_r103, 0.4382F, 0.108F, -0.2863F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 24, 64, 0.0F, -0.2F, -2.5F, 0, 1, 5, 0.0F, true));

        this.cube_r104 = new AdvancedModelRenderer(this);
        this.cube_r104.setRotationPoint(-5.25F, 2.2175F, -3.3474F);
        this.chestOsteoderms2.addChild(cube_r104);
        this.setRotateAngle(cube_r104, 0.3313F, -0.3042F, 0.4512F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 54, 96, -0.8F, 0.0F, -3.5F, 2, 0, 7, 0.0F, true));

        this.cube_r105 = new AdvancedModelRenderer(this);
        this.cube_r105.setRotationPoint(-5.2822F, 4.5614F, -2.365F);
        this.chestOsteoderms2.addChild(cube_r105);
        this.setRotateAngle(cube_r105, 0.0775F, 0.0588F, 0.0266F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 90, 36, -0.5F, -1.2F, 0.7F, 1, 1, 2, 0.0F, true));

        this.cube_r106 = new AdvancedModelRenderer(this);
        this.cube_r106.setRotationPoint(-6.3682F, 4.248F, -2.5147F);
        this.chestOsteoderms2.addChild(cube_r106);
        this.setRotateAngle(cube_r106, 0.0778F, -0.1152F, 0.0131F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 73, 86, 0.6F, -0.5F, -4.3F, 1, 1, 2, 0.0F, true));
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 61, 90, 0.6F, -0.6F, -1.9F, 1, 1, 2, 0.0F, true));

        this.cube_r107 = new AdvancedModelRenderer(this);
        this.cube_r107.setRotationPoint(-4.863F, 6.5264F, -5.4021F);
        this.chestOsteoderms2.addChild(cube_r107);
        this.setRotateAngle(cube_r107, -0.0369F, -0.2432F, -0.3818F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 38, 67, -1.0F, -0.5F, -1.0F, 2, 1, 2, -0.0004F, true));

        this.cube_r108 = new AdvancedModelRenderer(this);
        this.cube_r108.setRotationPoint(-4.9657F, 7.4172F, -1.6834F);
        this.chestOsteoderms2.addChild(cube_r108);
        this.setRotateAngle(cube_r108, -0.237F, -0.2022F, -0.424F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 69, 0, -1.5F, -0.5F, -1.5F, 3, 1, 3, -0.0004F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 2.1F, -7.1F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.0873F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 71, 74, -3.5F, -1.461F, -3.6973F, 7, 6, 5, 0.0F, false));

        this.cube_r109 = new AdvancedModelRenderer(this);
        this.cube_r109.setRotationPoint(-1.5061F, -1.8593F, -1.3164F);
        this.neck.addChild(cube_r109);
        this.setRotateAngle(cube_r109, 0.0701F, -0.0871F, -0.0061F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 80, 25, 0.2F, -0.5F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r110 = new AdvancedModelRenderer(this);
        this.cube_r110.setRotationPoint(1.5061F, -1.8593F, -1.3164F);
        this.neck.addChild(cube_r110);
        this.setRotateAngle(cube_r110, 0.0701F, 0.0871F, 0.0061F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 80, 25, -0.2F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.bipartiteOsteoderm3 = new AdvancedModelRenderer(this);
        this.bipartiteOsteoderm3.setRotationPoint(3.8881F, 0.3767F, -2.2062F);
        this.neck.addChild(bipartiteOsteoderm3);


        this.cube_r111 = new AdvancedModelRenderer(this);
        this.cube_r111.setRotationPoint(0.6119F, 0.1832F, 0.0537F);
        this.bipartiteOsteoderm3.addChild(cube_r111);
        this.setRotateAngle(cube_r111, -0.0853F, -0.0499F, 0.6517F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 38, 85, -0.6737F, 1.8839F, -0.9512F, 2, 1, 2, 0.0F, false));

        this.cube_r112 = new AdvancedModelRenderer(this);
        this.cube_r112.setRotationPoint(-0.643F, -0.2218F, 0.3166F);
        this.bipartiteOsteoderm3.addChild(cube_r112);
        this.setRotateAngle(cube_r112, 0.7222F, 0.103F, 1.1295F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 11, 81, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.bipartiteOsteoderm4 = new AdvancedModelRenderer(this);
        this.bipartiteOsteoderm4.setRotationPoint(-3.8881F, 0.3767F, -2.2062F);
        this.neck.addChild(bipartiteOsteoderm4);


        this.cube_r113 = new AdvancedModelRenderer(this);
        this.cube_r113.setRotationPoint(-0.6119F, 0.1832F, 0.0537F);
        this.bipartiteOsteoderm4.addChild(cube_r113);
        this.setRotateAngle(cube_r113, -0.0853F, 0.0499F, -0.6517F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 38, 85, -1.3263F, 1.8839F, -0.9512F, 2, 1, 2, 0.0F, true));

        this.cube_r114 = new AdvancedModelRenderer(this);
        this.cube_r114.setRotationPoint(0.643F, -0.2218F, 0.3166F);
        this.bipartiteOsteoderm4.addChild(cube_r114);
        this.setRotateAngle(cube_r114, 0.7222F, -0.103F, -1.1295F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 11, 81, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.561F, -3.0973F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.4712F, 0.0F, 0.0F);


        this.cube_r115 = new AdvancedModelRenderer(this);
        this.cube_r115.setRotationPoint(0.0F, -0.4615F, -3.3987F);
        this.neck2.addChild(cube_r115);
        this.setRotateAngle(cube_r115, 0.1047F, 0.0F, 0.0F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 0, 93, -2.0F, 0.1F, 0.0F, 4, 5, 5, 0.0F, false));

        this.cube_r116 = new AdvancedModelRenderer(this);
        this.cube_r116.setRotationPoint(-0.8F, 1.2713F, -1.7083F);
        this.neck2.addChild(cube_r116);
        this.setRotateAngle(cube_r116, 0.1056F, -0.1302F, -0.0138F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 37, 0, -0.2F, -2.5F, -1.5F, 0, 5, 3, 0.0F, true));

        this.cube_r117 = new AdvancedModelRenderer(this);
        this.cube_r117.setRotationPoint(0.8F, 1.2713F, -1.7083F);
        this.neck2.addChild(cube_r117);
        this.setRotateAngle(cube_r117, 0.1056F, 0.1302F, 0.0138F);
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 37, 0, 0.2F, -2.5F, -1.5F, 0, 5, 3, 0.0F, false));

        this.bipartiteOsteoderm2 = new AdvancedModelRenderer(this);
        this.bipartiteOsteoderm2.setRotationPoint(2.16F, 1.301F, -1.7915F);
        this.neck2.addChild(bipartiteOsteoderm2);
        this.setRotateAngle(bipartiteOsteoderm2, 0.1309F, 0.0F, 0.0F);


        this.cube_r118 = new AdvancedModelRenderer(this);
        this.cube_r118.setRotationPoint(0.54F, 0.2393F, -0.2592F);
        this.bipartiteOsteoderm2.addChild(cube_r118);
        this.setRotateAngle(cube_r118, -0.0853F, -0.0499F, 0.6517F);
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 69, 5, -0.6351F, 1.2836F, -0.52F, 2, 1, 2, 0.0F, false));

        this.cube_r119 = new AdvancedModelRenderer(this);
        this.cube_r119.setRotationPoint(-0.6761F, -0.3264F, 0.0423F);
        this.bipartiteOsteoderm2.addChild(cube_r119);
        this.setRotateAngle(cube_r119, 0.8131F, -0.1118F, 1.0413F);
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 51, 57, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.bipartiteOsteoderm5 = new AdvancedModelRenderer(this);
        this.bipartiteOsteoderm5.setRotationPoint(-2.16F, 1.301F, -1.7915F);
        this.neck2.addChild(bipartiteOsteoderm5);
        this.setRotateAngle(bipartiteOsteoderm5, 0.1309F, 0.0F, 0.0F);


        this.cube_r120 = new AdvancedModelRenderer(this);
        this.cube_r120.setRotationPoint(-0.54F, 0.2393F, -0.2592F);
        this.bipartiteOsteoderm5.addChild(cube_r120);
        this.setRotateAngle(cube_r120, -0.0853F, 0.0499F, -0.6517F);
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 69, 5, -1.3649F, 1.2836F, -0.52F, 2, 1, 2, 0.0F, true));

        this.cube_r121 = new AdvancedModelRenderer(this);
        this.cube_r121.setRotationPoint(0.6761F, -0.3264F, 0.0423F);
        this.bipartiteOsteoderm5.addChild(cube_r121);
        this.setRotateAngle(cube_r121, 0.8131F, 0.1118F, -1.0413F);
        this.cube_r121.cubeList.add(new ModelBox(cube_r121, 51, 57, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.5196F, -2.7955F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.2531F, 0.0F, 0.0F);


        this.cube_r122 = new AdvancedModelRenderer(this);
        this.cube_r122.setRotationPoint(0.0F, -1.8516F, -3.1662F);
        this.neck3.addChild(cube_r122);
        this.setRotateAngle(cube_r122, -0.2443F, 0.0F, 0.0F);
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 66, 33, -1.5F, 0.0F, 0.1F, 3, 3, 1, -0.009F, false));
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 26, 103, -1.5F, 0.0F, 1.1F, 3, 4, 3, -0.009F, false));

        this.bipartiteOsteoderm = new AdvancedModelRenderer(this);
        this.bipartiteOsteoderm.setRotationPoint(1.3144F, -0.3635F, -1.5283F);
        this.neck3.addChild(bipartiteOsteoderm);
        this.setRotateAngle(bipartiteOsteoderm, -0.2182F, 0.0F, 0.0F);


        this.cube_r123 = new AdvancedModelRenderer(this);
        this.cube_r123.setRotationPoint(-3.1006F, -0.9467F, 0.0621F);
        this.bipartiteOsteoderm.addChild(cube_r123);
        this.setRotateAngle(cube_r123, 0.0F, 0.0F, -0.8727F);
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 14, 62, -0.592F, -0.2621F, -0.8414F, 0, 2, 1, 0.0F, true));

        this.cube_r124 = new AdvancedModelRenderer(this);
        this.cube_r124.setRotationPoint(-3.3144F, 0.4369F, 0.0621F);
        this.bipartiteOsteoderm.addChild(cube_r124);
        this.setRotateAngle(cube_r124, -0.0853F, 0.0499F, -0.6517F);
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 43, 36, -1.0216F, 1.0518F, -0.3566F, 2, 0, 1, 0.0F, true));

        this.cube_r125 = new AdvancedModelRenderer(this);
        this.cube_r125.setRotationPoint(0.6856F, 0.4369F, 0.0621F);
        this.bipartiteOsteoderm.addChild(cube_r125);
        this.setRotateAngle(cube_r125, -0.0853F, -0.0499F, 0.6517F);
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 43, 36, -0.9784F, 1.0518F, -0.3566F, 2, 0, 1, 0.0F, false));

        this.cube_r126 = new AdvancedModelRenderer(this);
        this.cube_r126.setRotationPoint(-2.1446F, -1.314F, -0.4161F);
        this.bipartiteOsteoderm.addChild(cube_r126);
        this.setRotateAngle(cube_r126, 0.0F, 0.0F, -0.1309F);
        this.cube_r126.cubeList.add(new ModelBox(cube_r126, 6, 25, 0.0F, -0.4F, -1.0F, 0, 1, 2, 0.0F, true));

        this.cube_r127 = new AdvancedModelRenderer(this);
        this.cube_r127.setRotationPoint(-0.4843F, -1.314F, -0.4161F);
        this.bipartiteOsteoderm.addChild(cube_r127);
        this.setRotateAngle(cube_r127, 0.0F, 0.0F, 0.1309F);
        this.cube_r127.cubeList.add(new ModelBox(cube_r127, 6, 25, 0.0F, -0.4F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r128 = new AdvancedModelRenderer(this);
        this.cube_r128.setRotationPoint(0.4718F, -0.9467F, 0.0621F);
        this.bipartiteOsteoderm.addChild(cube_r128);
        this.setRotateAngle(cube_r128, 0.0F, 0.0F, 0.8727F);
        this.cube_r128.cubeList.add(new ModelBox(cube_r128, 14, 62, 0.592F, -0.2621F, -0.8414F, 0, 2, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.3516F, -3.0662F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.2618F, 0.0F, 0.0F);


        this.cube_r129 = new AdvancedModelRenderer(this);
        this.cube_r129.setRotationPoint(-1.1605F, 1.6075F, -0.6136F);
        this.head.addChild(cube_r129);
        this.setRotateAngle(cube_r129, 0.1231F, -0.535F, -0.3498F);
        this.cube_r129.cubeList.add(new ModelBox(cube_r129, 14, 93, -0.7195F, -0.3927F, -0.9969F, 1, 1, 2, 0.006F, true));

        this.cube_r130 = new AdvancedModelRenderer(this);
        this.cube_r130.setRotationPoint(1.1605F, 1.6075F, -0.6136F);
        this.head.addChild(cube_r130);
        this.setRotateAngle(cube_r130, 0.1231F, 0.535F, 0.3498F);
        this.cube_r130.cubeList.add(new ModelBox(cube_r130, 14, 93, -0.2805F, -0.3927F, -0.9969F, 1, 1, 2, 0.006F, false));

        this.cube_r131 = new AdvancedModelRenderer(this);
        this.cube_r131.setRotationPoint(0.0F, 0.4892F, -2.4911F);
        this.head.addChild(cube_r131);
        this.setRotateAngle(cube_r131, -0.0349F, 0.0F, 0.0F);
        this.cube_r131.cubeList.add(new ModelBox(cube_r131, 93, 98, -1.5F, -1.2F, 0.8F, 3, 3, 2, 0.006F, false));

        this.cube_r132 = new AdvancedModelRenderer(this);
        this.cube_r132.setRotationPoint(0.2F, 0.2373F, -3.0798F);
        this.head.addChild(cube_r132);
        this.setRotateAngle(cube_r132, 0.096F, 0.0F, 0.0F);
        this.cube_r132.cubeList.add(new ModelBox(cube_r132, 0, 11, -1.7F, 0.0F, -0.5F, 3, 1, 1, 0.008F, false));

        this.cube_r133 = new AdvancedModelRenderer(this);
        this.cube_r133.setRotationPoint(0.0F, 0.0838F, -4.5535F);
        this.head.addChild(cube_r133);
        this.setRotateAngle(cube_r133, 0.2705F, 0.0F, 0.0F);
        this.cube_r133.cubeList.add(new ModelBox(cube_r133, 0, 104, -1.5F, -0.0266F, 0.0714F, 3, 1, 3, 0.0F, false));

        this.cube_r134 = new AdvancedModelRenderer(this);
        this.cube_r134.setRotationPoint(0.0F, 0.9612F, -6.2154F);
        this.head.addChild(cube_r134);
        this.setRotateAngle(cube_r134, 0.6981F, 0.0F, 0.0F);
        this.cube_r134.cubeList.add(new ModelBox(cube_r134, 83, 86, -0.5F, -0.0165F, -2.0305F, 1, 1, 2, 0.003F, false));

        this.cube_r135 = new AdvancedModelRenderer(this);
        this.cube_r135.setRotationPoint(0.0F, 0.0659F, -4.4874F);
        this.head.addChild(cube_r135);
        this.setRotateAngle(cube_r135, 0.4451F, 0.0F, 0.0F);
        this.cube_r135.cubeList.add(new ModelBox(cube_r135, 88, 10, -0.5F, 0.4064F, -1.9967F, 1, 1, 2, -0.004F, false));
        this.cube_r135.cubeList.add(new ModelBox(cube_r135, 88, 5, -0.5F, 0.0064F, -1.9967F, 1, 1, 2, 0.0F, false));

        this.cube_r136 = new AdvancedModelRenderer(this);
        this.cube_r136.setRotationPoint(-0.2F, 0.7781F, -3.2861F);
        this.head.addChild(cube_r136);
        this.setRotateAngle(cube_r136, 0.0873F, 0.0F, 0.0F);
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 46, 102, -0.49F, 1.1149F, -2.125F, 0, 1, 5, 0.0F, true));
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 100, 0, -0.4F, 0.7F, -3.7F, 0, 1, 6, 0.0F, true));
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 46, 102, 0.89F, 1.1149F, -2.125F, 0, 1, 5, 0.0F, false));
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 14, 103, 0.9F, 1.1149F, -2.125F, 0, 1, 5, 0.0F, false));
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 100, 0, 0.8F, 0.7F, -3.7F, 0, 1, 6, 0.0F, false));
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 98, 10, -0.6F, 0.5F, -3.7F, 1, 1, 6, 0.003F, true));
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 98, 10, 0.0F, 0.5F, -3.7F, 1, 1, 6, 0.005F, false));
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 82, 0, -1.3F, 1.3F, -0.6F, 3, 1, 3, -0.004F, false));
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 38, 72, -1.3F, -0.5F, -1.0F, 3, 2, 3, 0.004F, false));

        this.occipitalhorn = new AdvancedModelRenderer(this);
        this.occipitalhorn.setRotationPoint(0.9F, -0.5441F, -0.4678F);
        this.head.addChild(occipitalhorn);


        this.cube_r137 = new AdvancedModelRenderer(this);
        this.cube_r137.setRotationPoint(0.1F, -0.8F, 1.0F);
        this.occipitalhorn.addChild(cube_r137);
        this.setRotateAngle(cube_r137, 1.0279F, 1.0889F, 0.8212F);
        this.cube_r137.cubeList.add(new ModelBox(cube_r137, 9, 11, -0.2453F, -0.3402F, -0.0794F, 1, 1, 1, -0.025F, false));

        this.cube_r138 = new AdvancedModelRenderer(this);
        this.cube_r138.setRotationPoint(0.1F, -0.3F, 0.1F);
        this.occipitalhorn.addChild(cube_r138);
        this.setRotateAngle(cube_r138, 0.4626F, 0.4749F, 0.0723F);
        this.cube_r138.cubeList.add(new ModelBox(cube_r138, 33, 94, -0.723F, -0.4367F, -1.0008F, 1, 1, 2, -0.02F, false));

        this.occipitalhorn2 = new AdvancedModelRenderer(this);
        this.occipitalhorn2.setRotationPoint(-0.9F, -0.5441F, -0.4678F);
        this.head.addChild(occipitalhorn2);


        this.cube_r139 = new AdvancedModelRenderer(this);
        this.cube_r139.setRotationPoint(-0.1F, -0.8F, 1.0F);
        this.occipitalhorn2.addChild(cube_r139);
        this.setRotateAngle(cube_r139, 1.0279F, -1.0889F, -0.8212F);
        this.cube_r139.cubeList.add(new ModelBox(cube_r139, 9, 11, -0.7547F, -0.3402F, -0.0794F, 1, 1, 1, -0.025F, true));

        this.cube_r140 = new AdvancedModelRenderer(this);
        this.cube_r140.setRotationPoint(-0.1F, -0.3F, 0.1F);
        this.occipitalhorn2.addChild(cube_r140);
        this.setRotateAngle(cube_r140, 0.4626F, -0.4749F, -0.0723F);
        this.cube_r140.cubeList.add(new ModelBox(cube_r140, 33, 94, -0.277F, -0.4367F, -1.0008F, 1, 1, 2, -0.02F, true));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.1781F, 0.1139F);
        this.head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.1484F, 0.0F, 0.0F);


        this.cube_r141 = new AdvancedModelRenderer(this);
        this.cube_r141.setRotationPoint(0.0F, 0.8531F, -6.0154F);
        this.Jaw.addChild(cube_r141);
        this.setRotateAngle(cube_r141, -0.3316F, 0.0F, 0.0F);
        this.cube_r141.cubeList.add(new ModelBox(cube_r141, 89, 21, -0.5F, -1.0345F, -1.9822F, 1, 1, 2, 0.0F, false));

        this.cube_r142 = new AdvancedModelRenderer(this);
        this.cube_r142.setRotationPoint(0.0F, -0.5F, -6.9F);
        this.Jaw.addChild(cube_r142);
        this.setRotateAngle(cube_r142, -0.1396F, 0.0F, 0.0F);
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 58, 104, -1.5F, -0.8033F, 5.1173F, 3, 2, 2, 0.004F, false));
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 102, 38, -1.5F, -0.8033F, 3.0173F, 3, 2, 3, 0.0F, false));
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 89, 25, -0.5F, 0.1967F, 1.0173F, 1, 1, 2, -0.004F, false));
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 22, 73, -0.7F, -0.6462F, 1.5033F, 0, 1, 2, 0.0F, true));
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 0, 62, -0.6F, -0.3033F, 0.0173F, 0, 1, 3, 0.0F, true));
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 74, 46, -0.8F, -0.1033F, 0.0173F, 1, 1, 3, 0.003F, true));
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 22, 73, 0.7F, -0.6462F, 1.5033F, 0, 1, 2, 0.0F, false));
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 79, 37, 0.71F, -0.6462F, 1.5033F, 0, 1, 2, 0.0F, false));
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 0, 62, 0.6F, -0.3033F, 0.0173F, 0, 1, 3, 0.0F, false));
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 74, 46, -0.2F, -0.1033F, 0.0173F, 1, 1, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.hips.offsetZ = -0.3F;
        this.Jaw.rotateAngleX = (float) Math.toRadians(25);
        this.hips.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.5F;
        this.hips.offsetX = -0.1F;
        this.hips.rotateAngleY = (float)Math.toRadians(135);
        this.hips.rotateAngleX = (float)Math.toRadians(0);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.4F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        //this.setRotateAngle(root, 0.2618F, 0.0F, 0.0F);

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {

        EntityPrehistoricFloraScelidosaurus walker = (EntityPrehistoricFloraScelidosaurus) e;

        AdvancedModelRenderer[] tailFull = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck3, this.neck2, this.neck, this.head};

        walker.tailBuffer.applyChainSwingBuffer(tailFull);

        float speed = 0.2F;

        this.hips.offsetZ = 0.4F;

        //Animations:

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 4, head);

        if (walker.getAnimation() == walker.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!walker.isReallyInWater()) {

                if (f3 == 0.0F || !walker.getIsMoving()) {
                    if (walker.getAnimation() != walker.EAT_ANIMATION
                            && (!walker.isAnimationDirectionLocked(walker.getAnimation()))) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(tailFull, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(tailFull, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    return;
                }

                if (walker.getIsFast()) { //Running


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
        EntityPrehistoricFloraScelidosaurus ee = (EntityPrehistoricFloraScelidosaurus) entitylivingbaseIn;

        if ((!ee.isQuad() && ee.getAnimation() != ee.TOBI_ANIMATION) || ee.getAnimation() == ee.TOQUAD_ANIMATION) {
            //Bipedal Pose

            //And now the pose:

            this.setRotateAngle(bipartiteOsteoderm, -0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(bipartiteOsteoderm2, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(bipartiteOsteoderm5, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r10, -0.0139F, 0.01F, -0.4749F);
            this.setRotateAngle(cube_r100, -0.0369F, 0.2432F, 0.3818F);
            this.setRotateAngle(cube_r101, -0.237F, 0.2022F, 0.424F);
            this.setRotateAngle(cube_r102, 0.3665F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r103, 0.4382F, 0.108F, -0.2863F);
            this.setRotateAngle(cube_r104, 0.3313F, -0.3042F, 0.4512F);
            this.setRotateAngle(cube_r105, 0.0775F, 0.0588F, 0.0266F);
            this.setRotateAngle(cube_r106, 0.0778F, -0.1152F, 0.0131F);
            this.setRotateAngle(cube_r107, -0.0369F, -0.2432F, -0.3818F);
            this.setRotateAngle(cube_r108, -0.237F, -0.2022F, -0.424F);
            this.setRotateAngle(cube_r109, 0.0701F, -0.0871F, -0.0061F);
            this.setRotateAngle(cube_r11, 0.0F, -0.6981F, 0.0F);
            this.setRotateAngle(cube_r110, 0.0701F, 0.0871F, 0.0061F);
            this.setRotateAngle(cube_r111, -0.0853F, -0.0499F, 0.6517F);
            this.setRotateAngle(cube_r112, 0.7222F, 0.103F, 1.1295F);
            this.setRotateAngle(cube_r113, -0.0853F, 0.0499F, -0.6517F);
            this.setRotateAngle(cube_r114, 0.7222F, -0.103F, -1.1295F);
            this.setRotateAngle(cube_r115, 0.1047F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r116, 0.1056F, -0.1302F, -0.0138F);
            this.setRotateAngle(cube_r117, 0.1056F, 0.1302F, 0.0138F);
            this.setRotateAngle(cube_r118, -0.0853F, -0.0499F, 0.6517F);
            this.setRotateAngle(cube_r119, 0.8131F, -0.1118F, 1.0413F);
            this.setRotateAngle(cube_r12, -0.0524F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r120, -0.0853F, 0.0499F, -0.6517F);
            this.setRotateAngle(cube_r121, 0.8131F, 0.1118F, -1.0413F);
            this.setRotateAngle(cube_r122, -0.2443F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r123, 0.0F, 0.0F, -0.1309F);
            this.setRotateAngle(cube_r124, 0.0F, 0.0F, -0.8727F);
            this.setRotateAngle(cube_r125, -0.0853F, 0.0499F, -0.6517F);
            this.setRotateAngle(cube_r126, -0.0853F, -0.0499F, 0.6517F);
            this.setRotateAngle(cube_r127, 0.0F, 0.0F, 0.1309F);
            this.setRotateAngle(cube_r128, 0.0F, 0.0F, 0.8727F);
            this.setRotateAngle(cube_r129, 0.1231F, -0.535F, -0.3498F);
            this.setRotateAngle(cube_r13, -0.118F, -0.0342F, 0.3052F);
            this.setRotateAngle(cube_r130, 0.1231F, 0.535F, 0.3498F);
            this.setRotateAngle(cube_r131, -0.0349F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r132, 0.096F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r133, 0.2705F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r134, 0.6981F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r135, 0.4451F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r136, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r137, 1.0279F, 1.0889F, 0.8212F);
            this.setRotateAngle(cube_r138, 0.4626F, 0.4749F, 0.0723F);
            this.setRotateAngle(cube_r139, 1.0279F, -1.0889F, -0.8212F);
            this.setRotateAngle(cube_r14, -0.0714F, -0.1243F, -0.465F);
            this.setRotateAngle(cube_r140, 0.4626F, -0.4749F, -0.0723F);
            this.setRotateAngle(cube_r141, -0.3316F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r142, -0.1396F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r15, -0.0524F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r16, -0.118F, 0.0342F, -0.3052F);
            this.setRotateAngle(cube_r17, -0.0714F, 0.1243F, 0.465F);
            this.setRotateAngle(cube_r18, 0.0F, -0.0873F, 0.0F);
            this.setRotateAngle(cube_r19, -0.0151F, 0.5853F, 0.4205F);
            this.setRotateAngle(cube_r2, 0.0007F, -0.0013F, -0.4648F);
            this.setRotateAngle(cube_r20, -0.0211F, 0.603F, -0.5243F);
            this.setRotateAngle(cube_r21, 0.093F, 0.6524F, -0.4572F);
            this.setRotateAngle(cube_r22, 0.0F, 0.0873F, 0.0F);
            this.setRotateAngle(cube_r23, -0.0151F, -0.5853F, -0.4205F);
            this.setRotateAngle(cube_r24, -0.0211F, -0.603F, 0.5243F);
            this.setRotateAngle(cube_r25, 0.093F, -0.6524F, 0.4572F);
            this.setRotateAngle(cube_r26, 0.0F, -0.0349F, 0.0F);
            this.setRotateAngle(cube_r27, 0.0F, -0.0873F, -0.48F);
            this.setRotateAngle(cube_r28, 0.0F, -0.0873F, 0.48F);
            this.setRotateAngle(cube_r29, 0.0F, 0.0349F, 0.0F);
            this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.1745F);
            this.setRotateAngle(cube_r30, 0.0F, 0.0873F, 0.48F);
            this.setRotateAngle(cube_r31, 0.0F, 0.0873F, -0.48F);
            this.setRotateAngle(cube_r32, 0.0F, -0.0262F, 0.0F);
            this.setRotateAngle(cube_r33, 0.0233F, -0.0561F, -0.4818F);
            this.setRotateAngle(cube_r34, 0.0F, -0.0873F, 0.3927F);
            this.setRotateAngle(cube_r35, 0.0F, 0.0262F, 0.0F);
            this.setRotateAngle(cube_r36, 0.0233F, 0.0561F, 0.4818F);
            this.setRotateAngle(cube_r37, 0.0F, 0.0873F, -0.3927F);
            this.setRotateAngle(cube_r38, 0.0F, -0.0873F, 0.3054F);
            this.setRotateAngle(cube_r39, 0.0435F, -0.035F, -0.3031F);
            this.setRotateAngle(cube_r4, 0.0734F, -0.01F, 0.4749F);
            this.setRotateAngle(cube_r40, 0.0F, -0.0349F, 0.0F);
            this.setRotateAngle(cube_r41, 0.0F, 0.0873F, -0.3054F);
            this.setRotateAngle(cube_r42, 0.0435F, 0.035F, 0.3031F);
            this.setRotateAngle(cube_r43, 0.0F, 0.0349F, 0.0F);
            this.setRotateAngle(cube_r44, 0.0F, -0.0175F, 0.0F);
            this.setRotateAngle(cube_r45, 0.0F, -0.0873F, -0.2618F);
            this.setRotateAngle(cube_r46, 0.0341F, -0.0692F, 0.3945F);
            this.setRotateAngle(cube_r47, 0.0F, 0.0175F, 0.0F);
            this.setRotateAngle(cube_r48, 0.0F, 0.0873F, 0.2618F);
            this.setRotateAngle(cube_r49, 0.0341F, 0.0692F, -0.3945F);
            this.setRotateAngle(cube_r5, -0.0139F, -0.01F, 0.4749F);
            this.setRotateAngle(cube_r50, 0.1833F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r51, 0.117F, -0.01F, 0.4749F);
            this.setRotateAngle(cube_r52, 0.0297F, -0.01F, 0.4749F);
            this.setRotateAngle(cube_r53, 0.0297F, -0.01F, 0.4749F);
            this.setRotateAngle(cube_r54, -0.0577F, 0.0771F, 0.4698F);
            this.setRotateAngle(cube_r55, 0.0421F, -0.0113F, 0.2616F);
            this.setRotateAngle(cube_r56, 0.0421F, -0.0113F, 0.2616F);
            this.setRotateAngle(cube_r57, 0.0421F, -0.0113F, 0.2616F);
            this.setRotateAngle(cube_r58, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r59, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, 0.0F, 0.6981F, 0.0F);
            this.setRotateAngle(cube_r60, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r61, -0.0178F, 0.0216F, 0.1801F);
            this.setRotateAngle(cube_r62, 0.1267F, 0.3479F, -0.4397F);
            this.setRotateAngle(cube_r63, 0.0164F, 0.0063F, -0.4743F);
            this.setRotateAngle(cube_r64, 0.0164F, 0.0063F, -0.4743F);
            this.setRotateAngle(cube_r65, 0.1195F, 0.088F, -0.4725F);
            this.setRotateAngle(cube_r66, 0.175F, -0.0548F, 0.3006F);
            this.setRotateAngle(cube_r67, 0.1833F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r68, 0.0F, 0.0F, 0.3054F);
            this.setRotateAngle(cube_r69, 0.117F, 0.01F, -0.4749F);
            this.setRotateAngle(cube_r7, 0.0007F, 0.0013F, 0.4648F);
            this.setRotateAngle(cube_r70, 0.0297F, 0.01F, -0.4749F);
            this.setRotateAngle(cube_r71, 0.0297F, 0.01F, -0.4749F);
            this.setRotateAngle(cube_r72, -0.0577F, -0.0771F, -0.4698F);
            this.setRotateAngle(cube_r73, 0.0421F, 0.0113F, -0.2616F);
            this.setRotateAngle(cube_r74, 0.0421F, 0.0113F, -0.2616F);
            this.setRotateAngle(cube_r75, 0.0421F, 0.0113F, -0.2616F);
            this.setRotateAngle(cube_r76, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r77, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r78, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r79, -0.0178F, -0.0216F, -0.1801F);
            this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.1745F);
            this.setRotateAngle(cube_r80, 0.1267F, -0.3479F, 0.4397F);
            this.setRotateAngle(cube_r81, 0.0164F, -0.0063F, 0.4743F);
            this.setRotateAngle(cube_r82, 0.0164F, -0.0063F, 0.4743F);
            this.setRotateAngle(cube_r83, 0.1195F, -0.088F, 0.4725F);
            this.setRotateAngle(cube_r84, 0.175F, 0.0548F, -0.3006F);
            this.setRotateAngle(cube_r85, 0.1833F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r86, 0.0F, 0.0F, -0.3054F);
            this.setRotateAngle(cube_r87, -0.3054F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r88, 0.3665F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r89, 0.1876F, 0.6219F, 0.2156F);
            this.setRotateAngle(cube_r9, 0.0734F, 0.01F, -0.4749F);
            this.setRotateAngle(cube_r90, 0.2505F, -0.3452F, 0.0147F);
            this.setRotateAngle(cube_r91, -0.1442F, -0.3293F, 0.1524F);
            this.setRotateAngle(cube_r92, 0.1876F, -0.6219F, -0.2156F);
            this.setRotateAngle(cube_r93, 0.2505F, 0.3452F, -0.0147F);
            this.setRotateAngle(cube_r94, -0.1442F, 0.3293F, -0.1524F);
            this.setRotateAngle(cube_r95, 0.3665F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r96, 0.4382F, -0.108F, 0.2863F);
            this.setRotateAngle(cube_r97, 0.3313F, 0.3042F, -0.4512F);
            this.setRotateAngle(cube_r98, 0.0775F, -0.0588F, -0.0266F);
            this.setRotateAngle(cube_r99, 0.0778F, 0.1152F, -0.0131F);
            this.setRotateAngle(head, 0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, 0.1484F, 0.0F, 0.0F);
            this.setRotateAngle(leftArm, 0.9105F, 0.045F, -0.258F);
            this.setRotateAngle(leftArm2, -1.2745F, 0.2426F, 0.3534F);
            this.setRotateAngle(leftArm3, 1.9199F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg, -0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg2, 0.9163F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg3, -1.0472F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg4, 0.5236F, 0.0F, 0.0F);
            this.setRotateAngle(neck, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, -0.4712F, 0.0F, 0.0F);
            this.setRotateAngle(neck3, 0.2531F, 0.0F, 0.0F);
            this.setRotateAngle(rightArm, 0.9105F, -0.045F, 0.258F);
            this.setRotateAngle(rightArm2, -1.2745F, -0.2426F, -0.3534F);
            this.setRotateAngle(rightArm3, 1.9199F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg, -0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg2, 0.9163F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg3, -1.0472F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg4, 0.5236F, 0.0F, 0.0F);
            this.setRotateAngle(tail, -0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(tail3, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(tail4, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(tail5, -0.1745F, 0.0F, 0.0F);





        }

                //Is Walking:
        if (ee.getIsMoving() && !ee.isQuad()) {
            if(ee.getIsFast()) {
                animRunBi(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalkBi(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        } else if(ee.getIsMoving() && ee.isQuad()){
            animWalkQuad(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }




        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }



    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraScelidosaurus entity = (EntityPrehistoricFloraScelidosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17 + (((tickAnim - 10) / 10) * (0-(17)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 22.25 + (((tickAnim - 10) / 10) * (0-(22.25)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 19.25 + (((tickAnim - 10) / 10) * (0-(19.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (14.63-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 14.63 + (((tickAnim - 5) / 5) * (1.25-(14.63)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 1.25 + (((tickAnim - 10) / 3) * (11.19-(1.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 11.19 + (((tickAnim - 13) / 7) * (0-(11.19)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 10.25 + (((tickAnim - 5) / 5) * (0-(10.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));
        

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraScelidosaurus entity = (EntityPrehistoricFloraScelidosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.75 + (((tickAnim - 20) / 10) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.75 + (((tickAnim - 30) / 20) * (0-(-7.75)));
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
            yy = 0 + (((tickAnim - 0) / 20) * (-6.275-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.95-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -6.275 + (((tickAnim - 20) / 10) * (-6.275-(-6.275)));
            zz = 0.95 + (((tickAnim - 20) / 10) * (0.95-(0.95)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -6.275 + (((tickAnim - 30) / 20) * (0-(-6.275)));
            zz = 0.95 + (((tickAnim - 30) / 20) * (0-(0.95)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -13 + (((tickAnim - 20) / 10) * (-13-(-13)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -13 + (((tickAnim - 30) / 20) * (0-(-13)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 34.25 + (((tickAnim - 20) / 10) * (34.25-(34.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 34.25 + (((tickAnim - 30) / 20) * (0-(34.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -29.5 + (((tickAnim - 20) / 10) * (-29.5-(-29.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -29.5 + (((tickAnim - 30) / 20) * (0-(-29.5)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 17.5 + (((tickAnim - 20) / 10) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 17.5 + (((tickAnim - 30) / 20) * (0-(17.5)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.55-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.5 + (((tickAnim - 20) / 10) * (1.5-(1.5)));
            zz = -0.55 + (((tickAnim - 20) / 10) * (-0.55-(-0.55)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.5 + (((tickAnim - 30) / 20) * (0-(1.5)));
            zz = -0.55 + (((tickAnim - 30) / 20) * (0-(-0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -6.5 + (((tickAnim - 20) / 10) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -6.5 + (((tickAnim - 30) / 20) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -9.5 + (((tickAnim - 20) / 10) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -9.5 + (((tickAnim - 30) / 20) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (2-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2 + (((tickAnim - 20) / 10) * (2-(2)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 2 + (((tickAnim - 30) / 20) * (0-(2)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (19.25-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 19.25 + (((tickAnim - 20) / 10) * (19.25-(19.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 19.25 + (((tickAnim - 30) / 3) * (9.29-(19.25)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 9.29 + (((tickAnim - 33) / 6) * (0-(9.29)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 39) / 4) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -1.75 + (((tickAnim - 43) / 7) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (27.25-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 27.25 + (((tickAnim - 20) / 10) * (27.25-(27.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 27.25 + (((tickAnim - 30) / 3) * (23.09-(27.25)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 23.09 + (((tickAnim - 33) / 6) * (0-(23.09)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 39) / 4) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -5.75 + (((tickAnim - 43) / 7) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (33.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 33.25 + (((tickAnim - 20) / 10) * (33.25-(33.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 33.25 + (((tickAnim - 30) / 20) * (0-(33.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-51.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -51.75 + (((tickAnim - 20) / 10) * (-51.75-(-51.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -51.75 + (((tickAnim - 30) / 20) * (0-(-51.75)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 27.5 + (((tickAnim - 20) / 10) * (27.5-(27.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 27.5 + (((tickAnim - 30) / 20) * (0-(27.5)));
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
            yy = 0 + (((tickAnim - 0) / 20) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.075-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.425 + (((tickAnim - 20) / 10) * (0.425-(0.425)));
            zz = -0.075 + (((tickAnim - 20) / 10) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.425 + (((tickAnim - 30) / 20) * (0-(0.425)));
            zz = -0.075 + (((tickAnim - 30) / 20) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 9.25 + (((tickAnim - 20) / 10) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 30) / 20) * (0-(9.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (33.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 33.25 + (((tickAnim - 20) / 10) * (33.25-(33.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 33.25 + (((tickAnim - 30) / 20) * (0-(33.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-51.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -51.75 + (((tickAnim - 20) / 10) * (-51.75-(-51.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -51.75 + (((tickAnim - 30) / 20) * (0-(-51.75)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 27.5 + (((tickAnim - 20) / 10) * (27.5-(27.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 27.5 + (((tickAnim - 30) / 20) * (0-(27.5)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.075-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.425 + (((tickAnim - 20) / 10) * (0.425-(0.425)));
            zz = -0.075 + (((tickAnim - 20) / 10) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.425 + (((tickAnim - 30) / 20) * (0-(0.425)));
            zz = -0.075 + (((tickAnim - 30) / 20) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -13 + (((tickAnim - 20) / 10) * (-13-(-13)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -13 + (((tickAnim - 30) / 20) * (0-(-13)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 34.25 + (((tickAnim - 20) / 10) * (34.25-(34.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 34.25 + (((tickAnim - 30) / 20) * (0-(34.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -29.5 + (((tickAnim - 20) / 10) * (-29.5-(-29.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -29.5 + (((tickAnim - 30) / 20) * (0-(-29.5)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 17.5 + (((tickAnim - 20) / 10) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 17.5 + (((tickAnim - 30) / 20) * (0-(17.5)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.55-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.5 + (((tickAnim - 20) / 10) * (1.5-(1.5)));
            zz = -0.55 + (((tickAnim - 20) / 10) * (-0.55-(-0.55)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.5 + (((tickAnim - 30) / 20) * (0-(1.5)));
            zz = -0.55 + (((tickAnim - 30) / 20) * (0-(-0.55)));
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
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraScelidosaurus entity = (EntityPrehistoricFloraScelidosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 21 + (((tickAnim - 20) / 15) * (-3.25-(21)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -3.25 + (((tickAnim - 35) / 15) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 21.5 + (((tickAnim - 20) / 15) * (-16.5-(21.5)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -16.5 + (((tickAnim - 35) / 15) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 11.75 + (((tickAnim - 20) / 8) * (-27.25-(11.75)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -27.25 + (((tickAnim - 28) / 7) * (-1.75-(-27.25)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -1.75 + (((tickAnim - 35) / 15) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (42.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 42.25 + (((tickAnim - 20) / 8) * (57.78-(42.25)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 57.78 + (((tickAnim - 28) / 7) * (22.5-(57.78)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 22.5 + (((tickAnim - 35) / 15) * (0-(22.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (2.375-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (-0.5-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 2.375 + (((tickAnim - 24) / 4) * (2.1-(2.375)));
            zz = -0.5 + (((tickAnim - 24) / 4) * (-1-(-0.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 2.1 + (((tickAnim - 28) / 7) * (0-(2.1)));
            zz = -1 + (((tickAnim - 28) / 7) * (0-(-1)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
        EntityPrehistoricFloraScelidosaurus entity = (EntityPrehistoricFloraScelidosaurus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 18) / 17) * (0-(-0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-4.19556-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-1.94438-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-3.20715-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -4.19556 + (((tickAnim - 18) / 17) * (0-(-4.19556)));
            yy = -1.94438 + (((tickAnim - 18) / 17) * (0-(-1.94438)));
            zz = -3.20715 + (((tickAnim - 18) / 17) * (0-(-3.20715)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-3.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -4.5 + (((tickAnim - 18) / 17) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = -3.5 + (((tickAnim - 18) / 17) * (0-(-3.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.95-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = 4.95 + (((tickAnim - 5) / 13) * (-13-(4.95)));
            yy = 0 + (((tickAnim - 5) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 13) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -13 + (((tickAnim - 18) / 17) * (0-(-13)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
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
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 5) / 13) * (10.75-(0)));
            yy = 0 + (((tickAnim - 5) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 13) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 10.75 + (((tickAnim - 18) / 7) * (0-(10.75)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraScelidosaurus entity = (EntityPrehistoricFloraScelidosaurus) entitylivingbaseIn;
        int animCycle = 200;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1 + (((tickAnim - 40) / 120) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1 + (((tickAnim - 160) / 40) * (0-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1)));
            yy = 0 + (((tickAnim - 160) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*1 + (((tickAnim - 40) / 120) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*1-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*1)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*1 + (((tickAnim - 160) / 40) * (0-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*1)));
            yy = 0 + (((tickAnim - 160) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1 + (((tickAnim - 40) / 120) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1 + (((tickAnim - 160) / 40) * (0-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1)));
            yy = 0 + (((tickAnim - 160) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1 + (((tickAnim - 40) / 120) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1 + (((tickAnim - 160) / 40) * (0-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1)));
            yy = 0 + (((tickAnim - 160) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 167) {
            xx = 7.75 + (((tickAnim - 60) / 107) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 60) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 107) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = 7.75 + (((tickAnim - 167) / 33) * (0-(7.75)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 167) {
            xx = -4.25 + (((tickAnim - 60) / 107) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 60) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 107) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = -4.25 + (((tickAnim - 167) / 33) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 167) {
            xx = -16 + (((tickAnim - 60) / 107) * (-16-(-16)));
            yy = 0 + (((tickAnim - 60) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 107) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = -16 + (((tickAnim - 167) / 33) * (0-(-16)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 167) {
            xx = 12.5 + (((tickAnim - 60) / 107) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 60) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 107) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = 12.5 + (((tickAnim - 167) / 33) * (0-(12.5)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 167) {
            xx = -4.25 + (((tickAnim - 60) / 107) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 60) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 107) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = -4.25 + (((tickAnim - 167) / 33) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 167) {
            xx = -16 + (((tickAnim - 60) / 107) * (-16-(-16)));
            yy = 0 + (((tickAnim - 60) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 107) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = -16 + (((tickAnim - 167) / 33) * (0-(-16)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 167) {
            xx = 12.5 + (((tickAnim - 60) / 107) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 60) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 107) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = 12.5 + (((tickAnim - 167) / 33) * (0-(12.5)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 85) {
            xx = 21.5 + (((tickAnim - 60) / 25) * (27-(21.5)));
            yy = 0 + (((tickAnim - 60) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 25) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 120) {
            xx = 27 + (((tickAnim - 85) / 35) * (20.25-(27)));
            yy = 0 + (((tickAnim - 85) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 35) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 20.25 + (((tickAnim - 120) / 30) * (21.5-(20.25)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 167) {
            xx = 21.5 + (((tickAnim - 150) / 17) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 150) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 17) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = 21.5 + (((tickAnim - 167) / 33) * (0-(21.5)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 85) {
            xx = 30 + (((tickAnim - 60) / 25) * (22-(30)));
            yy = 0 + (((tickAnim - 60) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 25) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 120) {
            xx = 22 + (((tickAnim - 85) / 35) * (7-(22)));
            yy = 0 + (((tickAnim - 85) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 35) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 7 + (((tickAnim - 120) / 30) * (30-(7)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 167) {
            xx = 30 + (((tickAnim - 150) / 17) * (30-(30)));
            yy = 0 + (((tickAnim - 150) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 17) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = 30 + (((tickAnim - 167) / 33) * (0-(30)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 85) {
            xx = 17.75 + (((tickAnim - 60) / 25) * (2.5-(17.75)));
            yy = 0 + (((tickAnim - 60) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 25) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 120) {
            xx = 2.5 + (((tickAnim - 85) / 35) * (17.75-(2.5)));
            yy = 0 + (((tickAnim - 85) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 35) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 17.75 + (((tickAnim - 120) / 15) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 143) {
            xx = 17.75 + (((tickAnim - 135) / 8) * (23-(17.75)));
            yy = 0 + (((tickAnim - 135) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 8) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 150) {
            xx = 23 + (((tickAnim - 143) / 7) * (11.5-(23)));
            yy = 0 + (((tickAnim - 143) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 7) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 11.5 + (((tickAnim - 150) / 10) * (7.25-(11.5)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 167) {
            xx = 7.25 + (((tickAnim - 160) / 7) * (11.5-(7.25)));
            yy = 0 + (((tickAnim - 160) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 7) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = 11.5 + (((tickAnim - 167) / 33) * (0-(11.5)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 60) / 25) * (0-(0)));
            yy = -0.25 + (((tickAnim - 60) / 25) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 60) / 25) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 85) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 35) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 85) / 35) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            yy = -0.25 + (((tickAnim - 120) / 15) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 135) / 15) * (0-(0)));
            yy = -0.25 + (((tickAnim - 135) / 15) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 135) / 15) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 167) {
            xx = 0 + (((tickAnim - 150) / 17) * (0-(0)));
            yy = -0.25 + (((tickAnim - 150) / 17) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 150) / 17) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            yy = -0.25 + (((tickAnim - 167) / 33) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (6.92-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 6.92 + (((tickAnim - 40) / 20) * (-12.5-(6.92)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 85) {
            xx = -12.5 + (((tickAnim - 60) / 25) * (12.25-(-12.5)));
            yy = 0 + (((tickAnim - 60) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 25) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 91) {
            xx = 12.25 + (((tickAnim - 85) / 6) * (12.17-(12.25)));
            yy = 0 + (((tickAnim - 85) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 6) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 98) {
            xx = 12.17 + (((tickAnim - 91) / 7) * (12.5-(12.17)));
            yy = 0 + (((tickAnim - 91) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 7) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 120) {
            xx = 12.5 + (((tickAnim - 98) / 22) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 98) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 22) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 12.5 + (((tickAnim - 120) / 15) * (0-(12.5)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 135) / 8) * (-11.94-(0)));
            yy = 0 + (((tickAnim - 135) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 8) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 150) {
            xx = -11.94 + (((tickAnim - 143) / 7) * (-3.25-(-11.94)));
            yy = 0 + (((tickAnim - 143) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 7) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = -3.25 + (((tickAnim - 150) / 10) * (0.06-(-3.25)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 167) {
            xx = 0.06 + (((tickAnim - 160) / 7) * (-3.25-(0.06)));
            yy = 0 + (((tickAnim - 160) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 7) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = -3.25 + (((tickAnim - 167) / 33) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 167) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 33) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 40) / 12) * (10-(0)));
            yy = 0 + (((tickAnim - 40) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 12) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 10 + (((tickAnim - 52) / 8) * (0-(10)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 60) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 25) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 85) / 6) * (4-(0)));
            yy = 0 + (((tickAnim - 85) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 6) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 98) {
            xx = 4 + (((tickAnim - 91) / 7) * (0-(4)));
            yy = 0 + (((tickAnim - 91) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 7) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 98) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 98) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 22) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 135) / 8) * (9.5-(0)));
            yy = 0 + (((tickAnim - 135) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 8) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 150) {
            xx = 9.5 + (((tickAnim - 143) / 7) * (0-(9.5)));
            yy = 0 + (((tickAnim - 143) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 7) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 150) / 10) * (9.5-(0)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 167) {
            xx = 9.5 + (((tickAnim - 160) / 7) * (0-(9.5)));
            yy = 0 + (((tickAnim - 160) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animWalkBi(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraScelidosaurus entity = (EntityPrehistoricFloraScelidosaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-20))*2), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*-2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*-2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-20))*0.55);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-20))*0.4);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -6 + (((tickAnim - 0) / 15) * (30.75-(-6)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 30.75 + (((tickAnim - 15) / 8) * (12.44691-(30.75)));
            yy = 0 + (((tickAnim - 15) / 8) * (-5.38745-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (-0.31039-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 12.44691 + (((tickAnim - 23) / 7) * (-6-(12.44691)));
            yy = -5.38745 + (((tickAnim - 23) / 7) * (0-(-5.38745)));
            zz = -0.31039 + (((tickAnim - 23) / 7) * (0-(-0.31039)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -23.25 + (((tickAnim - 0) / 15) * (9.5-(-23.25)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 9.5 + (((tickAnim - 15) / 4) * (18.02-(9.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 18.02 + (((tickAnim - 19) / 11) * (-23.25-(18.02)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0.8 + (((tickAnim - 0) / 15) * (0-(0.8)));
            zz = -0.35 + (((tickAnim - 0) / 15) * (0-(-0.35)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0.8-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (-0.35-(0)));
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
            xx = 15.75 + (((tickAnim - 0) / 15) * (24.75-(15.75)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 24.75 + (((tickAnim - 15) / 4) * (-12.67-(24.75)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -12.67 + (((tickAnim - 19) / 6) * (-30.01-(-12.67)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -30.01 + (((tickAnim - 25) / 5) * (15.75-(-30.01)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 13 + (((tickAnim - 0) / 5) * (-9.75-(13)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -9.75 + (((tickAnim - 5) / 10) * (38-(-9.75)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 38 + (((tickAnim - 15) / 4) * (67.3-(38)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 67.3 + (((tickAnim - 19) / 6) * (74.39-(67.3)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 74.39 + (((tickAnim - 25) / 5) * (13-(74.39)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 5) * (1-(0.275)));
            zz = -0.2 + (((tickAnim - 0) / 5) * (0-(-0.2)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 5) / 10) * (0.85-(1)));
            zz = 0 + (((tickAnim - 5) / 10) * (-0.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0.85 + (((tickAnim - 15) / 4) * (1.55-(0.85)));
            zz = -0.25 + (((tickAnim - 15) / 4) * (-0.715-(-0.25)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 1.55 + (((tickAnim - 19) / 6) * (1.3-(1.55)));
            zz = -0.715 + (((tickAnim - 19) / 6) * (-0.855-(-0.715)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 1.3 + (((tickAnim - 25) / 5) * (0.275-(1.3)));
            zz = -0.855 + (((tickAnim - 25) / 5) * (-0.2-(-0.855)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 30.75 + (((tickAnim - 0) / 8) * (12.44691-(30.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (5.38745-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.31039-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 12.44691 + (((tickAnim - 8) / 7) * (-6-(12.44691)));
            yy = 5.38745 + (((tickAnim - 8) / 7) * (0-(5.38745)));
            zz = 0.31039 + (((tickAnim - 8) / 7) * (0-(0.31039)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -6 + (((tickAnim - 15) / 15) * (30.75-(-6)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 9.5 + (((tickAnim - 0) / 3) * (18.02-(9.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 18.02 + (((tickAnim - 3) / 12) * (-23.25-(18.02)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -23.25 + (((tickAnim - 15) / 15) * (9.5-(-23.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(0);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(0.8);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(-0.35);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 24.75 + (((tickAnim - 0) / 4) * (-12.67-(24.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -12.67 + (((tickAnim - 4) / 6) * (-30.01-(-12.67)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -30.01 + (((tickAnim - 10) / 5) * (15.75-(-30.01)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 15.75 + (((tickAnim - 15) / 15) * (24.75-(15.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 38 + (((tickAnim - 0) / 4) * (67.3-(38)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 67.3 + (((tickAnim - 4) / 6) * (74.39-(67.3)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 74.39 + (((tickAnim - 10) / 5) * (13-(74.39)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 13 + (((tickAnim - 15) / 5) * (-12.5-(13)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -12.5 + (((tickAnim - 20) / 10) * (38-(-12.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.85 + (((tickAnim - 0) / 4) * (1.55-(0.85)));
            zz = -0.25 + (((tickAnim - 0) / 4) * (-0.715-(-0.25)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 1.55 + (((tickAnim - 4) / 6) * (1.3-(1.55)));
            zz = -0.715 + (((tickAnim - 4) / 6) * (-0.855-(-0.715)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 1.3 + (((tickAnim - 10) / 5) * (0.275-(1.3)));
            zz = -0.855 + (((tickAnim - 10) / 5) * (-0.2-(-0.855)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0.275 + (((tickAnim - 15) / 2) * (0.845-(0.275)));
            zz = -0.2 + (((tickAnim - 15) / 2) * (-0.21-(-0.2)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.845 + (((tickAnim - 17) / 3) * (0.895-(0.845)));
            zz = -0.21 + (((tickAnim - 17) / 3) * (-0.22-(-0.21)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.895 + (((tickAnim - 20) / 10) * (0.85-(0.895)));
            zz = -0.22 + (((tickAnim - 20) / 10) * (-0.25-(-0.22)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*2), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*-2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-200))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-140))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*-4));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-250))*3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-190))*-6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*-4));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-300))*4), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-230))*-9), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*-4));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-350))*5), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-280))*-10), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*-4));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-90))*-2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*2), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*-1));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0.425);


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*2), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*-1));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*2), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*-1));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-200))*3), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-300))*-1));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*2), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*-1));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*2), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*-1));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-200))*3), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-300))*-1));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*2), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-200))*2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*-2));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-250))*-2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-300))*3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunBi(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraScelidosaurus entity = (EntityPrehistoricFloraScelidosaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-20))*4), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-4), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-20))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-20))*0.9);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -8.75 + (((tickAnim - 0) / 8) * (41.5-(-8.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 41.5 + (((tickAnim - 8) / 4) * (12.44691-(41.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (-5.38745-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (-0.31039-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 12.44691 + (((tickAnim - 12) / 3) * (-8.75-(12.44691)));
            yy = -5.38745 + (((tickAnim - 12) / 3) * (0-(-5.38745)));
            zz = -0.31039 + (((tickAnim - 12) / 3) * (0-(-0.31039)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -23.25 + (((tickAnim - 0) / 8) * (9.5-(-23.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 9.5 + (((tickAnim - 8) / 1) * (18.02-(9.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 18.02 + (((tickAnim - 9) / 6) * (-23.25-(18.02)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.8 + (((tickAnim - 0) / 8) * (0-(0.8)));
            zz = -0.35 + (((tickAnim - 0) / 8) * (0-(-0.35)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0.8-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-0.35-(0)));
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
            xx = 19.75 + (((tickAnim - 0) / 8) * (24.75-(19.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 24.75 + (((tickAnim - 8) / 1) * (-12.67-(24.75)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -12.67 + (((tickAnim - 9) / 4) * (-30.01-(-12.67)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -30.01 + (((tickAnim - 13) / 2) * (19.75-(-30.01)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 13 + (((tickAnim - 0) / 3) * (-9.75-(13)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -9.75 + (((tickAnim - 3) / 5) * (38-(-9.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 38 + (((tickAnim - 8) / 1) * (67.3-(38)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 67.3 + (((tickAnim - 9) / 4) * (74.39-(67.3)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 74.39 + (((tickAnim - 13) / 2) * (13-(74.39)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 3) * (1-(0.275)));
            zz = -0.2 + (((tickAnim - 0) / 3) * (0-(-0.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1 + (((tickAnim - 3) / 5) * (0.85-(1)));
            zz = 0 + (((tickAnim - 3) / 5) * (-0.25-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.85 + (((tickAnim - 8) / 1) * (1.55-(0.85)));
            zz = -0.25 + (((tickAnim - 8) / 1) * (-0.715-(-0.25)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 1.55 + (((tickAnim - 9) / 4) * (1.3-(1.55)));
            zz = -0.715 + (((tickAnim - 9) / 4) * (-0.855-(-0.715)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.3 + (((tickAnim - 13) / 2) * (0.275-(1.3)));
            zz = -0.855 + (((tickAnim - 13) / 2) * (-0.2-(-0.855)));
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
            xx = 41.5 + (((tickAnim - 0) / 4) * (12.44691-(41.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (5.38745-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.31039-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 12.44691 + (((tickAnim - 4) / 4) * (-8.75-(12.44691)));
            yy = 5.38745 + (((tickAnim - 4) / 4) * (0-(5.38745)));
            zz = 0.31039 + (((tickAnim - 4) / 4) * (0-(0.31039)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -8.75 + (((tickAnim - 8) / 7) * (41.5-(-8.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 9.5 + (((tickAnim - 0) / 2) * (18.02-(9.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 18.02 + (((tickAnim - 2) / 6) * (-23.25-(18.02)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -23.25 + (((tickAnim - 8) / 7) * (9.5-(-23.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(0);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(0.8);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(-0.35);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 24.75 + (((tickAnim - 0) / 2) * (-12.67-(24.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -12.67 + (((tickAnim - 2) / 3) * (-30.01-(-12.67)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -30.01 + (((tickAnim - 5) / 3) * (19.75-(-30.01)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 19.75 + (((tickAnim - 8) / 7) * (24.75-(19.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 38 + (((tickAnim - 0) / 2) * (67.3-(38)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 67.3 + (((tickAnim - 2) / 3) * (74.39-(67.3)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 74.39 + (((tickAnim - 5) / 3) * (13-(74.39)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 13 + (((tickAnim - 8) / 2) * (-12.5-(13)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -12.5 + (((tickAnim - 10) / 5) * (38-(-12.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.85 + (((tickAnim - 0) / 2) * (1.55-(0.85)));
            zz = -0.25 + (((tickAnim - 0) / 2) * (-0.715-(-0.25)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 1.55 + (((tickAnim - 2) / 3) * (1.3-(1.55)));
            zz = -0.715 + (((tickAnim - 2) / 3) * (-0.855-(-0.715)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.3 + (((tickAnim - 5) / 3) * (0.275-(1.3)));
            zz = -0.855 + (((tickAnim - 5) / 3) * (-0.2-(-0.855)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.275 + (((tickAnim - 8) / 0) * (0.845-(0.275)));
            zz = -0.2 + (((tickAnim - 8) / 0) * (-0.21-(-0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.845 + (((tickAnim - 8) / 2) * (0.895-(0.845)));
            zz = -0.21 + (((tickAnim - 8) / 2) * (-0.22-(-0.21)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.895 + (((tickAnim - 10) / 5) * (0.85-(0.895)));
            zz = -0.22 + (((tickAnim - 10) / 5) * (-0.25-(-0.22)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-150))*4), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-4), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-200))*4), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-140))*-8), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-8));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-250))*6), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-190))*-9), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-8));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-300))*8), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-230))*-12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-8));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-350))*5), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-280))*-13), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-4));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-90))*-4), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*4), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-100))*4), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*-3));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0.425);


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-100))*4), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*-3));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-150))*4), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*-3));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-200))*5), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-300))*-3));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-100))*4), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*-3));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-150))*4), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*-3));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-200))*5), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-300))*-3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-150))*4), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*4));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-200))*4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*-4));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-250))*-4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-300))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animWalkQuad(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraScelidosaurus entity = (EntityPrehistoricFloraScelidosaurus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-90))*1.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+90))*2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-120))*0.25);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-150))*0.3);



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 15.5 + (((tickAnim - 0) / 12) * (31.5-(15.5)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 31.5 + (((tickAnim - 12) / 6) * (15.73785-(31.5)));
            yy = 0 + (((tickAnim - 12) / 6) * (-2.96303-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0.46972-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 15.73785 + (((tickAnim - 18) / 6) * (0-(15.73785)));
            yy = -2.96303 + (((tickAnim - 18) / 6) * (0-(-2.96303)));
            zz = 0.46972 + (((tickAnim - 18) / 6) * (0-(0.46972)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (15.5-(0)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 2.25 + (((tickAnim - 12) / 1) * (7.36-(2.25)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = 7.36 + (((tickAnim - 13) / 11) * (-16.25-(7.36)));
            yy = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 11) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = -16.25 + (((tickAnim - 24) / 11) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (-0.1-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = 0.275 + (((tickAnim - 24) / 11) * (0-(0.275)));
            zz = -0.1 + (((tickAnim - 24) / 11) * (0-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (21.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 21.25 + (((tickAnim - 12) / 6) * (-28.62-(21.25)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -28.62 + (((tickAnim - 18) / 3) * (-28.62-(-28.62)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -28.62 + (((tickAnim - 21) / 3) * (-4-(-28.62)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = -4 + (((tickAnim - 24) / 11) * (0-(-4)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -13.25 + (((tickAnim - 0) / 12) * (15.25-(-13.25)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 15.25 + (((tickAnim - 12) / 2) * (42.5-(15.25)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 42.5 + (((tickAnim - 14) / 4) * (59.46-(42.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 59.46 + (((tickAnim - 18) / 3) * (59.46-(59.46)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 59.46 + (((tickAnim - 21) / 3) * (20.5-(59.46)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 20.5 + (((tickAnim - 24) / 11) * (-13.25-(20.5)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (1.6-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 1.6 + (((tickAnim - 12) / 4) * (2.51-(1.6)));
            zz = 0 + (((tickAnim - 12) / 4) * (-0.81-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 2.51 + (((tickAnim - 16) / 2) * (1.81-(2.51)));
            zz = -0.81 + (((tickAnim - 16) / 2) * (-0.765-(-0.81)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 1.81 + (((tickAnim - 18) / 3) * (1.81-(1.81)));
            zz = -0.765 + (((tickAnim - 18) / 3) * (-0.765-(-0.765)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            yy = 1.81 + (((tickAnim - 21) / 3) * (0-(1.81)));
            zz = -0.765 + (((tickAnim - 21) / 3) * (0.1-(-0.765)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0.1 + (((tickAnim - 24) / 11) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-120))*-2), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+120))*-4), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+100))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-200))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+150))*-6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+150))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-250))*3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*-9), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+200))*-2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-300))*4), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+250))*12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+200))*-2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-350))*5), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+350))*-15), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+200))*-2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-150))*-1.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+90))*-2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-200))*2.5), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+90))*-1), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+20))*-4));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 18.85 + (((tickAnim - 0) / 3) * (25.75-(18.85)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 25.75 + (((tickAnim - 3) / 6) * (-6.21894-(25.75)));
            yy = 0 + (((tickAnim - 3) / 6) * (-2.18117-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (9.26579-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -6.21894 + (((tickAnim - 9) / 7) * (-32-(-6.21894)));
            yy = -2.18117 + (((tickAnim - 9) / 7) * (0-(-2.18117)));
            zz = 9.26579 + (((tickAnim - 9) / 7) * (0-(9.26579)));
        }
        else if (tickAnim >= 16 && tickAnim < 35) {
            xx = -32 + (((tickAnim - 16) / 19) * (18.85-(-32)));
            yy = 0 + (((tickAnim - 16) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 16.45 + (((tickAnim - 0) / 3) * (17.75-(16.45)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 17.75 + (((tickAnim - 3) / 6) * (-45-(17.75)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -45 + (((tickAnim - 9) / 7) * (10.25-(-45)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 35) {
            xx = 10.25 + (((tickAnim - 16) / 19) * (16.45-(10.25)));
            yy = 0 + (((tickAnim - 16) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -0.02 + (((tickAnim - 0) / 3) * (0-(-0.02)));
        }
        else if (tickAnim >= 3 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 3) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 13) * (-0.1-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 16) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 19) * (0-(0)));
            zz = -0.1 + (((tickAnim - 16) / 19) * (-0.02-(-0.1)));
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
            xx = 45.68 + (((tickAnim - 0) / 3) * (66.75-(45.68)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 66.75 + (((tickAnim - 3) / 6) * (92.37055-(66.75)));
            yy = 0 + (((tickAnim - 3) / 6) * (-0.40294-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0.63259-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 92.37055 + (((tickAnim - 9) / 7) * (19.9911-(92.37055)));
            yy = -0.40294 + (((tickAnim - 9) / 7) * (-0.80588-(-0.40294)));
            zz = 0.63259 + (((tickAnim - 9) / 7) * (1.26517-(0.63259)));
        }
        else if (tickAnim >= 16 && tickAnim < 26) {
            xx = 19.9911 + (((tickAnim - 16) / 10) * (-8.35599-(19.9911)));
            yy = -0.80588 + (((tickAnim - 16) / 10) * (-0.38542-(-0.80588)));
            zz = 1.26517 + (((tickAnim - 16) / 10) * (0.60508-(1.26517)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = -8.35599 + (((tickAnim - 26) / 9) * (45.68-(-8.35599)));
            yy = -0.38542 + (((tickAnim - 26) / 9) * (0-(-0.38542)));
            zz = 0.60508 + (((tickAnim - 26) / 9) * (0-(0.60508)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 3) * (0-(0.1)));
            zz = -0.46 + (((tickAnim - 0) / 3) * (-0.65-(-0.46)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0.85-(0)));
            zz = -0.65 + (((tickAnim - 3) / 3) * (-0.49-(-0.65)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            yy = 0.85 + (((tickAnim - 6) / 10) * (0.2-(0.85)));
            zz = -0.49 + (((tickAnim - 6) / 10) * (0-(-0.49)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0.2 + (((tickAnim - 16) / 7) * (0.85-(0.2)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            yy = 0.85 + (((tickAnim - 23) / 12) * (0.1-(0.85)));
            zz = 0 + (((tickAnim - 23) / 12) * (-0.46-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-250))*2), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+90))*1), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-350))*2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*-2));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-450))*3), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*4), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*-4));



        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -25.75 + (((tickAnim - 0) / 19) * (29-(-25.75)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 29 + (((tickAnim - 19) / 7) * (-6.21894-(29)));
            yy = 0 + (((tickAnim - 19) / 7) * (2.18117-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (-9.26579-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = -6.21894 + (((tickAnim - 26) / 7) * (-32-(-6.21894)));
            yy = 2.18117 + (((tickAnim - 26) / 7) * (0-(2.18117)));
            zz = -9.26579 + (((tickAnim - 26) / 7) * (0-(-9.26579)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -32 + (((tickAnim - 33) / 2) * (-25.75-(-32)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 10.25 + (((tickAnim - 0) / 19) * (17.75-(10.25)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 17.75 + (((tickAnim - 19) / 7) * (-45-(17.75)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = -45 + (((tickAnim - 26) / 7) * (10.25-(-45)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 10.25 + (((tickAnim - 33) / 2) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = -0.1 + (((tickAnim - 0) / 19) * (0-(-0.1)));
        }
        else if (tickAnim >= 19 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 19) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 14) * (-0.1-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = -0.1 + (((tickAnim - 33) / 2) * (-0.1-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 14.2411 + (((tickAnim - 0) / 8) * (-7-(14.2411)));
            yy = -0.80588 + (((tickAnim - 0) / 8) * (0-(-0.80588)));
            zz = 1.26517 + (((tickAnim - 0) / 8) * (0-(1.26517)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = -7 + (((tickAnim - 8) / 11) * (66.75-(-7)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 66.75 + (((tickAnim - 19) / 7) * (92.37055-(66.75)));
            yy = 0 + (((tickAnim - 19) / 7) * (-0.40294-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0.63259-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 92.37055 + (((tickAnim - 26) / 7) * (19.9911-(92.37055)));
            yy = -0.40294 + (((tickAnim - 26) / 7) * (-0.80588-(-0.40294)));
            zz = 0.63259 + (((tickAnim - 26) / 7) * (1.26517-(0.63259)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 19.9911 + (((tickAnim - 33) / 2) * (14.2411-(19.9911)));
            yy = -0.80588 + (((tickAnim - 33) / 2) * (-0.80588-(-0.80588)));
            zz = 1.26517 + (((tickAnim - 33) / 2) * (1.26517-(1.26517)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.375 + (((tickAnim - 0) / 8) * (0.85-(0.375)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            yy = 0.85 + (((tickAnim - 8) / 11) * (0-(0.85)));
            zz = 0 + (((tickAnim - 8) / 11) * (-0.65-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 4) * (0.85-(0)));
            zz = -0.65 + (((tickAnim - 19) / 4) * (-0.49-(-0.65)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0.85 + (((tickAnim - 23) / 10) * (0.2-(0.85)));
            zz = -0.49 + (((tickAnim - 23) / 10) * (0-(-0.49)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 33) / 2) * (0.375-(0.2)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 7.86893 + (((tickAnim - 0) / 4) * (0-(7.86893)));
            yy = 1.48152 + (((tickAnim - 0) / 4) * (0-(1.48152)));
            zz = 0.23486 + (((tickAnim - 0) / 4) * (0-(0.23486)));
        }
        else if (tickAnim >= 4 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 4) / 22) * (31.5-(0)));
            yy = 0 + (((tickAnim - 4) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 22) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 31.5 + (((tickAnim - 26) / 9) * (7.86893-(31.5)));
            yy = 0 + (((tickAnim - 26) / 9) * (1.48152-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0.23486-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -8.49 + (((tickAnim - 0) / 4) * (-16.25-(-8.49)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 26) {
            xx = -16.25 + (((tickAnim - 4) / 22) * (2.25-(-16.25)));
            yy = 0 + (((tickAnim - 4) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 22) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 2.25 + (((tickAnim - 26) / 3) * (7.36-(2.25)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 7.36 + (((tickAnim - 29) / 6) * (-8.49-(7.36)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.265 + (((tickAnim - 0) / 4) * (0.275-(0.265)));
            zz = -0.09 + (((tickAnim - 0) / 4) * (-0.1-(-0.09)));
        }
        else if (tickAnim >= 4 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 4) / 31) * (0-(0)));
            yy = 0.275 + (((tickAnim - 4) / 31) * (0.265-(0.275)));
            zz = -0.1 + (((tickAnim - 4) / 31) * (-0.09-(-0.1)));
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
            xx = -28.62 + (((tickAnim - 0) / 4) * (-4-(-28.62)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 26) {
            xx = -4 + (((tickAnim - 4) / 22) * (21.25-(-4)));
            yy = 0 + (((tickAnim - 4) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 22) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 21.25 + (((tickAnim - 26) / 6) * (-28.62-(21.25)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -28.62 + (((tickAnim - 32) / 3) * (-28.62-(-28.62)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
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



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 59.46 + (((tickAnim - 0) / 4) * (20.5-(59.46)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 20.5 + (((tickAnim - 4) / 8) * (-6.44-(20.5)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 26) {
            xx = -6.44 + (((tickAnim - 12) / 14) * (15.25-(-6.44)));
            yy = 0 + (((tickAnim - 12) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 14) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 15.25 + (((tickAnim - 26) / 2) * (42.5-(15.25)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 42.5 + (((tickAnim - 28) / 4) * (59.46-(42.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 59.46 + (((tickAnim - 32) / 3) * (59.46-(59.46)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 1.81 + (((tickAnim - 0) / 4) * (0-(1.81)));
            zz = -0.765 + (((tickAnim - 0) / 4) * (0.1-(-0.765)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 8) * (0.59-(0)));
            zz = 0.1 + (((tickAnim - 4) / 8) * (0.06-(0.1)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0.59 + (((tickAnim - 12) / 6) * (1.685-(0.59)));
            zz = 0.06 + (((tickAnim - 12) / 6) * (0.04-(0.06)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = 1.685 + (((tickAnim - 18) / 8) * (1.6-(1.685)));
            zz = 0.04 + (((tickAnim - 18) / 8) * (0-(0.04)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 1.6 + (((tickAnim - 26) / 4) * (2.51-(1.6)));
            zz = 0 + (((tickAnim - 26) / 4) * (-0.81-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            yy = 2.51 + (((tickAnim - 30) / 2) * (1.81-(2.51)));
            zz = -0.81 + (((tickAnim - 30) / 2) * (-0.765-(-0.81)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = 1.81 + (((tickAnim - 32) / 3) * (1.81-(1.81)));
            zz = -0.765 + (((tickAnim - 32) / 3) * (-0.765-(-0.765)));
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
        EntityPrehistoricFloraScelidosaurus e = (EntityPrehistoricFloraScelidosaurus) entity;
        animator.update(entity);

        //do Pose
        animator.setAnimation(e.TOBI_ANIMATION);
        animator.startKeyframe(e.getToBiTransitionLength()); //move to this keyframe over the right length

        animator.rotate(bipartiteOsteoderm, ((-0.2182F)-(-0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(bipartiteOsteoderm2, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(bipartiteOsteoderm5, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(body, ((0F)-(0.0349F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(chest, ((0F)-(0.0654F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r10, ((-0.0139F)-(-0.0139F)), ((0.01F)-(0.01F)),((-0.4749F)-(-0.4749F)));
        animator.rotate(cube_r100, ((-0.0369F)-(-0.0369F)), ((0.2432F)-(0.2432F)),((0.3818F)-(0.3818F)));
        animator.rotate(cube_r101, ((-0.237F)-(-0.237F)), ((0.2022F)-(0.2022F)),((0.424F)-(0.424F)));
        animator.rotate(cube_r102, ((0.3665F)-(0.3665F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r103, ((0.4382F)-(0.4382F)), ((0.108F)-(0.108F)),((-0.2863F)-(-0.2863F)));
        animator.rotate(cube_r104, ((0.3313F)-(0.3313F)), ((-0.3042F)-(-0.3042F)),((0.4512F)-(0.4512F)));
        animator.rotate(cube_r105, ((0.0775F)-(0.0775F)), ((0.0588F)-(0.0588F)),((0.0266F)-(0.0266F)));
        animator.rotate(cube_r106, ((0.0778F)-(0.0778F)), ((-0.1152F)-(-0.1152F)),((0.0131F)-(0.0131F)));
        animator.rotate(cube_r107, ((-0.0369F)-(-0.0369F)), ((-0.2432F)-(-0.2432F)),((-0.3818F)-(-0.3818F)));
        animator.rotate(cube_r108, ((-0.237F)-(-0.237F)), ((-0.2022F)-(-0.2022F)),((-0.424F)-(-0.424F)));
        animator.rotate(cube_r109, ((0.0701F)-(0.0701F)), ((-0.0871F)-(-0.0871F)),((-0.0061F)-(-0.0061F)));
        animator.rotate(cube_r11, ((0.0F)-(0.0F)), ((-0.6981F)-(-0.6981F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r110, ((0.0701F)-(0.0701F)), ((0.0871F)-(0.0871F)),((0.0061F)-(0.0061F)));
        animator.rotate(cube_r111, ((-0.0853F)-(-0.0853F)), ((-0.0499F)-(-0.0499F)),((0.6517F)-(0.6517F)));
        animator.rotate(cube_r112, ((0.7222F)-(0.7222F)), ((0.103F)-(0.103F)),((1.1295F)-(1.1295F)));
        animator.rotate(cube_r113, ((-0.0853F)-(-0.0853F)), ((0.0499F)-(0.0499F)),((-0.6517F)-(-0.6517F)));
        animator.rotate(cube_r114, ((0.7222F)-(0.7222F)), ((-0.103F)-(-0.103F)),((-1.1295F)-(-1.1295F)));
        animator.rotate(cube_r115, ((0.1047F)-(0.1047F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r116, ((0.1056F)-(0.1056F)), ((-0.1302F)-(-0.1302F)),((-0.0138F)-(-0.0138F)));
        animator.rotate(cube_r117, ((0.1056F)-(0.1056F)), ((0.1302F)-(0.1302F)),((0.0138F)-(0.0138F)));
        animator.rotate(cube_r118, ((-0.0853F)-(-0.0853F)), ((-0.0499F)-(-0.0499F)),((0.6517F)-(0.6517F)));
        animator.rotate(cube_r119, ((0.8131F)-(0.8131F)), ((-0.1118F)-(-0.1118F)),((1.0413F)-(1.0413F)));
        animator.rotate(cube_r12, ((-0.0524F)-(-0.0524F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r120, ((-0.0853F)-(-0.0853F)), ((0.0499F)-(0.0499F)),((-0.6517F)-(-0.6517F)));
        animator.rotate(cube_r121, ((0.8131F)-(0.8131F)), ((0.1118F)-(0.1118F)),((-1.0413F)-(-1.0413F)));
        animator.rotate(cube_r122, ((-0.2443F)-(-0.2443F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r123, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.1309F)-(-0.8727F)));
        animator.rotate(cube_r124, ((0.0F)-(-0.0853F)), ((0.0F)-(0.0499F)),((-0.8727F)-(-0.6517F)));
        animator.rotate(cube_r125, ((-0.0853F)-(-0.0853F)), ((0.0499F)-(-0.0499F)),((-0.6517F)-(0.6517F)));
        animator.rotate(cube_r126, ((-0.0853F)-(0.0F)), ((-0.0499F)-(0.0F)),((0.6517F)-(-0.1309F)));
        animator.rotate(cube_r127, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.1309F)-(0.1309F)));
        animator.rotate(cube_r128, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.8727F)-(0.8727F)));
        animator.rotate(cube_r129, ((0.1231F)-(0.1231F)), ((-0.535F)-(-0.535F)),((-0.3498F)-(-0.3498F)));
        animator.rotate(cube_r13, ((-0.118F)-(-0.118F)), ((-0.0342F)-(-0.0342F)),((0.3052F)-(0.3052F)));
        animator.rotate(cube_r130, ((0.1231F)-(0.1231F)), ((0.535F)-(0.535F)),((0.3498F)-(0.3498F)));
        animator.rotate(cube_r131, ((-0.0349F)-(-0.0349F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r132, ((0.096F)-(0.096F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r133, ((0.2705F)-(0.2705F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r134, ((0.6981F)-(0.6981F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r135, ((0.4451F)-(0.4451F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r136, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r137, ((1.0279F)-(1.0279F)), ((1.0889F)-(1.0889F)),((0.8212F)-(0.8212F)));
        animator.rotate(cube_r138, ((0.4626F)-(0.4626F)), ((0.4749F)-(0.4749F)),((0.0723F)-(0.0723F)));
        animator.rotate(cube_r139, ((1.0279F)-(1.0279F)), ((-1.0889F)-(-1.0889F)),((-0.8212F)-(-0.8212F)));
        animator.rotate(cube_r14, ((-0.0714F)-(-0.0714F)), ((-0.1243F)-(-0.1243F)),((-0.465F)-(-0.465F)));
        animator.rotate(cube_r140, ((0.4626F)-(0.4626F)), ((-0.4749F)-(-0.4749F)),((-0.0723F)-(-0.0723F)));
        animator.rotate(cube_r141, ((-0.3316F)-(-0.3316F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r142, ((-0.1396F)-(-0.1396F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r15, ((-0.0524F)-(-0.0524F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r16, ((-0.118F)-(-0.118F)), ((0.0342F)-(0.0342F)),((-0.3052F)-(-0.3052F)));
        animator.rotate(cube_r17, ((-0.0714F)-(-0.0714F)), ((0.1243F)-(0.1243F)),((0.465F)-(0.465F)));
        animator.rotate(cube_r18, ((0.0F)-(0.0F)), ((-0.0873F)-(-0.0873F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r19, ((-0.0151F)-(-0.0151F)), ((0.5853F)-(0.5853F)),((0.4205F)-(0.4205F)));
        animator.rotate(cube_r2, ((0.0007F)-(0.0007F)), ((-0.0013F)-(-0.0013F)),((-0.4648F)-(-0.4648F)));
        animator.rotate(cube_r20, ((-0.0211F)-(-0.0211F)), ((0.603F)-(0.603F)),((-0.5243F)-(-0.5243F)));
        animator.rotate(cube_r21, ((0.093F)-(0.093F)), ((0.6524F)-(0.6524F)),((-0.4572F)-(-0.4572F)));
        animator.rotate(cube_r22, ((0.0F)-(0.0F)), ((0.0873F)-(0.0873F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r23, ((-0.0151F)-(-0.0151F)), ((-0.5853F)-(-0.5853F)),((-0.4205F)-(-0.4205F)));
        animator.rotate(cube_r24, ((-0.0211F)-(-0.0211F)), ((-0.603F)-(-0.603F)),((0.5243F)-(0.5243F)));
        animator.rotate(cube_r25, ((0.093F)-(0.093F)), ((-0.6524F)-(-0.6524F)),((0.4572F)-(0.4572F)));
        animator.rotate(cube_r26, ((0.0F)-(0.0F)), ((-0.0349F)-(-0.0349F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r27, ((0.0F)-(0.0F)), ((-0.0873F)-(-0.0873F)),((-0.48F)-(-0.48F)));
        animator.rotate(cube_r28, ((0.0F)-(0.0F)), ((-0.0873F)-(-0.0873F)),((0.48F)-(0.48F)));
        animator.rotate(cube_r29, ((0.0F)-(0.0F)), ((0.0349F)-(0.0349F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r3, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.1745F)-(0.1745F)));
        animator.rotate(cube_r30, ((0.0F)-(0.0F)), ((0.0873F)-(0.0873F)),((0.48F)-(0.48F)));
        animator.rotate(cube_r31, ((0.0F)-(0.0F)), ((0.0873F)-(0.0873F)),((-0.48F)-(-0.48F)));
        animator.rotate(cube_r32, ((0.0F)-(0.0F)), ((-0.0262F)-(-0.0262F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r33, ((0.0233F)-(0.0233F)), ((-0.0561F)-(-0.0561F)),((-0.4818F)-(-0.4818F)));
        animator.rotate(cube_r34, ((0.0F)-(0.0F)), ((-0.0873F)-(-0.0873F)),((0.3927F)-(0.3927F)));
        animator.rotate(cube_r35, ((0.0F)-(0.0F)), ((0.0262F)-(0.0262F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r36, ((0.0233F)-(0.0233F)), ((0.0561F)-(0.0561F)),((0.4818F)-(0.4818F)));
        animator.rotate(cube_r37, ((0.0F)-(0.0F)), ((0.0873F)-(0.0873F)),((-0.3927F)-(-0.3927F)));
        animator.rotate(cube_r38, ((0.0F)-(0.0F)), ((-0.0873F)-(-0.0873F)),((0.3054F)-(0.3054F)));
        animator.rotate(cube_r39, ((0.0435F)-(0.0435F)), ((-0.035F)-(-0.035F)),((-0.3031F)-(-0.3031F)));
        animator.rotate(cube_r4, ((0.0734F)-(0.0734F)), ((-0.01F)-(-0.01F)),((0.4749F)-(0.4749F)));
        animator.rotate(cube_r40, ((0.0F)-(0.0F)), ((-0.0349F)-(-0.0349F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r41, ((0.0F)-(0.0F)), ((0.0873F)-(0.0873F)),((-0.3054F)-(-0.3054F)));
        animator.rotate(cube_r42, ((0.0435F)-(0.0435F)), ((0.035F)-(0.035F)),((0.3031F)-(0.3031F)));
        animator.rotate(cube_r43, ((0.0F)-(0.0F)), ((0.0349F)-(0.0349F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r44, ((0.0F)-(0.0F)), ((-0.0175F)-(-0.0175F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r45, ((0.0F)-(0.0F)), ((-0.0873F)-(-0.0873F)),((-0.2618F)-(-0.2618F)));
        animator.rotate(cube_r46, ((0.0341F)-(0.0341F)), ((-0.0692F)-(-0.0692F)),((0.3945F)-(0.3945F)));
        animator.rotate(cube_r47, ((0.0F)-(0.0F)), ((0.0175F)-(0.0175F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r48, ((0.0F)-(0.0F)), ((0.0873F)-(0.0873F)),((0.2618F)-(0.2618F)));
        animator.rotate(cube_r49, ((0.0341F)-(0.0341F)), ((0.0692F)-(0.0692F)),((-0.3945F)-(-0.3945F)));
        animator.rotate(cube_r5, ((-0.0139F)-(-0.0139F)), ((-0.01F)-(-0.01F)),((0.4749F)-(0.4749F)));
        animator.rotate(cube_r50, ((0.1833F)-(0.1833F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r51, ((0.117F)-(0.117F)), ((-0.01F)-(-0.01F)),((0.4749F)-(0.4749F)));
        animator.rotate(cube_r52, ((0.0297F)-(0.0297F)), ((-0.01F)-(-0.01F)),((0.4749F)-(0.4749F)));
        animator.rotate(cube_r53, ((0.0297F)-(0.0297F)), ((-0.01F)-(-0.01F)),((0.4749F)-(0.4749F)));
        animator.rotate(cube_r54, ((-0.0577F)-(-0.0577F)), ((0.0771F)-(0.0771F)),((0.4698F)-(0.4698F)));
        animator.rotate(cube_r55, ((0.0421F)-(0.0421F)), ((-0.0113F)-(-0.0113F)),((0.2616F)-(0.2616F)));
        animator.rotate(cube_r56, ((0.0421F)-(0.0421F)), ((-0.0113F)-(-0.0113F)),((0.2616F)-(0.2616F)));
        animator.rotate(cube_r57, ((0.0421F)-(0.0421F)), ((-0.0113F)-(-0.0113F)),((0.2616F)-(0.2616F)));
        animator.rotate(cube_r58, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r59, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r6, ((0.0F)-(0.0F)), ((0.6981F)-(0.6981F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r60, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r61, ((-0.0178F)-(-0.0178F)), ((0.0216F)-(0.0216F)),((0.1801F)-(0.1801F)));
        animator.rotate(cube_r62, ((0.1267F)-(0.1267F)), ((0.3479F)-(0.3479F)),((-0.4397F)-(-0.4397F)));
        animator.rotate(cube_r63, ((0.0164F)-(0.0164F)), ((0.0063F)-(0.0063F)),((-0.4743F)-(-0.4743F)));
        animator.rotate(cube_r64, ((0.0164F)-(0.0164F)), ((0.0063F)-(0.0063F)),((-0.4743F)-(-0.4743F)));
        animator.rotate(cube_r65, ((0.1195F)-(0.1195F)), ((0.088F)-(0.088F)),((-0.4725F)-(-0.4725F)));
        animator.rotate(cube_r66, ((0.175F)-(0.175F)), ((-0.0548F)-(-0.0548F)),((0.3006F)-(0.3006F)));
        animator.rotate(cube_r67, ((0.1833F)-(0.1833F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r68, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.3054F)-(0.3054F)));
        animator.rotate(cube_r69, ((0.117F)-(0.117F)), ((0.01F)-(0.01F)),((-0.4749F)-(-0.4749F)));
        animator.rotate(cube_r7, ((0.0007F)-(0.0007F)), ((0.0013F)-(0.0013F)),((0.4648F)-(0.4648F)));
        animator.rotate(cube_r70, ((0.0297F)-(0.0297F)), ((0.01F)-(0.01F)),((-0.4749F)-(-0.4749F)));
        animator.rotate(cube_r71, ((0.0297F)-(0.0297F)), ((0.01F)-(0.01F)),((-0.4749F)-(-0.4749F)));
        animator.rotate(cube_r72, ((-0.0577F)-(-0.0577F)), ((-0.0771F)-(-0.0771F)),((-0.4698F)-(-0.4698F)));
        animator.rotate(cube_r73, ((0.0421F)-(0.0421F)), ((0.0113F)-(0.0113F)),((-0.2616F)-(-0.2616F)));
        animator.rotate(cube_r74, ((0.0421F)-(0.0421F)), ((0.0113F)-(0.0113F)),((-0.2616F)-(-0.2616F)));
        animator.rotate(cube_r75, ((0.0421F)-(0.0421F)), ((0.0113F)-(0.0113F)),((-0.2616F)-(-0.2616F)));
        animator.rotate(cube_r76, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r77, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r78, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r79, ((-0.0178F)-(-0.0178F)), ((-0.0216F)-(-0.0216F)),((-0.1801F)-(-0.1801F)));
        animator.rotate(cube_r8, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.1745F)-(-0.1745F)));
        animator.rotate(cube_r80, ((0.1267F)-(0.1267F)), ((-0.3479F)-(-0.3479F)),((0.4397F)-(0.4397F)));
        animator.rotate(cube_r81, ((0.0164F)-(0.0164F)), ((-0.0063F)-(-0.0063F)),((0.4743F)-(0.4743F)));
        animator.rotate(cube_r82, ((0.0164F)-(0.0164F)), ((-0.0063F)-(-0.0063F)),((0.4743F)-(0.4743F)));
        animator.rotate(cube_r83, ((0.1195F)-(0.1195F)), ((-0.088F)-(-0.088F)),((0.4725F)-(0.4725F)));
        animator.rotate(cube_r84, ((0.175F)-(0.175F)), ((0.0548F)-(0.0548F)),((-0.3006F)-(-0.3006F)));
        animator.rotate(cube_r85, ((0.1833F)-(0.1833F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r86, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.3054F)-(-0.3054F)));
        animator.rotate(cube_r87, ((-0.3054F)-(-0.3054F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r88, ((0.3665F)-(0.3665F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r89, ((0.1876F)-(0.1876F)), ((0.6219F)-(-0.6219F)),((0.2156F)-(-0.2156F)));
        animator.rotate(cube_r9, ((0.0734F)-(0.0734F)), ((0.01F)-(0.01F)),((-0.4749F)-(-0.4749F)));
        animator.rotate(cube_r90, ((0.2505F)-(0.2505F)), ((-0.3452F)-(0.3452F)),((0.0147F)-(-0.0147F)));
        animator.rotate(cube_r91, ((-0.1442F)-(-0.1442F)), ((-0.3293F)-(0.3293F)),((0.1524F)-(-0.1524F)));
        animator.rotate(cube_r92, ((0.1876F)-(0.1876F)), ((-0.6219F)-(0.6219F)),((-0.2156F)-(0.2156F)));
        animator.rotate(cube_r93, ((0.2505F)-(0.2505F)), ((0.3452F)-(-0.3452F)),((-0.0147F)-(0.0147F)));
        animator.rotate(cube_r94, ((-0.1442F)-(-0.1442F)), ((0.3293F)-(-0.3293F)),((-0.1524F)-(0.1524F)));
        animator.rotate(cube_r95, ((0.3665F)-(0.3665F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r96, ((0.4382F)-(0.4382F)), ((-0.108F)-(-0.108F)),((0.2863F)-(0.2863F)));
        animator.rotate(cube_r97, ((0.3313F)-(0.3313F)), ((0.3042F)-(0.3042F)),((-0.4512F)-(-0.4512F)));
        animator.rotate(cube_r98, ((0.0775F)-(0.0775F)), ((-0.0588F)-(-0.0588F)),((-0.0266F)-(-0.0266F)));
        animator.rotate(cube_r99, ((0.0778F)-(0.0778F)), ((0.1152F)-(0.1152F)),((-0.0131F)-(-0.0131F)));
        animator.rotate(head, ((0.2618F)-(0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(hips, ((0F)-(0.0305F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(Jaw, ((0.1484F)-(0.1484F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftArm, ((0.9105F)-(0.3345F)), ((0.045F)-(0.045F)),((-0.258F)-(-0.258F)));
        animator.rotate(leftArm2, ((-1.2745F)-(-0.6622F)), ((0.2426F)-(0.1239F)),((0.3534F)-(0.1943F)));
        animator.rotate(leftArm3, ((1.9199F)-(0.192F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftLeg, ((-0.3927F)-(-0.432F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftLeg2, ((0.9163F)-(0.8508F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftLeg3, ((-1.0472F)-(-1.0472F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftLeg4, ((0.5236F)-(0.5934F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck, ((0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((-0.4712F)-(-0.4712F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck3, ((0.2531F)-(0.2531F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightArm, ((0.9105F)-(0.3345F)), ((-0.045F)-(-0.045F)),((0.258F)-(0.258F)));
        animator.rotate(rightArm2, ((-1.2745F)-(-0.6622F)), ((-0.2426F)-(-0.1239F)),((-0.3534F)-(-0.1943F)));
        animator.rotate(rightArm3, ((1.9199F)-(0.192F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightLeg, ((-0.3927F)-(-0.432F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightLeg2, ((0.9163F)-(0.8508F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightLeg3, ((-1.0472F)-(-1.0472F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightLeg4, ((0.5236F)-(0.5934F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail, ((-0.2182F)-(-0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail2, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail3, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail4, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail5, ((-0.1745F)-(-0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));




        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        //unpose
        animator.setAnimation(e.TOQUAD_ANIMATION);
        animator.startKeyframe(e.getToQuadTransitionLength()); //move to this keyframe over the right length

        animator.rotate(bipartiteOsteoderm, -((-0.2182F)-(-0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(bipartiteOsteoderm2, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(bipartiteOsteoderm5, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(body, -((0F)-(0.0349F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(chest, -((0F)-(0.0654F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r10, -((-0.0139F)-(-0.0139F)), -((0.01F)-(0.01F)),-((-0.4749F)-(-0.4749F)));
        animator.rotate(cube_r100, -((-0.0369F)-(-0.0369F)), -((0.2432F)-(0.2432F)),-((0.3818F)-(0.3818F)));
        animator.rotate(cube_r101, -((-0.237F)-(-0.237F)), -((0.2022F)-(0.2022F)),-((0.424F)-(0.424F)));
        animator.rotate(cube_r102, -((0.3665F)-(0.3665F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r103, -((0.4382F)-(0.4382F)), -((0.108F)-(0.108F)),-((-0.2863F)-(-0.2863F)));
        animator.rotate(cube_r104, -((0.3313F)-(0.3313F)), -((-0.3042F)-(-0.3042F)),-((0.4512F)-(0.4512F)));
        animator.rotate(cube_r105, -((0.0775F)-(0.0775F)), -((0.0588F)-(0.0588F)),-((0.0266F)-(0.0266F)));
        animator.rotate(cube_r106, -((0.0778F)-(0.0778F)), -((-0.1152F)-(-0.1152F)),-((0.0131F)-(0.0131F)));
        animator.rotate(cube_r107, -((-0.0369F)-(-0.0369F)), -((-0.2432F)-(-0.2432F)),-((-0.3818F)-(-0.3818F)));
        animator.rotate(cube_r108, -((-0.237F)-(-0.237F)), -((-0.2022F)-(-0.2022F)),-((-0.424F)-(-0.424F)));
        animator.rotate(cube_r109, -((0.0701F)-(0.0701F)), -((-0.0871F)-(-0.0871F)),-((-0.0061F)-(-0.0061F)));
        animator.rotate(cube_r11, -((0.0F)-(0.0F)), -((-0.6981F)-(-0.6981F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r110, -((0.0701F)-(0.0701F)), -((0.0871F)-(0.0871F)),-((0.0061F)-(0.0061F)));
        animator.rotate(cube_r111, -((-0.0853F)-(-0.0853F)), -((-0.0499F)-(-0.0499F)),-((0.6517F)-(0.6517F)));
        animator.rotate(cube_r112, -((0.7222F)-(0.7222F)), -((0.103F)-(0.103F)),-((1.1295F)-(1.1295F)));
        animator.rotate(cube_r113, -((-0.0853F)-(-0.0853F)), -((0.0499F)-(0.0499F)),-((-0.6517F)-(-0.6517F)));
        animator.rotate(cube_r114, -((0.7222F)-(0.7222F)), -((-0.103F)-(-0.103F)),-((-1.1295F)-(-1.1295F)));
        animator.rotate(cube_r115, -((0.1047F)-(0.1047F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r116, -((0.1056F)-(0.1056F)), -((-0.1302F)-(-0.1302F)),-((-0.0138F)-(-0.0138F)));
        animator.rotate(cube_r117, -((0.1056F)-(0.1056F)), -((0.1302F)-(0.1302F)),-((0.0138F)-(0.0138F)));
        animator.rotate(cube_r118, -((-0.0853F)-(-0.0853F)), -((-0.0499F)-(-0.0499F)),-((0.6517F)-(0.6517F)));
        animator.rotate(cube_r119, -((0.8131F)-(0.8131F)), -((-0.1118F)-(-0.1118F)),-((1.0413F)-(1.0413F)));
        animator.rotate(cube_r12, -((-0.0524F)-(-0.0524F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r120, -((-0.0853F)-(-0.0853F)), -((0.0499F)-(0.0499F)),-((-0.6517F)-(-0.6517F)));
        animator.rotate(cube_r121, -((0.8131F)-(0.8131F)), -((0.1118F)-(0.1118F)),-((-1.0413F)-(-1.0413F)));
        animator.rotate(cube_r122, -((-0.2443F)-(-0.2443F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r123, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.1309F)-(-0.8727F)));
        animator.rotate(cube_r124, -((0.0F)-(-0.0853F)), -((0.0F)-(0.0499F)),-((-0.8727F)-(-0.6517F)));
        animator.rotate(cube_r125, -((-0.0853F)-(-0.0853F)), -((0.0499F)-(-0.0499F)),-((-0.6517F)-(0.6517F)));
        animator.rotate(cube_r126, -((-0.0853F)-(0.0F)), -((-0.0499F)-(0.0F)),-((0.6517F)-(-0.1309F)));
        animator.rotate(cube_r127, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.1309F)-(0.1309F)));
        animator.rotate(cube_r128, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.8727F)-(0.8727F)));
        animator.rotate(cube_r129, -((0.1231F)-(0.1231F)), -((-0.535F)-(-0.535F)),-((-0.3498F)-(-0.3498F)));
        animator.rotate(cube_r13, -((-0.118F)-(-0.118F)), -((-0.0342F)-(-0.0342F)),-((0.3052F)-(0.3052F)));
        animator.rotate(cube_r130, -((0.1231F)-(0.1231F)), -((0.535F)-(0.535F)),-((0.3498F)-(0.3498F)));
        animator.rotate(cube_r131, -((-0.0349F)-(-0.0349F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r132, -((0.096F)-(0.096F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r133, -((0.2705F)-(0.2705F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r134, -((0.6981F)-(0.6981F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r135, -((0.4451F)-(0.4451F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r136, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r137, -((1.0279F)-(1.0279F)), -((1.0889F)-(1.0889F)),-((0.8212F)-(0.8212F)));
        animator.rotate(cube_r138, -((0.4626F)-(0.4626F)), -((0.4749F)-(0.4749F)),-((0.0723F)-(0.0723F)));
        animator.rotate(cube_r139, -((1.0279F)-(1.0279F)), -((-1.0889F)-(-1.0889F)),-((-0.8212F)-(-0.8212F)));
        animator.rotate(cube_r14, -((-0.0714F)-(-0.0714F)), -((-0.1243F)-(-0.1243F)),-((-0.465F)-(-0.465F)));
        animator.rotate(cube_r140, -((0.4626F)-(0.4626F)), -((-0.4749F)-(-0.4749F)),-((-0.0723F)-(-0.0723F)));
        animator.rotate(cube_r141, -((-0.3316F)-(-0.3316F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r142, -((-0.1396F)-(-0.1396F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r15, -((-0.0524F)-(-0.0524F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r16, -((-0.118F)-(-0.118F)), -((0.0342F)-(0.0342F)),-((-0.3052F)-(-0.3052F)));
        animator.rotate(cube_r17, -((-0.0714F)-(-0.0714F)), -((0.1243F)-(0.1243F)),-((0.465F)-(0.465F)));
        animator.rotate(cube_r18, -((0.0F)-(0.0F)), -((-0.0873F)-(-0.0873F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r19, -((-0.0151F)-(-0.0151F)), -((0.5853F)-(0.5853F)),-((0.4205F)-(0.4205F)));
        animator.rotate(cube_r2, -((0.0007F)-(0.0007F)), -((-0.0013F)-(-0.0013F)),-((-0.4648F)-(-0.4648F)));
        animator.rotate(cube_r20, -((-0.0211F)-(-0.0211F)), -((0.603F)-(0.603F)),-((-0.5243F)-(-0.5243F)));
        animator.rotate(cube_r21, -((0.093F)-(0.093F)), -((0.6524F)-(0.6524F)),-((-0.4572F)-(-0.4572F)));
        animator.rotate(cube_r22, -((0.0F)-(0.0F)), -((0.0873F)-(0.0873F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r23, -((-0.0151F)-(-0.0151F)), -((-0.5853F)-(-0.5853F)),-((-0.4205F)-(-0.4205F)));
        animator.rotate(cube_r24, -((-0.0211F)-(-0.0211F)), -((-0.603F)-(-0.603F)),-((0.5243F)-(0.5243F)));
        animator.rotate(cube_r25, -((0.093F)-(0.093F)), -((-0.6524F)-(-0.6524F)),-((0.4572F)-(0.4572F)));
        animator.rotate(cube_r26, -((0.0F)-(0.0F)), -((-0.0349F)-(-0.0349F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r27, -((0.0F)-(0.0F)), -((-0.0873F)-(-0.0873F)),-((-0.48F)-(-0.48F)));
        animator.rotate(cube_r28, -((0.0F)-(0.0F)), -((-0.0873F)-(-0.0873F)),-((0.48F)-(0.48F)));
        animator.rotate(cube_r29, -((0.0F)-(0.0F)), -((0.0349F)-(0.0349F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r3, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.1745F)-(0.1745F)));
        animator.rotate(cube_r30, -((0.0F)-(0.0F)), -((0.0873F)-(0.0873F)),-((0.48F)-(0.48F)));
        animator.rotate(cube_r31, -((0.0F)-(0.0F)), -((0.0873F)-(0.0873F)),-((-0.48F)-(-0.48F)));
        animator.rotate(cube_r32, -((0.0F)-(0.0F)), -((-0.0262F)-(-0.0262F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r33, -((0.0233F)-(0.0233F)), -((-0.0561F)-(-0.0561F)),-((-0.4818F)-(-0.4818F)));
        animator.rotate(cube_r34, -((0.0F)-(0.0F)), -((-0.0873F)-(-0.0873F)),-((0.3927F)-(0.3927F)));
        animator.rotate(cube_r35, -((0.0F)-(0.0F)), -((0.0262F)-(0.0262F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r36, -((0.0233F)-(0.0233F)), -((0.0561F)-(0.0561F)),-((0.4818F)-(0.4818F)));
        animator.rotate(cube_r37, -((0.0F)-(0.0F)), -((0.0873F)-(0.0873F)),-((-0.3927F)-(-0.3927F)));
        animator.rotate(cube_r38, -((0.0F)-(0.0F)), -((-0.0873F)-(-0.0873F)),-((0.3054F)-(0.3054F)));
        animator.rotate(cube_r39, -((0.0435F)-(0.0435F)), -((-0.035F)-(-0.035F)),-((-0.3031F)-(-0.3031F)));
        animator.rotate(cube_r4, -((0.0734F)-(0.0734F)), -((-0.01F)-(-0.01F)),-((0.4749F)-(0.4749F)));
        animator.rotate(cube_r40, -((0.0F)-(0.0F)), -((-0.0349F)-(-0.0349F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r41, -((0.0F)-(0.0F)), -((0.0873F)-(0.0873F)),-((-0.3054F)-(-0.3054F)));
        animator.rotate(cube_r42, -((0.0435F)-(0.0435F)), -((0.035F)-(0.035F)),-((0.3031F)-(0.3031F)));
        animator.rotate(cube_r43, -((0.0F)-(0.0F)), -((0.0349F)-(0.0349F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r44, -((0.0F)-(0.0F)), -((-0.0175F)-(-0.0175F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r45, -((0.0F)-(0.0F)), -((-0.0873F)-(-0.0873F)),-((-0.2618F)-(-0.2618F)));
        animator.rotate(cube_r46, -((0.0341F)-(0.0341F)), -((-0.0692F)-(-0.0692F)),-((0.3945F)-(0.3945F)));
        animator.rotate(cube_r47, -((0.0F)-(0.0F)), -((0.0175F)-(0.0175F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r48, -((0.0F)-(0.0F)), -((0.0873F)-(0.0873F)),-((0.2618F)-(0.2618F)));
        animator.rotate(cube_r49, -((0.0341F)-(0.0341F)), -((0.0692F)-(0.0692F)),-((-0.3945F)-(-0.3945F)));
        animator.rotate(cube_r5, -((-0.0139F)-(-0.0139F)), -((-0.01F)-(-0.01F)),-((0.4749F)-(0.4749F)));
        animator.rotate(cube_r50, -((0.1833F)-(0.1833F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r51, -((0.117F)-(0.117F)), -((-0.01F)-(-0.01F)),-((0.4749F)-(0.4749F)));
        animator.rotate(cube_r52, -((0.0297F)-(0.0297F)), -((-0.01F)-(-0.01F)),-((0.4749F)-(0.4749F)));
        animator.rotate(cube_r53, -((0.0297F)-(0.0297F)), -((-0.01F)-(-0.01F)),-((0.4749F)-(0.4749F)));
        animator.rotate(cube_r54, -((-0.0577F)-(-0.0577F)), -((0.0771F)-(0.0771F)),-((0.4698F)-(0.4698F)));
        animator.rotate(cube_r55, -((0.0421F)-(0.0421F)), -((-0.0113F)-(-0.0113F)),-((0.2616F)-(0.2616F)));
        animator.rotate(cube_r56, -((0.0421F)-(0.0421F)), -((-0.0113F)-(-0.0113F)),-((0.2616F)-(0.2616F)));
        animator.rotate(cube_r57, -((0.0421F)-(0.0421F)), -((-0.0113F)-(-0.0113F)),-((0.2616F)-(0.2616F)));
        animator.rotate(cube_r58, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r59, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r6, -((0.0F)-(0.0F)), -((0.6981F)-(0.6981F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r60, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r61, -((-0.0178F)-(-0.0178F)), -((0.0216F)-(0.0216F)),-((0.1801F)-(0.1801F)));
        animator.rotate(cube_r62, -((0.1267F)-(0.1267F)), -((0.3479F)-(0.3479F)),-((-0.4397F)-(-0.4397F)));
        animator.rotate(cube_r63, -((0.0164F)-(0.0164F)), -((0.0063F)-(0.0063F)),-((-0.4743F)-(-0.4743F)));
        animator.rotate(cube_r64, -((0.0164F)-(0.0164F)), -((0.0063F)-(0.0063F)),-((-0.4743F)-(-0.4743F)));
        animator.rotate(cube_r65, -((0.1195F)-(0.1195F)), -((0.088F)-(0.088F)),-((-0.4725F)-(-0.4725F)));
        animator.rotate(cube_r66, -((0.175F)-(0.175F)), -((-0.0548F)-(-0.0548F)),-((0.3006F)-(0.3006F)));
        animator.rotate(cube_r67, -((0.1833F)-(0.1833F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r68, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.3054F)-(0.3054F)));
        animator.rotate(cube_r69, -((0.117F)-(0.117F)), -((0.01F)-(0.01F)),-((-0.4749F)-(-0.4749F)));
        animator.rotate(cube_r7, -((0.0007F)-(0.0007F)), -((0.0013F)-(0.0013F)),-((0.4648F)-(0.4648F)));
        animator.rotate(cube_r70, -((0.0297F)-(0.0297F)), -((0.01F)-(0.01F)),-((-0.4749F)-(-0.4749F)));
        animator.rotate(cube_r71, -((0.0297F)-(0.0297F)), -((0.01F)-(0.01F)),-((-0.4749F)-(-0.4749F)));
        animator.rotate(cube_r72, -((-0.0577F)-(-0.0577F)), -((-0.0771F)-(-0.0771F)),-((-0.4698F)-(-0.4698F)));
        animator.rotate(cube_r73, -((0.0421F)-(0.0421F)), -((0.0113F)-(0.0113F)),-((-0.2616F)-(-0.2616F)));
        animator.rotate(cube_r74, -((0.0421F)-(0.0421F)), -((0.0113F)-(0.0113F)),-((-0.2616F)-(-0.2616F)));
        animator.rotate(cube_r75, -((0.0421F)-(0.0421F)), -((0.0113F)-(0.0113F)),-((-0.2616F)-(-0.2616F)));
        animator.rotate(cube_r76, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r77, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r78, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r79, -((-0.0178F)-(-0.0178F)), -((-0.0216F)-(-0.0216F)),-((-0.1801F)-(-0.1801F)));
        animator.rotate(cube_r8, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.1745F)-(-0.1745F)));
        animator.rotate(cube_r80, -((0.1267F)-(0.1267F)), -((-0.3479F)-(-0.3479F)),-((0.4397F)-(0.4397F)));
        animator.rotate(cube_r81, -((0.0164F)-(0.0164F)), -((-0.0063F)-(-0.0063F)),-((0.4743F)-(0.4743F)));
        animator.rotate(cube_r82, -((0.0164F)-(0.0164F)), -((-0.0063F)-(-0.0063F)),-((0.4743F)-(0.4743F)));
        animator.rotate(cube_r83, -((0.1195F)-(0.1195F)), -((-0.088F)-(-0.088F)),-((0.4725F)-(0.4725F)));
        animator.rotate(cube_r84, -((0.175F)-(0.175F)), -((0.0548F)-(0.0548F)),-((-0.3006F)-(-0.3006F)));
        animator.rotate(cube_r85, -((0.1833F)-(0.1833F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r86, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.3054F)-(-0.3054F)));
        animator.rotate(cube_r87, -((-0.3054F)-(-0.3054F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r88, -((0.3665F)-(0.3665F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r89, -((0.1876F)-(0.1876F)), -((0.6219F)-(-0.6219F)),-((0.2156F)-(-0.2156F)));
        animator.rotate(cube_r9, -((0.0734F)-(0.0734F)), -((0.01F)-(0.01F)),-((-0.4749F)-(-0.4749F)));
        animator.rotate(cube_r90, -((0.2505F)-(0.2505F)), -((-0.3452F)-(0.3452F)),-((0.0147F)-(-0.0147F)));
        animator.rotate(cube_r91, -((-0.1442F)-(-0.1442F)), -((-0.3293F)-(0.3293F)),-((0.1524F)-(-0.1524F)));
        animator.rotate(cube_r92, -((0.1876F)-(0.1876F)), -((-0.6219F)-(0.6219F)),-((-0.2156F)-(0.2156F)));
        animator.rotate(cube_r93, -((0.2505F)-(0.2505F)), -((0.3452F)-(-0.3452F)),-((-0.0147F)-(0.0147F)));
        animator.rotate(cube_r94, -((-0.1442F)-(-0.1442F)), -((0.3293F)-(-0.3293F)),-((-0.1524F)-(0.1524F)));
        animator.rotate(cube_r95, -((0.3665F)-(0.3665F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r96, -((0.4382F)-(0.4382F)), -((-0.108F)-(-0.108F)),-((0.2863F)-(0.2863F)));
        animator.rotate(cube_r97, -((0.3313F)-(0.3313F)), -((0.3042F)-(0.3042F)),-((-0.4512F)-(-0.4512F)));
        animator.rotate(cube_r98, -((0.0775F)-(0.0775F)), -((-0.0588F)-(-0.0588F)),-((-0.0266F)-(-0.0266F)));
        animator.rotate(cube_r99, -((0.0778F)-(0.0778F)), -((0.1152F)-(0.1152F)),-((-0.0131F)-(-0.0131F)));
        animator.rotate(head, -((0.2618F)-(0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(hips, -((0F)-(0.0305F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(Jaw, -((0.1484F)-(0.1484F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftArm, -((0.9105F)-(0.3345F)), -((0.045F)-(0.045F)),-((-0.258F)-(-0.258F)));
        animator.rotate(leftArm2, -((-1.2745F)-(-0.6622F)), -((0.2426F)-(0.1239F)),-((0.3534F)-(0.1943F)));
        animator.rotate(leftArm3, -((1.9199F)-(0.192F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftLeg, -((-0.3927F)-(-0.432F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftLeg2, -((0.9163F)-(0.8508F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftLeg3, -((-1.0472F)-(-1.0472F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftLeg4, -((0.5236F)-(0.5934F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck, -((0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((-0.4712F)-(-0.4712F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck3, -((0.2531F)-(0.2531F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightArm, -((0.9105F)-(0.3345F)), -((-0.045F)-(-0.045F)),-((0.258F)-(0.258F)));
        animator.rotate(rightArm2, -((-1.2745F)-(-0.6622F)), -((-0.2426F)-(-0.1239F)),-((-0.3534F)-(-0.1943F)));
        animator.rotate(rightArm3, -((1.9199F)-(0.192F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightLeg, -((-0.3927F)-(-0.432F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightLeg2, -((0.9163F)-(0.8508F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightLeg3, -((-1.0472F)-(-1.0472F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightLeg4, -((0.5236F)-(0.5934F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail, -((-0.2182F)-(-0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail2, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail3, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail4, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail5, -((-0.1745F)-(-0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));




        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
