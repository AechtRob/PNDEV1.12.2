package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraYuanyanglong;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelYuanyanglong extends ModelBasePalaeopedia {
    public final AdvancedModelRenderer root;
    public final AdvancedModelRenderer cube_r1;
    public final AdvancedModelRenderer cube_r2;
    public final AdvancedModelRenderer cube_r3;
    public final AdvancedModelRenderer cube_r4;
    public final AdvancedModelRenderer cube_r5;
    public final AdvancedModelRenderer leftLeg1;
    public final AdvancedModelRenderer cube_r6;
    public final AdvancedModelRenderer leftLeg2;
    public final AdvancedModelRenderer cube_r7;
    public final AdvancedModelRenderer leftLeg3;
    public final AdvancedModelRenderer cube_r8;
    public final AdvancedModelRenderer leftFoot;
    public final AdvancedModelRenderer cube_r9;
    public final AdvancedModelRenderer leftToes;
    public final AdvancedModelRenderer cube_r10;
    public final AdvancedModelRenderer rightLeg1;
    public final AdvancedModelRenderer cube_r11;
    public final AdvancedModelRenderer rightLeg2;
    public final AdvancedModelRenderer cube_r12;
    public final AdvancedModelRenderer rightLeg3;
    public final AdvancedModelRenderer cube_r13;
    public final AdvancedModelRenderer rightFoot;
    public final AdvancedModelRenderer cube_r14;
    public final AdvancedModelRenderer rightToes;
    public final AdvancedModelRenderer cube_r15;
    public final AdvancedModelRenderer tail1;
    public final AdvancedModelRenderer cube_r16;
    public final AdvancedModelRenderer cube_r17;
    public final AdvancedModelRenderer tail2;
    public final AdvancedModelRenderer cube_r18;
    public final AdvancedModelRenderer cube_r19;
    public final AdvancedModelRenderer cube_r20;
    public final AdvancedModelRenderer tail3;
    public final AdvancedModelRenderer cube_r21;
    public final AdvancedModelRenderer cube_r22;
    public final AdvancedModelRenderer cube_r23;
    public final AdvancedModelRenderer cube_r24;
    public final AdvancedModelRenderer chest;
    public final AdvancedModelRenderer cube_r25;
    public final AdvancedModelRenderer cube_r26;
    public final AdvancedModelRenderer cube_r27;
    public final AdvancedModelRenderer cube_r28;
    public final AdvancedModelRenderer neck1;
    public final AdvancedModelRenderer cube_r29;
    public final AdvancedModelRenderer cube_r30;
    public final AdvancedModelRenderer neck2;
    public final AdvancedModelRenderer cube_r31;
    public final AdvancedModelRenderer cube_r32;
    public final AdvancedModelRenderer neck3;
    public final AdvancedModelRenderer cube_r33;
    public final AdvancedModelRenderer cube_r34;
    public final AdvancedModelRenderer neck4;
    public final AdvancedModelRenderer cube_r35;
    public final AdvancedModelRenderer cube_r36;
    public final AdvancedModelRenderer head;
    public final AdvancedModelRenderer cube_r37;
    public final AdvancedModelRenderer cube_r38;
    public final AdvancedModelRenderer cube_r39;
    public final AdvancedModelRenderer cube_r40;
    public final AdvancedModelRenderer cube_r41;
    public final AdvancedModelRenderer cube_r42;
    public final AdvancedModelRenderer cube_r43;
    public final AdvancedModelRenderer cube_r44;
    public final AdvancedModelRenderer cube_r45;
    public final AdvancedModelRenderer cube_r46;
    public final AdvancedModelRenderer jaw;
    public final AdvancedModelRenderer cube_r47;
    public final AdvancedModelRenderer cube_r48;
    public final AdvancedModelRenderer cube_r49;
    public final AdvancedModelRenderer throat;
    public final AdvancedModelRenderer cube_r50;
    public final AdvancedModelRenderer eye;
    public final AdvancedModelRenderer cube_r51;
    public final AdvancedModelRenderer cube_r52;
    public final AdvancedModelRenderer leftArm1;
    public final AdvancedModelRenderer cube_r53;
    public final AdvancedModelRenderer cube_r54;
    public final AdvancedModelRenderer leftArm2;
    public final AdvancedModelRenderer cube_r55;
    public final AdvancedModelRenderer cube_r56;
    public final AdvancedModelRenderer cube_r57;
    public final AdvancedModelRenderer leftArm3;
    public final AdvancedModelRenderer cube_r58;
    public final AdvancedModelRenderer cube_r59;
    public final AdvancedModelRenderer cube_r60;
    public final AdvancedModelRenderer rightArm1;
    public final AdvancedModelRenderer cube_r61;
    public final AdvancedModelRenderer cube_r62;
    public final AdvancedModelRenderer rightArm2;
    public final AdvancedModelRenderer cube_r63;
    public final AdvancedModelRenderer cube_r64;
    public final AdvancedModelRenderer cube_r65;
    public final AdvancedModelRenderer rightArm3;
    public final AdvancedModelRenderer cube_r66;
    public final AdvancedModelRenderer cube_r67;
    public final AdvancedModelRenderer cube_r68;


    private ModelAnimator animator;

    public ModelYuanyanglong() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 2.0532F, 0.7656F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 0.9319F, -6.6752F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0087F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 26, -2.0F, -2.8F, 3.4F, 6, 10, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.4282F, 0.2045F);
        this.root.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0611F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 7, -3.0F, -0.9F, -3.7F, 6, 2, 7, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 2.428F, 5.0348F);
        this.root.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2094F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 50, 40, -3.0F, -3.4F, -3.1F, 5, 7, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 2.428F, 5.0348F);
        this.root.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 53, -3.0F, -3.875F, -3.425F, 5, 2, 5, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 2.428F, 5.0348F);
        this.root.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 66, 0, -3.0F, 2.6F, -3.6F, 4, 2, 4, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(2.4F, 1.1008F, 2.6635F);
        this.root.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.2618F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.7F, -3.0F);
        this.leftLeg1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.8203F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 59, 52, -1.4F, 3.8102F, 0.6441F, 3, 2, 6, 0.01F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 53, 1.1F, -3.1898F, 6.6441F, 0, 7, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 50, -1.4F, -3.1898F, 0.6441F, 3, 7, 6, 0.01F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 44, 52, -1.0F, -3.0898F, 1.3441F, 2, 9, 5, 0.01F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 4.4264F, -5.2903F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.1047F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -4.9F, 1.8F);
        this.leftLeg2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 69, 24, -1.0F, 4.0451F, -3.3785F, 2, 11, 2, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 9.9129F, 2.345F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.2618F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 2.4F, -5.1F);
        this.leftLeg3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.5672F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 37, 79, -1.0F, -5.3386F, 2.1848F, 1, 8, 1, 0.0F, true));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 5.8504F, -4.0212F);
        this.leftLeg3.addChild(leftFoot);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 2.1806F, 3.2862F);
        this.leftFoot.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1047F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 27, 82, -1.0F, -2.2F, -5.2F, 2, 1, 2, 0.0F, true));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, -0.1531F, -1.6972F);
        this.leftFoot.addChild(leftToes);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.1351F, 3.0938F);
        this.leftToes.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1047F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 80, -1.0F, -2.2F, -5.2F, 2, 1, 2, -0.01F, true));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-2.4F, 1.1008F, 2.6635F);
        this.root.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.2618F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.7F, -3.0F);
        this.rightLeg1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.8203F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 59, 52, -1.6F, 3.8102F, 0.6441F, 3, 2, 6, 0.01F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 21, 53, -1.1F, -3.1898F, 6.6441F, 0, 7, 1, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 25, 50, -1.6F, -3.1898F, 0.6441F, 3, 7, 6, 0.01F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 44, 52, -1.0F, -3.0898F, 1.3441F, 2, 9, 5, 0.01F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 4.4264F, -5.2903F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.1047F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -4.9F, 1.8F);
        this.rightLeg2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1745F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 69, 24, -1.0F, 4.0451F, -3.3785F, 2, 11, 2, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 9.9129F, 2.345F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.2618F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 2.4F, -5.1F);
        this.rightLeg3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.5672F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 37, 79, 0.0F, -5.3386F, 2.1848F, 1, 8, 1, 0.0F, false));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 5.8504F, -4.0212F);
        this.rightLeg3.addChild(rightFoot);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 2.1806F, 3.2862F);
        this.rightFoot.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1047F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 27, 82, -1.0F, -2.2F, -5.2F, 2, 1, 2, 0.0F, false));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, -0.1531F, -1.6972F);
        this.rightFoot.addChild(rightToes);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 2.1351F, 3.0938F);
        this.rightToes.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1047F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 80, -1.0F, -2.2F, -5.2F, 2, 1, 2, -0.01F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.472F, 6.1348F);
        this.root.addChild(tail1);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 2.9F, -1.1F);
        this.tail1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 13, 70, -2.0F, 0.2F, -0.5F, 3, 2, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 2.7F, -0.9F);
        this.tail1.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2618F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 59, 61, -2.0F, -3.1F, -0.4F, 4, 4, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.9F, 2.9F);
        this.tail1.addChild(tail2);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 3.1713F, 8.2187F);
        this.tail2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2724F, -0.1192F, -0.4025F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 79, 7, -4.0F, 0.0F, -8.5F, 3, 0, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 3.1713F, 8.2187F);
        this.tail2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.2724F, 0.1192F, 0.4025F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 75, 78, 1.0F, 0.0F, -8.5F, 3, 0, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 1.6F, -3.3F);
        this.tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.2793F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 64, 78, -1.0F, -0.7F, 2.6F, 1, 1, 4, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 76, 61, -1.5F, -2.7F, 2.6F, 2, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.01F, 1.4892F, 3.2371F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1309F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.01F, 1.382F, 4.9816F);
        this.tail3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2287F, -0.1192F, -0.4025F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 13, -5.0F, 0.0F, -5.5F, 5, 0, 12, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.01F, 1.382F, 4.9816F);
        this.tail3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.2287F, 0.1192F, 0.4025F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, 0.0F, 0.0F, -5.5F, 5, 0, 12, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.01F, 1.5413F, 5.4475F);
        this.tail3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.6283F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 35, 0, -4.5F, 0.0F, 0.0F, 9, 0, 6, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.49F, 0.4991F, -9.6414F);
        this.tail3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.2967F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 69, 38, 0.0F, -3.7441F, 8.7299F, 1, 1, 6, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -2.9F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, -0.0436F, 0.0F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0F, -0.0682F, -6.9215F);
        this.chest.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.4363F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 13, 77, -3.0F, -0.2F, 0.2F, 4, 1, 3, 0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, 0.9319F, -3.7752F);
        this.chest.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3054F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 43, -3.0F, -2.1F, -2.5F, 5, 2, 7, 0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, 0.9319F, -3.7752F);
        this.chest.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1833F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 25, 26, -3.0F, -1.7F, -2.5F, 5, 5, 8, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 35, 17, -3.0F, 3.3F, -0.5F, 5, 1, 6, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 58, 17, -3.0F, 4.3F, 0.5F, 5, 1, 5, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 19, 64, -3.0F, 5.3F, 1.5F, 5, 1, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.5F, 0.9319F, -3.7752F);
        this.chest.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.5498F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 8, 88, -1.0F, 4.4F, 7.0F, 5, 0, 1, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 25, 40, -1.0F, 2.4F, 0.0F, 5, 2, 7, 0.01F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 1.0224F, -5.228F);
        this.chest.addChild(neck1);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.162F, -2.926F);
        this.neck1.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.8465F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, -1, 88, -2.0F, 1.0238F, 4.7433F, 4, 0, 1, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 61, -2.0F, -0.9762F, -0.2567F, 4, 2, 5, 0.01F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -1.338F, -3.426F);
        this.neck1.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.4102F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 62, 7, -2.0F, -1.0F, 0.8F, 4, 3, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.2942F, -1.8687F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.0262F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5F, 0.2018F, -4.475F);
        this.neck2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.9512F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 69, 46, -1.0F, -2.2849F, 0.0226F, 3, 1, 4, 0.01F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, 0.2018F, -4.475F);
        this.neck2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.829F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 51, 70, -1.0F, -3.6478F, 0.3175F, 3, 2, 4, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.3005F, -1.582F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2094F, 0.0F, 0.0F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -3.6421F, -1.0936F);
        this.neck3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -1.1957F, -0.0036F, 0.0003F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 51, 77, -1.0F, -0.2182F, 0.0053F, 2, 1, 4, 0.01F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -2.6383F, -2.9991F);
        this.neck3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -1.0908F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 79, 17, -1.0F, -0.5398F, 0.8981F, 2, 1, 3, 0.01F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 78, 31, -1.0F, -1.9398F, 0.8981F, 2, 2, 3, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -2.9966F, -1.2244F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.2618F, 0.0F, 0.0F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -0.6973F, -2.5817F);
        this.neck4.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.6545F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 83, 0, -1.0F, -1.8F, 0.5F, 2, 1, 2, 0.02F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -0.3854F, -2.0971F);
        this.neck4.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.9163F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 79, 68, -1.0F, -1.4116F, 0.0845F, 2, 2, 2, -0.03F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -1.0274F, -0.9615F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, -0.0785F, 0.0F, 0.0F);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.1875F, -6.3862F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -1.1694F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 84, 40, 0.0F, -3.8949F, 0.9054F, 1, 1, 1, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 2.0772F, -6.2222F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.2531F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 84, 0.0F, -2.8261F, 2.2191F, 1, 1, 1, 0.005F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 2.0772F, -6.2222F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.4014F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 58, 83, 0.0F, -0.0979F, 2.8611F, 1, 1, 1, 0.01F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 1.7286F, -4.7767F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.1047F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 38, 64, 0.0F, -0.9738F, 1.5499F, 1, 1, 1, 0.0F, false));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 79, 73, -0.5F, -0.9738F, 2.5499F, 2, 1, 2, 0.0F, false));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 51, 67, -0.5F, -1.9738F, 2.5499F, 2, 1, 1, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.8F, 0.7751F, -2.6471F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.4974F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 84, 82, -0.5F, -0.7F, -0.2F, 1, 1, 1, -0.005F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 68, 84, -1.1F, -0.7F, -0.2F, 1, 1, 1, -0.005F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.5F, 1.7051F, -4.764F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.1047F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 63, 84, -0.2F, -1.2738F, 1.7499F, 1, 1, 1, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 84, 43, -0.8F, -1.2738F, 1.7499F, 1, 1, 1, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 84, 49, -0.2F, -0.9738F, 1.7499F, 1, 1, 1, -0.005F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 84, 46, -0.8F, -0.9738F, 1.7499F, 1, 1, 1, -0.005F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.5F, 1.3941F, -5.61F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.3316F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 83, 4, -1.0F, -3.2441F, 3.8799F, 2, 1, 1, -0.02F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.5F, -0.4601F, -1.3164F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.3578F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 51, 83, -0.5F, -0.4F, -1.0F, 1, 1, 2, 0.01F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.5F, 1.3813F, -5.6162F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.3316F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 78, 58, -1.0F, -3.2441F, 3.2799F, 2, 1, 1, -0.01F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.5F, 0.5653F, -1.6068F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.1745F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 75, 82, -1.0F, -1.1181F, -0.1F, 2, 1, 2, 0.03F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.25F, 0.9528F, -0.8151F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0262F, 0.0F, 0.0F);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.2F, 0.2182F, -4.5096F);
        this.jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.4189F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 85, 58, -0.05F, 0.9761F, 1.908F, 1, 1, 1, -0.02F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.25F, 0.1557F, -4.4936F);
        this.jaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.4189F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 42, 85, 0.0F, 1.0261F, 1.7191F, 1, 1, 1, -0.01F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.25F, -0.9438F, -5.694F);
        this.jaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0873F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 9, 82, -1.0F, 1.2524F, 4.1235F, 2, 1, 2, -0.01F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.25F, 0.9085F, -1.183F);
        this.jaw.addChild(throat);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 0.1888F, -3.1624F);
        this.throat.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.5236F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 18, 82, -1.0F, -2.6776F, 2.5871F, 2, 1, 2, -0.05F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.5F, 0.5723F, -2.1351F);
        this.head.addChild(eye);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 1.1563F, -2.6416F);
        this.eye.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.1063F, -0.1736F, -0.0184F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 84, 37, -0.5791F, -1.3738F, 2.3043F, 1, 1, 1, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 1.1563F, -2.6416F);
        this.eye.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.1063F, 0.1736F, 0.0184F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 84, 37, -0.4209F, -1.3738F, 2.3043F, 1, 1, 1, 0.0F, true));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(2.4F, 1.6252F, -4.5944F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.0F, 0.1745F, -0.1309F);


        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.3885F, 1.1154F, -1.2454F);
        this.leftArm1.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.1222F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 52, 25, 0.279F, -3.5601F, 0.6324F, 0, 4, 8, 0.0F, true));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 66, 70, -0.521F, -1.5601F, 0.6324F, 1, 2, 5, 0.0F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.8885F, 1.7388F, -2.7325F);
        this.leftArm1.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.6632F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 28, 76, -1.021F, -3.8189F, 1.8281F, 1, 2, 3, -0.02F, true));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.1655F, 1.6727F, 3.8046F);
        this.leftArm1.addChild(leftArm2);


        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.829F, -0.2573F, -0.35F);
        this.leftArm2.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.794F, 0.0124F, -0.0122F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 69, 0.004F, -0.045F, -3.7235F, 0, 4, 6, -0.01F, true));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(1.2033F, 2.2394F, -5.8218F);
        this.leftArm2.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 1.1257F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 79, 11, -1.1702F, 2.6117F, 1.0994F, 1, 1, 4, -0.03F, true));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.554F, -0.2573F, -5.05F);
        this.leftArm2.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.7941F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 78, 52, -0.521F, 3.3072F, -0.4292F, 1, 1, 4, -0.01F, true));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0096F, 2.4101F, -2.8894F);
        this.leftArm2.addChild(leftArm3);


        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(1.2887F, 0.0522F, -2.4774F);
        this.leftArm3.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 2.1031F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 42, 79, -0.8652F, 2.0861F, -5.3828F, 0, 1, 4, 0.0F, true));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(1.2887F, 0.0522F, -2.4774F);
        this.leftArm3.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 1.946F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 38, 67, -0.6652F, 2.6893F, -6.9661F, 0, 5, 6, 0.0F, true));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 78, 24, -0.7652F, 2.1893F, -5.9661F, 0, 1, 5, 0.0F, true));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.5444F, -2.6674F, -2.1607F);
        this.leftArm3.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 1.5795F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 28, 70, 0.179F, 2.0543F, -6.6258F, 0, 1, 4, 0.0F, true));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-2.4F, 1.6252F, -4.5944F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.0F, -0.1745F, 0.1309F);


        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-0.3885F, 1.1154F, -1.2454F);
        this.rightArm1.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.1222F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 52, 25, -0.279F, -3.5601F, 0.6324F, 0, 4, 8, 0.0F, false));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 66, 70, -0.479F, -1.5601F, 0.6324F, 1, 2, 5, 0.0F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(-0.8885F, 1.7388F, -2.7325F);
        this.rightArm1.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.6632F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 28, 76, 0.021F, -3.8189F, 1.8281F, 1, 2, 3, -0.02F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.1655F, 1.6727F, 3.8046F);
        this.rightArm1.addChild(rightArm2);


        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(-0.829F, -0.2573F, -0.35F);
        this.rightArm2.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.794F, -0.0124F, 0.0122F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 0, 69, -0.004F, -0.045F, -3.7235F, 0, 4, 6, -0.01F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(-1.2033F, 2.2394F, -5.8218F);
        this.rightArm2.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 1.1257F, 0.0F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 79, 11, 0.1702F, 2.6117F, 1.0994F, 1, 1, 4, -0.03F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(-0.554F, -0.2573F, -5.05F);
        this.rightArm2.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.7941F, 0.0F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 78, 52, -0.479F, 3.3072F, -0.4292F, 1, 1, 4, -0.01F, false));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.0096F, 2.4101F, -2.8894F);
        this.rightArm2.addChild(rightArm3);


        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(-1.2887F, 0.0522F, -2.4774F);
        this.rightArm3.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 2.1031F, 0.0F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 42, 79, 0.8652F, 2.0861F, -5.3828F, 0, 1, 4, 0.0F, false));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(-1.2887F, 0.0522F, -2.4774F);
        this.rightArm3.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 1.946F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 38, 67, 0.6652F, 2.6893F, -6.9661F, 0, 5, 6, 0.0F, false));
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 78, 24, 0.7652F, 2.1893F, -5.9661F, 0, 1, 5, 0.0F, false));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(-0.5444F, -2.6674F, -2.1607F);
        this.rightArm3.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 1.5795F, 0.0F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 28, 70, -0.179F, 2.0543F, -6.6258F, 0, 1, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.root.offsetY = -0.01F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.4F;
        this.root.offsetX = 0.1F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(130);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 0.8F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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

        EntityPrehistoricFloraYuanyanglong entityYuanyanglong = (EntityPrehistoricFloraYuanyanglong) e;

        this.faceTarget(f3, f4, 12, neck1);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, neck3);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityYuanyanglong.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityYuanyanglong.getAnimation() == entityYuanyanglong.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        } else {
            if (!entityYuanyanglong.isReallyInWater()) {

                if (f3 == 0.0F || !entityYuanyanglong.getIsMoving()) {
                    if (entityYuanyanglong.getAnimation() != entityYuanyanglong.EAT_ANIMATION
                            && entityYuanyanglong.getAnimation() != entityYuanyanglong.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityYuanyanglong.getIsFast()) { //Running


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
        EntityPrehistoricFloraYuanyanglong ee = (EntityPrehistoricFloraYuanyanglong) entitylivingbaseIn;

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
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
//            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.SAND_ANIMATION) {
            animSand(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) {
            animDisp(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYuanyanglong entity = (EntityPrehistoricFloraYuanyanglong) entitylivingbaseIn;
        int animCycle = 120;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-22.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -22.75 + (((tickAnim - 15) / 15) * (-22.75-(-22.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -22.75 + (((tickAnim - 30) / 8) * (5.95008-(-22.75)));
            yy = 0 + (((tickAnim - 30) / 8) * (8.73411-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (-0.09374-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 5.95008 + (((tickAnim - 38) / 7) * (-21.84985-(5.95008)));
            yy = 8.73411 + (((tickAnim - 38) / 7) * (17.46821-(8.73411)));
            zz = -0.09374 + (((tickAnim - 38) / 7) * (-0.18748-(-0.09374)));
        }
        else if (tickAnim >= 45 && tickAnim < 105) {
            xx = -21.84985 + (((tickAnim - 45) / 60) * (-21.84985-(-21.84985)));
            yy = 17.46821 + (((tickAnim - 45) / 60) * (17.46821-(17.46821)));
            zz = -0.18748 + (((tickAnim - 45) / 60) * (-0.18748-(-0.18748)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = -21.84985 + (((tickAnim - 105) / 15) * (0-(-21.84985)));
            yy = 17.46821 + (((tickAnim - 105) / 15) * (0-(17.46821)));
            zz = -0.18748 + (((tickAnim - 105) / 15) * (0-(-0.18748)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.175-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (2.45-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 1.175 + (((tickAnim - 15) / 15) * (1.175-(1.175)));
            zz = 2.45 + (((tickAnim - 15) / 15) * (2.45-(2.45)));
        }
        else if (tickAnim >= 30 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 30) / 75) * (0-(0)));
            yy = 1.175 + (((tickAnim - 30) / 75) * (1.175-(1.175)));
            zz = 2.45 + (((tickAnim - 30) / 75) * (2.45-(2.45)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            yy = 1.175 + (((tickAnim - 105) / 15) * (0-(1.175)));
            zz = 2.45 + (((tickAnim - 105) / 15) * (0-(2.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (4.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-10-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 4.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-10 + (((tickAnim - 15) / 7) * (-5-(4.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-10)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -5 + (((tickAnim - 22) / 8) * (-5-(-5)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -5 + (((tickAnim - 30) / 8) * (-2-(-5)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -2 + (((tickAnim - 38) / 7) * (6.25-(-2)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 105) {
            xx = 6.25 + (((tickAnim - 45) / 60) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 45) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 60) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 6.25 + (((tickAnim - 105) / 15) * (0-(6.25)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (14.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 14.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-25 + (((tickAnim - 15) / 7) * (-10.25-(14.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-25)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -10.25 + (((tickAnim - 22) / 8) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = -10.25 + (((tickAnim - 30) / 7) * (-16-(-10.25)));
            yy = 0 + (((tickAnim - 30) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 48) {
            xx = -16 + (((tickAnim - 37) / 11) * (-10.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-15-(-16)));
            yy = 0 + (((tickAnim - 37) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 11) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 105) {
            xx = -10.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-15 + (((tickAnim - 48) / 57) * (6.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-15-(-10.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-15)));
            yy = 0 + (((tickAnim - 48) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 57) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 6.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-15 + (((tickAnim - 105) / 15) * (0-(6.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-15)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (11.17-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 15) {
            xx = 11.17 + (((tickAnim - 2) / 13) * (19.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-25-(11.17)));
            yy = 0 + (((tickAnim - 2) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 13) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 19.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-25 + (((tickAnim - 15) / 7) * (1.25-(19.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-25)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 1.25 + (((tickAnim - 22) / 8) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 1.25 + (((tickAnim - 30) / 8) * (-11.5-(1.25)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = -11.5 + (((tickAnim - 38) / 3) * (-20.94-(-11.5)));
            yy = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -20.94 + (((tickAnim - 41) / 9) * (-7.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(-20.94)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 107) {
            xx = -7.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 50) / 57) * (-7.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(-7.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 50) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 57) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 120) {
            xx = -7.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 107) / 13) * (0-(-7.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 107) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -9.75 + (((tickAnim - 15) / 2) * (-9.7-(-9.75)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -9.7 + (((tickAnim - 17) / 1) * (-9.75-(-9.7)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -9.75 + (((tickAnim - 18) / 2) * (-9.7-(-9.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -9.7 + (((tickAnim - 20) / 2) * (-9.75-(-9.7)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -9.75 + (((tickAnim - 22) / 8) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -9.75 + (((tickAnim - 30) / 8) * (4.75-(-9.75)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 4.75 + (((tickAnim - 38) / 12) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 52) {
            xx = 4.75 + (((tickAnim - 50) / 2) * (4.2-(4.75)));
            yy = 0 + (((tickAnim - 50) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 2) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 53) {
            xx = 4.2 + (((tickAnim - 52) / 1) * (4.75-(4.2)));
            yy = 0 + (((tickAnim - 52) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 1) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 4.75 + (((tickAnim - 53) / 2) * (4.2-(4.75)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 57) {
            xx = 4.2 + (((tickAnim - 55) / 2) * (4.75-(4.2)));
            yy = 0 + (((tickAnim - 55) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 2) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 105) {
            xx = 4.75 + (((tickAnim - 57) / 48) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 57) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 48) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 4.75 + (((tickAnim - 105) / 15) * (0-(4.75)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4.56-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 4.56 + (((tickAnim - 7) / 8) * (-1.5-(4.56)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -1.5 + (((tickAnim - 15) / 3) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -1.5 + (((tickAnim - 18) / 12) * (-2.25-(-1.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -2.25 + (((tickAnim - 30) / 8) * (3-(-2.25)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 3 + (((tickAnim - 38) / 7) * (-7.66789-(3)));
            yy = 0 + (((tickAnim - 38) / 7) * (12.69819-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (2.59138-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 61) {
            xx = -7.66789 + (((tickAnim - 45) / 16) * (-7.66789-(-7.66789)));
            yy = 12.69819 + (((tickAnim - 45) / 16) * (12.69819-(12.69819)));
            zz = 2.59138 + (((tickAnim - 45) / 16) * (2.59138-(2.59138)));
        }
        else if (tickAnim >= 61 && tickAnim < 105) {
            xx = -7.66789 + (((tickAnim - 61) / 44) * (-7.66789-(-7.66789)));
            yy = 12.69819 + (((tickAnim - 61) / 44) * (12.69819-(12.69819)));
            zz = 2.59138 + (((tickAnim - 61) / 44) * (2.59138-(2.59138)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = -7.66789 + (((tickAnim - 105) / 15) * (0-(-7.66789)));
            yy = 12.69819 + (((tickAnim - 105) / 15) * (0-(12.69819)));
            zz = 2.59138 + (((tickAnim - 105) / 15) * (0-(2.59138)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.125-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = -0.125 + (((tickAnim - 15) / 3) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = -0.125 + (((tickAnim - 18) / 12) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (0.15-(0)));
            zz = -0.125 + (((tickAnim - 30) / 8) * (0.02-(-0.125)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0.15 + (((tickAnim - 38) / 7) * (-0.5-(0.15)));
            zz = 0.02 + (((tickAnim - 38) / 7) * (0.175-(0.02)));
        }
        else if (tickAnim >= 45 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 45) / 16) * (0-(0)));
            yy = -0.5 + (((tickAnim - 45) / 16) * (-0.5-(-0.5)));
            zz = 0.175 + (((tickAnim - 45) / 16) * (0.175-(0.175)));
        }
        else if (tickAnim >= 61 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 61) / 44) * (0-(0)));
            yy = -0.5 + (((tickAnim - 61) / 44) * (-0.5-(-0.5)));
            zz = 0.175 + (((tickAnim - 61) / 44) * (0.175-(0.175)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            yy = -0.5 + (((tickAnim - 105) / 15) * (0-(-0.5)));
            zz = 0.175 + (((tickAnim - 105) / 15) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-10.71-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -10.71 + (((tickAnim - 7) / 8) * (11-(-10.71)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 11 + (((tickAnim - 15) / 3) * (11-(11)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 11 + (((tickAnim - 18) / 12) * (9-(11)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 9 + (((tickAnim - 30) / 8) * (-18.25-(9)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -18.25 + (((tickAnim - 38) / 7) * (12.85824-(-18.25)));
            yy = 0 + (((tickAnim - 38) / 7) * (2.81897-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (-0.40132-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 61) {
            xx = 12.85824 + (((tickAnim - 45) / 16) * (12.85824-(12.85824)));
            yy = 2.81897 + (((tickAnim - 45) / 16) * (2.81897-(2.81897)));
            zz = -0.40132 + (((tickAnim - 45) / 16) * (-0.40132-(-0.40132)));
        }
        else if (tickAnim >= 61 && tickAnim < 70) {
            xx = 12.85824 + (((tickAnim - 61) / 9) * (13.64955-(12.85824)));
            yy = 2.81897 + (((tickAnim - 61) / 9) * (10.23742-(2.81897)));
            zz = -0.40132 + (((tickAnim - 61) / 9) * (4.48347-(-0.40132)));
        }
        else if (tickAnim >= 70 && tickAnim < 105) {
            xx = 13.64955 + (((tickAnim - 70) / 35) * (13.64955-(13.64955)));
            yy = 10.23742 + (((tickAnim - 70) / 35) * (10.23742-(10.23742)));
            zz = 4.48347 + (((tickAnim - 70) / 35) * (4.48347-(4.48347)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 13.64955 + (((tickAnim - 105) / 15) * (0-(13.64955)));
            yy = 10.23742 + (((tickAnim - 105) / 15) * (0-(10.23742)));
            zz = 4.48347 + (((tickAnim - 105) / 15) * (0-(4.48347)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.47-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.275-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = -0.47 + (((tickAnim - 7) / 8) * (-0.05-(-0.47)));
            zz = 0.275 + (((tickAnim - 7) / 8) * (0-(0.275)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -0.05 + (((tickAnim - 15) / 3) * (-0.05-(-0.05)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = -0.05 + (((tickAnim - 18) / 12) * (-0.05-(-0.05)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = -0.05 + (((tickAnim - 30) / 8) * (-0.95-(-0.05)));
            zz = 0 + (((tickAnim - 30) / 8) * (0.325-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = -0.95 + (((tickAnim - 38) / 7) * (0.375-(-0.95)));
            zz = 0.325 + (((tickAnim - 38) / 7) * (-0.225-(0.325)));
        }
        else if (tickAnim >= 45 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 45) / 16) * (0-(0)));
            yy = 0.375 + (((tickAnim - 45) / 16) * (0.375-(0.375)));
            zz = -0.225 + (((tickAnim - 45) / 16) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 61 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 61) / 44) * (0-(0)));
            yy = 0.375 + (((tickAnim - 61) / 44) * (0.375-(0.375)));
            zz = -0.225 + (((tickAnim - 61) / 44) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            yy = 0.375 + (((tickAnim - 105) / 15) * (0-(0.375)));
            zz = -0.225 + (((tickAnim - 105) / 15) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-0.34-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -0.34 + (((tickAnim - 7) / 8) * (23.25-(-0.34)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 23.25 + (((tickAnim - 15) / 3) * (23.25-(23.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 23.25 + (((tickAnim - 18) / 12) * (23.25-(23.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 23.25 + (((tickAnim - 30) / 8) * (-0.37919-(23.25)));
            yy = 0 + (((tickAnim - 30) / 8) * (12.69134-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (2.38061-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -0.37919 + (((tickAnim - 38) / 7) * (9.1185-(-0.37919)));
            yy = 12.69134 + (((tickAnim - 38) / 7) * (13.12555-(12.69134)));
            zz = 2.38061 + (((tickAnim - 38) / 7) * (5.69494-(2.38061)));
        }
        else if (tickAnim >= 45 && tickAnim < 61) {
            xx = 9.1185 + (((tickAnim - 45) / 16) * (9.1185-(9.1185)));
            yy = 13.12555 + (((tickAnim - 45) / 16) * (13.12555-(13.12555)));
            zz = 5.69494 + (((tickAnim - 45) / 16) * (5.69494-(5.69494)));
        }
        else if (tickAnim >= 61 && tickAnim < 65) {
            xx = 9.1185 + (((tickAnim - 61) / 4) * (5.17304-(9.1185)));
            yy = 13.12555 + (((tickAnim - 61) / 4) * (12.84557-(13.12555)));
            zz = 5.69494 + (((tickAnim - 61) / 4) * (7.10756-(5.69494)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 5.17304 + (((tickAnim - 65) / 5) * (9.78848-(5.17304)));
            yy = 12.84557 + (((tickAnim - 65) / 5) * (12.50959-(12.84557)));
            zz = 7.10756 + (((tickAnim - 65) / 5) * (8.8027-(7.10756)));
        }
        else if (tickAnim >= 70 && tickAnim < 105) {
            xx = 9.78848 + (((tickAnim - 70) / 35) * (9.78848-(9.78848)));
            yy = 12.50959 + (((tickAnim - 70) / 35) * (12.50959-(12.50959)));
            zz = 8.8027 + (((tickAnim - 70) / 35) * (8.8027-(8.8027)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 9.78848 + (((tickAnim - 105) / 15) * (0-(9.78848)));
            yy = 12.50959 + (((tickAnim - 105) / 15) * (0-(12.50959)));
            zz = 8.8027 + (((tickAnim - 105) / 15) * (0-(8.8027)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.16-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = -0.16 + (((tickAnim - 7) / 8) * (0.525-(-0.16)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.525 + (((tickAnim - 15) / 3) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 0.525 + (((tickAnim - 18) / 12) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0.525 + (((tickAnim - 30) / 8) * (0.005-(0.525)));
            zz = 0 + (((tickAnim - 30) / 8) * (0.2-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0.005 + (((tickAnim - 38) / 7) * (0-(0.005)));
            zz = 0.2 + (((tickAnim - 38) / 7) * (0-(0.2)));
        }
        else if (tickAnim >= 45 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 45) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 16) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 61) / 44) * (0-(0)));
            yy = 0 + (((tickAnim - 61) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 44) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 19.5 + (((tickAnim - 7) / 8) * (19.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-25-(19.5)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 19.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-25 + (((tickAnim - 15) / 2) * (0.75-(19.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-25)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0.75 + (((tickAnim - 17) / 1) * (0-(0.75)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0.75-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0.75 + (((tickAnim - 20) / 2) * (0-(0.75)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -4.25 + (((tickAnim - 38) / 7) * (-14.75-(-4.25)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = -14.75 + (((tickAnim - 45) / 3) * (-15.25-(-14.75)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -15.25 + (((tickAnim - 48) / 2) * (-14.75-(-15.25)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 52) {
            xx = -14.75 + (((tickAnim - 50) / 2) * (-12-(-14.75)));
            yy = 0 + (((tickAnim - 50) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 2) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 53) {
            xx = -12 + (((tickAnim - 52) / 1) * (-14.75-(-12)));
            yy = 0 + (((tickAnim - 52) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 1) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = -14.75 + (((tickAnim - 53) / 2) * (-12-(-14.75)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 57) {
            xx = -12 + (((tickAnim - 55) / 2) * (-14.75-(-12)));
            yy = 0 + (((tickAnim - 55) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 2) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 61) {
            xx = -14.75 + (((tickAnim - 57) / 4) * (-14.75-(-14.75)));
            yy = 0 + (((tickAnim - 57) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 4) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 65) {
            xx = -14.75 + (((tickAnim - 61) / 4) * (-1.99724-(-14.75)));
            yy = 0 + (((tickAnim - 61) / 4) * (5.68176-(0)));
            zz = 0 + (((tickAnim - 61) / 4) * (0.02519-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = -1.99724 + (((tickAnim - 65) / 5) * (-14.74393-(-1.99724)));
            yy = 5.68176 + (((tickAnim - 65) / 5) * (12.49988-(5.68176)));
            zz = 0.02519 + (((tickAnim - 65) / 5) * (0.05542-(0.02519)));
        }
        else if (tickAnim >= 70 && tickAnim < 105) {
            xx = -14.74393 + (((tickAnim - 70) / 35) * (-14.74393-(-14.74393)));
            yy = 12.49988 + (((tickAnim - 70) / 35) * (12.49988-(12.49988)));
            zz = 0.05542 + (((tickAnim - 70) / 35) * (0.05542-(0.05542)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = -14.74393 + (((tickAnim - 105) / 15) * (0-(-14.74393)));
            yy = 12.49988 + (((tickAnim - 105) / 15) * (0-(12.49988)));
            zz = 0.05542 + (((tickAnim - 105) / 15) * (0-(0.05542)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0.325-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 0.325 + (((tickAnim - 33) / 5) * (0-(0.325)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = -0.15 + (((tickAnim - 40) / 5) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 4.25 + (((tickAnim - 7) / 8) * (0-(4.25)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (-3-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -3 + (((tickAnim - 17) / 1) * (0-(-3)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (-3-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -3 + (((tickAnim - 20) / 2) * (0-(-3)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (3-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 3 + (((tickAnim - 30) / 8) * (16.5-(3)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 16.5 + (((tickAnim - 38) / 7) * (16.5-(16.5)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 16.5 + (((tickAnim - 45) / 3) * (17.25-(16.5)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 17.25 + (((tickAnim - 48) / 2) * (16.5-(17.25)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 52) {
            xx = 16.5 + (((tickAnim - 50) / 2) * (11.5-(16.5)));
            yy = 0 + (((tickAnim - 50) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 2) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 53) {
            xx = 11.5 + (((tickAnim - 52) / 1) * (16.5-(11.5)));
            yy = 0 + (((tickAnim - 52) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 1) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 16.5 + (((tickAnim - 53) / 2) * (11.5-(16.5)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 57) {
            xx = 11.5 + (((tickAnim - 55) / 2) * (16.5-(11.5)));
            yy = 0 + (((tickAnim - 55) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 2) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 61) {
            xx = 16.5 + (((tickAnim - 57) / 4) * (16.5-(16.5)));
            yy = 0 + (((tickAnim - 57) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 4) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 105) {
            xx = 16.5 + (((tickAnim - 61) / 44) * (16.5-(16.5)));
            yy = 0 + (((tickAnim - 61) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 44) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 16.5 + (((tickAnim - 105) / 15) * (0-(16.5)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0.2 + (((tickAnim - 15) / 15) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 30) / 75) * (0-(0)));
            yy = 0.2 + (((tickAnim - 30) / 75) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 30) / 75) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            yy = 0.2 + (((tickAnim - 105) / 15) * (0-(0.2)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 24.5 + (((tickAnim - 15) / 15) * (24.5-(24.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 24.5 + (((tickAnim - 30) / 3) * (15.54205-(24.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (-2.71628-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (-0.54655-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 15.54205 + (((tickAnim - 33) / 1) * (9.23675-(15.54205)));
            yy = -2.71628 + (((tickAnim - 33) / 1) * (-4.52714-(-2.71628)));
            zz = -0.54655 + (((tickAnim - 33) / 1) * (-0.91092-(-0.54655)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 9.23675 + (((tickAnim - 34) / 4) * (-2.54758-(9.23675)));
            yy = -4.52714 + (((tickAnim - 34) / 4) * (-6.7399-(-4.52714)));
            zz = -0.91092 + (((tickAnim - 34) / 4) * (0.12423-(-0.91092)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -2.54758 + (((tickAnim - 38) / 2) * (7.77612-(-2.54758)));
            yy = -6.7399 + (((tickAnim - 38) / 2) * (-10.91499-(-6.7399)));
            zz = 0.12423 + (((tickAnim - 38) / 2) * (-0.38156-(0.12423)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 7.77612 + (((tickAnim - 40) / 5) * (32.08778-(7.77612)));
            yy = -10.91499 + (((tickAnim - 40) / 5) * (-17.347-(-10.91499)));
            zz = -0.38156 + (((tickAnim - 40) / 5) * (-6.36498-(-0.38156)));
        }
        else if (tickAnim >= 45 && tickAnim < 105) {
            xx = 32.08778 + (((tickAnim - 45) / 60) * (32.08778-(32.08778)));
            yy = -17.347 + (((tickAnim - 45) / 60) * (-17.347-(-17.347)));
            zz = -6.36498 + (((tickAnim - 45) / 60) * (-6.36498-(-6.36498)));
        }
        else if (tickAnim >= 105 && tickAnim < 113) {
            xx = 32.08778 + (((tickAnim - 105) / 8) * (12.63109-(32.08778)));
            yy = -17.347 + (((tickAnim - 105) / 8) * (-9.55893-(-17.347)));
            zz = -6.36498 + (((tickAnim - 105) / 8) * (-1.36621-(-6.36498)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 12.63109 + (((tickAnim - 113) / 7) * (0-(12.63109)));
            yy = -9.55893 + (((tickAnim - 113) / 7) * (0-(-9.55893)));
            zz = -1.36621 + (((tickAnim - 113) / 7) * (0-(-1.36621)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -22.5 + (((tickAnim - 15) / 15) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 105) {
            xx = -22.5 + (((tickAnim - 30) / 75) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 30) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 75) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = -22.5 + (((tickAnim - 105) / 15) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 15 + (((tickAnim - 15) / 15) * (15-(15)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 105) {
            xx = 15 + (((tickAnim - 30) / 75) * (15-(15)));
            yy = 0 + (((tickAnim - 30) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 75) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 15 + (((tickAnim - 105) / 15) * (0-(15)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 7 + (((tickAnim - 15) / 15) * (7-(7)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 7 + (((tickAnim - 30) / 8) * (5.5-(7)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 5.5 + (((tickAnim - 38) / 7) * (-3.03-(5.5)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 105) {
            xx = -3.03 + (((tickAnim - 45) / 60) * (-3.03-(-3.03)));
            yy = 0 + (((tickAnim - 45) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 60) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = -3.03 + (((tickAnim - 105) / 15) * (0-(-3.03)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.55-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0.675 + (((tickAnim - 15) / 15) * (0.675-(0.675)));
            zz = 0.55 + (((tickAnim - 15) / 15) * (0.55-(0.55)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0.675 + (((tickAnim - 30) / 8) * (0-(0.675)));
            zz = 0.55 + (((tickAnim - 30) / 8) * (0-(0.55)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (1.025-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0.325-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 45) / 60) * (0-(0)));
            yy = 1.025 + (((tickAnim - 45) / 60) * (1.025-(1.025)));
            zz = 0.325 + (((tickAnim - 45) / 60) * (0.325-(0.325)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            yy = 1.025 + (((tickAnim - 105) / 15) * (0-(1.025)));
            zz = 0.325 + (((tickAnim - 105) / 15) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 24.5 + (((tickAnim - 15) / 15) * (24.5-(24.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 24.5 + (((tickAnim - 30) / 15) * (10.5-(24.5)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 105) {
            xx = 10.5 + (((tickAnim - 45) / 60) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 45) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 60) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 10.5 + (((tickAnim - 105) / 15) * (0-(10.5)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -22.5 + (((tickAnim - 15) / 15) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -22.5 + (((tickAnim - 30) / 8) * (-0.87-(-22.5)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -0.87 + (((tickAnim - 38) / 7) * (-28.75-(-0.87)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 105) {
            xx = -28.75 + (((tickAnim - 45) / 60) * (-28.75-(-28.75)));
            yy = 0 + (((tickAnim - 45) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 60) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 113) {
            xx = -28.75 + (((tickAnim - 105) / 8) * (14.13-(-28.75)));
            yy = 0 + (((tickAnim - 105) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 8) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 14.13 + (((tickAnim - 113) / 7) * (0-(14.13)));
            yy = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(0);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(0);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 15 + (((tickAnim - 15) / 15) * (15-(15)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 15 + (((tickAnim - 30) / 8) * (-52.37-(15)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -52.37 + (((tickAnim - 38) / 4) * (-52.37-(-52.37)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = -52.37 + (((tickAnim - 42) / 3) * (29.25-(-52.37)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 105) {
            xx = 29.25 + (((tickAnim - 45) / 60) * (29.25-(29.25)));
            yy = 0 + (((tickAnim - 45) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 60) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 113) {
            xx = 29.25 + (((tickAnim - 105) / 8) * (-19.87-(29.25)));
            yy = 0 + (((tickAnim - 105) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 8) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = -19.87 + (((tickAnim - 113) / 7) * (0-(-19.87)));
            yy = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (-0.575-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = -0.35 + (((tickAnim - 38) / 4) * (-0.35-(-0.35)));
            zz = -0.575 + (((tickAnim - 38) / 4) * (-0.575-(-0.575)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            yy = -0.35 + (((tickAnim - 42) / 3) * (0-(-0.35)));
            zz = -0.575 + (((tickAnim - 42) / 3) * (0-(-0.575)));
        }
        else if (tickAnim >= 45 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 45) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 60) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 7 + (((tickAnim - 15) / 15) * (7-(7)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 7 + (((tickAnim - 30) / 8) * (69.13-(7)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 69.13 + (((tickAnim - 38) / 4) * (80.06-(69.13)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 80.06 + (((tickAnim - 42) / 3) * (12.75-(80.06)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 105) {
            xx = 12.75 + (((tickAnim - 45) / 60) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 45) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 60) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 113) {
            xx = 12.75 + (((tickAnim - 105) / 8) * (65.88-(12.75)));
            yy = 0 + (((tickAnim - 105) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 8) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 65.88 + (((tickAnim - 113) / 7) * (0-(65.88)));
            yy = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.55-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0.675 + (((tickAnim - 15) / 15) * (0.675-(0.675)));
            zz = 0.55 + (((tickAnim - 15) / 15) * (0.55-(0.55)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = 0.675 + (((tickAnim - 30) / 15) * (0-(0.675)));
            zz = 0.55 + (((tickAnim - 30) / 15) * (0-(0.55)));
        }
        else if (tickAnim >= 45 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 45) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 60) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 105) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 8) * (1.15-(0)));
            zz = 0 + (((tickAnim - 105) / 8) * (0.6-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            yy = 1.15 + (((tickAnim - 113) / 7) * (0-(1.15)));
            zz = 0.6 + (((tickAnim - 113) / 7) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 20 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 20) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 20) / 3) * (0.1675-(1)));
            zz = 1 + (((tickAnim - 20) / 3) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 23) / 2) * (1-(1)));
            yy = 0.1675 + (((tickAnim - 23) / 2) * (1-(0.1675)));
            zz = 1 + (((tickAnim - 23) / 2) * (1-(1)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 25) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 25) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 25) / 20) * (1-(1)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 1 + (((tickAnim - 45) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 45) / 3) * (0.1675-(1)));
            zz = 1 + (((tickAnim - 45) / 3) * (1-(1)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 48) / 2) * (1-(1)));
            yy = 0.1675 + (((tickAnim - 48) / 2) * (1-(0.1675)));
            zz = 1 + (((tickAnim - 48) / 2) * (1-(1)));
        }
        else if (tickAnim >= 50 && tickAnim < 61) {
            xx = 1 + (((tickAnim - 50) / 11) * (1-(1)));
            yy = 1 + (((tickAnim - 50) / 11) * (1-(1)));
            zz = 1 + (((tickAnim - 50) / 11) * (1-(1)));
        }
        else if (tickAnim >= 61 && tickAnim < 65) {
            xx = 1 + (((tickAnim - 61) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 61) / 4) * (0.04-(1)));
            zz = 1 + (((tickAnim - 61) / 4) * (1-(1)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 65) / 5) * (1-(1)));
            yy = 0.04 + (((tickAnim - 65) / 5) * (1-(0.04)));
            zz = 1 + (((tickAnim - 65) / 5) * (1-(1)));
        }
        else if (tickAnim >= 70 && tickAnim < 78) {
            xx = 1 + (((tickAnim - 70) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 8) * (1-(1)));
            zz = 1 + (((tickAnim - 70) / 8) * (1-(1)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = 1 + (((tickAnim - 78) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 78) / 5) * (0.04-(1)));
            zz = 1 + (((tickAnim - 78) / 5) * (1-(1)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
            xx = 1 + (((tickAnim - 83) / 5) * (1-(1)));
            yy = 0.04 + (((tickAnim - 83) / 5) * (1-(0.04)));
            zz = 1 + (((tickAnim - 83) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (9.83852-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (10.82249-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (12.04752-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = 9.83852 + (((tickAnim - 15) / 35) * (9.83852-(9.83852)));
            yy = 10.82249 + (((tickAnim - 15) / 35) * (10.82249-(10.82249)));
            zz = 12.04752 + (((tickAnim - 15) / 35) * (12.04752-(12.04752)));
        }
        else if (tickAnim >= 50 && tickAnim < 52) {
            xx = 9.83852 + (((tickAnim - 50) / 2) * (10.83852-(9.83852)));
            yy = 10.82249 + (((tickAnim - 50) / 2) * (10.82249-(10.82249)));
            zz = 12.04752 + (((tickAnim - 50) / 2) * (12.04752-(12.04752)));
        }
        else if (tickAnim >= 52 && tickAnim < 53) {
            xx = 10.83852 + (((tickAnim - 52) / 1) * (9.83852-(10.83852)));
            yy = 10.82249 + (((tickAnim - 52) / 1) * (10.82249-(10.82249)));
            zz = 12.04752 + (((tickAnim - 52) / 1) * (12.04752-(12.04752)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 9.83852 + (((tickAnim - 53) / 2) * (10.83852-(9.83852)));
            yy = 10.82249 + (((tickAnim - 53) / 2) * (10.82249-(10.82249)));
            zz = 12.04752 + (((tickAnim - 53) / 2) * (12.04752-(12.04752)));
        }
        else if (tickAnim >= 55 && tickAnim < 57) {
            xx = 10.83852 + (((tickAnim - 55) / 2) * (9.83852-(10.83852)));
            yy = 10.82249 + (((tickAnim - 55) / 2) * (10.82249-(10.82249)));
            zz = 12.04752 + (((tickAnim - 55) / 2) * (12.04752-(12.04752)));
        }
        else if (tickAnim >= 57 && tickAnim < 105) {
            xx = 9.83852 + (((tickAnim - 57) / 48) * (9.83852-(9.83852)));
            yy = 10.82249 + (((tickAnim - 57) / 48) * (10.82249-(10.82249)));
            zz = 12.04752 + (((tickAnim - 57) / 48) * (12.04752-(12.04752)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 9.83852 + (((tickAnim - 105) / 15) * (0-(9.83852)));
            yy = 10.82249 + (((tickAnim - 105) / 15) * (0-(10.82249)));
            zz = 12.04752 + (((tickAnim - 105) / 15) * (0-(12.04752)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (9.83852-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-10.82249-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-12.04752-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = 9.83852 + (((tickAnim - 15) / 35) * (9.83852-(9.83852)));
            yy = -10.82249 + (((tickAnim - 15) / 35) * (-10.82249-(-10.82249)));
            zz = -12.04752 + (((tickAnim - 15) / 35) * (-12.04752-(-12.04752)));
        }
        else if (tickAnim >= 50 && tickAnim < 52) {
            xx = 9.83852 + (((tickAnim - 50) / 2) * (10.83852-(9.83852)));
            yy = -10.82249 + (((tickAnim - 50) / 2) * (-10.82249-(-10.82249)));
            zz = -12.04752 + (((tickAnim - 50) / 2) * (-12.04752-(-12.04752)));
        }
        else if (tickAnim >= 52 && tickAnim < 53) {
            xx = 10.83852 + (((tickAnim - 52) / 1) * (9.83852-(10.83852)));
            yy = -10.82249 + (((tickAnim - 52) / 1) * (-10.82249-(-10.82249)));
            zz = -12.04752 + (((tickAnim - 52) / 1) * (-12.04752-(-12.04752)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 9.83852 + (((tickAnim - 53) / 2) * (10.83852-(9.83852)));
            yy = -10.82249 + (((tickAnim - 53) / 2) * (-10.82249-(-10.82249)));
            zz = -12.04752 + (((tickAnim - 53) / 2) * (-12.04752-(-12.04752)));
        }
        else if (tickAnim >= 55 && tickAnim < 57) {
            xx = 10.83852 + (((tickAnim - 55) / 2) * (9.83852-(10.83852)));
            yy = -10.82249 + (((tickAnim - 55) / 2) * (-10.82249-(-10.82249)));
            zz = -12.04752 + (((tickAnim - 55) / 2) * (-12.04752-(-12.04752)));
        }
        else if (tickAnim >= 57 && tickAnim < 105) {
            xx = 9.83852 + (((tickAnim - 57) / 48) * (9.83852-(9.83852)));
            yy = -10.82249 + (((tickAnim - 57) / 48) * (-10.82249-(-10.82249)));
            zz = -12.04752 + (((tickAnim - 57) / 48) * (-12.04752-(-12.04752)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 9.83852 + (((tickAnim - 105) / 15) * (0-(9.83852)));
            yy = -10.82249 + (((tickAnim - 105) / 15) * (0-(-10.82249)));
            zz = -12.04752 + (((tickAnim - 105) / 15) * (0-(-12.04752)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));

       
    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYuanyanglong entity = (EntityPrehistoricFloraYuanyanglong) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 3 + (((tickAnim - 15) / 10) * (0-(3)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (3-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3 + (((tickAnim - 35) / 15) * (0-(3)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (34.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 34.5 + (((tickAnim - 15) / 10) * (-9-(34.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -9 + (((tickAnim - 25) / 10) * (34.5-(-9)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 34.5 + (((tickAnim - 35) / 15) * (0-(34.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 17.25 + (((tickAnim - 15) / 10) * (-25-(17.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -25 + (((tickAnim - 25) / 10) * (17.25-(-25)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 17.25 + (((tickAnim - 35) / 15) * (0-(17.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 26.5 + (((tickAnim - 15) / 5) * (-46.41-(26.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -46.41 + (((tickAnim - 20) / 5) * (19.5-(-46.41)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 19.5 + (((tickAnim - 25) / 10) * (26.5-(19.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 26.5 + (((tickAnim - 35) / 7) * (-27.78-(26.5)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -27.78 + (((tickAnim - 42) / 8) * (0-(-27.78)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (46.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 46.25 + (((tickAnim - 15) / 5) * (66.77-(46.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 66.77 + (((tickAnim - 20) / 5) * (16.5-(66.77)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 16.5 + (((tickAnim - 25) / 5) * (-32.62-(16.5)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -32.62 + (((tickAnim - 30) / 5) * (46.25-(-32.62)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 46.25 + (((tickAnim - 35) / 7) * (64.69-(46.25)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 64.69 + (((tickAnim - 42) / 8) * (0-(64.69)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
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
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0.79-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0.55-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.79 + (((tickAnim - 18) / 2) * (0.725-(0.79)));
            zz = 0.55 + (((tickAnim - 18) / 2) * (0.35-(0.55)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0.725 + (((tickAnim - 20) / 5) * (0-(0.725)));
            zz = 0.35 + (((tickAnim - 20) / 5) * (0-(0.35)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (1.485-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0.85-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 1.485 + (((tickAnim - 28) / 2) * (0.525-(1.485)));
            zz = 0.85 + (((tickAnim - 28) / 2) * (0.3-(0.85)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 30) / 5) * (0-(0.525)));
            zz = 0.3 + (((tickAnim - 30) / 5) * (0-(0.3)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 7) * (0.75-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0.425-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            yy = 0.75 + (((tickAnim - 42) / 5) * (0.76-(0.75)));
            zz = 0.425 + (((tickAnim - 42) / 5) * (0.52-(0.425)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 0.76 + (((tickAnim - 47) / 3) * (0-(0.76)));
            zz = 0.52 + (((tickAnim - 47) / 3) * (0-(0.52)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-53.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -53.25 + (((tickAnim - 7) / 8) * (40.25-(-53.25)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 40.25 + (((tickAnim - 15) / 10) * (0-(40.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 30) / 2) * (-10.36-(0)));
            yy = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 2) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -10.36 + (((tickAnim - 32) / 3) * (35.5-(-10.36)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 35.5 + (((tickAnim - 35) / 7) * (27.25-(35.5)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 27.25 + (((tickAnim - 42) / 8) * (0-(27.25)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.045-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.515-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.045 + (((tickAnim - 3) / 4) * (-0.35-(-0.045)));
            zz = 0.515 + (((tickAnim - 3) / 4) * (0.175-(0.515)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = -0.35 + (((tickAnim - 7) / 4) * (0-(-0.35)));
            zz = 0.175 + (((tickAnim - 7) / 4) * (0-(0.175)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0.175-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0.175 + (((tickAnim - 15) / 10) * (0-(0.175)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0.15-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0.15 + (((tickAnim - 35) / 7) * (0.15-(0.15)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0.15 + (((tickAnim - 42) / 8) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -3.25 + (((tickAnim - 15) / 10) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -2.75 + (((tickAnim - 35) / 15) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -4.5 + (((tickAnim - 15) / 10) * (4.5-(-4.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 4.5 + (((tickAnim - 25) / 10) * (-4.5-(4.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -4.5 + (((tickAnim - 35) / 15) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -7.25 + (((tickAnim - 15) / 10) * (2-(-7.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 2 + (((tickAnim - 25) / 10) * (-7.25-(2)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -7.25 + (((tickAnim - 35) / 15) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4.39-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 4.39 + (((tickAnim - 7) / 8) * (-11.5-(4.39)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -11.5 + (((tickAnim - 15) / 3) * (-13.5-(-11.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -13.5 + (((tickAnim - 18) / 7) * (7.5-(-13.5)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 7.5 + (((tickAnim - 25) / 3) * (11.42-(7.5)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 11.42 + (((tickAnim - 28) / 7) * (-11.5-(11.42)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -11.5 + (((tickAnim - 35) / 3) * (-13.5-(-11.5)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -13.5 + (((tickAnim - 38) / 12) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -3.5 + (((tickAnim - 15) / 10) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -3.5 + (((tickAnim - 35) / 15) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYuanyanglong entity = (EntityPrehistoricFloraYuanyanglong) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -18.5 + (((tickAnim - 15) / 15) * (-18.5-(-18.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -18.5 + (((tickAnim - 30) / 20) * (0-(-18.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-9.95-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (4.85-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -9.95 + (((tickAnim - 15) / 15) * (-9.95-(-9.95)));
            zz = 4.85 + (((tickAnim - 15) / 15) * (4.85-(4.85)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -9.95 + (((tickAnim - 30) / 20) * (0-(-9.95)));
            zz = 4.85 + (((tickAnim - 30) / 20) * (0-(4.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-26.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -26.25 + (((tickAnim - 15) / 15) * (-26.25-(-26.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -26.25 + (((tickAnim - 30) / 20) * (0-(-26.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (35.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 35.5 + (((tickAnim - 15) / 15) * (35.5-(35.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 35.5 + (((tickAnim - 30) / 20) * (0-(35.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.625-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0.9 + (((tickAnim - 15) / 15) * (0.9-(0.9)));
            zz = -0.625 + (((tickAnim - 15) / 15) * (-0.625-(-0.625)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.9 + (((tickAnim - 30) / 20) * (0-(0.9)));
            zz = -0.625 + (((tickAnim - 30) / 20) * (0-(-0.625)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-47.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -47.75 + (((tickAnim - 15) / 15) * (-47.75-(-47.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -47.75 + (((tickAnim - 30) / 20) * (0-(-47.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (56-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 56 + (((tickAnim - 15) / 15) * (56-(56)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
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
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.5 + (((tickAnim - 7) / 8) * (0-(0.5)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 30) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 9) * (0.7-(0)));
            zz = 0 + (((tickAnim - 30) / 9) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 0.7 + (((tickAnim - 39) / 11) * (0-(0.7)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
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




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-26.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -26.25 + (((tickAnim - 15) / 15) * (-26.25-(-26.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -26.25 + (((tickAnim - 30) / 20) * (0-(-26.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (35.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 35.5 + (((tickAnim - 15) / 15) * (35.5-(35.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 35.5 + (((tickAnim - 30) / 20) * (0-(35.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.625-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0.9 + (((tickAnim - 15) / 15) * (0.9-(0.9)));
            zz = -0.625 + (((tickAnim - 15) / 15) * (-0.625-(-0.625)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.9 + (((tickAnim - 30) / 20) * (0-(0.9)));
            zz = -0.625 + (((tickAnim - 30) / 20) * (0-(-0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-47.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -47.75 + (((tickAnim - 15) / 15) * (-47.75-(-47.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -47.75 + (((tickAnim - 30) / 20) * (0-(-47.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (56-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 56 + (((tickAnim - 15) / 15) * (56-(56)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
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
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.5 + (((tickAnim - 7) / 8) * (0-(0.5)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 30) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 9) * (0.7-(0)));
            zz = 0 + (((tickAnim - 30) / 9) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 0.7 + (((tickAnim - 39) / 11) * (0-(0.7)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -15 + (((tickAnim - 15) / 15) * (-15-(-15)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -15 + (((tickAnim - 30) / 8) * (-12.62-(-15)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -12.62 + (((tickAnim - 38) / 12) * (0-(-12.62)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 8.5 + (((tickAnim - 15) / 15) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 8.5 + (((tickAnim - 30) / 8) * (-19.44-(8.5)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -19.44 + (((tickAnim - 38) / 12) * (0-(-19.44)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -10.5 + (((tickAnim - 8) / 3) * (-4.25-(-10.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -4.25 + (((tickAnim - 11) / 4) * (30.5-(-4.25)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 30.5 + (((tickAnim - 15) / 15) * (30.5-(30.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 30.5 + (((tickAnim - 30) / 8) * (20.06-(30.5)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 20.06 + (((tickAnim - 38) / 5) * (-16.21-(20.06)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -16.21 + (((tickAnim - 43) / 7) * (0-(-16.21)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 14.25 + (((tickAnim - 15) / 15) * (14.25-(14.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 14.25 + (((tickAnim - 30) / 20) * (0-(14.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 7 + (((tickAnim - 15) / 15) * (7-(7)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 30) / 20) * (0-(7)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -21.75 + (((tickAnim - 15) / 15) * (-21.75-(-21.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -21.75 + (((tickAnim - 30) / 20) * (0-(-21.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0.25 + (((tickAnim - 15) / 15) * (0.25-(0.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0.25 + (((tickAnim - 30) / 20) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -6 + (((tickAnim - 15) / 15) * (-6-(-6)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -6 + (((tickAnim - 30) / 20) * (0-(-6)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.025-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -0.4 + (((tickAnim - 15) / 15) * (-0.4-(-0.4)));
            zz = 0.025 + (((tickAnim - 15) / 15) * (0.025-(0.025)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.4 + (((tickAnim - 30) / 20) * (0-(-0.4)));
            zz = 0.025 + (((tickAnim - 30) / 20) * (0-(0.025)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 24.5 + (((tickAnim - 15) / 15) * (24.5-(24.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 24.5 + (((tickAnim - 30) / 20) * (0-(24.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.225-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0.225 + (((tickAnim - 15) / 15) * (0.225-(0.225)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0.225 + (((tickAnim - 30) / 20) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-38.97004-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (13.10189-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (5.5787-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -38.97004 + (((tickAnim - 15) / 15) * (-38.97004-(-38.97004)));
            yy = 13.10189 + (((tickAnim - 15) / 15) * (13.10189-(13.10189)));
            zz = 5.5787 + (((tickAnim - 15) / 15) * (5.5787-(5.5787)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -38.97004 + (((tickAnim - 30) / 20) * (0-(-38.97004)));
            yy = 13.10189 + (((tickAnim - 30) / 20) * (0-(13.10189)));
            zz = 5.5787 + (((tickAnim - 30) / 20) * (0-(5.5787)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (76.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 76.25 + (((tickAnim - 15) / 15) * (76.25-(76.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 76.25 + (((tickAnim - 30) / 20) * (0-(76.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-38.97004-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-13.10189-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-5.5787-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -38.97004 + (((tickAnim - 15) / 15) * (-38.97004-(-38.97004)));
            yy = -13.10189 + (((tickAnim - 15) / 15) * (-13.10189-(-13.10189)));
            zz = -5.5787 + (((tickAnim - 15) / 15) * (-5.5787-(-5.5787)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -38.97004 + (((tickAnim - 30) / 20) * (0-(-38.97004)));
            yy = -13.10189 + (((tickAnim - 30) / 20) * (0-(-13.10189)));
            zz = -5.5787 + (((tickAnim - 30) / 20) * (0-(-5.5787)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (76.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 76.25 + (((tickAnim - 15) / 15) * (76.25-(76.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 76.25 + (((tickAnim - 30) / 20) * (0-(76.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYuanyanglong entity = (EntityPrehistoricFloraYuanyanglong) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 2.25 + (((tickAnim - 7) / 8) * (9.75-(2.25)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 9.75 + (((tickAnim - 15) / 5) * (0-(9.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (4.5-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 4.5 + (((tickAnim - 24) / 4) * (2-(4.5)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 2 + (((tickAnim - 28) / 3) * (3.5-(2)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 3.5 + (((tickAnim - 31) / 5) * (-4.25-(3.5)));
            yy = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 5) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -4.25 + (((tickAnim - 36) / 4) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -7.5 + (((tickAnim - 7) / 8) * (0.75-(-7.5)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.75 + (((tickAnim - 15) / 5) * (0-(0.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (-4-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -4 + (((tickAnim - 24) / 4) * (-0.25-(-4)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -0.25 + (((tickAnim - 28) / 3) * (-4.75-(-0.25)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = -4.75 + (((tickAnim - 31) / 5) * (-10-(-4.75)));
            yy = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 5) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 36) / 4) * (0-(-10)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -10.5 + (((tickAnim - 7) / 4) * (-22-(-10.5)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -22 + (((tickAnim - 11) / 9) * (-5.75-(-22)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -5.75 + (((tickAnim - 20) / 4) * (-14.25-(-5.75)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -14.25 + (((tickAnim - 24) / 4) * (-6.25-(-14.25)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -6.25 + (((tickAnim - 28) / 3) * (-13-(-6.25)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = -13 + (((tickAnim - 31) / 5) * (10.5-(-13)));
            yy = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 5) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 10.5 + (((tickAnim - 36) / 4) * (0-(10.5)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.15-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = -0.4 + (((tickAnim - 7) / 4) * (-0.775-(-0.4)));
            zz = 0.15 + (((tickAnim - 7) / 4) * (0.15-(0.15)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = -0.775 + (((tickAnim - 11) / 9) * (-0.2-(-0.775)));
            zz = 0.15 + (((tickAnim - 11) / 9) * (0-(0.15)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = -0.2 + (((tickAnim - 20) / 4) * (-0.625-(-0.2)));
            zz = 0 + (((tickAnim - 20) / 4) * (0.2-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            yy = -0.625 + (((tickAnim - 24) / 12) * (0-(-0.625)));
            zz = 0.2 + (((tickAnim - 24) / 12) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 10.75 + (((tickAnim - 7) / 4) * (-3-(10.75)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -3 + (((tickAnim - 11) / 9) * (-20.75-(-3)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -20.75 + (((tickAnim - 20) / 4) * (3-(-20.75)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 3 + (((tickAnim - 24) / 4) * (-8.75-(3)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -8.75 + (((tickAnim - 28) / 3) * (5.5-(-8.75)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 5.5 + (((tickAnim - 31) / 5) * (-16-(5.5)));
            yy = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 5) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -16 + (((tickAnim - 36) / 4) * (0-(-16)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -8.75 + (((tickAnim - 7) / 4) * (12.25-(-8.75)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 12.25 + (((tickAnim - 11) / 9) * (3.5-(12.25)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 3.5 + (((tickAnim - 20) / 16) * (-1-(3.5)));
            yy = 0 + (((tickAnim - 20) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 16) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -1 + (((tickAnim - 36) / 4) * (0-(-1)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 25.75 + (((tickAnim - 7) / 8) * (0-(25.75)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (27.5-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 27.5 + (((tickAnim - 20) / 4) * (0-(27.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (19.5-(0)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 19.5 + (((tickAnim - 28) / 3) * (0-(19.5)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 31) / 5) * (29.75-(0)));
            yy = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 5) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 29.75 + (((tickAnim - 36) / 4) * (0-(29.75)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYuanyanglong entity = (EntityPrehistoricFloraYuanyanglong) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5.25 + (((tickAnim - 10) / 10) * (0-(5.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-6.2-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (3.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -6.2 + (((tickAnim - 10) / 10) * (0-(-6.2)));
            zz = 3.75 + (((tickAnim - 10) / 10) * (0-(3.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -16.5 + (((tickAnim - 10) / 10) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 20.75 + (((tickAnim - 10) / 10) * (0-(20.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-56.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -56.5 + (((tickAnim - 10) / 10) * (0-(-56.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.025-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.825 + (((tickAnim - 10) / 10) * (0-(-0.825)));
            zz = 0.025 + (((tickAnim - 10) / 10) * (0-(0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (47.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 47.25 + (((tickAnim - 10) / 10) * (0-(47.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-35.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -35.75 + (((tickAnim - 10) / 10) * (0-(-35.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (38-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 38 + (((tickAnim - 10) / 10) * (0-(38)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-34.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -34.75 + (((tickAnim - 10) / 10) * (0-(-34.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 10) / 10) * (0-(25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -7.25 + (((tickAnim - 10) / 10) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -13.25 + (((tickAnim - 10) / 10) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11.25 + (((tickAnim - 10) / 10) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 16.5 + (((tickAnim - 10) / 10) * (0-(16.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 42.5 + (((tickAnim - 10) / 4) * (48.75-(42.5)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 48.75 + (((tickAnim - 14) / 6) * (0-(48.75)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.65-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.35 + (((tickAnim - 10) / 10) * (0-(0.35)));
            zz = -1.65 + (((tickAnim - 10) / 10) * (0-(-1.65)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 13.25 + (((tickAnim - 10) / 4) * (26.25-(13.25)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 26.25 + (((tickAnim - 14) / 6) * (0-(26.25)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (56.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 56.75 + (((tickAnim - 10) / 4) * (27.25-(56.75)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 27.25 + (((tickAnim - 14) / 6) * (0-(27.25)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -12.25 + (((tickAnim - 10) / 4) * (-16.5-(-12.25)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -16.5 + (((tickAnim - 14) / 6) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-28-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -28 + (((tickAnim - 10) / 4) * (-1.25-(-28)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -1.25 + (((tickAnim - 14) / 6) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (37-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 37 + (((tickAnim - 10) / 4) * (0-(37)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (29.75-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 29.75 + (((tickAnim - 10) / 10) * (0-(29.75)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-28.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -28.5 + (((tickAnim - 10) / 10) * (0-(-28.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraYuanyanglong entity = (EntityPrehistoricFloraYuanyanglong) entitylivingbaseIn;
        int animCycle = 13;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-50))*6), root.rotateAngleY + (float) Math.toRadians(0), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*549+50))*4));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-80))*1.8);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5))*2);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -17.79055 + (((tickAnim - 0) / 6) * (47.3717-(-17.79055)));
            yy = -1.9367 + (((tickAnim - 0) / 6) * (-4.17452-(-1.9367)));
            zz = 2.30513 + (((tickAnim - 0) / 6) * (1.60356-(2.30513)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 47.3717 + (((tickAnim - 6) / 7) * (-17.79055-(47.3717)));
            yy = -4.17452 + (((tickAnim - 6) / 7) * (-1.9367-(-4.17452)));
            zz = 1.60356 + (((tickAnim - 6) / 7) * (2.30513-(1.60356)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -26 + (((tickAnim - 0) / 6) * (18-(-26)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 18 + (((tickAnim - 6) / 7) * (-26-(18)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (1.1-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.1 + (((tickAnim - 10) / 3) * (0-(1.1)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 26.25 + (((tickAnim - 0) / 6) * (22.50832-(26.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.11147-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.24555-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 22.50832 + (((tickAnim - 6) / 4) * (-39.24584-(22.50832)));
            yy = 0.11147 + (((tickAnim - 6) / 4) * (0.05573-(0.11147)));
            zz = 0.24555 + (((tickAnim - 6) / 4) * (0.12278-(0.24555)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -39.24584 + (((tickAnim - 10) / 2) * (-39.24584-(-39.24584)));
            yy = 0.05573 + (((tickAnim - 10) / 2) * (0.05573-(0.05573)));
            zz = 0.12278 + (((tickAnim - 10) / 2) * (0.12278-(0.12278)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -39.24584 + (((tickAnim - 12) / 1) * (26.25-(-39.24584)));
            yy = 0.05573 + (((tickAnim - 12) / 1) * (0-(0.05573)));
            zz = 0.12278 + (((tickAnim - 12) / 1) * (0-(0.12278)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = -0.425 + (((tickAnim - 10) / 2) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -0.425 + (((tickAnim - 12) / 1) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
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
            xx = 20.25 + (((tickAnim - 0) / 2) * (-18.14-(20.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -18.14 + (((tickAnim - 2) / 1) * (37.42-(-18.14)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 37.42 + (((tickAnim - 3) / 3) * (34.5-(37.42)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 34.5 + (((tickAnim - 6) / 4) * (64.88-(34.5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 64.88 + (((tickAnim - 10) / 2) * (64.88-(64.88)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 64.88 + (((tickAnim - 12) / 1) * (20.25-(64.88)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (1.86-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.455-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 1.86 + (((tickAnim - 1) / 1) * (1.125-(1.86)));
            zz = 0.455 + (((tickAnim - 1) / 1) * (0.55-(0.455)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.125 + (((tickAnim - 2) / 1) * (0-(1.125)));
            zz = 0.55 + (((tickAnim - 2) / 1) * (0-(0.55)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (-0.525-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.375 + (((tickAnim - 3) / 3) * (0-(-0.375)));
            zz = -0.525 + (((tickAnim - 3) / 3) * (0-(-0.525)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (1.09-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0.62-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.09 + (((tickAnim - 8) / 2) * (1.4-(1.09)));
            zz = 0.62 + (((tickAnim - 8) / 2) * (0.7-(0.62)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 1.4 + (((tickAnim - 10) / 2) * (1.4-(1.4)));
            zz = 0.7 + (((tickAnim - 10) / 2) * (0.7-(0.7)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.4 + (((tickAnim - 12) / 1) * (0-(1.4)));
            zz = 0.7 + (((tickAnim - 12) / 1) * (0-(0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (-82.15-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -82.15 + (((tickAnim - 3) / 1) * (0-(-82.15)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (26.5-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 26.5 + (((tickAnim - 6) / 7) * (0-(26.5)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0.075-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0.305-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.075 + (((tickAnim - 3) / 0) * (-0.5-(0.075)));
            zz = 0.305 + (((tickAnim - 3) / 0) * (0.05-(0.305)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.5 + (((tickAnim - 3) / 1) * (0-(-0.5)));
            zz = 0.05 + (((tickAnim - 3) / 1) * (0-(0.05)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0.125-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0.125 + (((tickAnim - 6) / 7) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 47.3717 + (((tickAnim - 0) / 7) * (-17.79055-(47.3717)));
            yy = 4.17452 + (((tickAnim - 0) / 7) * (-1.9367-(4.17452)));
            zz = -1.60356 + (((tickAnim - 0) / 7) * (2.30513-(-1.60356)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -17.79055 + (((tickAnim - 7) / 6) * (47.3717-(-17.79055)));
            yy = -1.9367 + (((tickAnim - 7) / 6) * (4.17452-(-1.9367)));
            zz = 2.30513 + (((tickAnim - 7) / 6) * (-1.60356-(2.30513)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 18 + (((tickAnim - 0) / 7) * (-26-(18)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -26 + (((tickAnim - 7) / 6) * (18-(-26)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 1.1 + (((tickAnim - 3) / 4) * (0-(1.1)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
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
            xx = 22.50832 + (((tickAnim - 0) / 3) * (-39.24584-(22.50832)));
            yy = 0.11147 + (((tickAnim - 0) / 3) * (0.05573-(0.11147)));
            zz = 0.24555 + (((tickAnim - 0) / 3) * (0.12278-(0.24555)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -39.24584 + (((tickAnim - 3) / 2) * (-39.24584-(-39.24584)));
            yy = 0.05573 + (((tickAnim - 3) / 2) * (0.05573-(0.05573)));
            zz = 0.12278 + (((tickAnim - 3) / 2) * (0.12278-(0.12278)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -39.24584 + (((tickAnim - 5) / 2) * (26.25-(-39.24584)));
            yy = 0.05573 + (((tickAnim - 5) / 2) * (0-(0.05573)));
            zz = 0.12278 + (((tickAnim - 5) / 2) * (0-(0.12278)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 26.25 + (((tickAnim - 7) / 6) * (22.50832-(26.25)));
            yy = 0 + (((tickAnim - 7) / 6) * (0.11147-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0.24555-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.425 + (((tickAnim - 3) / 2) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.425 + (((tickAnim - 5) / 2) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 41.25 + (((tickAnim - 0) / 3) * (64.88-(41.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 64.88 + (((tickAnim - 3) / 2) * (64.88-(64.88)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 64.88 + (((tickAnim - 5) / 2) * (20.25-(64.88)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 20.25 + (((tickAnim - 7) / 2) * (-26.78-(20.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -26.78 + (((tickAnim - 9) / 2) * (31.73-(-26.78)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 31.73 + (((tickAnim - 11) / 2) * (41.25-(31.73)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.4-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.7-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.4 + (((tickAnim - 3) / 2) * (1.4-(1.4)));
            zz = 0.7 + (((tickAnim - 3) / 2) * (0.7-(0.7)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 1.4 + (((tickAnim - 5) / 2) * (0-(1.4)));
            zz = 0.7 + (((tickAnim - 5) / 2) * (0-(0.7)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (1.975-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0.775-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 1.975 + (((tickAnim - 8) / 0) * (1.625-(1.975)));
            zz = 0.775 + (((tickAnim - 8) / 0) * (0.75-(0.775)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.625 + (((tickAnim - 8) / 1) * (0.5-(1.625)));
            zz = 0.75 + (((tickAnim - 8) / 1) * (-0.025-(0.75)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 9) / 1) * (0.095-(0.5)));
            zz = -0.025 + (((tickAnim - 9) / 1) * (0.195-(-0.025)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0.095 + (((tickAnim - 10) / 1) * (-0.125-(0.095)));
            zz = 0.195 + (((tickAnim - 10) / 1) * (-0.43-(0.195)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = -0.125 + (((tickAnim - 11) / 1) * (0.475-(-0.125)));
            zz = -0.43 + (((tickAnim - 11) / 1) * (0.3-(-0.43)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.475 + (((tickAnim - 12) / 1) * (0-(0.475)));
            zz = 0.3 + (((tickAnim - 12) / 1) * (0-(0.3)));
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
            xx = 26.5 + (((tickAnim - 0) / 7) * (0-(26.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (-80.75-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -80.75 + (((tickAnim - 11) / 1) * (0-(-80.75)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (26.5-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0.125 + (((tickAnim - 0) / 7) * (0-(0.125)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0.15-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = -0.375 + (((tickAnim - 11) / 1) * (0-(-0.375)));
            zz = 0.15 + (((tickAnim - 11) / 1) * (0-(0.15)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0.125-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-150))*8), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*549+50))*4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-220))*15), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*549+50))*4));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-250))*20), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*549+50))*4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-170))*10), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*549+150))*4));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(7.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-120))*-9), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*549+150))*-4));
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(0);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(0.225+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5))*-0.5);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(0);


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-6.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-200))*12), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*549+150))*-4));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-50))*0.2);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-200))*-15), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*549+150))*4));
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(-0.45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-100))*-0.2);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0);


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-3050))*-18), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*549+150))*-4));
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(0);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-150))*-0.1);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(0);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-3050))*20), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-200))*-0.1);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(-0.1543+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-170))*10), leftArm1.rotateAngleY + (float) Math.toRadians(15.24246), leftArm1.rotateAngleZ + (float) Math.toRadians(-0.5048+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*549+150))*4));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-0.0833+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-100))*-15), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(-0.3207+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*549+150))*4));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(-0.1543+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-170))*10), rightArm1.rotateAngleY + (float) Math.toRadians(-15.24246), rightArm1.rotateAngleZ + (float) Math.toRadians(-0.5048+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*549+150))*-4));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-0.0833+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-100))*-15), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(-0.3207+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*549+150))*-4));


        this.eye.setScale((float)1,(float)(0.92+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5))*0.1),(float)1);

       
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraYuanyanglong entity = (EntityPrehistoricFloraYuanyanglong) entitylivingbaseIn;
        int animCycle = 22;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+50))*3), root.rotateAngleY + (float) Math.toRadians(0), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+80))*3));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-70))*-0.5);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-50))*0.5);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -16.29055 + (((tickAnim - 0) / 13) * (27.3717-(-16.29055)));
            yy = -1.9367 + (((tickAnim - 0) / 13) * (-4.17452-(-1.9367)));
            zz = 2.30513 + (((tickAnim - 0) / 13) * (1.60356-(2.30513)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 27.3717 + (((tickAnim - 13) / 5) * (-51.1778+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*55-(27.3717)));
            yy = -4.17452 + (((tickAnim - 13) / 5) * (-2.24145-(-4.17452)));
            zz = 1.60356 + (((tickAnim - 13) / 5) * (-2.22625-(1.60356)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -51.1778+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*55 + (((tickAnim - 18) / 5) * (-16.29055-(-51.1778+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*55)));
            yy = -2.24145 + (((tickAnim - 18) / 5) * (-1.9367-(-2.24145)));
            zz = -2.22625 + (((tickAnim - 18) / 5) * (2.30513-(-2.22625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -16.25 + (((tickAnim - 0) / 13) * (28.25-(-16.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 28.25 + (((tickAnim - 13) / 10) * (-16.25-(28.25)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 27 + (((tickAnim - 0) / 13) * (0-(27)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (-27.18-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -27.18 + (((tickAnim - 17) / 2) * (-27.09-(-27.18)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -27.09 + (((tickAnim - 19) / 2) * (-12.3-(-27.09)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -12.3 + (((tickAnim - 21) / 2) * (27-(-12.3)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0.1-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = -0.2 + (((tickAnim - 17) / 6) * (0-(-0.2)));
            zz = 0.1 + (((tickAnim - 17) / 6) * (0-(0.1)));
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
            xx = 5.25 + (((tickAnim - 0) / 3) * (-9.62-(5.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -9.62 + (((tickAnim - 3) / 2) * (-13-(-9.62)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -13 + (((tickAnim - 5) / 3) * (23.83-(-13)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 23.83 + (((tickAnim - 8) / 5) * (34.5-(23.83)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 34.5 + (((tickAnim - 13) / 4) * (62.46-(34.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 62.46 + (((tickAnim - 17) / 2) * (64.61-(62.46)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 64.61 + (((tickAnim - 19) / 2) * (64.61-(64.61)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 64.61 + (((tickAnim - 21) / 2) * (5.25-(64.61)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.965-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.52-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.965 + (((tickAnim - 3) / 2) * (0.985-(0.965)));
            zz = 0.52 + (((tickAnim - 3) / 2) * (0.825-(0.52)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0.985 + (((tickAnim - 5) / 8) * (0-(0.985)));
            zz = 0.825 + (((tickAnim - 5) / 8) * (0-(0.825)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0.95-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0.45-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0.95 + (((tickAnim - 17) / 6) * (0-(0.95)));
            zz = 0.45 + (((tickAnim - 17) / 6) * (0-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -5.5 + (((tickAnim - 5) / 2) * (-31.39-(-5.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -31.39 + (((tickAnim - 7) / 2) * (16.5-(-31.39)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 16.5 + (((tickAnim - 9) / 4) * (26.5-(16.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 26.5 + (((tickAnim - 13) / 4) * (26.5-(26.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 26.5 + (((tickAnim - 17) / 6) * (0-(26.5)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0.255-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = -0.15 + (((tickAnim - 7) / 2) * (0-(-0.15)));
            zz = 0.255 + (((tickAnim - 7) / 2) * (0.15-(0.255)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0.15 + (((tickAnim - 9) / 4) * (0.125-(0.15)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0.125 + (((tickAnim - 13) / 4) * (0.125-(0.125)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0.125 + (((tickAnim - 17) / 6) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 27.3717 + (((tickAnim - 0) / 6) * (20.5972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35-(27.3717)));
            yy = 4.17452 + (((tickAnim - 0) / 6) * (2.24145-(4.17452)));
            zz = -1.60356 + (((tickAnim - 0) / 6) * (2.22625-(-1.60356)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 20.5972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35 + (((tickAnim - 6) / 6) * (-16.29055-(20.5972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35)));
            yy = 2.24145 + (((tickAnim - 6) / 6) * (1.9367-(2.24145)));
            zz = 2.22625 + (((tickAnim - 6) / 6) * (-2.30513-(2.22625)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = -16.29055 + (((tickAnim - 12) / 11) * (27.3717-(-16.29055)));
            yy = 1.9367 + (((tickAnim - 12) / 11) * (4.17452-(1.9367)));
            zz = -2.30513 + (((tickAnim - 12) / 11) * (-1.60356-(-2.30513)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 28.25 + (((tickAnim - 0) / 12) * (-16.25-(28.25)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = -16.25 + (((tickAnim - 12) / 11) * (28.25-(-16.25)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-27.18-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -27.18 + (((tickAnim - 5) / 3) * (-27.09-(-27.18)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -27.09 + (((tickAnim - 8) / 2) * (-12.3-(-27.09)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -12.3 + (((tickAnim - 10) / 2) * (27-(-12.3)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 27 + (((tickAnim - 12) / 11) * (0-(27)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.1-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 5) / 18) * (0-(0)));
            yy = -0.2 + (((tickAnim - 5) / 18) * (0-(-0.2)));
            zz = 0.1 + (((tickAnim - 5) / 18) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 34.5 + (((tickAnim - 0) / 5) * (62.46-(34.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 62.46 + (((tickAnim - 5) / 3) * (64.61-(62.46)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 64.61 + (((tickAnim - 8) / 2) * (64.61-(64.61)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 64.61 + (((tickAnim - 10) / 2) * (1.98728-(64.61)));
            yy = 0 + (((tickAnim - 10) / 2) * (-0.36571-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (3.98327-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 1.98728 + (((tickAnim - 12) / 3) * (-14.25-(1.98728)));
            yy = -0.36571 + (((tickAnim - 12) / 3) * (0-(-0.36571)));
            zz = 3.98327 + (((tickAnim - 12) / 3) * (0-(3.98327)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -14.25 + (((tickAnim - 15) / 3) * (23.83-(-14.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 23.83 + (((tickAnim - 18) / 5) * (34.5-(23.83)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.3-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.675-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 1.3 + (((tickAnim - 5) / 7) * (0.075-(1.3)));
            zz = 0.675 + (((tickAnim - 5) / 7) * (0.175-(0.675)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.075 + (((tickAnim - 12) / 1) * (0.94-(0.075)));
            zz = 0.175 + (((tickAnim - 12) / 1) * (0.62-(0.175)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.94 + (((tickAnim - 13) / 2) * (1.185-(0.94)));
            zz = 0.62 + (((tickAnim - 13) / 2) * (0.925-(0.62)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 1.185 + (((tickAnim - 15) / 3) * (1.115-(1.185)));
            zz = 0.925 + (((tickAnim - 15) / 3) * (0.845-(0.925)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 1.115 + (((tickAnim - 18) / 5) * (0-(1.115)));
            zz = 0.845 + (((tickAnim - 18) / 5) * (0-(0.845)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 26.5 + (((tickAnim - 0) / 12) * (0-(26.5)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-50.25-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -50.25 + (((tickAnim - 18) / 2) * (10.5-(-50.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 10.5 + (((tickAnim - 20) / 3) * (26.5-(10.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0.125 + (((tickAnim - 0) / 12) * (0-(0.125)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0.075-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.175 + (((tickAnim - 18) / 2) * (0-(-0.175)));
            zz = 0.075 + (((tickAnim - 18) / 2) * (0-(0.075)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0.125-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5))*2), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+80))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-50))*4), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+80))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-100))*7), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+80))*3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+100))*-4), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+120))*-4));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+150))*6), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+120))*-4));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+200))*-7), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+150))*4));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+250))*6), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+180))*-2));
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(-0.15);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0);


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+300))*-9), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+200))*1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+300))*8), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+200))*1));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+120))*-2), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+200))*4), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+120))*-2), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+200))*4), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animDisp(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYuanyanglong entity = (EntityPrehistoricFloraYuanyanglong) entitylivingbaseIn;
        int animCycle = 155;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (22-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 22 + (((tickAnim - 3) / 3) * (-13.33-(22)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -13.33 + (((tickAnim - 6) / 3) * (-8-(-13.33)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -8 + (((tickAnim - 9) / 5) * (22-(-8)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 22 + (((tickAnim - 14) / 4) * (22-(22)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 22 + (((tickAnim - 18) / 2) * (-13.33-(22)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -13.33 + (((tickAnim - 20) / 3) * (-8-(-13.33)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -8 + (((tickAnim - 23) / 5) * (22-(-8)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 22 + (((tickAnim - 28) / 4) * (22-(22)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 22 + (((tickAnim - 32) / 2) * (-13.33-(22)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -13.33 + (((tickAnim - 34) / 4) * (-8-(-13.33)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -8 + (((tickAnim - 38) / 5) * (22-(-8)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 22 + (((tickAnim - 43) / 3) * (22-(22)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 22 + (((tickAnim - 46) / 4) * (7.5-(22)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*0.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 7.5 + (((tickAnim - 50) / 3) * (4.5-(7.5)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*0.5 + (((tickAnim - 50) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*0.5)));
        }
        else if (tickAnim >= 53 && tickAnim < 94) {
            xx = 4.5 + (((tickAnim - 53) / 41) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 53) / 41) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*0.5 + (((tickAnim - 53) / 41) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*0.5)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = 4.5 + (((tickAnim - 94) / 10) * (22-(4.5)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*0.5 + (((tickAnim - 94) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*0.5)));
        }
        else if (tickAnim >= 104 && tickAnim < 107) {
            xx = 22 + (((tickAnim - 104) / 3) * (-13.33-(22)));
            yy = 0 + (((tickAnim - 104) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 3) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 110) {
            xx = -13.33 + (((tickAnim - 107) / 3) * (-8-(-13.33)));
            yy = 0 + (((tickAnim - 107) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 3) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = -8 + (((tickAnim - 110) / 5) * (22-(-8)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 118) {
            xx = 22 + (((tickAnim - 115) / 3) * (22-(22)));
            yy = 0 + (((tickAnim - 115) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 3) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 121) {
            xx = 22 + (((tickAnim - 118) / 3) * (-13.33-(22)));
            yy = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 3) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 124) {
            xx = -13.33 + (((tickAnim - 121) / 3) * (-8-(-13.33)));
            yy = 0 + (((tickAnim - 121) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 3) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 129) {
            xx = -8 + (((tickAnim - 124) / 5) * (22-(-8)));
            yy = 0 + (((tickAnim - 124) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 5) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 133) {
            xx = 22 + (((tickAnim - 129) / 4) * (22-(22)));
            yy = 0 + (((tickAnim - 129) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 4) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 135) {
            xx = 22 + (((tickAnim - 133) / 2) * (-13.33-(22)));
            yy = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 2) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = -13.33 + (((tickAnim - 135) / 3) * (-8-(-13.33)));
            yy = 0 + (((tickAnim - 135) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 3) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 143) {
            xx = -8 + (((tickAnim - 138) / 5) * (22-(-8)));
            yy = 0 + (((tickAnim - 138) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 5) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 147) {
            xx = 22 + (((tickAnim - 143) / 4) * (22-(22)));
            yy = 0 + (((tickAnim - 143) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 4) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = 22 + (((tickAnim - 147) / 8) * (0-(22)));
            yy = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-7.425-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = -7.425 + (((tickAnim - 3) / 8) * (13.775-(-7.425)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = 13.775 + (((tickAnim - 11) / 7) * (-7.425-(13.775)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = -7.425 + (((tickAnim - 18) / 7) * (13.775-(-7.425)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 13.775 + (((tickAnim - 25) / 7) * (-7.425-(13.775)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            yy = -7.425 + (((tickAnim - 32) / 7) * (13.775-(-7.425)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 39) / 7) * (0-(0)));
            yy = 13.775 + (((tickAnim - 39) / 7) * (-7.425-(13.775)));
            zz = 0 + (((tickAnim - 39) / 7) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = -7.425 + (((tickAnim - 46) / 4) * (-10.72-(-7.425)));
            zz = 0 + (((tickAnim - 46) / 4) * (0.9-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            yy = -10.72 + (((tickAnim - 50) / 3) * (-11.245-(-10.72)));
            zz = 0.9 + (((tickAnim - 50) / 3) * (0.9-(0.9)));
        }
        else if (tickAnim >= 53 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 53) / 41) * (0-(0)));
            yy = -11.245 + (((tickAnim - 53) / 41) * (-11.245-(-11.245)));
            zz = 0.9 + (((tickAnim - 53) / 41) * (0.9-(0.9)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            yy = -11.245 + (((tickAnim - 94) / 10) * (-7.425-(-11.245)));
            zz = 0.9 + (((tickAnim - 94) / 10) * (0-(0.9)));
        }
        else if (tickAnim >= 104 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 104) / 8) * (0-(0)));
            yy = -7.425 + (((tickAnim - 104) / 8) * (13.775-(-7.425)));
            zz = 0 + (((tickAnim - 104) / 8) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 112) / 6) * (0-(0)));
            yy = 13.775 + (((tickAnim - 112) / 6) * (-7.425-(13.775)));
            zz = 0 + (((tickAnim - 112) / 6) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 126) {
            xx = 0 + (((tickAnim - 118) / 8) * (0-(0)));
            yy = -7.425 + (((tickAnim - 118) / 8) * (13.775-(-7.425)));
            zz = 0 + (((tickAnim - 118) / 8) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 126) / 7) * (0-(0)));
            yy = 13.775 + (((tickAnim - 126) / 7) * (-7.425-(13.775)));
            zz = 0 + (((tickAnim - 126) / 7) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 133) / 7) * (0-(0)));
            yy = -7.425 + (((tickAnim - 133) / 7) * (24.75-(-7.425)));
            zz = 0 + (((tickAnim - 133) / 7) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 147) {
            xx = 0 + (((tickAnim - 140) / 7) * (0-(0)));
            yy = 24.75 + (((tickAnim - 140) / 7) * (-7.425-(24.75)));
            zz = 0 + (((tickAnim - 140) / 7) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            yy = -7.425 + (((tickAnim - 147) / 8) * (0-(-7.425)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-31.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -31.25 + (((tickAnim - 3) / 3) * (25.63-(-31.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 25.63 + (((tickAnim - 6) / 3) * (-16.25-(25.63)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -16.25 + (((tickAnim - 9) / 3) * (-43-(-16.25)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -43 + (((tickAnim - 12) / 3) * (-10.25-(-43)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -10.25 + (((tickAnim - 15) / 3) * (-31.25-(-10.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -31.25 + (((tickAnim - 18) / 2) * (25.63-(-31.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 25.63 + (((tickAnim - 20) / 3) * (-16.25-(25.63)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -16.25 + (((tickAnim - 23) / 3) * (-43-(-16.25)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = -43 + (((tickAnim - 26) / 3) * (-10.25-(-43)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = -10.25 + (((tickAnim - 29) / 3) * (-31.25-(-10.25)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = -31.25 + (((tickAnim - 32) / 2) * (25.63-(-31.25)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 25.63 + (((tickAnim - 34) / 4) * (-16.25-(25.63)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -16.25 + (((tickAnim - 38) / 2) * (-43-(-16.25)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -43 + (((tickAnim - 40) / 3) * (-10.25-(-43)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -10.25 + (((tickAnim - 43) / 3) * (-31.25-(-10.25)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -31.25 + (((tickAnim - 46) / 4) * (-46.75-(-31.25)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -46.75 + (((tickAnim - 50) / 3) * (-46.5-(-46.75)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 94) {
            xx = -46.5 + (((tickAnim - 53) / 41) * (-46.75-(-46.5)));
            yy = 0 + (((tickAnim - 53) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 41) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = -46.75 + (((tickAnim - 94) / 10) * (-31.25-(-46.75)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 10) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 107) {
            xx = -31.25 + (((tickAnim - 104) / 3) * (25.63-(-31.25)));
            yy = 0 + (((tickAnim - 104) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 3) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 110) {
            xx = 25.63 + (((tickAnim - 107) / 3) * (-16.25-(25.63)));
            yy = 0 + (((tickAnim - 107) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 3) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 113) {
            xx = -16.25 + (((tickAnim - 110) / 3) * (-43-(-16.25)));
            yy = 0 + (((tickAnim - 110) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 3) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 116) {
            xx = -43 + (((tickAnim - 113) / 3) * (-10.25-(-43)));
            yy = 0 + (((tickAnim - 113) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 3) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 118) {
            xx = -10.25 + (((tickAnim - 116) / 2) * (-31.25-(-10.25)));
            yy = 0 + (((tickAnim - 116) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 2) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 121) {
            xx = -31.25 + (((tickAnim - 118) / 3) * (25.63-(-31.25)));
            yy = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 3) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 124) {
            xx = 25.63 + (((tickAnim - 121) / 3) * (-16.25-(25.63)));
            yy = 0 + (((tickAnim - 121) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 3) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 127) {
            xx = -16.25 + (((tickAnim - 124) / 3) * (-43-(-16.25)));
            yy = 0 + (((tickAnim - 124) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 3) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 130) {
            xx = -43 + (((tickAnim - 127) / 3) * (-10.25-(-43)));
            yy = 0 + (((tickAnim - 127) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 3) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 133) {
            xx = -10.25 + (((tickAnim - 130) / 3) * (-31.25-(-10.25)));
            yy = 0 + (((tickAnim - 130) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 3) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 135) {
            xx = -31.25 + (((tickAnim - 133) / 2) * (25.63-(-31.25)));
            yy = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 2) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = 25.63 + (((tickAnim - 135) / 3) * (-16.25-(25.63)));
            yy = 0 + (((tickAnim - 135) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 3) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 141) {
            xx = -16.25 + (((tickAnim - 138) / 3) * (-43-(-16.25)));
            yy = 0 + (((tickAnim - 138) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 3) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 144) {
            xx = -43 + (((tickAnim - 141) / 3) * (-10.25-(-43)));
            yy = 0 + (((tickAnim - 141) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 3) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 147) {
            xx = -10.25 + (((tickAnim - 144) / 3) * (-31.25-(-10.25)));
            yy = 0 + (((tickAnim - 144) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 3) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = -31.25 + (((tickAnim - 147) / 8) * (0-(-31.25)));
            yy = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (26-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 26 + (((tickAnim - 3) / 3) * (-25.5-(26)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -25.5 + (((tickAnim - 6) / 3) * (24.5-(-25.5)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 24.5 + (((tickAnim - 9) / 3) * (54.5-(24.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 54.5 + (((tickAnim - 12) / 3) * (-14.5-(54.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -14.5 + (((tickAnim - 15) / 3) * (26-(-14.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 26 + (((tickAnim - 18) / 2) * (-25.5-(26)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -25.5 + (((tickAnim - 20) / 3) * (24.5-(-25.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 24.5 + (((tickAnim - 23) / 3) * (54.5-(24.5)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 54.5 + (((tickAnim - 26) / 3) * (-14.5-(54.5)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = -14.5 + (((tickAnim - 29) / 3) * (26-(-14.5)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 26 + (((tickAnim - 32) / 2) * (-25.5-(26)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -25.5 + (((tickAnim - 34) / 4) * (24.5-(-25.5)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 24.5 + (((tickAnim - 38) / 2) * (54.5-(24.5)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 54.5 + (((tickAnim - 40) / 3) * (-14.5-(54.5)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -14.5 + (((tickAnim - 43) / 3) * (26-(-14.5)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 26 + (((tickAnim - 46) / 4) * (44.5-(26)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 94) {
            xx = 44.5 + (((tickAnim - 50) / 44) * (44.5-(44.5)));
            yy = 0 + (((tickAnim - 50) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 44) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = 44.5 + (((tickAnim - 94) / 10) * (26-(44.5)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 10) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 107) {
            xx = 26 + (((tickAnim - 104) / 3) * (-25.5-(26)));
            yy = 0 + (((tickAnim - 104) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 3) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 110) {
            xx = -25.5 + (((tickAnim - 107) / 3) * (24.5-(-25.5)));
            yy = 0 + (((tickAnim - 107) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 3) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 113) {
            xx = 24.5 + (((tickAnim - 110) / 3) * (54.5-(24.5)));
            yy = 0 + (((tickAnim - 110) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 3) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 116) {
            xx = 54.5 + (((tickAnim - 113) / 3) * (-14.5-(54.5)));
            yy = 0 + (((tickAnim - 113) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 3) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 118) {
            xx = -14.5 + (((tickAnim - 116) / 2) * (26-(-14.5)));
            yy = 0 + (((tickAnim - 116) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 2) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 121) {
            xx = 26 + (((tickAnim - 118) / 3) * (-25.5-(26)));
            yy = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 3) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 124) {
            xx = -25.5 + (((tickAnim - 121) / 3) * (24.5-(-25.5)));
            yy = 0 + (((tickAnim - 121) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 3) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 127) {
            xx = 24.5 + (((tickAnim - 124) / 3) * (54.5-(24.5)));
            yy = 0 + (((tickAnim - 124) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 3) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 130) {
            xx = 54.5 + (((tickAnim - 127) / 3) * (-14.5-(54.5)));
            yy = 0 + (((tickAnim - 127) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 3) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 133) {
            xx = -14.5 + (((tickAnim - 130) / 3) * (26-(-14.5)));
            yy = 0 + (((tickAnim - 130) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 3) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 135) {
            xx = 26 + (((tickAnim - 133) / 2) * (-25.5-(26)));
            yy = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 2) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = -25.5 + (((tickAnim - 135) / 3) * (24.5-(-25.5)));
            yy = 0 + (((tickAnim - 135) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 3) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 141) {
            xx = 24.5 + (((tickAnim - 138) / 3) * (54.5-(24.5)));
            yy = 0 + (((tickAnim - 138) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 3) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 144) {
            xx = 54.5 + (((tickAnim - 141) / 3) * (-14.5-(54.5)));
            yy = 0 + (((tickAnim - 141) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 3) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 147) {
            xx = -14.5 + (((tickAnim - 144) / 3) * (26-(-14.5)));
            yy = 0 + (((tickAnim - 144) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 3) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = 26 + (((tickAnim - 147) / 8) * (0-(26)));
            yy = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-55-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -55 + (((tickAnim - 3) / 3) * (22-(-55)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 22 + (((tickAnim - 6) / 3) * (-53.75-(22)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -53.75 + (((tickAnim - 9) / 3) * (-74-(-53.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -74 + (((tickAnim - 12) / 3) * (26.25-(-74)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 26.25 + (((tickAnim - 15) / 3) * (-55-(26.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -55 + (((tickAnim - 18) / 2) * (22-(-55)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 22 + (((tickAnim - 20) / 3) * (-53.75-(22)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -53.75 + (((tickAnim - 23) / 3) * (-74-(-53.75)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = -74 + (((tickAnim - 26) / 3) * (26.25-(-74)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 26.25 + (((tickAnim - 29) / 3) * (-55-(26.25)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = -55 + (((tickAnim - 32) / 2) * (22-(-55)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 22 + (((tickAnim - 34) / 4) * (-53.75-(22)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -53.75 + (((tickAnim - 38) / 2) * (-74-(-53.75)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -74 + (((tickAnim - 40) / 3) * (26.25-(-74)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 26.25 + (((tickAnim - 43) / 3) * (-55-(26.25)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -55 + (((tickAnim - 46) / 4) * (-68.25-(-55)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 94) {
            xx = -68.25 + (((tickAnim - 50) / 44) * (-68.25-(-68.25)));
            yy = 0 + (((tickAnim - 50) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 44) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = -68.25 + (((tickAnim - 94) / 10) * (-55-(-68.25)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 10) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 107) {
            xx = -55 + (((tickAnim - 104) / 3) * (22-(-55)));
            yy = 0 + (((tickAnim - 104) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 3) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 110) {
            xx = 22 + (((tickAnim - 107) / 3) * (-53.75-(22)));
            yy = 0 + (((tickAnim - 107) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 3) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 113) {
            xx = -53.75 + (((tickAnim - 110) / 3) * (-74-(-53.75)));
            yy = 0 + (((tickAnim - 110) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 3) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 116) {
            xx = -74 + (((tickAnim - 113) / 3) * (26.25-(-74)));
            yy = 0 + (((tickAnim - 113) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 3) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 118) {
            xx = 26.25 + (((tickAnim - 116) / 2) * (-55-(26.25)));
            yy = 0 + (((tickAnim - 116) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 2) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 121) {
            xx = -55 + (((tickAnim - 118) / 3) * (22-(-55)));
            yy = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 3) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 124) {
            xx = 22 + (((tickAnim - 121) / 3) * (-53.75-(22)));
            yy = 0 + (((tickAnim - 121) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 3) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 127) {
            xx = -53.75 + (((tickAnim - 124) / 3) * (-74-(-53.75)));
            yy = 0 + (((tickAnim - 124) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 3) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 130) {
            xx = -74 + (((tickAnim - 127) / 3) * (26.25-(-74)));
            yy = 0 + (((tickAnim - 127) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 3) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 133) {
            xx = 26.25 + (((tickAnim - 130) / 3) * (-55-(26.25)));
            yy = 0 + (((tickAnim - 130) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 3) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 135) {
            xx = -55 + (((tickAnim - 133) / 2) * (22-(-55)));
            yy = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 2) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = 22 + (((tickAnim - 135) / 3) * (-53.75-(22)));
            yy = 0 + (((tickAnim - 135) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 3) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 141) {
            xx = -53.75 + (((tickAnim - 138) / 3) * (-74-(-53.75)));
            yy = 0 + (((tickAnim - 138) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 3) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 144) {
            xx = -74 + (((tickAnim - 141) / 3) * (26.25-(-74)));
            yy = 0 + (((tickAnim - 141) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 3) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 147) {
            xx = 26.25 + (((tickAnim - 144) / 3) * (-55-(26.25)));
            yy = 0 + (((tickAnim - 144) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 3) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = -55 + (((tickAnim - 147) / 8) * (0-(-55)));
            yy = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = -0.425 + (((tickAnim - 3) / 6) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 3) / 6) * (-0.4-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = -0.425 + (((tickAnim - 9) / 3) * (-0.725-(-0.425)));
            zz = -0.4 + (((tickAnim - 9) / 3) * (-0.2-(-0.4)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = -0.725 + (((tickAnim - 12) / 3) * (0-(-0.725)));
            zz = -0.2 + (((tickAnim - 12) / 3) * (0-(-0.2)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -0.425 + (((tickAnim - 18) / 5) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 18) / 5) * (-0.4-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = -0.425 + (((tickAnim - 23) / 3) * (-0.725-(-0.425)));
            zz = -0.4 + (((tickAnim - 23) / 3) * (-0.2-(-0.4)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            yy = -0.725 + (((tickAnim - 26) / 3) * (0-(-0.725)));
            zz = -0.2 + (((tickAnim - 26) / 3) * (0-(-0.2)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 3) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = -0.425 + (((tickAnim - 32) / 6) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 32) / 6) * (-0.4-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = -0.425 + (((tickAnim - 38) / 2) * (-0.725-(-0.425)));
            zz = -0.4 + (((tickAnim - 38) / 2) * (-0.2-(-0.4)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            yy = -0.725 + (((tickAnim - 40) / 3) * (0-(-0.725)));
            zz = -0.2 + (((tickAnim - 40) / 3) * (0-(-0.2)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 3) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 46) / 58) * (0-(0)));
            yy = -0.425 + (((tickAnim - 46) / 58) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 46) / 58) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 104) / 6) * (0-(0)));
            yy = -0.425 + (((tickAnim - 104) / 6) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 104) / 6) * (-0.4-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 110) / 3) * (0-(0)));
            yy = -0.425 + (((tickAnim - 110) / 3) * (-0.725-(-0.425)));
            zz = -0.4 + (((tickAnim - 110) / 3) * (-0.2-(-0.4)));
        }
        else if (tickAnim >= 113 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 113) / 3) * (0-(0)));
            yy = -0.725 + (((tickAnim - 113) / 3) * (0-(-0.725)));
            zz = -0.2 + (((tickAnim - 113) / 3) * (0-(-0.2)));
        }
        else if (tickAnim >= 116 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 116) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 116) / 2) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 116) / 2) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 118) / 6) * (0-(0)));
            yy = -0.425 + (((tickAnim - 118) / 6) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 118) / 6) * (-0.4-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 127) {
            xx = 0 + (((tickAnim - 124) / 3) * (0-(0)));
            yy = -0.425 + (((tickAnim - 124) / 3) * (-0.725-(-0.425)));
            zz = -0.4 + (((tickAnim - 124) / 3) * (-0.2-(-0.4)));
        }
        else if (tickAnim >= 127 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 127) / 3) * (0-(0)));
            yy = -0.725 + (((tickAnim - 127) / 3) * (0-(-0.725)));
            zz = -0.2 + (((tickAnim - 127) / 3) * (0-(-0.2)));
        }
        else if (tickAnim >= 130 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 130) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 3) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 130) / 3) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 133) / 5) * (0-(0)));
            yy = -0.425 + (((tickAnim - 133) / 5) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 133) / 5) * (-0.4-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 138) / 3) * (0-(0)));
            yy = -0.425 + (((tickAnim - 138) / 3) * (-0.725-(-0.425)));
            zz = -0.4 + (((tickAnim - 138) / 3) * (-0.2-(-0.4)));
        }
        else if (tickAnim >= 141 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 141) / 3) * (0-(0)));
            yy = -0.725 + (((tickAnim - 141) / 3) * (0-(-0.725)));
            zz = -0.2 + (((tickAnim - 141) / 3) * (0-(-0.2)));
        }
        else if (tickAnim >= 144 && tickAnim < 147) {
            xx = 0 + (((tickAnim - 144) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 144) / 3) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 144) / 3) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            yy = -0.425 + (((tickAnim - 147) / 8) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (40-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 40 + (((tickAnim - 3) / 3) * (-10.25-(40)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -10.25 + (((tickAnim - 6) / 1) * (67.17-(-10.25)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 67.17 + (((tickAnim - 7) / 1) * (75.09-(67.17)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 75.09 + (((tickAnim - 8) / 1) * (82.25-(75.09)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 82.25 + (((tickAnim - 9) / 3) * (82.25-(82.25)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 82.25 + (((tickAnim - 12) / 1) * (81.27023-(82.25)));
            yy = 0 + (((tickAnim - 12) / 1) * (-1.93246-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0.81883-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 81.27023 + (((tickAnim - 13) / 1) * (45.16017-(81.27023)));
            yy = -1.93246 + (((tickAnim - 13) / 1) * (-1.44934-(-1.93246)));
            zz = 0.81883 + (((tickAnim - 13) / 1) * (0.61412-(0.81883)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 45.16017 + (((tickAnim - 14) / 1) * (-22.42-(45.16017)));
            yy = -1.44934 + (((tickAnim - 14) / 1) * (0-(-1.44934)));
            zz = 0.61412 + (((tickAnim - 14) / 1) * (0-(0.61412)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -22.42 + (((tickAnim - 15) / 3) * (40-(-22.42)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 40 + (((tickAnim - 18) / 2) * (-10.25-(40)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = -10.25 + (((tickAnim - 20) / 1) * (67.17-(-10.25)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 67.17 + (((tickAnim - 21) / 1) * (75.09-(67.17)));
            yy = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 1) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 75.09 + (((tickAnim - 22) / 1) * (82.25-(75.09)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 82.25 + (((tickAnim - 23) / 3) * (82.25-(82.25)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 82.25 + (((tickAnim - 26) / 2) * (81.27023-(82.25)));
            yy = 0 + (((tickAnim - 26) / 2) * (-1.93246-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0.81883-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = 81.27023 + (((tickAnim - 28) / 0) * (45.16017-(81.27023)));
            yy = -1.93246 + (((tickAnim - 28) / 0) * (-1.44934-(-1.93246)));
            zz = 0.81883 + (((tickAnim - 28) / 0) * (0.61412-(0.81883)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 45.16017 + (((tickAnim - 28) / 1) * (-22.42-(45.16017)));
            yy = -1.44934 + (((tickAnim - 28) / 1) * (0-(-1.44934)));
            zz = 0.61412 + (((tickAnim - 28) / 1) * (0-(0.61412)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = -22.42 + (((tickAnim - 29) / 3) * (40-(-22.42)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 40 + (((tickAnim - 32) / 2) * (-10.25-(40)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -10.25 + (((tickAnim - 34) / 1) * (67.17-(-10.25)));
            yy = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 1) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 67.17 + (((tickAnim - 35) / 1) * (75.09-(67.17)));
            yy = 0 + (((tickAnim - 35) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 1) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 75.09 + (((tickAnim - 36) / 2) * (82.25-(75.09)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 82.25 + (((tickAnim - 38) / 2) * (82.25-(82.25)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 82.25 + (((tickAnim - 40) / 2) * (81.27023-(82.25)));
            yy = 0 + (((tickAnim - 40) / 2) * (-1.93246-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0.81883-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 81.27023 + (((tickAnim - 42) / 1) * (45.16017-(81.27023)));
            yy = -1.93246 + (((tickAnim - 42) / 1) * (-1.44934-(-1.93246)));
            zz = 0.81883 + (((tickAnim - 42) / 1) * (0.61412-(0.81883)));
        }
        else if (tickAnim >= 43 && tickAnim < 43) {
            xx = 45.16017 + (((tickAnim - 43) / 0) * (-22.42-(45.16017)));
            yy = -1.44934 + (((tickAnim - 43) / 0) * (0-(-1.44934)));
            zz = 0.61412 + (((tickAnim - 43) / 0) * (0-(0.61412)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -22.42 + (((tickAnim - 43) / 3) * (40-(-22.42)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 40 + (((tickAnim - 46) / 4) * (66.75-(40)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 94) {
            xx = 66.75 + (((tickAnim - 50) / 44) * (66.75-(66.75)));
            yy = 0 + (((tickAnim - 50) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 44) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = 66.75 + (((tickAnim - 94) / 10) * (40-(66.75)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 10) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 107) {
            xx = 40 + (((tickAnim - 104) / 3) * (-10.25-(40)));
            yy = 0 + (((tickAnim - 104) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 3) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 108) {
            xx = -10.25 + (((tickAnim - 107) / 1) * (67.17-(-10.25)));
            yy = 0 + (((tickAnim - 107) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 1) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 108) {
            xx = 67.17 + (((tickAnim - 108) / 0) * (75.09-(67.17)));
            yy = 0 + (((tickAnim - 108) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 0) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 110) {
            xx = 75.09 + (((tickAnim - 108) / 2) * (82.25-(75.09)));
            yy = 0 + (((tickAnim - 108) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 2) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 113) {
            xx = 82.25 + (((tickAnim - 110) / 3) * (82.25-(82.25)));
            yy = 0 + (((tickAnim - 110) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 3) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 114) {
            xx = 82.25 + (((tickAnim - 113) / 1) * (81.27023-(82.25)));
            yy = 0 + (((tickAnim - 113) / 1) * (-1.93246-(0)));
            zz = 0 + (((tickAnim - 113) / 1) * (0.81883-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 115) {
            xx = 81.27023 + (((tickAnim - 114) / 1) * (45.16017-(81.27023)));
            yy = -1.93246 + (((tickAnim - 114) / 1) * (-1.44934-(-1.93246)));
            zz = 0.81883 + (((tickAnim - 114) / 1) * (0.61412-(0.81883)));
        }
        else if (tickAnim >= 115 && tickAnim < 116) {
            xx = 45.16017 + (((tickAnim - 115) / 1) * (-22.42-(45.16017)));
            yy = -1.44934 + (((tickAnim - 115) / 1) * (0-(-1.44934)));
            zz = 0.61412 + (((tickAnim - 115) / 1) * (0-(0.61412)));
        }
        else if (tickAnim >= 116 && tickAnim < 118) {
            xx = -22.42 + (((tickAnim - 116) / 2) * (40-(-22.42)));
            yy = 0 + (((tickAnim - 116) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 2) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 121) {
            xx = 40 + (((tickAnim - 118) / 3) * (-10.25-(40)));
            yy = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 3) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 122) {
            xx = -10.25 + (((tickAnim - 121) / 1) * (67.17-(-10.25)));
            yy = 0 + (((tickAnim - 121) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 1) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 123) {
            xx = 67.17 + (((tickAnim - 122) / 1) * (75.09-(67.17)));
            yy = 0 + (((tickAnim - 122) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 1) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 124) {
            xx = 75.09 + (((tickAnim - 123) / 1) * (82.25-(75.09)));
            yy = 0 + (((tickAnim - 123) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 1) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 127) {
            xx = 82.25 + (((tickAnim - 124) / 3) * (82.25-(82.25)));
            yy = 0 + (((tickAnim - 124) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 3) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 128) {
            xx = 82.25 + (((tickAnim - 127) / 1) * (81.27023-(82.25)));
            yy = 0 + (((tickAnim - 127) / 1) * (-1.93246-(0)));
            zz = 0 + (((tickAnim - 127) / 1) * (0.81883-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 129) {
            xx = 81.27023 + (((tickAnim - 128) / 1) * (45.16017-(81.27023)));
            yy = -1.93246 + (((tickAnim - 128) / 1) * (-1.44934-(-1.93246)));
            zz = 0.81883 + (((tickAnim - 128) / 1) * (0.61412-(0.81883)));
        }
        else if (tickAnim >= 129 && tickAnim < 130) {
            xx = 45.16017 + (((tickAnim - 129) / 1) * (-22.42-(45.16017)));
            yy = -1.44934 + (((tickAnim - 129) / 1) * (0-(-1.44934)));
            zz = 0.61412 + (((tickAnim - 129) / 1) * (0-(0.61412)));
        }
        else if (tickAnim >= 130 && tickAnim < 133) {
            xx = -22.42 + (((tickAnim - 130) / 3) * (40-(-22.42)));
            yy = 0 + (((tickAnim - 130) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 3) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 135) {
            xx = 40 + (((tickAnim - 133) / 2) * (-10.25-(40)));
            yy = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 2) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 137) {
            xx = -10.25 + (((tickAnim - 135) / 2) * (90.09-(-10.25)));
            yy = 0 + (((tickAnim - 135) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 2) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 138) {
            xx = 90.09 + (((tickAnim - 137) / 1) * (82.25-(90.09)));
            yy = 0 + (((tickAnim - 137) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 1) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 141) {
            xx = 82.25 + (((tickAnim - 138) / 3) * (82.25-(82.25)));
            yy = 0 + (((tickAnim - 138) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 3) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 143) {
            xx = 82.25 + (((tickAnim - 141) / 2) * (81.27023-(82.25)));
            yy = 0 + (((tickAnim - 141) / 2) * (-1.93246-(0)));
            zz = 0 + (((tickAnim - 141) / 2) * (0.81883-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 144) {
            xx = 81.27023 + (((tickAnim - 143) / 1) * (18.08-(81.27023)));
            yy = -1.93246 + (((tickAnim - 143) / 1) * (0-(-1.93246)));
            zz = 0.81883 + (((tickAnim - 143) / 1) * (0-(0.81883)));
        }
        else if (tickAnim >= 144 && tickAnim < 145) {
            xx = 18.08 + (((tickAnim - 144) / 1) * (-3.86-(18.08)));
            yy = 0 + (((tickAnim - 144) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 1) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 147) {
            xx = -3.86 + (((tickAnim - 145) / 2) * (40-(-3.86)));
            yy = 0 + (((tickAnim - 145) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 2) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = 40 + (((tickAnim - 147) / 8) * (0-(40)));
            yy = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.325 + (((tickAnim - 3) / 2) * (3.195-(0.325)));
            zz = 0 + (((tickAnim - 3) / 2) * (1.27-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 3.195 + (((tickAnim - 5) / 1) * (2.95-(3.195)));
            zz = 1.27 + (((tickAnim - 5) / 1) * (1.9-(1.27)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 2.95 + (((tickAnim - 6) / 2) * (0-(2.95)));
            zz = 1.9 + (((tickAnim - 6) / 2) * (0-(1.9)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 1) * (1.21-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 1.21 + (((tickAnim - 16) / 2) * (0.325-(1.21)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.325 + (((tickAnim - 18) / 1) * (3.195-(0.325)));
            zz = 0 + (((tickAnim - 18) / 1) * (1.27-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = 3.195 + (((tickAnim - 19) / 1) * (2.95-(3.195)));
            zz = 1.27 + (((tickAnim - 19) / 1) * (1.9-(1.27)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 2.95 + (((tickAnim - 20) / 2) * (0-(2.95)));
            zz = 1.9 + (((tickAnim - 20) / 2) * (0-(1.9)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 29) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 1) * (1.21-(0)));
            zz = 0 + (((tickAnim - 29) / 1) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            yy = 1.21 + (((tickAnim - 30) / 2) * (0.325-(1.21)));
            zz = 0 + (((tickAnim - 30) / 2) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = 0.325 + (((tickAnim - 32) / 1) * (3.195-(0.325)));
            zz = 0 + (((tickAnim - 32) / 1) * (1.27-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            yy = 3.195 + (((tickAnim - 33) / 1) * (2.95-(3.195)));
            zz = 1.27 + (((tickAnim - 33) / 1) * (1.9-(1.27)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 34) / 2) * (0-(0)));
            yy = 2.95 + (((tickAnim - 34) / 2) * (0-(2.95)));
            zz = 1.9 + (((tickAnim - 34) / 2) * (0-(1.9)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 43) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 1) * (1.21-(0)));
            zz = 0 + (((tickAnim - 43) / 1) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 44) / 2) * (0-(0)));
            yy = 1.21 + (((tickAnim - 44) / 2) * (0.325-(1.21)));
            zz = 0 + (((tickAnim - 44) / 2) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 46) / 58) * (0-(0)));
            yy = 0.325 + (((tickAnim - 46) / 58) * (0.325-(0.325)));
            zz = 0 + (((tickAnim - 46) / 58) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 104) / 2) * (0-(0)));
            yy = 0.325 + (((tickAnim - 104) / 2) * (3.195-(0.325)));
            zz = 0 + (((tickAnim - 104) / 2) * (1.27-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 106) / 1) * (0-(0)));
            yy = 3.195 + (((tickAnim - 106) / 1) * (2.95-(3.195)));
            zz = 1.27 + (((tickAnim - 106) / 1) * (1.9-(1.27)));
        }
        else if (tickAnim >= 107 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 107) / 1) * (0-(0)));
            yy = 2.95 + (((tickAnim - 107) / 1) * (0-(2.95)));
            zz = 1.9 + (((tickAnim - 107) / 1) * (0-(1.9)));
        }
        else if (tickAnim >= 108 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 108) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 108) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 5) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 114) {
            xx = 0 + (((tickAnim - 113) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 113) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 1) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 114) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 114) / 1) * (-0.355-(0)));
            zz = 0 + (((tickAnim - 114) / 1) * (0.37-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 115) / 1) * (0-(0)));
            yy = -0.355 + (((tickAnim - 115) / 1) * (0-(-0.355)));
            zz = 0.37 + (((tickAnim - 115) / 1) * (0-(0.37)));
        }
        else if (tickAnim >= 116 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 116) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 116) / 1) * (1.21-(0)));
            zz = 0 + (((tickAnim - 116) / 1) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 117) / 1) * (0-(0)));
            yy = 1.21 + (((tickAnim - 117) / 1) * (0.325-(1.21)));
            zz = 0 + (((tickAnim - 117) / 1) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 118) / 2) * (0-(0)));
            yy = 0.325 + (((tickAnim - 118) / 2) * (3.195-(0.325)));
            zz = 0 + (((tickAnim - 118) / 2) * (1.27-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 120) / 1) * (0-(0)));
            yy = 3.195 + (((tickAnim - 120) / 1) * (2.95-(3.195)));
            zz = 1.27 + (((tickAnim - 120) / 1) * (1.9-(1.27)));
        }
        else if (tickAnim >= 121 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 121) / 2) * (0-(0)));
            yy = 2.95 + (((tickAnim - 121) / 2) * (0-(2.95)));
            zz = 1.9 + (((tickAnim - 121) / 2) * (0-(1.9)));
        }
        else if (tickAnim >= 123 && tickAnim < 127) {
            xx = 0 + (((tickAnim - 123) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 123) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 4) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 127) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 127) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 1) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 128) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 128) / 1) * (-0.355-(0)));
            zz = 0 + (((tickAnim - 128) / 1) * (0.37-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 129) / 1) * (0-(0)));
            yy = -0.355 + (((tickAnim - 129) / 1) * (0-(-0.355)));
            zz = 0.37 + (((tickAnim - 129) / 1) * (0-(0.37)));
        }
        else if (tickAnim >= 130 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 130) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 1) * (1.21-(0)));
            zz = 0 + (((tickAnim - 130) / 1) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 131) / 2) * (0-(0)));
            yy = 1.21 + (((tickAnim - 131) / 2) * (0.325-(1.21)));
            zz = 0 + (((tickAnim - 131) / 2) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 133) / 1) * (0-(0)));
            yy = 0.325 + (((tickAnim - 133) / 1) * (0.85-(0.325)));
            zz = 0 + (((tickAnim - 133) / 1) * (0.75-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 134) / 1) * (0-(0)));
            yy = 0.85 + (((tickAnim - 134) / 1) * (0-(0.85)));
            zz = 0.75 + (((tickAnim - 134) / 1) * (0-(0.75)));
        }
        else if (tickAnim >= 135 && tickAnim < 137) {
            xx = 0 + (((tickAnim - 135) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 2) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 137) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 137) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 4) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 141) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 141) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 2) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 143) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 143) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 1) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 147) {
            xx = 0 + (((tickAnim - 144) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 144) / 3) * (0.325-(0)));
            zz = 0 + (((tickAnim - 144) / 3) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            yy = 0.325 + (((tickAnim - 147) / 8) * (0-(0.325)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (37.5-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 37.5 + (((tickAnim - 9) / 4) * (0-(37.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (37.5-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 37.5 + (((tickAnim - 23) / 5) * (0-(37.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 28) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 0) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 1) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (37.5-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 37.5 + (((tickAnim - 38) / 4) * (0-(37.5)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 43) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 0) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 46) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 61) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 107) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 107) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 1) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 108) / 2) * (37.5-(0)));
            yy = 0 + (((tickAnim - 108) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 2) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 114) {
            xx = 37.5 + (((tickAnim - 110) / 4) * (0-(37.5)));
            yy = 0 + (((tickAnim - 110) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 4) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 114) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 114) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 1) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 115) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 115) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 1) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 116) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 116) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 2) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 3) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 121) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 121) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 1) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 122) / 2) * (37.5-(0)));
            yy = 0 + (((tickAnim - 122) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 2) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 128) {
            xx = 37.5 + (((tickAnim - 124) / 4) * (0-(37.5)));
            yy = 0 + (((tickAnim - 124) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 4) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 128) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 128) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 1) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 129) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 129) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 1) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 130) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 3) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 2) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 135) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 1) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 136) / 2) * (37.5-(0)));
            yy = 0 + (((tickAnim - 136) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 2) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 143) {
            xx = 37.5 + (((tickAnim - 138) / 5) * (0-(37.5)));
            yy = 0 + (((tickAnim - 138) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 5) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 143) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 143) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 1) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 147) {
            xx = 0 + (((tickAnim - 144) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 144) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 28) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 0) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 1) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 46) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 61) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 107) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 107) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 1) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 108) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 108) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 2) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 114) {
            xx = 0 + (((tickAnim - 110) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 4) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 114) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 114) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 1) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 115) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 115) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 3) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 3) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 121) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 121) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 1) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 122) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 122) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 2) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 124) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 124) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 4) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 128) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 128) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 1) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 129) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 129) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 4) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 2) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 135) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 1) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 136) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 136) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 2) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 138) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 138) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 5) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 147) {
            xx = 0 + (((tickAnim - 143) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 143) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-31.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -31.25 + (((tickAnim - 3) / 3) * (25.63-(-31.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 25.63 + (((tickAnim - 6) / 3) * (-16.25-(25.63)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -16.25 + (((tickAnim - 9) / 3) * (-43-(-16.25)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -43 + (((tickAnim - 12) / 3) * (-10.25-(-43)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -10.25 + (((tickAnim - 15) / 3) * (-31.25-(-10.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -31.25 + (((tickAnim - 18) / 2) * (25.63-(-31.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 25.63 + (((tickAnim - 20) / 3) * (-16.25-(25.63)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -16.25 + (((tickAnim - 23) / 3) * (-43-(-16.25)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = -43 + (((tickAnim - 26) / 3) * (-10.25-(-43)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = -10.25 + (((tickAnim - 29) / 3) * (-31.25-(-10.25)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = -31.25 + (((tickAnim - 32) / 2) * (25.63-(-31.25)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 25.63 + (((tickAnim - 34) / 4) * (-16.25-(25.63)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -16.25 + (((tickAnim - 38) / 2) * (-43-(-16.25)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -43 + (((tickAnim - 40) / 3) * (-10.25-(-43)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -10.25 + (((tickAnim - 43) / 3) * (-31.25-(-10.25)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -31.25 + (((tickAnim - 46) / 4) * (-46.75-(-31.25)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 94) {
            xx = -46.75 + (((tickAnim - 50) / 44) * (-46.75-(-46.75)));
            yy = 0 + (((tickAnim - 50) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 44) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = -46.75 + (((tickAnim - 94) / 10) * (-31.25-(-46.75)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 10) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 107) {
            xx = -31.25 + (((tickAnim - 104) / 3) * (25.63-(-31.25)));
            yy = 0 + (((tickAnim - 104) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 3) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 110) {
            xx = 25.63 + (((tickAnim - 107) / 3) * (-16.25-(25.63)));
            yy = 0 + (((tickAnim - 107) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 3) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 113) {
            xx = -16.25 + (((tickAnim - 110) / 3) * (-43-(-16.25)));
            yy = 0 + (((tickAnim - 110) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 3) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 116) {
            xx = -43 + (((tickAnim - 113) / 3) * (-10.25-(-43)));
            yy = 0 + (((tickAnim - 113) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 3) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 118) {
            xx = -10.25 + (((tickAnim - 116) / 2) * (-31.25-(-10.25)));
            yy = 0 + (((tickAnim - 116) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 2) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 121) {
            xx = -31.25 + (((tickAnim - 118) / 3) * (25.63-(-31.25)));
            yy = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 3) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 124) {
            xx = 25.63 + (((tickAnim - 121) / 3) * (-16.25-(25.63)));
            yy = 0 + (((tickAnim - 121) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 3) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 127) {
            xx = -16.25 + (((tickAnim - 124) / 3) * (-43-(-16.25)));
            yy = 0 + (((tickAnim - 124) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 3) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 130) {
            xx = -43 + (((tickAnim - 127) / 3) * (-10.25-(-43)));
            yy = 0 + (((tickAnim - 127) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 3) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 133) {
            xx = -10.25 + (((tickAnim - 130) / 3) * (-31.25-(-10.25)));
            yy = 0 + (((tickAnim - 130) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 3) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 135) {
            xx = -31.25 + (((tickAnim - 133) / 2) * (25.63-(-31.25)));
            yy = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 2) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = 25.63 + (((tickAnim - 135) / 3) * (-16.25-(25.63)));
            yy = 0 + (((tickAnim - 135) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 3) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 141) {
            xx = -16.25 + (((tickAnim - 138) / 3) * (-43-(-16.25)));
            yy = 0 + (((tickAnim - 138) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 3) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 144) {
            xx = -43 + (((tickAnim - 141) / 3) * (-10.25-(-43)));
            yy = 0 + (((tickAnim - 141) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 3) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 147) {
            xx = -10.25 + (((tickAnim - 144) / 3) * (-31.25-(-10.25)));
            yy = 0 + (((tickAnim - 144) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 3) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = -31.25 + (((tickAnim - 147) / 8) * (0-(-31.25)));
            yy = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (26-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 26 + (((tickAnim - 3) / 3) * (-25.5-(26)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -25.5 + (((tickAnim - 6) / 3) * (24.5-(-25.5)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 24.5 + (((tickAnim - 9) / 3) * (54.5-(24.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 54.5 + (((tickAnim - 12) / 3) * (-14.5-(54.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -14.5 + (((tickAnim - 15) / 3) * (26-(-14.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 26 + (((tickAnim - 18) / 2) * (-25.5-(26)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -25.5 + (((tickAnim - 20) / 3) * (24.5-(-25.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 24.5 + (((tickAnim - 23) / 3) * (54.5-(24.5)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 54.5 + (((tickAnim - 26) / 3) * (-14.5-(54.5)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = -14.5 + (((tickAnim - 29) / 3) * (26-(-14.5)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 26 + (((tickAnim - 32) / 2) * (-25.5-(26)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -25.5 + (((tickAnim - 34) / 4) * (24.5-(-25.5)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 24.5 + (((tickAnim - 38) / 2) * (54.5-(24.5)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 54.5 + (((tickAnim - 40) / 3) * (-14.5-(54.5)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -14.5 + (((tickAnim - 43) / 3) * (26-(-14.5)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 26 + (((tickAnim - 46) / 4) * (44.5-(26)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 94) {
            xx = 44.5 + (((tickAnim - 50) / 44) * (44.5-(44.5)));
            yy = 0 + (((tickAnim - 50) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 44) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = 44.5 + (((tickAnim - 94) / 10) * (26-(44.5)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 10) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 107) {
            xx = 26 + (((tickAnim - 104) / 3) * (-25.5-(26)));
            yy = 0 + (((tickAnim - 104) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 3) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 110) {
            xx = -25.5 + (((tickAnim - 107) / 3) * (24.5-(-25.5)));
            yy = 0 + (((tickAnim - 107) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 3) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 113) {
            xx = 24.5 + (((tickAnim - 110) / 3) * (54.5-(24.5)));
            yy = 0 + (((tickAnim - 110) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 3) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 116) {
            xx = 54.5 + (((tickAnim - 113) / 3) * (-14.5-(54.5)));
            yy = 0 + (((tickAnim - 113) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 3) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 118) {
            xx = -14.5 + (((tickAnim - 116) / 2) * (26-(-14.5)));
            yy = 0 + (((tickAnim - 116) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 2) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 121) {
            xx = 26 + (((tickAnim - 118) / 3) * (-25.5-(26)));
            yy = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 3) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 124) {
            xx = -25.5 + (((tickAnim - 121) / 3) * (24.5-(-25.5)));
            yy = 0 + (((tickAnim - 121) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 3) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 127) {
            xx = 24.5 + (((tickAnim - 124) / 3) * (54.5-(24.5)));
            yy = 0 + (((tickAnim - 124) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 3) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 130) {
            xx = 54.5 + (((tickAnim - 127) / 3) * (-14.5-(54.5)));
            yy = 0 + (((tickAnim - 127) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 3) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 133) {
            xx = -14.5 + (((tickAnim - 130) / 3) * (26-(-14.5)));
            yy = 0 + (((tickAnim - 130) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 3) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 135) {
            xx = 26 + (((tickAnim - 133) / 2) * (-25.5-(26)));
            yy = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 2) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = -25.5 + (((tickAnim - 135) / 3) * (24.5-(-25.5)));
            yy = 0 + (((tickAnim - 135) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 3) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 141) {
            xx = 24.5 + (((tickAnim - 138) / 3) * (54.5-(24.5)));
            yy = 0 + (((tickAnim - 138) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 3) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 144) {
            xx = 54.5 + (((tickAnim - 141) / 3) * (-14.5-(54.5)));
            yy = 0 + (((tickAnim - 141) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 3) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 147) {
            xx = -14.5 + (((tickAnim - 144) / 3) * (26-(-14.5)));
            yy = 0 + (((tickAnim - 144) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 3) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = 26 + (((tickAnim - 147) / 8) * (0-(26)));
            yy = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-55-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -55 + (((tickAnim - 3) / 3) * (22-(-55)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 22 + (((tickAnim - 6) / 3) * (-53.75-(22)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -53.75 + (((tickAnim - 9) / 3) * (-74-(-53.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -74 + (((tickAnim - 12) / 3) * (26.25-(-74)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 26.25 + (((tickAnim - 15) / 3) * (-55-(26.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -55 + (((tickAnim - 18) / 2) * (22-(-55)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 22 + (((tickAnim - 20) / 3) * (-53.75-(22)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -53.75 + (((tickAnim - 23) / 3) * (-74-(-53.75)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = -74 + (((tickAnim - 26) / 3) * (26.25-(-74)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 26.25 + (((tickAnim - 29) / 3) * (-55-(26.25)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = -55 + (((tickAnim - 32) / 2) * (22-(-55)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 22 + (((tickAnim - 34) / 4) * (-53.75-(22)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -53.75 + (((tickAnim - 38) / 2) * (-74-(-53.75)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -74 + (((tickAnim - 40) / 3) * (26.25-(-74)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 26.25 + (((tickAnim - 43) / 3) * (-55-(26.25)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -55 + (((tickAnim - 46) / 4) * (-68.25-(-55)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 94) {
            xx = -68.25 + (((tickAnim - 50) / 44) * (-68.25-(-68.25)));
            yy = 0 + (((tickAnim - 50) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 44) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = -68.25 + (((tickAnim - 94) / 10) * (-55-(-68.25)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 10) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 107) {
            xx = -55 + (((tickAnim - 104) / 3) * (22-(-55)));
            yy = 0 + (((tickAnim - 104) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 3) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 110) {
            xx = 22 + (((tickAnim - 107) / 3) * (-53.75-(22)));
            yy = 0 + (((tickAnim - 107) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 3) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 113) {
            xx = -53.75 + (((tickAnim - 110) / 3) * (-74-(-53.75)));
            yy = 0 + (((tickAnim - 110) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 3) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 116) {
            xx = -74 + (((tickAnim - 113) / 3) * (26.25-(-74)));
            yy = 0 + (((tickAnim - 113) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 3) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 118) {
            xx = 26.25 + (((tickAnim - 116) / 2) * (-55-(26.25)));
            yy = 0 + (((tickAnim - 116) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 2) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 121) {
            xx = -55 + (((tickAnim - 118) / 3) * (22-(-55)));
            yy = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 3) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 124) {
            xx = 22 + (((tickAnim - 121) / 3) * (-53.75-(22)));
            yy = 0 + (((tickAnim - 121) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 3) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 127) {
            xx = -53.75 + (((tickAnim - 124) / 3) * (-74-(-53.75)));
            yy = 0 + (((tickAnim - 124) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 3) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 130) {
            xx = -74 + (((tickAnim - 127) / 3) * (26.25-(-74)));
            yy = 0 + (((tickAnim - 127) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 3) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 133) {
            xx = 26.25 + (((tickAnim - 130) / 3) * (-55-(26.25)));
            yy = 0 + (((tickAnim - 130) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 3) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 135) {
            xx = -55 + (((tickAnim - 133) / 2) * (22-(-55)));
            yy = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 2) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = 22 + (((tickAnim - 135) / 3) * (-53.75-(22)));
            yy = 0 + (((tickAnim - 135) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 3) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 141) {
            xx = -53.75 + (((tickAnim - 138) / 3) * (-74-(-53.75)));
            yy = 0 + (((tickAnim - 138) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 3) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 144) {
            xx = -74 + (((tickAnim - 141) / 3) * (26.25-(-74)));
            yy = 0 + (((tickAnim - 141) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 3) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 147) {
            xx = 26.25 + (((tickAnim - 144) / 3) * (-55-(26.25)));
            yy = 0 + (((tickAnim - 144) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 3) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = -55 + (((tickAnim - 147) / 8) * (0-(-55)));
            yy = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = -0.425 + (((tickAnim - 3) / 6) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 3) / 6) * (-0.4-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = -0.425 + (((tickAnim - 9) / 3) * (-0.725-(-0.425)));
            zz = -0.4 + (((tickAnim - 9) / 3) * (-0.2-(-0.4)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = -0.725 + (((tickAnim - 12) / 3) * (0-(-0.725)));
            zz = -0.2 + (((tickAnim - 12) / 3) * (0-(-0.2)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -0.425 + (((tickAnim - 18) / 5) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 18) / 5) * (-0.4-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = -0.425 + (((tickAnim - 23) / 3) * (-0.725-(-0.425)));
            zz = -0.4 + (((tickAnim - 23) / 3) * (-0.2-(-0.4)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            yy = -0.725 + (((tickAnim - 26) / 3) * (0-(-0.725)));
            zz = -0.2 + (((tickAnim - 26) / 3) * (0-(-0.2)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 3) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = -0.425 + (((tickAnim - 32) / 6) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 32) / 6) * (-0.4-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = -0.425 + (((tickAnim - 38) / 2) * (-0.725-(-0.425)));
            zz = -0.4 + (((tickAnim - 38) / 2) * (-0.2-(-0.4)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            yy = -0.725 + (((tickAnim - 40) / 3) * (0-(-0.725)));
            zz = -0.2 + (((tickAnim - 40) / 3) * (0-(-0.2)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 3) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 46) / 58) * (0-(0)));
            yy = -0.425 + (((tickAnim - 46) / 58) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 46) / 58) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 104) / 6) * (0-(0)));
            yy = -0.425 + (((tickAnim - 104) / 6) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 104) / 6) * (-0.4-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 110) / 3) * (0-(0)));
            yy = -0.425 + (((tickAnim - 110) / 3) * (-0.725-(-0.425)));
            zz = -0.4 + (((tickAnim - 110) / 3) * (-0.2-(-0.4)));
        }
        else if (tickAnim >= 113 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 113) / 3) * (0-(0)));
            yy = -0.725 + (((tickAnim - 113) / 3) * (0-(-0.725)));
            zz = -0.2 + (((tickAnim - 113) / 3) * (0-(-0.2)));
        }
        else if (tickAnim >= 116 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 116) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 116) / 2) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 116) / 2) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 118) / 6) * (0-(0)));
            yy = -0.425 + (((tickAnim - 118) / 6) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 118) / 6) * (-0.4-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 127) {
            xx = 0 + (((tickAnim - 124) / 3) * (0-(0)));
            yy = -0.425 + (((tickAnim - 124) / 3) * (-0.725-(-0.425)));
            zz = -0.4 + (((tickAnim - 124) / 3) * (-0.2-(-0.4)));
        }
        else if (tickAnim >= 127 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 127) / 3) * (0-(0)));
            yy = -0.725 + (((tickAnim - 127) / 3) * (0-(-0.725)));
            zz = -0.2 + (((tickAnim - 127) / 3) * (0-(-0.2)));
        }
        else if (tickAnim >= 130 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 130) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 3) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 130) / 3) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 133) / 5) * (0-(0)));
            yy = -0.425 + (((tickAnim - 133) / 5) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 133) / 5) * (-0.4-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 138) / 3) * (0-(0)));
            yy = -0.425 + (((tickAnim - 138) / 3) * (-0.725-(-0.425)));
            zz = -0.4 + (((tickAnim - 138) / 3) * (-0.2-(-0.4)));
        }
        else if (tickAnim >= 141 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 141) / 3) * (0-(0)));
            yy = -0.725 + (((tickAnim - 141) / 3) * (0-(-0.725)));
            zz = -0.2 + (((tickAnim - 141) / 3) * (0-(-0.2)));
        }
        else if (tickAnim >= 144 && tickAnim < 147) {
            xx = 0 + (((tickAnim - 144) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 144) / 3) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 144) / 3) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            yy = -0.425 + (((tickAnim - 147) / 8) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (40-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 40 + (((tickAnim - 3) / 3) * (-10.25-(40)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -10.25 + (((tickAnim - 6) / 1) * (67.17-(-10.25)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 67.17 + (((tickAnim - 7) / 1) * (75.09-(67.17)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 75.09 + (((tickAnim - 8) / 1) * (82.25-(75.09)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 82.25 + (((tickAnim - 9) / 3) * (82.25-(82.25)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 82.25 + (((tickAnim - 12) / 1) * (81.27023-(82.25)));
            yy = 0 + (((tickAnim - 12) / 1) * (-1.93246-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0.81883-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 81.27023 + (((tickAnim - 13) / 1) * (45.16017-(81.27023)));
            yy = -1.93246 + (((tickAnim - 13) / 1) * (-1.44934-(-1.93246)));
            zz = 0.81883 + (((tickAnim - 13) / 1) * (0.61412-(0.81883)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 45.16017 + (((tickAnim - 14) / 1) * (-22.42-(45.16017)));
            yy = -1.44934 + (((tickAnim - 14) / 1) * (0-(-1.44934)));
            zz = 0.61412 + (((tickAnim - 14) / 1) * (0-(0.61412)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -22.42 + (((tickAnim - 15) / 3) * (40-(-22.42)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 40 + (((tickAnim - 18) / 2) * (-10.25-(40)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = -10.25 + (((tickAnim - 20) / 1) * (67.17-(-10.25)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 67.17 + (((tickAnim - 21) / 1) * (75.09-(67.17)));
            yy = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 1) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 75.09 + (((tickAnim - 22) / 1) * (82.25-(75.09)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 82.25 + (((tickAnim - 23) / 3) * (82.25-(82.25)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 82.25 + (((tickAnim - 26) / 2) * (81.27023-(82.25)));
            yy = 0 + (((tickAnim - 26) / 2) * (-1.93246-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0.81883-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = 81.27023 + (((tickAnim - 28) / 0) * (45.16017-(81.27023)));
            yy = -1.93246 + (((tickAnim - 28) / 0) * (-1.44934-(-1.93246)));
            zz = 0.81883 + (((tickAnim - 28) / 0) * (0.61412-(0.81883)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 45.16017 + (((tickAnim - 28) / 1) * (-22.42-(45.16017)));
            yy = -1.44934 + (((tickAnim - 28) / 1) * (0-(-1.44934)));
            zz = 0.61412 + (((tickAnim - 28) / 1) * (0-(0.61412)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = -22.42 + (((tickAnim - 29) / 3) * (40-(-22.42)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 40 + (((tickAnim - 32) / 2) * (-10.25-(40)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -10.25 + (((tickAnim - 34) / 1) * (67.17-(-10.25)));
            yy = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 1) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 67.17 + (((tickAnim - 35) / 1) * (75.09-(67.17)));
            yy = 0 + (((tickAnim - 35) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 1) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 75.09 + (((tickAnim - 36) / 2) * (82.25-(75.09)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 82.25 + (((tickAnim - 38) / 2) * (82.25-(82.25)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 82.25 + (((tickAnim - 40) / 2) * (81.27023-(82.25)));
            yy = 0 + (((tickAnim - 40) / 2) * (-1.93246-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0.81883-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 81.27023 + (((tickAnim - 42) / 1) * (45.16017-(81.27023)));
            yy = -1.93246 + (((tickAnim - 42) / 1) * (-1.44934-(-1.93246)));
            zz = 0.81883 + (((tickAnim - 42) / 1) * (0.61412-(0.81883)));
        }
        else if (tickAnim >= 43 && tickAnim < 43) {
            xx = 45.16017 + (((tickAnim - 43) / 0) * (-22.42-(45.16017)));
            yy = -1.44934 + (((tickAnim - 43) / 0) * (0-(-1.44934)));
            zz = 0.61412 + (((tickAnim - 43) / 0) * (0-(0.61412)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -22.42 + (((tickAnim - 43) / 3) * (40-(-22.42)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 40 + (((tickAnim - 46) / 4) * (66.75-(40)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 94) {
            xx = 66.75 + (((tickAnim - 50) / 44) * (66.75-(66.75)));
            yy = 0 + (((tickAnim - 50) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 44) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = 66.75 + (((tickAnim - 94) / 10) * (40-(66.75)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 10) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 107) {
            xx = 40 + (((tickAnim - 104) / 3) * (-10.25-(40)));
            yy = 0 + (((tickAnim - 104) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 3) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 108) {
            xx = -10.25 + (((tickAnim - 107) / 1) * (67.17-(-10.25)));
            yy = 0 + (((tickAnim - 107) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 1) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 108) {
            xx = 67.17 + (((tickAnim - 108) / 0) * (75.09-(67.17)));
            yy = 0 + (((tickAnim - 108) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 0) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 110) {
            xx = 75.09 + (((tickAnim - 108) / 2) * (82.25-(75.09)));
            yy = 0 + (((tickAnim - 108) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 2) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 113) {
            xx = 82.25 + (((tickAnim - 110) / 3) * (82.25-(82.25)));
            yy = 0 + (((tickAnim - 110) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 3) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 114) {
            xx = 82.25 + (((tickAnim - 113) / 1) * (81.27023-(82.25)));
            yy = 0 + (((tickAnim - 113) / 1) * (-1.93246-(0)));
            zz = 0 + (((tickAnim - 113) / 1) * (0.81883-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 115) {
            xx = 81.27023 + (((tickAnim - 114) / 1) * (45.16017-(81.27023)));
            yy = -1.93246 + (((tickAnim - 114) / 1) * (-1.44934-(-1.93246)));
            zz = 0.81883 + (((tickAnim - 114) / 1) * (0.61412-(0.81883)));
        }
        else if (tickAnim >= 115 && tickAnim < 116) {
            xx = 45.16017 + (((tickAnim - 115) / 1) * (-22.42-(45.16017)));
            yy = -1.44934 + (((tickAnim - 115) / 1) * (0-(-1.44934)));
            zz = 0.61412 + (((tickAnim - 115) / 1) * (0-(0.61412)));
        }
        else if (tickAnim >= 116 && tickAnim < 118) {
            xx = -22.42 + (((tickAnim - 116) / 2) * (40-(-22.42)));
            yy = 0 + (((tickAnim - 116) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 2) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 121) {
            xx = 40 + (((tickAnim - 118) / 3) * (-10.25-(40)));
            yy = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 3) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 122) {
            xx = -10.25 + (((tickAnim - 121) / 1) * (67.17-(-10.25)));
            yy = 0 + (((tickAnim - 121) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 1) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 123) {
            xx = 67.17 + (((tickAnim - 122) / 1) * (75.09-(67.17)));
            yy = 0 + (((tickAnim - 122) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 1) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 124) {
            xx = 75.09 + (((tickAnim - 123) / 1) * (82.25-(75.09)));
            yy = 0 + (((tickAnim - 123) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 1) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 127) {
            xx = 82.25 + (((tickAnim - 124) / 3) * (82.25-(82.25)));
            yy = 0 + (((tickAnim - 124) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 3) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 128) {
            xx = 82.25 + (((tickAnim - 127) / 1) * (81.27023-(82.25)));
            yy = 0 + (((tickAnim - 127) / 1) * (-1.93246-(0)));
            zz = 0 + (((tickAnim - 127) / 1) * (0.81883-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 129) {
            xx = 81.27023 + (((tickAnim - 128) / 1) * (45.16017-(81.27023)));
            yy = -1.93246 + (((tickAnim - 128) / 1) * (-1.44934-(-1.93246)));
            zz = 0.81883 + (((tickAnim - 128) / 1) * (0.61412-(0.81883)));
        }
        else if (tickAnim >= 129 && tickAnim < 130) {
            xx = 45.16017 + (((tickAnim - 129) / 1) * (-22.42-(45.16017)));
            yy = -1.44934 + (((tickAnim - 129) / 1) * (0-(-1.44934)));
            zz = 0.61412 + (((tickAnim - 129) / 1) * (0-(0.61412)));
        }
        else if (tickAnim >= 130 && tickAnim < 133) {
            xx = -22.42 + (((tickAnim - 130) / 3) * (40-(-22.42)));
            yy = 0 + (((tickAnim - 130) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 3) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 135) {
            xx = 40 + (((tickAnim - 133) / 2) * (-10.25-(40)));
            yy = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 2) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 137) {
            xx = -10.25 + (((tickAnim - 135) / 2) * (90.09-(-10.25)));
            yy = 0 + (((tickAnim - 135) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 2) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 138) {
            xx = 90.09 + (((tickAnim - 137) / 1) * (82.25-(90.09)));
            yy = 0 + (((tickAnim - 137) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 1) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 141) {
            xx = 82.25 + (((tickAnim - 138) / 3) * (82.25-(82.25)));
            yy = 0 + (((tickAnim - 138) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 3) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 143) {
            xx = 82.25 + (((tickAnim - 141) / 2) * (81.27023-(82.25)));
            yy = 0 + (((tickAnim - 141) / 2) * (-1.93246-(0)));
            zz = 0 + (((tickAnim - 141) / 2) * (0.81883-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 144) {
            xx = 81.27023 + (((tickAnim - 143) / 1) * (18.33-(81.27023)));
            yy = -1.93246 + (((tickAnim - 143) / 1) * (0-(-1.93246)));
            zz = 0.81883 + (((tickAnim - 143) / 1) * (0-(0.81883)));
        }
        else if (tickAnim >= 144 && tickAnim < 145) {
            xx = 18.33 + (((tickAnim - 144) / 1) * (-3.2-(18.33)));
            yy = 0 + (((tickAnim - 144) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 1) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 147) {
            xx = -3.2 + (((tickAnim - 145) / 2) * (40-(-3.2)));
            yy = 0 + (((tickAnim - 145) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 2) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = 40 + (((tickAnim - 147) / 8) * (0-(40)));
            yy = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.325 + (((tickAnim - 3) / 2) * (3.195-(0.325)));
            zz = 0 + (((tickAnim - 3) / 2) * (1.27-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 3.195 + (((tickAnim - 5) / 1) * (2.95-(3.195)));
            zz = 1.27 + (((tickAnim - 5) / 1) * (1.9-(1.27)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 2.95 + (((tickAnim - 6) / 2) * (0-(2.95)));
            zz = 1.9 + (((tickAnim - 6) / 2) * (0-(1.9)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 1) * (1.21-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 1.21 + (((tickAnim - 16) / 2) * (0.325-(1.21)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.325 + (((tickAnim - 18) / 1) * (3.195-(0.325)));
            zz = 0 + (((tickAnim - 18) / 1) * (1.27-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = 3.195 + (((tickAnim - 19) / 1) * (2.95-(3.195)));
            zz = 1.27 + (((tickAnim - 19) / 1) * (1.9-(1.27)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 2.95 + (((tickAnim - 20) / 2) * (0-(2.95)));
            zz = 1.9 + (((tickAnim - 20) / 2) * (0-(1.9)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 29) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 1) * (1.21-(0)));
            zz = 0 + (((tickAnim - 29) / 1) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            yy = 1.21 + (((tickAnim - 30) / 2) * (0.325-(1.21)));
            zz = 0 + (((tickAnim - 30) / 2) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = 0.325 + (((tickAnim - 32) / 1) * (3.195-(0.325)));
            zz = 0 + (((tickAnim - 32) / 1) * (1.27-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            yy = 3.195 + (((tickAnim - 33) / 1) * (2.95-(3.195)));
            zz = 1.27 + (((tickAnim - 33) / 1) * (1.9-(1.27)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 34) / 2) * (0-(0)));
            yy = 2.95 + (((tickAnim - 34) / 2) * (0-(2.95)));
            zz = 1.9 + (((tickAnim - 34) / 2) * (0-(1.9)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 43) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 1) * (1.21-(0)));
            zz = 0 + (((tickAnim - 43) / 1) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 44) / 2) * (0-(0)));
            yy = 1.21 + (((tickAnim - 44) / 2) * (0.325-(1.21)));
            zz = 0 + (((tickAnim - 44) / 2) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 46) / 58) * (0-(0)));
            yy = 0.325 + (((tickAnim - 46) / 58) * (0.325-(0.325)));
            zz = 0 + (((tickAnim - 46) / 58) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 104) / 2) * (0-(0)));
            yy = 0.325 + (((tickAnim - 104) / 2) * (3.195-(0.325)));
            zz = 0 + (((tickAnim - 104) / 2) * (1.27-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 106) / 1) * (0-(0)));
            yy = 3.195 + (((tickAnim - 106) / 1) * (2.95-(3.195)));
            zz = 1.27 + (((tickAnim - 106) / 1) * (1.9-(1.27)));
        }
        else if (tickAnim >= 107 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 107) / 1) * (0-(0)));
            yy = 2.95 + (((tickAnim - 107) / 1) * (0-(2.95)));
            zz = 1.9 + (((tickAnim - 107) / 1) * (0-(1.9)));
        }
        else if (tickAnim >= 108 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 108) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 108) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 5) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 114) {
            xx = 0 + (((tickAnim - 113) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 113) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 1) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 114) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 114) / 1) * (-0.355-(0)));
            zz = 0 + (((tickAnim - 114) / 1) * (0.37-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 115) / 1) * (0-(0)));
            yy = -0.355 + (((tickAnim - 115) / 1) * (0-(-0.355)));
            zz = 0.37 + (((tickAnim - 115) / 1) * (0-(0.37)));
        }
        else if (tickAnim >= 116 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 116) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 116) / 1) * (1.21-(0)));
            zz = 0 + (((tickAnim - 116) / 1) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 117) / 1) * (0-(0)));
            yy = 1.21 + (((tickAnim - 117) / 1) * (0.325-(1.21)));
            zz = 0 + (((tickAnim - 117) / 1) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 118) / 2) * (0-(0)));
            yy = 0.325 + (((tickAnim - 118) / 2) * (3.195-(0.325)));
            zz = 0 + (((tickAnim - 118) / 2) * (1.27-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 120) / 1) * (0-(0)));
            yy = 3.195 + (((tickAnim - 120) / 1) * (2.95-(3.195)));
            zz = 1.27 + (((tickAnim - 120) / 1) * (1.9-(1.27)));
        }
        else if (tickAnim >= 121 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 121) / 2) * (0-(0)));
            yy = 2.95 + (((tickAnim - 121) / 2) * (0-(2.95)));
            zz = 1.9 + (((tickAnim - 121) / 2) * (0-(1.9)));
        }
        else if (tickAnim >= 123 && tickAnim < 127) {
            xx = 0 + (((tickAnim - 123) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 123) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 4) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 127) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 127) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 1) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 128) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 128) / 1) * (-0.355-(0)));
            zz = 0 + (((tickAnim - 128) / 1) * (0.37-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 129) / 1) * (0-(0)));
            yy = -0.355 + (((tickAnim - 129) / 1) * (0-(-0.355)));
            zz = 0.37 + (((tickAnim - 129) / 1) * (0-(0.37)));
        }
        else if (tickAnim >= 130 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 130) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 1) * (1.21-(0)));
            zz = 0 + (((tickAnim - 130) / 1) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 131) / 2) * (0-(0)));
            yy = 1.21 + (((tickAnim - 131) / 2) * (0.325-(1.21)));
            zz = 0 + (((tickAnim - 131) / 2) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 133) / 1) * (0-(0)));
            yy = 0.325 + (((tickAnim - 133) / 1) * (0.85-(0.325)));
            zz = 0 + (((tickAnim - 133) / 1) * (0.75-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 134) / 1) * (0-(0)));
            yy = 0.85 + (((tickAnim - 134) / 1) * (0-(0.85)));
            zz = 0.75 + (((tickAnim - 134) / 1) * (0-(0.75)));
        }
        else if (tickAnim >= 135 && tickAnim < 137) {
            xx = 0 + (((tickAnim - 135) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 2) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 137) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 137) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 4) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 141) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 141) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 2) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 143) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 143) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 1) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 147) {
            xx = 0 + (((tickAnim - 144) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 144) / 3) * (0.325-(0)));
            zz = 0 + (((tickAnim - 144) / 3) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            yy = 0.325 + (((tickAnim - 147) / 8) * (0-(0.325)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (37.5-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 37.5 + (((tickAnim - 9) / 4) * (0-(37.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -21.75 + (((tickAnim - 14) / 1) * (0-(-21.75)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (37.5-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 37.5 + (((tickAnim - 23) / 5) * (0-(37.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 28) / 0) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 28) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 0) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -21.75 + (((tickAnim - 28) / 1) * (0-(-21.75)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 1) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (37.5-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 37.5 + (((tickAnim - 38) / 4) * (0-(37.5)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 42) / 1) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 43) {
            xx = -21.75 + (((tickAnim - 43) / 0) * (0-(-21.75)));
            yy = 0 + (((tickAnim - 43) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 0) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 46) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 61) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 107) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 107) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 1) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 108) / 2) * (37.5-(0)));
            yy = 0 + (((tickAnim - 108) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 2) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 114) {
            xx = 37.5 + (((tickAnim - 110) / 4) * (0-(37.5)));
            yy = 0 + (((tickAnim - 110) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 4) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 114) / 1) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 114) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 1) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 116) {
            xx = -21.75 + (((tickAnim - 115) / 1) * (0-(-21.75)));
            yy = 0 + (((tickAnim - 115) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 1) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 116) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 116) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 2) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 3) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 121) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 121) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 1) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 122) / 2) * (37.5-(0)));
            yy = 0 + (((tickAnim - 122) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 2) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 128) {
            xx = 37.5 + (((tickAnim - 124) / 4) * (0-(37.5)));
            yy = 0 + (((tickAnim - 124) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 4) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 128) / 1) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 128) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 1) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 130) {
            xx = -21.75 + (((tickAnim - 129) / 1) * (0-(-21.75)));
            yy = 0 + (((tickAnim - 129) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 1) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 130) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 3) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 2) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 135) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 1) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 136) / 2) * (37.5-(0)));
            yy = 0 + (((tickAnim - 136) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 2) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 143) {
            xx = 37.5 + (((tickAnim - 138) / 5) * (0-(37.5)));
            yy = 0 + (((tickAnim - 138) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 5) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 143) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 143) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 1) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 147) {
            xx = 0 + (((tickAnim - 144) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 144) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));

        animDispHelper(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, animTick, tickAnim, xx, yy, zz);

    }
    public void animDispHelper(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick, double tickAnim, double xx, double yy, double zz) {

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 1) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 46) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 61) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 107) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 107) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 1) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 108) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 108) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 2) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 114) {
            xx = 0 + (((tickAnim - 110) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 4) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 114) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 114) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 4) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 3) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 121) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 121) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 1) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 122) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 122) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 2) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 124) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 124) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 4) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 128) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 128) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 5) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 2) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 135) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 1) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 136) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 136) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 2) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 138) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 138) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 5) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 147) {
            xx = 0 + (((tickAnim - 143) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 143) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (12.44014-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.80779-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.52856-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 12.44014 + (((tickAnim - 3) / 3) * (-10.05986-(12.44014)));
            yy = -0.80779 + (((tickAnim - 3) / 3) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 3) / 3) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -10.05986 + (((tickAnim - 6) / 3) * (-28.80986-(-10.05986)));
            yy = -0.80779 + (((tickAnim - 6) / 3) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 6) / 3) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -28.80986 + (((tickAnim - 9) / 3) * (-0.55986-(-28.80986)));
            yy = -0.80779 + (((tickAnim - 9) / 3) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 9) / 3) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -0.55986 + (((tickAnim - 12) / 6) * (12.44014-(-0.55986)));
            yy = -0.80779 + (((tickAnim - 12) / 6) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 12) / 6) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 12.44014 + (((tickAnim - 18) / 2) * (-10.05986-(12.44014)));
            yy = -0.80779 + (((tickAnim - 18) / 2) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 18) / 2) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -10.05986 + (((tickAnim - 20) / 3) * (-28.80986-(-10.05986)));
            yy = -0.80779 + (((tickAnim - 20) / 3) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 20) / 3) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -28.80986 + (((tickAnim - 23) / 3) * (-0.55986-(-28.80986)));
            yy = -0.80779 + (((tickAnim - 23) / 3) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 23) / 3) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = -0.55986 + (((tickAnim - 26) / 6) * (12.44014-(-0.55986)));
            yy = -0.80779 + (((tickAnim - 26) / 6) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 26) / 6) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 12.44014 + (((tickAnim - 32) / 2) * (-10.05986-(12.44014)));
            yy = -0.80779 + (((tickAnim - 32) / 2) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 32) / 2) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -10.05986 + (((tickAnim - 34) / 4) * (-28.80986-(-10.05986)));
            yy = -0.80779 + (((tickAnim - 34) / 4) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 34) / 4) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -28.80986 + (((tickAnim - 38) / 2) * (-0.55986-(-28.80986)));
            yy = -0.80779 + (((tickAnim - 38) / 2) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 38) / 2) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = -0.55986 + (((tickAnim - 40) / 6) * (12.44014-(-0.55986)));
            yy = -0.80779 + (((tickAnim - 40) / 6) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 40) / 6) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 12.44014 + (((tickAnim - 46) / 4) * (14.75-(12.44014)));
            yy = -0.80779 + (((tickAnim - 46) / 4) * (0-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 46) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5-(0.52856)));
        }
        else if (tickAnim >= 50 && tickAnim < 94) {
            xx = 14.75 + (((tickAnim - 50) / 44) * (14.75-(14.75)));
            yy = 0 + (((tickAnim - 50) / 44) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5 + (((tickAnim - 50) / 44) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = 14.75 + (((tickAnim - 94) / 10) * (12.44014-(14.75)));
            yy = 0 + (((tickAnim - 94) / 10) * (-0.80779-(0)));
            zz = 0 + (((tickAnim - 94) / 10) * (0.52856-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 107) {
            xx = 12.44014 + (((tickAnim - 104) / 3) * (-10.05986-(12.44014)));
            yy = -0.80779 + (((tickAnim - 104) / 3) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 104) / 3) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 107 && tickAnim < 110) {
            xx = -10.05986 + (((tickAnim - 107) / 3) * (-28.80986-(-10.05986)));
            yy = -0.80779 + (((tickAnim - 107) / 3) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 107) / 3) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 110 && tickAnim < 113) {
            xx = -28.80986 + (((tickAnim - 110) / 3) * (-0.55986-(-28.80986)));
            yy = -0.80779 + (((tickAnim - 110) / 3) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 110) / 3) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 113 && tickAnim < 118) {
            xx = -0.55986 + (((tickAnim - 113) / 5) * (12.44014-(-0.55986)));
            yy = -0.80779 + (((tickAnim - 113) / 5) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 113) / 5) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 118 && tickAnim < 121) {
            xx = 12.44014 + (((tickAnim - 118) / 3) * (-10.05986-(12.44014)));
            yy = -0.80779 + (((tickAnim - 118) / 3) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 118) / 3) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 121 && tickAnim < 124) {
            xx = -10.05986 + (((tickAnim - 121) / 3) * (-28.80986-(-10.05986)));
            yy = -0.80779 + (((tickAnim - 121) / 3) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 121) / 3) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 124 && tickAnim < 127) {
            xx = -28.80986 + (((tickAnim - 124) / 3) * (-0.55986-(-28.80986)));
            yy = -0.80779 + (((tickAnim - 124) / 3) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 124) / 3) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 127 && tickAnim < 133) {
            xx = -0.55986 + (((tickAnim - 127) / 6) * (12.44014-(-0.55986)));
            yy = -0.80779 + (((tickAnim - 127) / 6) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 127) / 6) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 133 && tickAnim < 135) {
            xx = 12.44014 + (((tickAnim - 133) / 2) * (-10.05986-(12.44014)));
            yy = -0.80779 + (((tickAnim - 133) / 2) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 133) / 2) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = -10.05986 + (((tickAnim - 135) / 3) * (-28.80986-(-10.05986)));
            yy = -0.80779 + (((tickAnim - 135) / 3) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 135) / 3) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 138 && tickAnim < 141) {
            xx = -28.80986 + (((tickAnim - 138) / 3) * (-9.80986-(-28.80986)));
            yy = -0.80779 + (((tickAnim - 138) / 3) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 138) / 3) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 141 && tickAnim < 147) {
            xx = -9.80986 + (((tickAnim - 141) / 6) * (12.44014-(-9.80986)));
            yy = -0.80779 + (((tickAnim - 141) / 6) * (-0.80779-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 141) / 6) * (0.52856-(0.52856)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = 12.44014 + (((tickAnim - 147) / 8) * (0-(12.44014)));
            yy = -0.80779 + (((tickAnim - 147) / 8) * (0-(-0.80779)));
            zz = 0.52856 + (((tickAnim - 147) / 8) * (0-(0.52856)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 27.25 + (((tickAnim - 3) / 3) * (14.5-(27.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 14.5 + (((tickAnim - 6) / 3) * (-14.5-(14.5)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -14.5 + (((tickAnim - 9) / 3) * (-25.25-(-14.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -25.25 + (((tickAnim - 12) / 6) * (27.25-(-25.25)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 27.25 + (((tickAnim - 18) / 2) * (14.5-(27.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 14.5 + (((tickAnim - 20) / 3) * (-14.5-(14.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -14.5 + (((tickAnim - 23) / 3) * (-25.25-(-14.5)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = -25.25 + (((tickAnim - 26) / 6) * (27.25-(-25.25)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 27.25 + (((tickAnim - 32) / 2) * (14.5-(27.25)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 14.5 + (((tickAnim - 34) / 4) * (-14.5-(14.5)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -14.5 + (((tickAnim - 38) / 2) * (-25.25-(-14.5)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = -25.25 + (((tickAnim - 40) / 6) * (27.25-(-25.25)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 27.25 + (((tickAnim - 46) / 4) * (18.25-(27.25)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*10-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 94) {
            xx = 18.25 + (((tickAnim - 50) / 44) * (18.25-(18.25)));
            yy = 0 + (((tickAnim - 50) / 44) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*10 + (((tickAnim - 50) / 44) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*10)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = 18.25 + (((tickAnim - 94) / 10) * (27.25-(18.25)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*10 + (((tickAnim - 94) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*10)));
        }
        else if (tickAnim >= 104 && tickAnim < 107) {
            xx = 27.25 + (((tickAnim - 104) / 3) * (14.5-(27.25)));
            yy = 0 + (((tickAnim - 104) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 3) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 110) {
            xx = 14.5 + (((tickAnim - 107) / 3) * (-14.5-(14.5)));
            yy = 0 + (((tickAnim - 107) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 3) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 113) {
            xx = -14.5 + (((tickAnim - 110) / 3) * (-25.25-(-14.5)));
            yy = 0 + (((tickAnim - 110) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 3) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 118) {
            xx = -25.25 + (((tickAnim - 113) / 5) * (27.25-(-25.25)));
            yy = 0 + (((tickAnim - 113) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 5) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 121) {
            xx = 27.25 + (((tickAnim - 118) / 3) * (14.5-(27.25)));
            yy = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 3) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 124) {
            xx = 14.5 + (((tickAnim - 121) / 3) * (-14.5-(14.5)));
            yy = 0 + (((tickAnim - 121) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 3) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 127) {
            xx = -14.5 + (((tickAnim - 124) / 3) * (-25.25-(-14.5)));
            yy = 0 + (((tickAnim - 124) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 3) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 133) {
            xx = -25.25 + (((tickAnim - 127) / 6) * (27.25-(-25.25)));
            yy = 0 + (((tickAnim - 127) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 6) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 135) {
            xx = 27.25 + (((tickAnim - 133) / 2) * (14.5-(27.25)));
            yy = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 2) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = 14.5 + (((tickAnim - 135) / 3) * (-14.5-(14.5)));
            yy = 0 + (((tickAnim - 135) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 3) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 141) {
            xx = -14.5 + (((tickAnim - 138) / 3) * (-38.25-(-14.5)));
            yy = 0 + (((tickAnim - 138) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 3) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 147) {
            xx = -38.25 + (((tickAnim - 141) / 6) * (27.25-(-38.25)));
            yy = 0 + (((tickAnim - 141) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 6) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = 27.25 + (((tickAnim - 147) / 8) * (0-(27.25)));
            yy = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (34-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 34 + (((tickAnim - 3) / 3) * (61.75-(34)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 61.75 + (((tickAnim - 6) / 2) * (20.4568-(61.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (1.28312-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0.59806-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 20.4568 + (((tickAnim - 8) / 1) * (33.16361-(20.4568)));
            yy = 1.28312 + (((tickAnim - 8) / 1) * (2.56624-(1.28312)));
            zz = 0.59806 + (((tickAnim - 8) / 1) * (1.19613-(0.59806)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 33.16361 + (((tickAnim - 9) / 3) * (-19.33639-(33.16361)));
            yy = 2.56624 + (((tickAnim - 9) / 3) * (2.56624-(2.56624)));
            zz = 1.19613 + (((tickAnim - 9) / 3) * (1.19613-(1.19613)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -19.33639 + (((tickAnim - 12) / 6) * (34-(-19.33639)));
            yy = 2.56624 + (((tickAnim - 12) / 6) * (0-(2.56624)));
            zz = 1.19613 + (((tickAnim - 12) / 6) * (0-(1.19613)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 34 + (((tickAnim - 18) / 2) * (61.75-(34)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 61.75 + (((tickAnim - 20) / 2) * (20.4568-(61.75)));
            yy = 0 + (((tickAnim - 20) / 2) * (1.28312-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0.59806-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 20.4568 + (((tickAnim - 22) / 1) * (33.16361-(20.4568)));
            yy = 1.28312 + (((tickAnim - 22) / 1) * (2.56624-(1.28312)));
            zz = 0.59806 + (((tickAnim - 22) / 1) * (1.19613-(0.59806)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 33.16361 + (((tickAnim - 23) / 3) * (-19.33639-(33.16361)));
            yy = 2.56624 + (((tickAnim - 23) / 3) * (2.56624-(2.56624)));
            zz = 1.19613 + (((tickAnim - 23) / 3) * (1.19613-(1.19613)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = -19.33639 + (((tickAnim - 26) / 6) * (34-(-19.33639)));
            yy = 2.56624 + (((tickAnim - 26) / 6) * (0-(2.56624)));
            zz = 1.19613 + (((tickAnim - 26) / 6) * (0-(1.19613)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 34 + (((tickAnim - 32) / 2) * (61.75-(34)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = 61.75 + (((tickAnim - 34) / 2) * (20.4568-(61.75)));
            yy = 0 + (((tickAnim - 34) / 2) * (1.28312-(0)));
            zz = 0 + (((tickAnim - 34) / 2) * (0.59806-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 20.4568 + (((tickAnim - 36) / 2) * (33.16361-(20.4568)));
            yy = 1.28312 + (((tickAnim - 36) / 2) * (2.56624-(1.28312)));
            zz = 0.59806 + (((tickAnim - 36) / 2) * (1.19613-(0.59806)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 33.16361 + (((tickAnim - 38) / 2) * (-19.33639-(33.16361)));
            yy = 2.56624 + (((tickAnim - 38) / 2) * (2.56624-(2.56624)));
            zz = 1.19613 + (((tickAnim - 38) / 2) * (1.19613-(1.19613)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = -19.33639 + (((tickAnim - 40) / 6) * (34-(-19.33639)));
            yy = 2.56624 + (((tickAnim - 40) / 6) * (0-(2.56624)));
            zz = 1.19613 + (((tickAnim - 40) / 6) * (0-(1.19613)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 34 + (((tickAnim - 46) / 2) * (49.8-(34)));
            yy = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 49.8 + (((tickAnim - 48) / 2) * (42.75-(49.8)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*10-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 94) {
            xx = 42.75 + (((tickAnim - 50) / 44) * (42.75-(42.75)));
            yy = 0 + (((tickAnim - 50) / 44) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*10 + (((tickAnim - 50) / 44) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*10)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = 42.75 + (((tickAnim - 94) / 10) * (34-(42.75)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*10 + (((tickAnim - 94) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-200))*10)));
        }
        else if (tickAnim >= 104 && tickAnim < 107) {
            xx = 34 + (((tickAnim - 104) / 3) * (61.75-(34)));
            yy = 0 + (((tickAnim - 104) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 3) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 108) {
            xx = 61.75 + (((tickAnim - 107) / 1) * (20.4568-(61.75)));
            yy = 0 + (((tickAnim - 107) / 1) * (1.28312-(0)));
            zz = 0 + (((tickAnim - 107) / 1) * (0.59806-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 110) {
            xx = 20.4568 + (((tickAnim - 108) / 2) * (33.16361-(20.4568)));
            yy = 1.28312 + (((tickAnim - 108) / 2) * (2.56624-(1.28312)));
            zz = 0.59806 + (((tickAnim - 108) / 2) * (1.19613-(0.59806)));
        }
        else if (tickAnim >= 110 && tickAnim < 113) {
            xx = 33.16361 + (((tickAnim - 110) / 3) * (-19.33639-(33.16361)));
            yy = 2.56624 + (((tickAnim - 110) / 3) * (2.56624-(2.56624)));
            zz = 1.19613 + (((tickAnim - 110) / 3) * (1.19613-(1.19613)));
        }
        else if (tickAnim >= 113 && tickAnim < 118) {
            xx = -19.33639 + (((tickAnim - 113) / 5) * (34-(-19.33639)));
            yy = 2.56624 + (((tickAnim - 113) / 5) * (0-(2.56624)));
            zz = 1.19613 + (((tickAnim - 113) / 5) * (0-(1.19613)));
        }
        else if (tickAnim >= 118 && tickAnim < 121) {
            xx = 34 + (((tickAnim - 118) / 3) * (61.75-(34)));
            yy = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 3) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 123) {
            xx = 61.75 + (((tickAnim - 121) / 2) * (20.4568-(61.75)));
            yy = 0 + (((tickAnim - 121) / 2) * (1.28312-(0)));
            zz = 0 + (((tickAnim - 121) / 2) * (0.59806-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 124) {
            xx = 20.4568 + (((tickAnim - 123) / 1) * (33.16361-(20.4568)));
            yy = 1.28312 + (((tickAnim - 123) / 1) * (2.56624-(1.28312)));
            zz = 0.59806 + (((tickAnim - 123) / 1) * (1.19613-(0.59806)));
        }
        else if (tickAnim >= 124 && tickAnim < 127) {
            xx = 33.16361 + (((tickAnim - 124) / 3) * (-19.33639-(33.16361)));
            yy = 2.56624 + (((tickAnim - 124) / 3) * (2.56624-(2.56624)));
            zz = 1.19613 + (((tickAnim - 124) / 3) * (1.19613-(1.19613)));
        }
        else if (tickAnim >= 127 && tickAnim < 133) {
            xx = -19.33639 + (((tickAnim - 127) / 6) * (34-(-19.33639)));
            yy = 2.56624 + (((tickAnim - 127) / 6) * (0-(2.56624)));
            zz = 1.19613 + (((tickAnim - 127) / 6) * (0-(1.19613)));
        }
        else if (tickAnim >= 133 && tickAnim < 135) {
            xx = 34 + (((tickAnim - 133) / 2) * (61.75-(34)));
            yy = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 2) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = 61.75 + (((tickAnim - 135) / 3) * (33.16361-(61.75)));
            yy = 0 + (((tickAnim - 135) / 3) * (2.56624-(0)));
            zz = 0 + (((tickAnim - 135) / 3) * (1.19613-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 141) {
            xx = 33.16361 + (((tickAnim - 138) / 3) * (-19.33639-(33.16361)));
            yy = 2.56624 + (((tickAnim - 138) / 3) * (2.56624-(2.56624)));
            zz = 1.19613 + (((tickAnim - 138) / 3) * (1.19613-(1.19613)));
        }
        else if (tickAnim >= 141 && tickAnim < 147) {
            xx = -19.33639 + (((tickAnim - 141) / 6) * (34-(-19.33639)));
            yy = 2.56624 + (((tickAnim - 141) / 6) * (0-(2.56624)));
            zz = 1.19613 + (((tickAnim - 141) / 6) * (0-(1.19613)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = 34 + (((tickAnim - 147) / 8) * (0-(34)));
            yy = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.525-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = -0.525 + (((tickAnim - 3) / 3) * (-1.12-(-0.525)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = -1.12 + (((tickAnim - 6) / 3) * (-0.4-(-1.12)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = -0.4 + (((tickAnim - 9) / 3) * (0-(-0.4)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (-0.525-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = -0.525 + (((tickAnim - 18) / 2) * (-1.12-(-0.525)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = -1.12 + (((tickAnim - 20) / 3) * (-0.4-(-1.12)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = -0.4 + (((tickAnim - 23) / 3) * (0-(-0.4)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (-0.525-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = -0.525 + (((tickAnim - 32) / 2) * (-1.12-(-0.525)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = -1.12 + (((tickAnim - 34) / 4) * (-0.4-(-1.12)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = -0.4 + (((tickAnim - 38) / 2) * (0-(-0.4)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (-0.525-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = -0.525 + (((tickAnim - 46) / 4) * (-0.75-(-0.525)));
        }
        else if (tickAnim >= 50 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 50) / 44) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 44) * (0-(0)));
            zz = -0.75 + (((tickAnim - 50) / 44) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = -0.75 + (((tickAnim - 94) / 10) * (-0.525-(-0.75)));
        }
        else if (tickAnim >= 104 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 104) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 104) / 3) * (0-(0)));
            zz = -0.525 + (((tickAnim - 104) / 3) * (-1.12-(-0.525)));
        }
        else if (tickAnim >= 107 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 107) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 107) / 3) * (0-(0)));
            zz = -1.12 + (((tickAnim - 107) / 3) * (-0.4-(-1.12)));
        }
        else if (tickAnim >= 110 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 110) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 3) * (0-(0)));
            zz = -0.4 + (((tickAnim - 110) / 3) * (0-(-0.4)));
        }
        else if (tickAnim >= 113 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 113) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 113) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 5) * (-0.525-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            zz = -0.525 + (((tickAnim - 118) / 3) * (-1.12-(-0.525)));
        }
        else if (tickAnim >= 121 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 121) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 121) / 3) * (0-(0)));
            zz = -1.12 + (((tickAnim - 121) / 3) * (-0.4-(-1.12)));
        }
        else if (tickAnim >= 124 && tickAnim < 127) {
            xx = 0 + (((tickAnim - 124) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 124) / 3) * (0-(0)));
            zz = -0.4 + (((tickAnim - 124) / 3) * (0-(-0.4)));
        }
        else if (tickAnim >= 127 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 127) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 127) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 6) * (-0.525-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            zz = -0.525 + (((tickAnim - 133) / 2) * (-1.12-(-0.525)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 135) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 3) * (0-(0)));
            zz = -1.12 + (((tickAnim - 135) / 3) * (-0.4-(-1.12)));
        }
        else if (tickAnim >= 138 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 138) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 138) / 3) * (0-(0)));
            zz = -0.4 + (((tickAnim - 138) / 3) * (0-(-0.4)));
        }
        else if (tickAnim >= 141 && tickAnim < 147) {
            xx = 0 + (((tickAnim - 141) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 141) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 6) * (-0.525-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            zz = -0.525 + (((tickAnim - 147) / 8) * (0-(-0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 14 + (((tickAnim - 3) / 2) * (0-(14)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (19-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 19 + (((tickAnim - 9) / 9) * (14-(19)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 14 + (((tickAnim - 18) / 1) * (0-(14)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (19-(0)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 19 + (((tickAnim - 23) / 3) * (0-(19)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (14-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 14 + (((tickAnim - 32) / 1) * (0-(14)));
            yy = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (19-(0)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 19 + (((tickAnim - 38) / 8) * (14-(19)));
            yy = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*0.5-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 94) {
            xx = 14 + (((tickAnim - 46) / 48) * (14-(14)));
            yy = 0 + (((tickAnim - 46) / 48) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*0.5 + (((tickAnim - 46) / 48) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*0.5)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = 14 + (((tickAnim - 94) / 10) * (14-(14)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*0.5 + (((tickAnim - 94) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*0.5)));
        }
        else if (tickAnim >= 104 && tickAnim < 106) {
            xx = 14 + (((tickAnim - 104) / 2) * (0-(14)));
            yy = 0 + (((tickAnim - 104) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 2) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 106) / 4) * (19-(0)));
            yy = 0 + (((tickAnim - 106) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 4) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 118) {
            xx = 19 + (((tickAnim - 110) / 8) * (14-(19)));
            yy = 0 + (((tickAnim - 110) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 8) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 120) {
            xx = 14 + (((tickAnim - 118) / 2) * (0-(14)));
            yy = 0 + (((tickAnim - 118) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 2) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 120) / 4) * (19-(0)));
            yy = 0 + (((tickAnim - 120) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 4) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 133) {
            xx = 19 + (((tickAnim - 124) / 9) * (14-(19)));
            yy = 0 + (((tickAnim - 124) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 9) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 134) {
            xx = 14 + (((tickAnim - 133) / 1) * (0-(14)));
            yy = 0 + (((tickAnim - 133) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 1) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 134) / 4) * (19-(0)));
            yy = 0 + (((tickAnim - 134) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 4) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 147) {
            xx = 19 + (((tickAnim - 138) / 9) * (14-(19)));
            yy = 0 + (((tickAnim - 138) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 9) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = 14 + (((tickAnim - 147) / 8) * (0-(14)));
            yy = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 8.25 + (((tickAnim - 3) / 2) * (0-(8.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (21-(0)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 21 + (((tickAnim - 14) / 4) * (8.25-(21)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 8.25 + (((tickAnim - 18) / 1) * (0-(8.25)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (21-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 21 + (((tickAnim - 28) / 4) * (8.25-(21)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 8.25 + (((tickAnim - 32) / 1) * (0-(8.25)));
            yy = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (21-(0)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 21 + (((tickAnim - 43) / 3) * (8.25-(21)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 8.25 + (((tickAnim - 46) / 4) * (-6.75-(8.25)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 94) {
            xx = -6.75 + (((tickAnim - 50) / 44) * (-17.25-(-6.75)));
            yy = 0 + (((tickAnim - 50) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 44) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = -17.25 + (((tickAnim - 94) / 10) * (8.25-(-17.25)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 10) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 106) {
            xx = 8.25 + (((tickAnim - 104) / 2) * (0-(8.25)));
            yy = 0 + (((tickAnim - 104) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 2) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 106) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 4) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 110) / 5) * (21-(0)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 118) {
            xx = 21 + (((tickAnim - 115) / 3) * (8.25-(21)));
            yy = 0 + (((tickAnim - 115) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 3) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 120) {
            xx = 8.25 + (((tickAnim - 118) / 2) * (0-(8.25)));
            yy = 0 + (((tickAnim - 118) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 2) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 120) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 4) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 124) / 5) * (21-(0)));
            yy = 0 + (((tickAnim - 124) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 5) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 133) {
            xx = 21 + (((tickAnim - 129) / 4) * (8.25-(21)));
            yy = 0 + (((tickAnim - 129) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 4) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 134) {
            xx = 8.25 + (((tickAnim - 133) / 1) * (0-(8.25)));
            yy = 0 + (((tickAnim - 133) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 1) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 134) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 134) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 4) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 138) / 5) * (21-(0)));
            yy = 0 + (((tickAnim - 138) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 5) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 147) {
            xx = 21 + (((tickAnim - 143) / 4) * (8.25-(21)));
            yy = 0 + (((tickAnim - 143) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 4) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = 8.25 + (((tickAnim - 147) / 8) * (0-(8.25)));
            yy = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = -18.25 + (((tickAnim - 3) / 6) * (-14.75-(-18.25)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -14.75 + (((tickAnim - 9) / 5) * (-12.5-(-14.75)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -12.5 + (((tickAnim - 14) / 4) * (-18.25-(-12.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -18.25 + (((tickAnim - 18) / 5) * (-14.75-(-18.25)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -14.75 + (((tickAnim - 23) / 5) * (-12.5-(-14.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -12.5 + (((tickAnim - 28) / 4) * (-18.25-(-12.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -18.25 + (((tickAnim - 32) / 6) * (-14.75-(-18.25)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -14.75 + (((tickAnim - 38) / 5) * (-12.5-(-14.75)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -12.5 + (((tickAnim - 43) / 3) * (-18.25-(-12.5)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -18.25 + (((tickAnim - 46) / 4) * (-18.25-(-18.25)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 94) {
            xx = -18.25 + (((tickAnim - 50) / 44) * (-18.25-(-18.25)));
            yy = 0 + (((tickAnim - 50) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 44) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = -18.25 + (((tickAnim - 94) / 10) * (-18.25-(-18.25)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 10) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 110) {
            xx = -18.25 + (((tickAnim - 104) / 6) * (-14.75-(-18.25)));
            yy = 0 + (((tickAnim - 104) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 6) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = -14.75 + (((tickAnim - 110) / 5) * (-12.5-(-14.75)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 118) {
            xx = -12.5 + (((tickAnim - 115) / 3) * (-18.25-(-12.5)));
            yy = 0 + (((tickAnim - 115) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 3) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 124) {
            xx = -18.25 + (((tickAnim - 118) / 6) * (-14.75-(-18.25)));
            yy = 0 + (((tickAnim - 118) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 6) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 129) {
            xx = -14.75 + (((tickAnim - 124) / 5) * (-12.5-(-14.75)));
            yy = 0 + (((tickAnim - 124) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 5) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 133) {
            xx = -12.5 + (((tickAnim - 129) / 4) * (-18.25-(-12.5)));
            yy = 0 + (((tickAnim - 129) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 4) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 138) {
            xx = -18.25 + (((tickAnim - 133) / 5) * (-14.75-(-18.25)));
            yy = 0 + (((tickAnim - 133) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 5) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 143) {
            xx = -14.75 + (((tickAnim - 138) / 5) * (-12.5-(-14.75)));
            yy = 0 + (((tickAnim - 138) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 5) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 147) {
            xx = -12.5 + (((tickAnim - 143) / 4) * (-18.25-(-12.5)));
            yy = 0 + (((tickAnim - 143) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 4) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = -18.25 + (((tickAnim - 147) / 8) * (0-(-18.25)));
            yy = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -21.75 + (((tickAnim - 3) / 3) * (-12.75-(-21.75)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -12.75 + (((tickAnim - 6) / 3) * (-18.75-(-12.75)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -18.75 + (((tickAnim - 9) / 5) * (-30.25-(-18.75)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -30.25 + (((tickAnim - 14) / 4) * (-21.75-(-30.25)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -21.75 + (((tickAnim - 18) / 2) * (-12.75-(-21.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -12.75 + (((tickAnim - 20) / 3) * (-18.75-(-12.75)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -18.75 + (((tickAnim - 23) / 5) * (-30.25-(-18.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -30.25 + (((tickAnim - 28) / 4) * (-21.75-(-30.25)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = -21.75 + (((tickAnim - 32) / 2) * (-12.75-(-21.75)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -12.75 + (((tickAnim - 34) / 4) * (-18.75-(-12.75)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -18.75 + (((tickAnim - 38) / 5) * (-30.25-(-18.75)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -30.25 + (((tickAnim - 43) / 3) * (-21.75-(-30.25)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 94) {
            xx = -21.75 + (((tickAnim - 46) / 48) * (-24.5-(-21.75)));
            yy = 0 + (((tickAnim - 46) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 48) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = -24.5 + (((tickAnim - 94) / 10) * (-21.75-(-24.5)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 10) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 107) {
            xx = -21.75 + (((tickAnim - 104) / 3) * (-12.75-(-21.75)));
            yy = 0 + (((tickAnim - 104) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 3) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 110) {
            xx = -12.75 + (((tickAnim - 107) / 3) * (-18.75-(-12.75)));
            yy = 0 + (((tickAnim - 107) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 3) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = -18.75 + (((tickAnim - 110) / 5) * (-30.25-(-18.75)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 118) {
            xx = -30.25 + (((tickAnim - 115) / 3) * (-21.75-(-30.25)));
            yy = 0 + (((tickAnim - 115) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 3) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 121) {
            xx = -21.75 + (((tickAnim - 118) / 3) * (-12.75-(-21.75)));
            yy = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 3) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 124) {
            xx = -12.75 + (((tickAnim - 121) / 3) * (-18.75-(-12.75)));
            yy = 0 + (((tickAnim - 121) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 3) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 129) {
            xx = -18.75 + (((tickAnim - 124) / 5) * (-30.25-(-18.75)));
            yy = 0 + (((tickAnim - 124) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 5) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 133) {
            xx = -30.25 + (((tickAnim - 129) / 4) * (-21.75-(-30.25)));
            yy = 0 + (((tickAnim - 129) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 4) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 135) {
            xx = -21.75 + (((tickAnim - 133) / 2) * (-12.75-(-21.75)));
            yy = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 2) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = -12.75 + (((tickAnim - 135) / 3) * (-18.75-(-12.75)));
            yy = 0 + (((tickAnim - 135) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 3) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 143) {
            xx = -18.75 + (((tickAnim - 138) / 5) * (-30.25-(-18.75)));
            yy = 0 + (((tickAnim - 138) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 5) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 147) {
            xx = -30.25 + (((tickAnim - 143) / 4) * (-21.75-(-30.25)));
            yy = 0 + (((tickAnim - 143) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 4) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = -21.75 + (((tickAnim - 147) / 8) * (0-(-21.75)));
            yy = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.125-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = -0.625 + (((tickAnim - 3) / 6) * (-0.725-(-0.625)));
            zz = 0.125 + (((tickAnim - 3) / 6) * (0.15-(0.125)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = -0.725 + (((tickAnim - 9) / 5) * (-1.025-(-0.725)));
            zz = 0.15 + (((tickAnim - 9) / 5) * (0.075-(0.15)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -1.025 + (((tickAnim - 14) / 4) * (-0.625-(-1.025)));
            zz = 0.075 + (((tickAnim - 14) / 4) * (0.125-(0.075)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -0.625 + (((tickAnim - 18) / 5) * (-0.725-(-0.625)));
            zz = 0.125 + (((tickAnim - 18) / 5) * (0.15-(0.125)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = -0.725 + (((tickAnim - 23) / 5) * (-1.025-(-0.725)));
            zz = 0.15 + (((tickAnim - 23) / 5) * (0.075-(0.15)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = -1.025 + (((tickAnim - 28) / 4) * (-0.625-(-1.025)));
            zz = 0.075 + (((tickAnim - 28) / 4) * (0.125-(0.075)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = -0.625 + (((tickAnim - 32) / 6) * (-0.725-(-0.625)));
            zz = 0.125 + (((tickAnim - 32) / 6) * (0.15-(0.125)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = -0.725 + (((tickAnim - 38) / 5) * (-1.025-(-0.725)));
            zz = 0.15 + (((tickAnim - 38) / 5) * (0.075-(0.15)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            yy = -1.025 + (((tickAnim - 43) / 3) * (-0.625-(-1.025)));
            zz = 0.075 + (((tickAnim - 43) / 3) * (0.125-(0.075)));
        }
        else if (tickAnim >= 46 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 46) / 48) * (0-(0)));
            yy = -0.625 + (((tickAnim - 46) / 48) * (-1.245-(-0.625)));
            zz = 0.125 + (((tickAnim - 46) / 48) * (0.13-(0.125)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            yy = -1.245 + (((tickAnim - 94) / 10) * (-0.625-(-1.245)));
            zz = 0.13 + (((tickAnim - 94) / 10) * (0.125-(0.13)));
        }
        else if (tickAnim >= 104 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 104) / 6) * (0-(0)));
            yy = -0.625 + (((tickAnim - 104) / 6) * (-0.725-(-0.625)));
            zz = 0.125 + (((tickAnim - 104) / 6) * (0.15-(0.125)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            yy = -0.725 + (((tickAnim - 110) / 5) * (-1.025-(-0.725)));
            zz = 0.15 + (((tickAnim - 110) / 5) * (0.075-(0.15)));
        }
        else if (tickAnim >= 115 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 115) / 3) * (0-(0)));
            yy = -1.025 + (((tickAnim - 115) / 3) * (-0.625-(-1.025)));
            zz = 0.075 + (((tickAnim - 115) / 3) * (0.125-(0.075)));
        }
        else if (tickAnim >= 118 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 118) / 6) * (0-(0)));
            yy = -0.625 + (((tickAnim - 118) / 6) * (-0.725-(-0.625)));
            zz = 0.125 + (((tickAnim - 118) / 6) * (0.15-(0.125)));
        }
        else if (tickAnim >= 124 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 124) / 5) * (0-(0)));
            yy = -0.725 + (((tickAnim - 124) / 5) * (-1.025-(-0.725)));
            zz = 0.15 + (((tickAnim - 124) / 5) * (0.075-(0.15)));
        }
        else if (tickAnim >= 129 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 129) / 4) * (0-(0)));
            yy = -1.025 + (((tickAnim - 129) / 4) * (-0.625-(-1.025)));
            zz = 0.075 + (((tickAnim - 129) / 4) * (0.125-(0.075)));
        }
        else if (tickAnim >= 133 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 133) / 5) * (0-(0)));
            yy = -0.625 + (((tickAnim - 133) / 5) * (-0.725-(-0.625)));
            zz = 0.125 + (((tickAnim - 133) / 5) * (0.15-(0.125)));
        }
        else if (tickAnim >= 138 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 138) / 5) * (0-(0)));
            yy = -0.725 + (((tickAnim - 138) / 5) * (-1.025-(-0.725)));
            zz = 0.15 + (((tickAnim - 138) / 5) * (0.075-(0.15)));
        }
        else if (tickAnim >= 143 && tickAnim < 147) {
            xx = 0 + (((tickAnim - 143) / 4) * (0-(0)));
            yy = -1.025 + (((tickAnim - 143) / 4) * (-0.625-(-1.025)));
            zz = 0.075 + (((tickAnim - 143) / 4) * (0.125-(0.075)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            yy = -0.625 + (((tickAnim - 147) / 8) * (0-(-0.625)));
            zz = 0.125 + (((tickAnim - 147) / 8) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -5.5 + (((tickAnim - 3) / 3) * (14.75-(-5.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 14.75 + (((tickAnim - 6) / 3) * (19.75-(14.75)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 19.75 + (((tickAnim - 9) / 5) * (-15-(19.75)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -15 + (((tickAnim - 14) / 4) * (-5.5-(-15)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5.5 + (((tickAnim - 18) / 2) * (14.75-(-5.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 14.75 + (((tickAnim - 20) / 3) * (19.75-(14.75)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 19.75 + (((tickAnim - 23) / 5) * (-15-(19.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -15 + (((tickAnim - 28) / 4) * (-5.5-(-15)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = -5.5 + (((tickAnim - 32) / 2) * (14.75-(-5.5)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 14.75 + (((tickAnim - 34) / 4) * (19.75-(14.75)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 19.75 + (((tickAnim - 38) / 5) * (-15-(19.75)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -15 + (((tickAnim - 43) / 3) * (-5.5-(-15)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 94) {
            xx = -5.5 + (((tickAnim - 46) / 48) * (-29-(-5.5)));
            yy = 0 + (((tickAnim - 46) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 48) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = -29 + (((tickAnim - 94) / 10) * (-5.5-(-29)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 10) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 107) {
            xx = -5.5 + (((tickAnim - 104) / 3) * (14.75-(-5.5)));
            yy = 0 + (((tickAnim - 104) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 3) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 110) {
            xx = 14.75 + (((tickAnim - 107) / 3) * (19.75-(14.75)));
            yy = 0 + (((tickAnim - 107) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 3) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = 19.75 + (((tickAnim - 110) / 5) * (-15-(19.75)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 118) {
            xx = -15 + (((tickAnim - 115) / 3) * (-5.5-(-15)));
            yy = 0 + (((tickAnim - 115) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 3) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 121) {
            xx = -5.5 + (((tickAnim - 118) / 3) * (14.75-(-5.5)));
            yy = 0 + (((tickAnim - 118) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 3) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 124) {
            xx = 14.75 + (((tickAnim - 121) / 3) * (19.75-(14.75)));
            yy = 0 + (((tickAnim - 121) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 3) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 129) {
            xx = 19.75 + (((tickAnim - 124) / 5) * (-15-(19.75)));
            yy = 0 + (((tickAnim - 124) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 5) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 133) {
            xx = -15 + (((tickAnim - 129) / 4) * (-5.5-(-15)));
            yy = 0 + (((tickAnim - 129) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 4) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 135) {
            xx = -5.5 + (((tickAnim - 133) / 2) * (14.75-(-5.5)));
            yy = 0 + (((tickAnim - 133) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 2) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = 14.75 + (((tickAnim - 135) / 3) * (19.75-(14.75)));
            yy = 0 + (((tickAnim - 135) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 3) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 143) {
            xx = 19.75 + (((tickAnim - 138) / 5) * (-15-(19.75)));
            yy = 0 + (((tickAnim - 138) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 5) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 147) {
            xx = -15 + (((tickAnim - 143) / 4) * (-5.5-(-15)));
            yy = 0 + (((tickAnim - 143) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 4) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = -5.5 + (((tickAnim - 147) / 8) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 0) / 32) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 32) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 46) {
            xx = 18.5 + (((tickAnim - 32) / 14) * (18.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*2-(18.5)));
            yy = 0 + (((tickAnim - 32) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 14) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 94) {
            xx = 18.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*2 + (((tickAnim - 46) / 48) * (18.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*2-(18.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*2)));
            yy = 0 + (((tickAnim - 46) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 48) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = 18.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*2 + (((tickAnim - 94) / 10) * (18.5-(18.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*2)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 10) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 118) {
            xx = 18.5 + (((tickAnim - 104) / 14) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 104) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 14) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 133) {
            xx = 18.5 + (((tickAnim - 118) / 15) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 118) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 15) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 147) {
            xx = 18.5 + (((tickAnim - 133) / 14) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 133) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 14) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = 18.5 + (((tickAnim - 147) / 8) * (0-(18.5)));
            yy = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-56.64741-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (35.88872-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-64.70577-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -56.64741 + (((tickAnim - 3) / 4) * (-37.76631-(-56.64741)));
            yy = 35.88872 + (((tickAnim - 3) / 4) * (7.20185-(35.88872)));
            zz = -64.70577 + (((tickAnim - 3) / 4) * (3.09005-(-64.70577)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -37.76631 + (((tickAnim - 7) / 4) * (-37.76631-(-37.76631)));
            yy = 7.20185 + (((tickAnim - 7) / 4) * (7.20185-(7.20185)));
            zz = 3.09005 + (((tickAnim - 7) / 4) * (3.09005-(3.09005)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -37.76631 + (((tickAnim - 11) / 2) * (-39.28257-(-37.76631)));
            yy = 7.20185 + (((tickAnim - 11) / 2) * (2.89148-(7.20185)));
            zz = 3.09005 + (((tickAnim - 11) / 2) * (-28.30568-(3.09005)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -39.28257 + (((tickAnim - 13) / 5) * (-56.64741-(-39.28257)));
            yy = 2.89148 + (((tickAnim - 13) / 5) * (35.88872-(2.89148)));
            zz = -28.30568 + (((tickAnim - 13) / 5) * (-64.70577-(-28.30568)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -56.64741 + (((tickAnim - 18) / 3) * (-37.76631-(-56.64741)));
            yy = 35.88872 + (((tickAnim - 18) / 3) * (7.20185-(35.88872)));
            zz = -64.70577 + (((tickAnim - 18) / 3) * (3.09005-(-64.70577)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -37.76631 + (((tickAnim - 21) / 4) * (-37.76631-(-37.76631)));
            yy = 7.20185 + (((tickAnim - 21) / 4) * (7.20185-(7.20185)));
            zz = 3.09005 + (((tickAnim - 21) / 4) * (3.09005-(3.09005)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -37.76631 + (((tickAnim - 25) / 3) * (-39.28257-(-37.76631)));
            yy = 7.20185 + (((tickAnim - 25) / 3) * (2.89148-(7.20185)));
            zz = 3.09005 + (((tickAnim - 25) / 3) * (-28.30568-(3.09005)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -39.28257 + (((tickAnim - 28) / 4) * (-56.64741-(-39.28257)));
            yy = 2.89148 + (((tickAnim - 28) / 4) * (35.88872-(2.89148)));
            zz = -28.30568 + (((tickAnim - 28) / 4) * (-64.70577-(-28.30568)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -56.64741 + (((tickAnim - 32) / 3) * (-37.76631-(-56.64741)));
            yy = 35.88872 + (((tickAnim - 32) / 3) * (7.20185-(35.88872)));
            zz = -64.70577 + (((tickAnim - 32) / 3) * (3.09005-(-64.70577)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = -37.76631 + (((tickAnim - 35) / 4) * (-37.76631-(-37.76631)));
            yy = 7.20185 + (((tickAnim - 35) / 4) * (7.20185-(7.20185)));
            zz = 3.09005 + (((tickAnim - 35) / 4) * (3.09005-(3.09005)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = -37.76631 + (((tickAnim - 39) / 3) * (-39.28257-(-37.76631)));
            yy = 7.20185 + (((tickAnim - 39) / 3) * (2.89148-(7.20185)));
            zz = 3.09005 + (((tickAnim - 39) / 3) * (-28.30568-(3.09005)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -39.28257 + (((tickAnim - 42) / 4) * (-56.64741-(-39.28257)));
            yy = 2.89148 + (((tickAnim - 42) / 4) * (35.88872-(2.89148)));
            zz = -28.30568 + (((tickAnim - 42) / 4) * (-64.70577-(-28.30568)));
        }











        if (tickAnim >= 104 && tickAnim < 108) {
            xx = -56.64741 + (((tickAnim - 104) / 4) * (-37.76631-(-56.64741)));
            yy = 35.88872 + (((tickAnim - 104) / 4) * (7.20185-(35.88872)));
            zz = -64.70577 + (((tickAnim - 104) / 4) * (3.09005-(-64.70577)));
        }
        else if (tickAnim >= 108 && tickAnim < 112) {
            xx = -37.76631 + (((tickAnim - 108) / 4) * (-37.76631-(-37.76631)));
            yy = 7.20185 + (((tickAnim - 108) / 4) * (7.20185-(7.20185)));
            zz = 3.09005 + (((tickAnim - 108) / 4) * (3.09005-(3.09005)));
        }
        else if (tickAnim >= 112 && tickAnim < 114) {
            xx = -37.76631 + (((tickAnim - 112) / 2) * (-39.28257-(-37.76631)));
            yy = 7.20185 + (((tickAnim - 112) / 2) * (2.89148-(7.20185)));
            zz = 3.09005 + (((tickAnim - 112) / 2) * (-28.30568-(3.09005)));
        }
        else if (tickAnim >= 114 && tickAnim < 118) {
            xx = -39.28257 + (((tickAnim - 114) / 4) * (-56.64741-(-39.28257)));
            yy = 2.89148 + (((tickAnim - 114) / 4) * (35.88872-(2.89148)));
            zz = -28.30568 + (((tickAnim - 114) / 4) * (-64.70577-(-28.30568)));
        }
        else if (tickAnim >= 118 && tickAnim < 122) {
            xx = -56.64741 + (((tickAnim - 118) / 4) * (-37.76631-(-56.64741)));
            yy = 35.88872 + (((tickAnim - 118) / 4) * (7.20185-(35.88872)));
            zz = -64.70577 + (((tickAnim - 118) / 4) * (3.09005-(-64.70577)));
        }
        else if (tickAnim >= 122 && tickAnim < 126) {
            xx = -37.76631 + (((tickAnim - 122) / 4) * (-37.76631-(-37.76631)));
            yy = 7.20185 + (((tickAnim - 122) / 4) * (7.20185-(7.20185)));
            zz = 3.09005 + (((tickAnim - 122) / 4) * (3.09005-(3.09005)));
        }
        else if (tickAnim >= 126 && tickAnim < 128) {
            xx = -37.76631 + (((tickAnim - 126) / 2) * (-39.28257-(-37.76631)));
            yy = 7.20185 + (((tickAnim - 126) / 2) * (2.89148-(7.20185)));
            zz = 3.09005 + (((tickAnim - 126) / 2) * (-28.30568-(3.09005)));
        }
        else if (tickAnim >= 128 && tickAnim < 133) {
            xx = -39.28257 + (((tickAnim - 128) / 5) * (-56.64741-(-39.28257)));
            yy = 2.89148 + (((tickAnim - 128) / 5) * (35.88872-(2.89148)));
            zz = -28.30568 + (((tickAnim - 128) / 5) * (-64.70577-(-28.30568)));
        }
        else if (tickAnim >= 133 && tickAnim < 136) {
            xx = -56.64741 + (((tickAnim - 133) / 3) * (-37.76631-(-56.64741)));
            yy = 35.88872 + (((tickAnim - 133) / 3) * (7.20185-(35.88872)));
            zz = -64.70577 + (((tickAnim - 133) / 3) * (3.09005-(-64.70577)));
        }
        else if (tickAnim >= 136 && tickAnim < 140) {
            xx = -37.76631 + (((tickAnim - 136) / 4) * (-37.76631-(-37.76631)));
            yy = 7.20185 + (((tickAnim - 136) / 4) * (7.20185-(7.20185)));
            zz = 3.09005 + (((tickAnim - 136) / 4) * (3.09005-(3.09005)));
        }
        else if (tickAnim >= 140 && tickAnim < 143) {
            xx = -37.76631 + (((tickAnim - 140) / 3) * (-39.28257-(-37.76631)));
            yy = 7.20185 + (((tickAnim - 140) / 3) * (2.89148-(7.20185)));
            zz = 3.09005 + (((tickAnim - 140) / 3) * (-28.30568-(3.09005)));
        }
        else if (tickAnim >= 143 && tickAnim < 147) {
            xx = -39.28257 + (((tickAnim - 143) / 4) * (-56.64741-(-39.28257)));
            yy = 2.89148 + (((tickAnim - 143) / 4) * (35.88872-(2.89148)));
            zz = -28.30568 + (((tickAnim - 143) / 4) * (-64.70577-(-28.30568)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = -56.64741 + (((tickAnim - 147) / 8) * (0-(-56.64741)));
            yy = 35.88872 + (((tickAnim - 147) / 8) * (0-(35.88872)));
            zz = -64.70577 + (((tickAnim - 147) / 8) * (0-(-64.70577)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (22-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 22 + (((tickAnim - 3) / 6) * (63.67-(22)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 63.67 + (((tickAnim - 9) / 9) * (22-(63.67)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 22 + (((tickAnim - 18) / 5) * (63.67-(22)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 63.67 + (((tickAnim - 23) / 9) * (22-(63.67)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 22 + (((tickAnim - 32) / 6) * (63.67-(22)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 63.67 + (((tickAnim - 38) / 8) * (22-(63.67)));
            yy = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 104) {
            xx = 22 + (((tickAnim - 46) / 58) * (22-(22)));
            yy = 0 + (((tickAnim - 46) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 58) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 110) {
            xx = 22 + (((tickAnim - 104) / 6) * (63.67-(22)));
            yy = 0 + (((tickAnim - 104) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 6) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 118) {
            xx = 63.67 + (((tickAnim - 110) / 8) * (22-(63.67)));
            yy = 0 + (((tickAnim - 110) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 8) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 124) {
            xx = 22 + (((tickAnim - 118) / 6) * (63.67-(22)));
            yy = 0 + (((tickAnim - 118) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 6) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 133) {
            xx = 63.67 + (((tickAnim - 124) / 9) * (22-(63.67)));
            yy = 0 + (((tickAnim - 124) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 9) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 138) {
            xx = 22 + (((tickAnim - 133) / 5) * (63.67-(22)));
            yy = 0 + (((tickAnim - 133) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 5) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 147) {
            xx = 63.67 + (((tickAnim - 138) / 9) * (22-(63.67)));
            yy = 0 + (((tickAnim - 138) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 9) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = 22 + (((tickAnim - 147) / 8) * (0-(22)));
            yy = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (-0.77-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = -0.77 + (((tickAnim - 9) / 9) * (0-(-0.77)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-0.77-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = -0.77 + (((tickAnim - 23) / 9) * (0-(-0.77)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (-0.77-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            zz = -0.77 + (((tickAnim - 38) / 8) * (0-(-0.77)));
        }
        else if (tickAnim >= 46 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 46) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 58) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 104) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 104) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 6) * (-0.77-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 110) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 8) * (0-(0)));
            zz = -0.77 + (((tickAnim - 110) / 8) * (0-(-0.77)));
        }
        else if (tickAnim >= 118 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 118) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 6) * (-0.77-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 124) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 124) / 9) * (0-(0)));
            zz = -0.77 + (((tickAnim - 124) / 9) * (0-(-0.77)));
        }
        else if (tickAnim >= 133 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 133) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 133) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 5) * (-0.77-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 147) {
            xx = 0 + (((tickAnim - 138) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 138) / 9) * (0-(0)));
            zz = -0.77 + (((tickAnim - 138) / 9) * (0-(-0.77)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-56.64741-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-35.88872-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (64.70577-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -56.64741 + (((tickAnim - 3) / 4) * (-37.76631-(-56.64741)));
            yy = -35.88872 + (((tickAnim - 3) / 4) * (-7.20185-(-35.88872)));
            zz = 64.70577 + (((tickAnim - 3) / 4) * (-3.09005-(64.70577)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -37.76631 + (((tickAnim - 7) / 4) * (-37.76631-(-37.76631)));
            yy = -7.20185 + (((tickAnim - 7) / 4) * (-7.20185-(-7.20185)));
            zz = -3.09005 + (((tickAnim - 7) / 4) * (-3.09005-(-3.09005)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -37.76631 + (((tickAnim - 11) / 2) * (-39.28257-(-37.76631)));
            yy = -7.20185 + (((tickAnim - 11) / 2) * (-2.89148-(-7.20185)));
            zz = -3.09005 + (((tickAnim - 11) / 2) * (28.30568-(-3.09005)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -39.28257 + (((tickAnim - 13) / 5) * (-56.64741-(-39.28257)));
            yy = -2.89148 + (((tickAnim - 13) / 5) * (-35.88872-(-2.89148)));
            zz = 28.30568 + (((tickAnim - 13) / 5) * (64.70577-(28.30568)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -56.64741 + (((tickAnim - 18) / 3) * (-37.76631-(-56.64741)));
            yy = -35.88872 + (((tickAnim - 18) / 3) * (-7.20185-(-35.88872)));
            zz = 64.70577 + (((tickAnim - 18) / 3) * (-3.09005-(64.70577)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -37.76631 + (((tickAnim - 21) / 4) * (-37.76631-(-37.76631)));
            yy = -7.20185 + (((tickAnim - 21) / 4) * (-7.20185-(-7.20185)));
            zz = -3.09005 + (((tickAnim - 21) / 4) * (-3.09005-(-3.09005)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -37.76631 + (((tickAnim - 25) / 3) * (-39.28257-(-37.76631)));
            yy = -7.20185 + (((tickAnim - 25) / 3) * (-2.89148-(-7.20185)));
            zz = -3.09005 + (((tickAnim - 25) / 3) * (28.30568-(-3.09005)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -39.28257 + (((tickAnim - 28) / 4) * (-56.64741-(-39.28257)));
            yy = -2.89148 + (((tickAnim - 28) / 4) * (-35.88872-(-2.89148)));
            zz = 28.30568 + (((tickAnim - 28) / 4) * (64.70577-(28.30568)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -56.64741 + (((tickAnim - 32) / 3) * (-37.76631-(-56.64741)));
            yy = -35.88872 + (((tickAnim - 32) / 3) * (-7.20185-(-35.88872)));
            zz = 64.70577 + (((tickAnim - 32) / 3) * (-3.09005-(64.70577)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = -37.76631 + (((tickAnim - 35) / 4) * (-37.76631-(-37.76631)));
            yy = -7.20185 + (((tickAnim - 35) / 4) * (-7.20185-(-7.20185)));
            zz = -3.09005 + (((tickAnim - 35) / 4) * (-3.09005-(-3.09005)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = -37.76631 + (((tickAnim - 39) / 3) * (-39.28257-(-37.76631)));
            yy = -7.20185 + (((tickAnim - 39) / 3) * (-2.89148-(-7.20185)));
            zz = -3.09005 + (((tickAnim - 39) / 3) * (28.30568-(-3.09005)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -39.28257 + (((tickAnim - 42) / 4) * (-56.64741-(-39.28257)));
            yy = -2.89148 + (((tickAnim - 42) / 4) * (-35.88872-(-2.89148)));
            zz = 28.30568 + (((tickAnim - 42) / 4) * (64.70577-(28.30568)));
        }











        if (tickAnim >= 104 && tickAnim < 108) {
            xx = -56.64741 + (((tickAnim - 104) / 4) * (-37.76631-(-56.64741)));
            yy = -35.88872 + (((tickAnim - 104) / 4) * (-7.20185-(-35.88872)));
            zz = 64.70577 + (((tickAnim - 104) / 4) * (-3.09005-(64.70577)));
        }
        else if (tickAnim >= 108 && tickAnim < 112) {
            xx = -37.76631 + (((tickAnim - 108) / 4) * (-37.76631-(-37.76631)));
            yy = -7.20185 + (((tickAnim - 108) / 4) * (-7.20185-(-7.20185)));
            zz = -3.09005 + (((tickAnim - 108) / 4) * (-3.09005-(-3.09005)));
        }
        else if (tickAnim >= 112 && tickAnim < 114) {
            xx = -37.76631 + (((tickAnim - 112) / 2) * (-39.28257-(-37.76631)));
            yy = -7.20185 + (((tickAnim - 112) / 2) * (-2.89148-(-7.20185)));
            zz = -3.09005 + (((tickAnim - 112) / 2) * (28.30568-(-3.09005)));
        }
        else if (tickAnim >= 114 && tickAnim < 118) {
            xx = -39.28257 + (((tickAnim - 114) / 4) * (-56.64741-(-39.28257)));
            yy = -2.89148 + (((tickAnim - 114) / 4) * (-35.88872-(-2.89148)));
            zz = 28.30568 + (((tickAnim - 114) / 4) * (64.70577-(28.30568)));
        }
        else if (tickAnim >= 118 && tickAnim < 122) {
            xx = -56.64741 + (((tickAnim - 118) / 4) * (-37.76631-(-56.64741)));
            yy = -35.88872 + (((tickAnim - 118) / 4) * (-7.20185-(-35.88872)));
            zz = 64.70577 + (((tickAnim - 118) / 4) * (-3.09005-(64.70577)));
        }
        else if (tickAnim >= 122 && tickAnim < 126) {
            xx = -37.76631 + (((tickAnim - 122) / 4) * (-37.76631-(-37.76631)));
            yy = -7.20185 + (((tickAnim - 122) / 4) * (-7.20185-(-7.20185)));
            zz = -3.09005 + (((tickAnim - 122) / 4) * (-3.09005-(-3.09005)));
        }
        else if (tickAnim >= 126 && tickAnim < 128) {
            xx = -37.76631 + (((tickAnim - 126) / 2) * (-39.28257-(-37.76631)));
            yy = -7.20185 + (((tickAnim - 126) / 2) * (-2.89148-(-7.20185)));
            zz = -3.09005 + (((tickAnim - 126) / 2) * (28.30568-(-3.09005)));
        }
        else if (tickAnim >= 128 && tickAnim < 133) {
            xx = -39.28257 + (((tickAnim - 128) / 5) * (-56.64741-(-39.28257)));
            yy = -2.89148 + (((tickAnim - 128) / 5) * (-35.88872-(-2.89148)));
            zz = 28.30568 + (((tickAnim - 128) / 5) * (64.70577-(28.30568)));
        }
        else if (tickAnim >= 133 && tickAnim < 136) {
            xx = -56.64741 + (((tickAnim - 133) / 3) * (-37.76631-(-56.64741)));
            yy = -35.88872 + (((tickAnim - 133) / 3) * (-7.20185-(-35.88872)));
            zz = 64.70577 + (((tickAnim - 133) / 3) * (-3.09005-(64.70577)));
        }
        else if (tickAnim >= 136 && tickAnim < 140) {
            xx = -37.76631 + (((tickAnim - 136) / 4) * (-37.76631-(-37.76631)));
            yy = -7.20185 + (((tickAnim - 136) / 4) * (-7.20185-(-7.20185)));
            zz = -3.09005 + (((tickAnim - 136) / 4) * (-3.09005-(-3.09005)));
        }
        else if (tickAnim >= 140 && tickAnim < 143) {
            xx = -37.76631 + (((tickAnim - 140) / 3) * (-39.28257-(-37.76631)));
            yy = -7.20185 + (((tickAnim - 140) / 3) * (-2.89148-(-7.20185)));
            zz = -3.09005 + (((tickAnim - 140) / 3) * (28.30568-(-3.09005)));
        }
        else if (tickAnim >= 143 && tickAnim < 147) {
            xx = -39.28257 + (((tickAnim - 143) / 4) * (-56.64741-(-39.28257)));
            yy = -2.89148 + (((tickAnim - 143) / 4) * (-35.88872-(-2.89148)));
            zz = 28.30568 + (((tickAnim - 143) / 4) * (64.70577-(28.30568)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = -56.64741 + (((tickAnim - 147) / 8) * (0-(-56.64741)));
            yy = -35.88872 + (((tickAnim - 147) / 8) * (0-(-35.88872)));
            zz = 64.70577 + (((tickAnim - 147) / 8) * (0-(64.70577)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (22-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 22 + (((tickAnim - 3) / 6) * (63.67-(22)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 63.67 + (((tickAnim - 9) / 9) * (22-(63.67)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 22 + (((tickAnim - 18) / 5) * (63.67-(22)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 63.67 + (((tickAnim - 23) / 9) * (22-(63.67)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 22 + (((tickAnim - 32) / 6) * (63.67-(22)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 63.67 + (((tickAnim - 38) / 8) * (22-(63.67)));
            yy = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 104) {
            xx = 22 + (((tickAnim - 46) / 58) * (22-(22)));
            yy = 0 + (((tickAnim - 46) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 58) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 110) {
            xx = 22 + (((tickAnim - 104) / 6) * (63.67-(22)));
            yy = 0 + (((tickAnim - 104) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 6) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 118) {
            xx = 63.67 + (((tickAnim - 110) / 8) * (22-(63.67)));
            yy = 0 + (((tickAnim - 110) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 8) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 124) {
            xx = 22 + (((tickAnim - 118) / 6) * (63.67-(22)));
            yy = 0 + (((tickAnim - 118) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 6) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 133) {
            xx = 63.67 + (((tickAnim - 124) / 9) * (22-(63.67)));
            yy = 0 + (((tickAnim - 124) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 9) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 138) {
            xx = 22 + (((tickAnim - 133) / 5) * (63.67-(22)));
            yy = 0 + (((tickAnim - 133) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 5) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 147) {
            xx = 63.67 + (((tickAnim - 138) / 9) * (22-(63.67)));
            yy = 0 + (((tickAnim - 138) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 9) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = 22 + (((tickAnim - 147) / 8) * (0-(22)));
            yy = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (-0.77-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = -0.77 + (((tickAnim - 9) / 9) * (0-(-0.77)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-0.77-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = -0.77 + (((tickAnim - 23) / 9) * (0-(-0.77)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (-0.77-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            zz = -0.77 + (((tickAnim - 38) / 8) * (0-(-0.77)));
        }
        else if (tickAnim >= 46 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 46) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 58) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 104) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 104) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 6) * (-0.77-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 110) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 8) * (0-(0)));
            zz = -0.77 + (((tickAnim - 110) / 8) * (0-(-0.77)));
        }
        else if (tickAnim >= 118 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 118) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 6) * (-0.77-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 124) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 124) / 9) * (0-(0)));
            zz = -0.77 + (((tickAnim - 124) / 9) * (0-(-0.77)));
        }
        else if (tickAnim >= 133 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 133) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 133) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 5) * (-0.77-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 147) {
            xx = 0 + (((tickAnim - 138) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 138) / 9) * (0-(0)));
            zz = -0.77 + (((tickAnim - 138) / 9) * (0-(-0.77)));
        }
        else if (tickAnim >= 147 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 147) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);


    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYuanyanglong entity = (EntityPrehistoricFloraYuanyanglong) entitylivingbaseIn;
        int animCycle = 205;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 72) {
            xx = 8.25 + (((tickAnim - 20) / 52) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 20) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 52) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 82) {
            xx = 8.25 + (((tickAnim - 72) / 10) * (-3.25-(8.25)));
            yy = 0 + (((tickAnim - 72) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 10) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 90) {
            xx = -3.25 + (((tickAnim - 82) / 8) * (1.25-(-3.25)));
            yy = 0 + (((tickAnim - 82) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 8) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 1.25 + (((tickAnim - 90) / 10) * (-3.25-(1.25)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 108) {
            xx = -3.25 + (((tickAnim - 100) / 8) * (1.25-(-3.25)));
            yy = 0 + (((tickAnim - 100) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 8) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 117) {
            xx = 1.25 + (((tickAnim - 108) / 9) * (-3.25-(1.25)));
            yy = 0 + (((tickAnim - 108) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 9) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = -3.25 + (((tickAnim - 117) / 18) * (8.25-(-3.25)));
            yy = 0 + (((tickAnim - 117) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 18) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 178) {
            xx = 8.25 + (((tickAnim - 135) / 43) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 135) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 43) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 205) {
            xx = 8.25 + (((tickAnim - 178) / 27) * (0-(8.25)));
            yy = 0 + (((tickAnim - 178) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-4.95-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.35-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 20) / 52) * (0-(0)));
            yy = -4.95 + (((tickAnim - 20) / 52) * (-4.95-(-4.95)));
            zz = 1.35 + (((tickAnim - 20) / 52) * (1.35-(1.35)));
        }
        else if (tickAnim >= 72 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 72) / 10) * (0-(0)));
            yy = -4.95 + (((tickAnim - 72) / 10) * (-3.675-(-4.95)));
            zz = 1.35 + (((tickAnim - 72) / 10) * (1.15-(1.35)));
        }
        else if (tickAnim >= 82 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 82) / 8) * (0-(0)));
            yy = -3.675 + (((tickAnim - 82) / 8) * (-3.675-(-3.675)));
            zz = 1.15 + (((tickAnim - 82) / 8) * (1.15-(1.15)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = -3.675 + (((tickAnim - 90) / 10) * (-3.675-(-3.675)));
            zz = 1.15 + (((tickAnim - 90) / 10) * (1.15-(1.15)));
        }
        else if (tickAnim >= 100 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 100) / 8) * (0-(0)));
            yy = -3.675 + (((tickAnim - 100) / 8) * (-3.675-(-3.675)));
            zz = 1.15 + (((tickAnim - 100) / 8) * (1.15-(1.15)));
        }
        else if (tickAnim >= 108 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 108) / 9) * (0-(0)));
            yy = -3.675 + (((tickAnim - 108) / 9) * (-3.675-(-3.675)));
            zz = 1.15 + (((tickAnim - 108) / 9) * (1.15-(1.15)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 117) / 18) * (0-(0)));
            yy = -3.675 + (((tickAnim - 117) / 18) * (-4.95-(-3.675)));
            zz = 1.15 + (((tickAnim - 117) / 18) * (1.35-(1.15)));
        }
        else if (tickAnim >= 135 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 135) / 43) * (0-(0)));
            yy = -4.95 + (((tickAnim - 135) / 43) * (-4.95-(-4.95)));
            zz = 1.35 + (((tickAnim - 135) / 43) * (1.35-(1.35)));
        }
        else if (tickAnim >= 178 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 178) / 27) * (0-(0)));
            yy = -4.95 + (((tickAnim - 178) / 27) * (0-(-4.95)));
            zz = 1.35 + (((tickAnim - 178) / 27) * (0-(1.35)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-6.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 72) {
            xx = -6.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5 + (((tickAnim - 20) / 52) * (-6.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5-(-6.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5)));
            yy = 0 + (((tickAnim - 20) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 52) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 82) {
            xx = -6.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5 + (((tickAnim - 72) / 10) * (-15.93696-(-6.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5)));
            yy = 0 + (((tickAnim - 72) / 10) * (0.67687-(0)));
            zz = 0 + (((tickAnim - 72) / 10) * (-0.12811-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 90) {
            xx = -15.93696 + (((tickAnim - 82) / 8) * (-17.1869613038+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*15-(-15.93696)));
            yy = 0.67687 + (((tickAnim - 82) / 8) * (0.67687-(0.67687)));
            zz = -0.12811 + (((tickAnim - 82) / 8) * (-0.12811-(-0.12811)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -17.1869613038+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*15 + (((tickAnim - 90) / 10) * (-15.93696-(-17.1869613038+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*15)));
            yy = 0.67687 + (((tickAnim - 90) / 10) * (0.67687-(0.67687)));
            zz = -0.12811 + (((tickAnim - 90) / 10) * (-0.12811-(-0.12811)));
        }
        else if (tickAnim >= 100 && tickAnim < 108) {
            xx = -15.93696 + (((tickAnim - 100) / 8) * (-44.287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*30-(-15.93696)));
            yy = 0.67687 + (((tickAnim - 100) / 8) * (0.67687-(0.67687)));
            zz = -0.12811 + (((tickAnim - 100) / 8) * (-0.12811-(-0.12811)));
        }
        else if (tickAnim >= 108 && tickAnim < 117) {
            xx = -44.287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*30 + (((tickAnim - 108) / 9) * (-15.93696-(-44.287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*30)));
            yy = 0.67687 + (((tickAnim - 108) / 9) * (0.67687-(0.67687)));
            zz = -0.12811 + (((tickAnim - 108) / 9) * (-0.12811-(-0.12811)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = -15.93696 + (((tickAnim - 117) / 16) * (1.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5-(-15.93696)));
            yy = 0.67687 + (((tickAnim - 117) / 16) * (0-(0.67687)));
            zz = -0.12811 + (((tickAnim - 117) / 16) * (0-(-0.12811)));
        }
        else if (tickAnim >= 133 && tickAnim < 178) {
            xx = 1.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5 + (((tickAnim - 133) / 45) * (-6.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5-(1.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5)));
            yy = 0 + (((tickAnim - 133) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 45) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 205) {
            xx = -6.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5 + (((tickAnim - 178) / 27) * (0-(-6.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5)));
            yy = 0 + (((tickAnim - 178) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*8-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 72) {
            xx = -8.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*8 + (((tickAnim - 20) / 52) * (0.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-8-(-8.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*8)));
            yy = 0 + (((tickAnim - 20) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 52) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 82) {
            xx = 0.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-8 + (((tickAnim - 72) / 10) * (4.5-(0.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-8)));
            yy = 0 + (((tickAnim - 72) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 10) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 90) {
            xx = 4.5 + (((tickAnim - 82) / 8) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*35-(4.5)));
            yy = 0 + (((tickAnim - 82) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 8) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*35 + (((tickAnim - 90) / 10) * (4.5-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*35)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 108) {
            xx = 4.5 + (((tickAnim - 100) / 8) * (-21.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*35-(4.5)));
            yy = 0 + (((tickAnim - 100) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 8) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 117) {
            xx = -21.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*35 + (((tickAnim - 108) / 9) * (4.5-(-21.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*35)));
            yy = 0 + (((tickAnim - 108) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 9) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = 4.5 + (((tickAnim - 117) / 16) * (-4.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*8-(4.5)));
            yy = 0 + (((tickAnim - 117) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 16) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 178) {
            xx = -4.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*8 + (((tickAnim - 133) / 45) * (0.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-8-(-4.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*8)));
            yy = 0 + (((tickAnim - 133) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 45) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 205) {
            xx = 0.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-8 + (((tickAnim - 178) / 27) * (0-(0.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-8)));
            yy = 0 + (((tickAnim - 178) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-11.895+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*12-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 72) {
            xx = -11.895+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*12 + (((tickAnim - 20) / 52) * (-3.245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*-12-(-11.895+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*12)));
            yy = 0 + (((tickAnim - 20) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 52) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 82) {
            xx = -3.245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*-12 + (((tickAnim - 72) / 10) * (21.5-(-3.245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*-12)));
            yy = 0 + (((tickAnim - 72) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 10) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 90) {
            xx = 21.5 + (((tickAnim - 82) / 8) * (11.75-(21.5)));
            yy = 0 + (((tickAnim - 82) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 8) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 11.75 + (((tickAnim - 90) / 10) * (21.5-(11.75)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 108) {
            xx = 21.5 + (((tickAnim - 100) / 8) * (11.75-(21.5)));
            yy = 0 + (((tickAnim - 100) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 8) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 117) {
            xx = 11.75 + (((tickAnim - 108) / 9) * (21.5-(11.75)));
            yy = 0 + (((tickAnim - 108) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 9) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = 21.5 + (((tickAnim - 117) / 16) * (-3.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*12-(21.5)));
            yy = 0 + (((tickAnim - 117) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 16) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 178) {
            xx = -3.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*12 + (((tickAnim - 133) / 45) * (-3.245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*-12-(-3.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*12)));
            yy = 0 + (((tickAnim - 133) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 45) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 205) {
            xx = -3.245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*-12 + (((tickAnim - 178) / 27) * (0-(-3.245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*-12)));
            yy = 0 + (((tickAnim - 178) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 16 + (((tickAnim - 20) / 5) * (17-(16)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 43) {
            xx = 17 + (((tickAnim - 25) / 18) * (16-(17)));
            yy = 0 + (((tickAnim - 25) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 18) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 16 + (((tickAnim - 43) / 10) * (17-(16)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 72) {
            xx = 17 + (((tickAnim - 53) / 19) * (16-(17)));
            yy = 0 + (((tickAnim - 53) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 19) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 82) {
            xx = 16 + (((tickAnim - 72) / 10) * (4.5-(16)));
            yy = 0 + (((tickAnim - 72) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 10) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 90) {
            xx = 4.5 + (((tickAnim - 82) / 8) * (-2.25-(4.5)));
            yy = 0 + (((tickAnim - 82) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 8) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -2.25 + (((tickAnim - 90) / 10) * (4.5-(-2.25)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 108) {
            xx = 4.5 + (((tickAnim - 100) / 8) * (-2.25-(4.5)));
            yy = 0 + (((tickAnim - 100) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 8) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 117) {
            xx = -2.25 + (((tickAnim - 108) / 9) * (4.5-(-2.25)));
            yy = 0 + (((tickAnim - 108) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 9) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = 4.5 + (((tickAnim - 117) / 18) * (16-(4.5)));
            yy = 0 + (((tickAnim - 117) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 18) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 140) {
            xx = 16 + (((tickAnim - 135) / 5) * (17-(16)));
            yy = 0 + (((tickAnim - 135) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 5) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 158) {
            xx = 17 + (((tickAnim - 140) / 18) * (16-(17)));
            yy = 0 + (((tickAnim - 140) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 18) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 168) {
            xx = 16 + (((tickAnim - 158) / 10) * (17-(16)));
            yy = 0 + (((tickAnim - 158) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 10) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 178) {
            xx = 17 + (((tickAnim - 168) / 10) * (16-(17)));
            yy = 0 + (((tickAnim - 168) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 10) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 205) {
            xx = 16 + (((tickAnim - 178) / 27) * (0-(16)));
            yy = 0 + (((tickAnim - 178) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 25.75 + (((tickAnim - 15) / 10) * (39.75-(25.75)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 43) {
            xx = 39.75 + (((tickAnim - 25) / 18) * (25.75-(39.75)));
            yy = 0 + (((tickAnim - 25) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 18) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 25.75 + (((tickAnim - 43) / 10) * (39.75-(25.75)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 72) {
            xx = 39.75 + (((tickAnim - 53) / 19) * (25.75-(39.75)));
            yy = 0 + (((tickAnim - 53) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 19) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 82) {
            xx = 25.75 + (((tickAnim - 72) / 10) * (6-(25.75)));
            yy = 0 + (((tickAnim - 72) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 10) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 90) {
            xx = 6 + (((tickAnim - 82) / 8) * (1.75-(6)));
            yy = 0 + (((tickAnim - 82) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 8) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 1.75 + (((tickAnim - 90) / 10) * (6-(1.75)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 108) {
            xx = 6 + (((tickAnim - 100) / 8) * (1.75-(6)));
            yy = 0 + (((tickAnim - 100) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 8) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 117) {
            xx = 1.75 + (((tickAnim - 108) / 9) * (6-(1.75)));
            yy = 0 + (((tickAnim - 108) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 9) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 130) {
            xx = 6 + (((tickAnim - 117) / 13) * (25.75-(6)));
            yy = 0 + (((tickAnim - 117) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 13) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 25.75 + (((tickAnim - 130) / 10) * (39.75-(25.75)));
            yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 158) {
            xx = 39.75 + (((tickAnim - 140) / 18) * (25.75-(39.75)));
            yy = 0 + (((tickAnim - 140) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 18) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 168) {
            xx = 25.75 + (((tickAnim - 158) / 10) * (39.75-(25.75)));
            yy = 0 + (((tickAnim - 158) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 10) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 178) {
            xx = 39.75 + (((tickAnim - 168) / 10) * (25.75-(39.75)));
            yy = 0 + (((tickAnim - 168) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 10) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 193) {
            xx = 25.75 + (((tickAnim - 178) / 15) * (-7.23-(25.75)));
            yy = 0 + (((tickAnim - 178) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 15) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 205) {
            xx = -7.23 + (((tickAnim - 193) / 12) * (0-(-7.23)));
            yy = 0 + (((tickAnim - 193) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.7-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 15) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 28) * (0-(0)));
            zz = -0.7 + (((tickAnim - 15) / 28) * (-0.7-(-0.7)));
        }
        else if (tickAnim >= 43 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 43) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 29) * (0-(0)));
            zz = -0.7 + (((tickAnim - 43) / 29) * (-0.7-(-0.7)));
        }
        else if (tickAnim >= 72 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 72) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 18) * (0-(0)));
            zz = -0.7 + (((tickAnim - 72) / 18) * (-0.3-(-0.7)));
        }
        else if (tickAnim >= 90 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 90) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 18) * (0-(0)));
            zz = -0.3 + (((tickAnim - 90) / 18) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 108 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 108) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 108) / 22) * (0-(0)));
            zz = -0.3 + (((tickAnim - 108) / 22) * (-0.7-(-0.3)));
        }
        else if (tickAnim >= 130 && tickAnim < 158) {
            xx = 0 + (((tickAnim - 130) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 28) * (0-(0)));
            zz = -0.7 + (((tickAnim - 130) / 28) * (-0.7-(-0.7)));
        }
        else if (tickAnim >= 158 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 158) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 158) / 20) * (0-(0)));
            zz = -0.7 + (((tickAnim - 158) / 20) * (-0.7-(-0.7)));
        }
        else if (tickAnim >= 178 && tickAnim < 193) {
            xx = 0 + (((tickAnim - 178) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 178) / 15) * (-0.375-(0)));
            zz = -0.7 + (((tickAnim - 178) / 15) * (0.25-(-0.7)));
        }
        else if (tickAnim >= 193 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 193) / 12) * (0-(0)));
            yy = -0.375 + (((tickAnim - 193) / 12) * (0-(-0.375)));
            zz = 0.25 + (((tickAnim - 193) / 12) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 13.25 + (((tickAnim - 15) / 10) * (34-(13.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 43) {
            xx = 34 + (((tickAnim - 25) / 18) * (13.25-(34)));
            yy = 0 + (((tickAnim - 25) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 18) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 13.25 + (((tickAnim - 43) / 10) * (34-(13.25)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 82) {
            xx = 34 + (((tickAnim - 53) / 29) * (8.5-(34)));
            yy = 0 + (((tickAnim - 53) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 29) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 90) {
            xx = 8.5 + (((tickAnim - 82) / 8) * (13.5-(8.5)));
            yy = 0 + (((tickAnim - 82) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 8) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 13.5 + (((tickAnim - 90) / 10) * (8.5-(13.5)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 108) {
            xx = 8.5 + (((tickAnim - 100) / 8) * (13.5-(8.5)));
            yy = 0 + (((tickAnim - 100) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 8) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 117) {
            xx = 13.5 + (((tickAnim - 108) / 9) * (8.5-(13.5)));
            yy = 0 + (((tickAnim - 108) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 9) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 130) {
            xx = 8.5 + (((tickAnim - 117) / 13) * (13.25-(8.5)));
            yy = 0 + (((tickAnim - 117) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 13) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 13.25 + (((tickAnim - 130) / 10) * (34-(13.25)));
            yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 158) {
            xx = 34 + (((tickAnim - 140) / 18) * (13.25-(34)));
            yy = 0 + (((tickAnim - 140) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 18) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 168) {
            xx = 13.25 + (((tickAnim - 158) / 10) * (34-(13.25)));
            yy = 0 + (((tickAnim - 158) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 10) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 178) {
            xx = 34 + (((tickAnim - 168) / 10) * (13.25-(34)));
            yy = 0 + (((tickAnim - 168) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 10) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 193) {
            xx = 13.25 + (((tickAnim - 178) / 15) * (-6.2-(13.25)));
            yy = 0 + (((tickAnim - 178) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 15) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 205) {
            xx = -6.2 + (((tickAnim - 193) / 12) * (0-(-6.2)));
            yy = 0 + (((tickAnim - 193) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.4-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0.65-(0)));
            zz = -0.4 + (((tickAnim - 15) / 10) * (-1.225-(-0.4)));
        }
        else if (tickAnim >= 25 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 25) / 18) * (0-(0)));
            yy = 0.65 + (((tickAnim - 25) / 18) * (0-(0.65)));
            zz = -1.225 + (((tickAnim - 25) / 18) * (-0.4-(-1.225)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 10) * (0.65-(0)));
            zz = -0.4 + (((tickAnim - 43) / 10) * (-1.225-(-0.4)));
        }
        else if (tickAnim >= 53 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 53) / 19) * (0-(0)));
            yy = 0.65 + (((tickAnim - 53) / 19) * (0-(0.65)));
            zz = -1.225 + (((tickAnim - 53) / 19) * (-0.4-(-1.225)));
        }
        else if (tickAnim >= 72 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 72) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 58) * (0-(0)));
            zz = -0.4 + (((tickAnim - 72) / 58) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 10) * (0.65-(0)));
            zz = -0.4 + (((tickAnim - 130) / 10) * (-1.225-(-0.4)));
        }
        else if (tickAnim >= 140 && tickAnim < 158) {
            xx = 0 + (((tickAnim - 140) / 18) * (0-(0)));
            yy = 0.65 + (((tickAnim - 140) / 18) * (0-(0.65)));
            zz = -1.225 + (((tickAnim - 140) / 18) * (-0.4-(-1.225)));
        }
        else if (tickAnim >= 158 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 158) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 158) / 10) * (0.65-(0)));
            zz = -0.4 + (((tickAnim - 158) / 10) * (-1.225-(-0.4)));
        }
        else if (tickAnim >= 168 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 168) / 10) * (0-(0)));
            yy = 0.65 + (((tickAnim - 168) / 10) * (0-(0.65)));
            zz = -1.225 + (((tickAnim - 168) / 10) * (-0.4-(-1.225)));
        }
        else if (tickAnim >= 178 && tickAnim < 193) {
            xx = 0 + (((tickAnim - 178) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 178) / 15) * (-0.425-(0)));
            zz = -0.4 + (((tickAnim - 178) / 15) * (0.05-(-0.4)));
        }
        else if (tickAnim >= 193 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 193) / 12) * (0-(0)));
            yy = -0.425 + (((tickAnim - 193) / 12) * (0-(-0.425)));
            zz = 0.05 + (((tickAnim - 193) / 12) * (0-(0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -13.25 + (((tickAnim - 15) / 10) * (11.75-(-13.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 43) {
            xx = 11.75 + (((tickAnim - 25) / 18) * (-13.25-(11.75)));
            yy = 0 + (((tickAnim - 25) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 18) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = -13.25 + (((tickAnim - 43) / 10) * (11.75-(-13.25)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 82) {
            xx = 11.75 + (((tickAnim - 53) / 29) * (15-(11.75)));
            yy = 0 + (((tickAnim - 53) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 29) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 90) {
            xx = 15 + (((tickAnim - 82) / 8) * (24.75-(15)));
            yy = 0 + (((tickAnim - 82) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 8) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 24.75 + (((tickAnim - 90) / 10) * (15-(24.75)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 108) {
            xx = 15 + (((tickAnim - 100) / 8) * (24.75-(15)));
            yy = 0 + (((tickAnim - 100) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 8) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 117) {
            xx = 24.75 + (((tickAnim - 108) / 9) * (15-(24.75)));
            yy = 0 + (((tickAnim - 108) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 9) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 130) {
            xx = 15 + (((tickAnim - 117) / 13) * (-13.25-(15)));
            yy = 0 + (((tickAnim - 117) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 13) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = -13.25 + (((tickAnim - 130) / 10) * (11.75-(-13.25)));
            yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 158) {
            xx = 11.75 + (((tickAnim - 140) / 18) * (-13.25-(11.75)));
            yy = 0 + (((tickAnim - 140) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 18) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 168) {
            xx = -13.25 + (((tickAnim - 158) / 10) * (11.75-(-13.25)));
            yy = 0 + (((tickAnim - 158) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 10) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 178) {
            xx = 11.75 + (((tickAnim - 168) / 10) * (-13.25-(11.75)));
            yy = 0 + (((tickAnim - 168) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 10) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 193) {
            xx = -13.25 + (((tickAnim - 178) / 15) * (-17.55-(-13.25)));
            yy = 0 + (((tickAnim - 178) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 15) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 205) {
            xx = -17.55 + (((tickAnim - 193) / 12) * (0-(-17.55)));
            yy = 0 + (((tickAnim - 193) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.2-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -0.55 + (((tickAnim - 15) / 10) * (0-(-0.55)));
            zz = 0.2 + (((tickAnim - 15) / 10) * (0-(0.2)));
        }
        else if (tickAnim >= 25 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 25) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 18) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 25) / 18) * (0.2-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            yy = -0.55 + (((tickAnim - 43) / 10) * (0-(-0.55)));
            zz = 0.2 + (((tickAnim - 43) / 10) * (0-(0.2)));
        }
        else if (tickAnim >= 53 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 53) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 19) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 53) / 19) * (0.2-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 72) / 10) * (0-(0)));
            yy = -0.55 + (((tickAnim - 72) / 10) * (0-(-0.55)));
            zz = 0.2 + (((tickAnim - 72) / 10) * (0.2-(0.2)));
        }
        else if (tickAnim >= 82 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 82) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 82) / 18) * (0-(0)));
            zz = 0.2 + (((tickAnim - 82) / 18) * (0.2-(0.2)));
        }
        else if (tickAnim >= 100 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 100) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 17) * (0-(0)));
            zz = 0.2 + (((tickAnim - 100) / 17) * (0.2-(0.2)));
        }
        else if (tickAnim >= 117 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 117) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 13) * (-0.55-(0)));
            zz = 0.2 + (((tickAnim - 117) / 13) * (0.2-(0.2)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            yy = -0.55 + (((tickAnim - 130) / 10) * (0-(-0.55)));
            zz = 0.2 + (((tickAnim - 130) / 10) * (0-(0.2)));
        }
        else if (tickAnim >= 140 && tickAnim < 158) {
            xx = 0 + (((tickAnim - 140) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 18) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 140) / 18) * (0.2-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 158) / 10) * (0-(0)));
            yy = -0.55 + (((tickAnim - 158) / 10) * (0-(-0.55)));
            zz = 0.2 + (((tickAnim - 158) / 10) * (0-(0.2)));
        }
        else if (tickAnim >= 168 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 168) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 168) / 10) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 168) / 10) * (0.2-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 178) / 27) * (0-(0)));
            yy = -0.55 + (((tickAnim - 178) / 27) * (0-(-0.55)));
            zz = 0.2 + (((tickAnim - 178) / 27) * (0-(0.2)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 15.75 + (((tickAnim - 15) / 10) * (-16.75-(15.75)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -16.75 + (((tickAnim - 25) / 10) * (13-(-16.75)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 13 + (((tickAnim - 35) / 8) * (15.75-(13)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 15.75 + (((tickAnim - 43) / 10) * (-16.75-(15.75)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 63) {
            xx = -16.75 + (((tickAnim - 53) / 10) * (13-(-16.75)));
            yy = 0 + (((tickAnim - 53) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 10) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 72) {
            xx = 13 + (((tickAnim - 63) / 9) * (15.75-(13)));
            yy = 0 + (((tickAnim - 63) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 9) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 130) {
            xx = 15.75 + (((tickAnim - 72) / 58) * (15.75-(15.75)));
            yy = 0 + (((tickAnim - 72) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 58) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 15.75 + (((tickAnim - 130) / 10) * (-16.75-(15.75)));
            yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -16.75 + (((tickAnim - 140) / 10) * (13-(-16.75)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 10) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 158) {
            xx = 13 + (((tickAnim - 150) / 8) * (15.75-(13)));
            yy = 0 + (((tickAnim - 150) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 8) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 168) {
            xx = 15.75 + (((tickAnim - 158) / 10) * (-16.75-(15.75)));
            yy = 0 + (((tickAnim - 158) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 10) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 178) {
            xx = -16.75 + (((tickAnim - 168) / 10) * (15.75-(-16.75)));
            yy = 0 + (((tickAnim - 168) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 10) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 205) {
            xx = 15.75 + (((tickAnim - 178) / 27) * (0-(15.75)));
            yy = 0 + (((tickAnim - 178) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 9.5 + (((tickAnim - 15) / 10) * (-18.25-(9.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -18.25 + (((tickAnim - 25) / 8) * (6.9-(-18.25)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 6.9 + (((tickAnim - 33) / 10) * (9.5-(6.9)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 9.5 + (((tickAnim - 43) / 10) * (-18.25-(9.5)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 61) {
            xx = -18.25 + (((tickAnim - 53) / 8) * (6.9-(-18.25)));
            yy = 0 + (((tickAnim - 53) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 8) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 72) {
            xx = 6.9 + (((tickAnim - 61) / 11) * (9.5-(6.9)));
            yy = 0 + (((tickAnim - 61) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 11) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 130) {
            xx = 9.5 + (((tickAnim - 72) / 58) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 72) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 58) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 9.5 + (((tickAnim - 130) / 10) * (-18.25-(9.5)));
            yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 148) {
            xx = -18.25 + (((tickAnim - 140) / 8) * (6.9-(-18.25)));
            yy = 0 + (((tickAnim - 140) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 8) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 158) {
            xx = 6.9 + (((tickAnim - 148) / 10) * (9.5-(6.9)));
            yy = 0 + (((tickAnim - 148) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 10) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 168) {
            xx = 9.5 + (((tickAnim - 158) / 10) * (-18.25-(9.5)));
            yy = 0 + (((tickAnim - 158) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 10) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 173) {
            xx = -18.25 + (((tickAnim - 168) / 5) * (19.9-(-18.25)));
            yy = 0 + (((tickAnim - 168) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 5) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 178) {
            xx = 19.9 + (((tickAnim - 173) / 5) * (9.5-(19.9)));
            yy = 0 + (((tickAnim - 173) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 5) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 193) {
            xx = 9.5 + (((tickAnim - 178) / 15) * (11.91-(9.5)));
            yy = 0 + (((tickAnim - 178) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 15) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 205) {
            xx = 11.91 + (((tickAnim - 193) / 12) * (0-(11.91)));
            yy = 0 + (((tickAnim - 193) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (33-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 33 + (((tickAnim - 23) / 2) * (0-(33)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 38) / 3) * (11.25-(0)));
            yy = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 11.25 + (((tickAnim - 41) / 2) * (0-(11.25)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 43) / 8) * (33-(0)));
            yy = 0 + (((tickAnim - 43) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 8) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 53) {
            xx = 33 + (((tickAnim - 51) / 2) * (0-(33)));
            yy = 0 + (((tickAnim - 51) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 2) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 53) / 77) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 77) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 130) / 8) * (33-(0)));
            yy = 0 + (((tickAnim - 130) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 8) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 140) {
            xx = 33 + (((tickAnim - 138) / 2) * (0-(33)));
            yy = 0 + (((tickAnim - 138) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 2) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 140) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 13) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 156) {
            xx = 0 + (((tickAnim - 153) / 3) * (11.25-(0)));
            yy = 0 + (((tickAnim - 153) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 3) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 158) {
            xx = 11.25 + (((tickAnim - 156) / 2) * (0-(11.25)));
            yy = 0 + (((tickAnim - 156) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 2) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 166) {
            xx = 0 + (((tickAnim - 158) / 8) * (33-(0)));
            yy = 0 + (((tickAnim - 158) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 8) * (0-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 168) {
            xx = 33 + (((tickAnim - 166) / 2) * (0-(33)));
            yy = 0 + (((tickAnim - 166) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 166) / 2) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 168) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 168) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (18.25-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 18.25 + (((tickAnim - 25) / 10) * (0-(18.25)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 35) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 16) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 51) / 2) * (18.25-(0)));
            yy = 0 + (((tickAnim - 51) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 2) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 138) {
            xx = 18.25 + (((tickAnim - 53) / 85) * (0-(18.25)));
            yy = 0 + (((tickAnim - 53) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 85) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 138) / 2) * (18.25-(0)));
            yy = 0 + (((tickAnim - 138) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 2) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 18.25 + (((tickAnim - 140) / 10) * (0-(18.25)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 10) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 166) {
            xx = 0 + (((tickAnim - 150) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 16) * (0-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 166) / 2) * (18.25-(0)));
            yy = 0 + (((tickAnim - 166) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 166) / 2) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 205) {
            xx = 18.25 + (((tickAnim - 168) / 37) * (0-(18.25)));
            yy = 0 + (((tickAnim - 168) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 72) {
            xx = -7.5 + (((tickAnim - 20) / 52) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 52) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 82) {
            xx = -7.5 + (((tickAnim - 72) / 10) * (-20.25-(-7.5)));
            yy = 0 + (((tickAnim - 72) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 10) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 90) {
            xx = -20.25 + (((tickAnim - 82) / 8) * (26.25-(-20.25)));
            yy = 0 + (((tickAnim - 82) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 8) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 26.25 + (((tickAnim - 90) / 10) * (-20.25-(26.25)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 108) {
            xx = -20.25 + (((tickAnim - 100) / 8) * (26.25-(-20.25)));
            yy = 0 + (((tickAnim - 100) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 8) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 117) {
            xx = 26.25 + (((tickAnim - 108) / 9) * (3.5-(26.25)));
            yy = 0 + (((tickAnim - 108) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 9) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = 3.5 + (((tickAnim - 117) / 18) * (-7.5-(3.5)));
            yy = 0 + (((tickAnim - 117) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 18) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 178) {
            xx = -7.5 + (((tickAnim - 135) / 43) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 135) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 43) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 205) {
            xx = -7.5 + (((tickAnim - 178) / 27) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 178) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 72) {
            xx = 10.5 + (((tickAnim - 20) / 52) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 20) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 52) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 78) {
            xx = 10.5 + (((tickAnim - 72) / 6) * (-8.8-(10.5)));
            yy = 0 + (((tickAnim - 72) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 6) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 82) {
            xx = -8.8 + (((tickAnim - 78) / 4) * (-23.5-(-8.8)));
            yy = 0 + (((tickAnim - 78) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 4) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 90) {
            xx = -23.5 + (((tickAnim - 82) / 8) * (15.25-(-23.5)));
            yy = 0 + (((tickAnim - 82) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 8) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 96) {
            xx = 15.25 + (((tickAnim - 90) / 6) * (13.01-(15.25)));
            yy = 0 + (((tickAnim - 90) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 6) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 100) {
            xx = 13.01 + (((tickAnim - 96) / 4) * (-23.5-(13.01)));
            yy = 0 + (((tickAnim - 96) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 4) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 108) {
            xx = -23.5 + (((tickAnim - 100) / 8) * (15.25-(-23.5)));
            yy = 0 + (((tickAnim - 100) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 8) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 113) {
            xx = 15.25 + (((tickAnim - 108) / 5) * (13.01-(15.25)));
            yy = 0 + (((tickAnim - 108) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 5) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 117) {
            xx = 13.01 + (((tickAnim - 113) / 4) * (8.25-(13.01)));
            yy = 0 + (((tickAnim - 113) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 4) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = 8.25 + (((tickAnim - 117) / 18) * (10.5-(8.25)));
            yy = 0 + (((tickAnim - 117) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 18) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 178) {
            xx = 10.5 + (((tickAnim - 135) / 43) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 135) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 43) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 205) {
            xx = 10.5 + (((tickAnim - 178) / 27) * (0-(10.5)));
            yy = 0 + (((tickAnim - 178) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 72) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 72) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 6) * (1.6-(0)));
            zz = 0 + (((tickAnim - 72) / 6) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 78) / 4) * (0-(0)));
            yy = 1.6 + (((tickAnim - 78) / 4) * (0-(1.6)));
            zz = 0 + (((tickAnim - 78) / 4) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 82) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 82) / 4) * (1.2-(0)));
            zz = 0 + (((tickAnim - 82) / 4) * (0.7-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 86) / 4) * (0-(0)));
            yy = 1.2 + (((tickAnim - 86) / 4) * (0-(1.2)));
            zz = 0.7 + (((tickAnim - 86) / 4) * (0-(0.7)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 100) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 4) * (1.2-(0)));
            zz = 0 + (((tickAnim - 100) / 4) * (0.7-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 104) / 4) * (0-(0)));
            yy = 1.2 + (((tickAnim - 104) / 4) * (0-(1.2)));
            zz = 0.7 + (((tickAnim - 104) / 4) * (0-(0.7)));
        }
        else if (tickAnim >= 108 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 108) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 108) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 9) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-51.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 72) {
            xx = -51.5 + (((tickAnim - 20) / 52) * (-51.5-(-51.5)));
            yy = 0 + (((tickAnim - 20) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 52) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 78) {
            xx = -51.5 + (((tickAnim - 72) / 6) * (-35.59-(-51.5)));
            yy = 0 + (((tickAnim - 72) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 6) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 82) {
            xx = -35.59 + (((tickAnim - 78) / 4) * (2.5-(-35.59)));
            yy = 0 + (((tickAnim - 78) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 4) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 86) {
            xx = 2.5 + (((tickAnim - 82) / 4) * (32.38-(2.5)));
            yy = 0 + (((tickAnim - 82) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 4) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 90) {
            xx = 32.38 + (((tickAnim - 86) / 4) * (15.25-(32.38)));
            yy = 0 + (((tickAnim - 86) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 4) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 96) {
            xx = 15.25 + (((tickAnim - 90) / 6) * (-56.16-(15.25)));
            yy = 0 + (((tickAnim - 90) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 6) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 98) {
            xx = -56.16 + (((tickAnim - 96) / 2) * (-42-(-56.16)));
            yy = 0 + (((tickAnim - 96) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 2) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 100) {
            xx = -42 + (((tickAnim - 98) / 2) * (2.5-(-42)));
            yy = 0 + (((tickAnim - 98) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 2) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 104) {
            xx = 2.5 + (((tickAnim - 100) / 4) * (32.38-(2.5)));
            yy = 0 + (((tickAnim - 100) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 4) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 108) {
            xx = 32.38 + (((tickAnim - 104) / 4) * (15.25-(32.38)));
            yy = 0 + (((tickAnim - 104) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 4) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 113) {
            xx = 15.25 + (((tickAnim - 108) / 5) * (-56.16-(15.25)));
            yy = 0 + (((tickAnim - 108) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 5) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 115) {
            xx = -56.16 + (((tickAnim - 113) / 2) * (-42-(-56.16)));
            yy = 0 + (((tickAnim - 113) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 2) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 117) {
            xx = -42 + (((tickAnim - 115) / 2) * (-40.75-(-42)));
            yy = 0 + (((tickAnim - 115) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 2) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = -40.75 + (((tickAnim - 117) / 18) * (-51.5-(-40.75)));
            yy = 0 + (((tickAnim - 117) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 18) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 178) {
            xx = -51.5 + (((tickAnim - 135) / 43) * (-51.5-(-51.5)));
            yy = 0 + (((tickAnim - 135) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 43) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 205) {
            xx = -51.5 + (((tickAnim - 178) / 27) * (0-(-51.5)));
            yy = 0 + (((tickAnim - 178) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.15-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 20) / 52) * (0-(0)));
            yy = -0.5 + (((tickAnim - 20) / 52) * (-0.5-(-0.5)));
            zz = -0.15 + (((tickAnim - 20) / 52) * (-0.15-(-0.15)));
        }
        else if (tickAnim >= 72 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 72) / 6) * (0-(0)));
            yy = -0.5 + (((tickAnim - 72) / 6) * (-0.15-(-0.5)));
            zz = -0.15 + (((tickAnim - 72) / 6) * (-0.15-(-0.15)));
        }
        else if (tickAnim >= 78 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 78) / 4) * (0-(0)));
            yy = -0.15 + (((tickAnim - 78) / 4) * (0-(-0.15)));
            zz = -0.15 + (((tickAnim - 78) / 4) * (0-(-0.15)));
        }
        else if (tickAnim >= 82 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 82) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 82) / 4) * (1.15-(0)));
            zz = 0 + (((tickAnim - 82) / 4) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 86) / 4) * (0-(0)));
            yy = 1.15 + (((tickAnim - 86) / 4) * (0-(1.15)));
            zz = 0 + (((tickAnim - 86) / 4) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 90) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 6) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 90) / 6) * (-0.3-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 96) / 2) * (0-(0)));
            yy = -0.525 + (((tickAnim - 96) / 2) * (-0.615-(-0.525)));
            zz = -0.3 + (((tickAnim - 96) / 2) * (-0.16-(-0.3)));
        }
        else if (tickAnim >= 98 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 98) / 2) * (0-(0)));
            yy = -0.615 + (((tickAnim - 98) / 2) * (0-(-0.615)));
            zz = -0.16 + (((tickAnim - 98) / 2) * (0-(-0.16)));
        }
        else if (tickAnim >= 100 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 100) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 4) * (1.15-(0)));
            zz = 0 + (((tickAnim - 100) / 4) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 104) / 4) * (0-(0)));
            yy = 1.15 + (((tickAnim - 104) / 4) * (0-(1.15)));
            zz = 0 + (((tickAnim - 104) / 4) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 108) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 108) / 5) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 108) / 5) * (-0.3-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 113) / 2) * (0-(0)));
            yy = -0.525 + (((tickAnim - 113) / 2) * (-0.615-(-0.525)));
            zz = -0.3 + (((tickAnim - 113) / 2) * (-0.16-(-0.3)));
        }
        else if (tickAnim >= 115 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 115) / 2) * (0-(0)));
            yy = -0.615 + (((tickAnim - 115) / 2) * (-0.5-(-0.615)));
            zz = -0.16 + (((tickAnim - 115) / 2) * (-0.15-(-0.16)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 117) / 18) * (0-(0)));
            yy = -0.5 + (((tickAnim - 117) / 18) * (-0.5-(-0.5)));
            zz = -0.15 + (((tickAnim - 117) / 18) * (-0.15-(-0.15)));
        }
        else if (tickAnim >= 135 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 135) / 43) * (0-(0)));
            yy = -0.5 + (((tickAnim - 135) / 43) * (-0.5-(-0.5)));
            zz = -0.15 + (((tickAnim - 135) / 43) * (-0.15-(-0.15)));
        }
        else if (tickAnim >= 178 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 178) / 27) * (0-(0)));
            yy = -0.5 + (((tickAnim - 178) / 27) * (0-(-0.5)));
            zz = -0.15 + (((tickAnim - 178) / 27) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (41.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 72) {
            xx = 41.25 + (((tickAnim - 20) / 52) * (41.25-(41.25)));
            yy = 0 + (((tickAnim - 20) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 52) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 78) {
            xx = 41.25 + (((tickAnim - 72) / 6) * (68.23-(41.25)));
            yy = 0 + (((tickAnim - 72) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 6) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 82) {
            xx = 68.23 + (((tickAnim - 78) / 4) * (44.5-(68.23)));
            yy = 0 + (((tickAnim - 78) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 4) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 86) {
            xx = 44.5 + (((tickAnim - 82) / 4) * (-23.52-(44.5)));
            yy = 0 + (((tickAnim - 82) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 4) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 90) {
            xx = -23.52 + (((tickAnim - 86) / 4) * (25.25-(-23.52)));
            yy = 0 + (((tickAnim - 86) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 4) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 96) {
            xx = 25.25 + (((tickAnim - 90) / 6) * (59.18-(25.25)));
            yy = 0 + (((tickAnim - 90) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 6) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 98) {
            xx = 59.18 + (((tickAnim - 96) / 2) * (64.26-(59.18)));
            yy = 0 + (((tickAnim - 96) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 2) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 100) {
            xx = 64.26 + (((tickAnim - 98) / 2) * (44.5-(64.26)));
            yy = 0 + (((tickAnim - 98) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 2) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 104) {
            xx = 44.5 + (((tickAnim - 100) / 4) * (-23.52-(44.5)));
            yy = 0 + (((tickAnim - 100) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 4) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 108) {
            xx = -23.52 + (((tickAnim - 104) / 4) * (25.25-(-23.52)));
            yy = 0 + (((tickAnim - 104) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 4) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 113) {
            xx = 25.25 + (((tickAnim - 108) / 5) * (59.18-(25.25)));
            yy = 0 + (((tickAnim - 108) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 5) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 117) {
            xx = 59.18 + (((tickAnim - 113) / 4) * (33-(59.18)));
            yy = 0 + (((tickAnim - 113) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 4) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = 33 + (((tickAnim - 117) / 18) * (41.25-(33)));
            yy = 0 + (((tickAnim - 117) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 18) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 178) {
            xx = 41.25 + (((tickAnim - 135) / 43) * (41.25-(41.25)));
            yy = 0 + (((tickAnim - 135) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 43) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 205) {
            xx = 41.25 + (((tickAnim - 178) / 27) * (0-(41.25)));
            yy = 0 + (((tickAnim - 178) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 72) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 72) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 6) * (1.125-(0)));
            zz = 0 + (((tickAnim - 72) / 6) * (0.55-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 78) / 4) * (0-(0)));
            yy = 1.125 + (((tickAnim - 78) / 4) * (0-(1.125)));
            zz = 0.55 + (((tickAnim - 78) / 4) * (0-(0.55)));
        }
        else if (tickAnim >= 82 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 82) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 82) / 1) * (2.155-(0)));
            zz = 0 + (((tickAnim - 82) / 1) * (1.03-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 83) / 0) * (0-(0)));
            yy = 2.155 + (((tickAnim - 83) / 0) * (2.685-(2.155)));
            zz = 1.03 + (((tickAnim - 83) / 0) * (1.775-(1.03)));
        }
        else if (tickAnim >= 83 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 83) / 3) * (0-(0)));
            yy = 2.685 + (((tickAnim - 83) / 3) * (2.525-(2.685)));
            zz = 1.775 + (((tickAnim - 83) / 3) * (1.305-(1.775)));
        }
        else if (tickAnim >= 86 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 86) / 2) * (0-(0)));
            yy = 2.525 + (((tickAnim - 86) / 2) * (1.79-(2.525)));
            zz = 1.305 + (((tickAnim - 86) / 2) * (1.305-(1.305)));
        }
        else if (tickAnim >= 88 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 88) / 2) * (0-(0)));
            yy = 1.79 + (((tickAnim - 88) / 2) * (0.5-(1.79)));
            zz = 1.305 + (((tickAnim - 88) / 2) * (0.275-(1.305)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 90) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 90) / 3) * (2.98-(0.5)));
            zz = 0.275 + (((tickAnim - 90) / 3) * (1.86-(0.275)));
        }
        else if (tickAnim >= 93 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 93) / 7) * (0-(0)));
            yy = 2.98 + (((tickAnim - 93) / 7) * (0-(2.98)));
            zz = 1.86 + (((tickAnim - 93) / 7) * (0-(1.86)));
        }
        else if (tickAnim >= 100 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 100) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 2) * (3.16-(0)));
            zz = 0 + (((tickAnim - 100) / 2) * (1.775-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 102) / 2) * (0-(0)));
            yy = 3.16 + (((tickAnim - 102) / 2) * (2.525-(3.16)));
            zz = 1.775 + (((tickAnim - 102) / 2) * (1.305-(1.775)));
        }
        else if (tickAnim >= 104 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 104) / 2) * (0-(0)));
            yy = 2.525 + (((tickAnim - 104) / 2) * (1.79-(2.525)));
            zz = 1.305 + (((tickAnim - 104) / 2) * (1.305-(1.305)));
        }
        else if (tickAnim >= 106 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 106) / 2) * (0-(0)));
            yy = 1.79 + (((tickAnim - 106) / 2) * (0.5-(1.79)));
            zz = 1.305 + (((tickAnim - 106) / 2) * (0.275-(1.305)));
        }
        else if (tickAnim >= 108 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 108) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 108) / 3) * (2.98-(0.5)));
            zz = 0.275 + (((tickAnim - 108) / 3) * (1.86-(0.275)));
        }
        else if (tickAnim >= 111 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 111) / 2) * (0-(0)));
            yy = 2.98 + (((tickAnim - 111) / 2) * (2.98-(2.98)));
            zz = 1.86 + (((tickAnim - 111) / 2) * (1.86-(1.86)));
        }
        else if (tickAnim >= 113 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 113) / 4) * (0-(0)));
            yy = 2.98 + (((tickAnim - 113) / 4) * (0-(2.98)));
            zz = 1.86 + (((tickAnim - 113) / 4) * (0-(1.86)));
        }
        else if (tickAnim >= 117 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 117) / 88) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 88) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 72) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 72) / 6) * (14.25-(0)));
            yy = 0 + (((tickAnim - 72) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 6) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 82) {
            xx = 14.25 + (((tickAnim - 78) / 4) * (0-(14.25)));
            yy = 0 + (((tickAnim - 78) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 4) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 82) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 82) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 4) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 86) / 4) * (-80.75-(0)));
            yy = 0 + (((tickAnim - 86) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 4) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = -80.75 + (((tickAnim - 90) / 3) * (0-(-80.75)));
            yy = 0 + (((tickAnim - 90) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 3) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 93) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 93) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 3) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 96) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 4) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 100) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 4) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 104) / 4) * (-80.75-(0)));
            yy = 0 + (((tickAnim - 104) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 4) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 111) {
            xx = -80.75 + (((tickAnim - 108) / 3) * (0-(-80.75)));
            yy = 0 + (((tickAnim - 108) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 3) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 114) {
            xx = 0 + (((tickAnim - 111) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 111) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 3) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 114) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 114) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 3) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 117) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 61) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 178) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 178) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 0) / 86) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 86) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 86) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 86) / 2) * (0.085-(0)));
            zz = 0 + (((tickAnim - 86) / 2) * (1.16-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 88) / 2) * (0-(0)));
            yy = 0.085 + (((tickAnim - 88) / 2) * (-0.375-(0.085)));
            zz = 1.16 + (((tickAnim - 88) / 2) * (0.025-(1.16)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 90) / 3) * (0-(0)));
            yy = -0.375 + (((tickAnim - 90) / 3) * (0-(-0.375)));
            zz = 0.025 + (((tickAnim - 90) / 3) * (0-(0.025)));
        }
        else if (tickAnim >= 93 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 93) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 93) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 3) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 96) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 8) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 104) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 104) / 2) * (0.085-(0)));
            zz = 0 + (((tickAnim - 104) / 2) * (1.16-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 106) / 2) * (0-(0)));
            yy = 0.085 + (((tickAnim - 106) / 2) * (-0.375-(0.085)));
            zz = 1.16 + (((tickAnim - 106) / 2) * (0.025-(1.16)));
        }
        else if (tickAnim >= 108 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 108) / 3) * (0-(0)));
            yy = -0.375 + (((tickAnim - 108) / 3) * (0-(-0.375)));
            zz = 0.025 + (((tickAnim - 108) / 3) * (0-(0.025)));
        }
        else if (tickAnim >= 111 && tickAnim < 114) {
            xx = 0 + (((tickAnim - 111) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 111) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 3) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 114) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 114) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 64) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 178) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 178) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 72) {
            xx = -7.5 + (((tickAnim - 20) / 52) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 52) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 82) {
            xx = -7.5 + (((tickAnim - 72) / 10) * (3.5-(-7.5)));
            yy = 0 + (((tickAnim - 72) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 10) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 90) {
            xx = 3.5 + (((tickAnim - 82) / 8) * (-0.75-(3.5)));
            yy = 0 + (((tickAnim - 82) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 8) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -0.75 + (((tickAnim - 90) / 10) * (3.5-(-0.75)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 108) {
            xx = 3.5 + (((tickAnim - 100) / 8) * (-0.75-(3.5)));
            yy = 0 + (((tickAnim - 100) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 8) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 117) {
            xx = -0.75 + (((tickAnim - 108) / 9) * (3.5-(-0.75)));
            yy = 0 + (((tickAnim - 108) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 9) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = 3.5 + (((tickAnim - 117) / 18) * (-7.5-(3.5)));
            yy = 0 + (((tickAnim - 117) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 18) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 178) {
            xx = -7.5 + (((tickAnim - 135) / 43) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 135) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 43) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 205) {
            xx = -7.5 + (((tickAnim - 178) / 27) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 178) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 72) {
            xx = 10.5 + (((tickAnim - 20) / 52) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 20) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 52) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 82) {
            xx = 10.5 + (((tickAnim - 72) / 10) * (8.25-(10.5)));
            yy = 0 + (((tickAnim - 72) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 10) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 90) {
            xx = 8.25 + (((tickAnim - 82) / 8) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 82) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 8) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 8.25 + (((tickAnim - 90) / 10) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 108) {
            xx = 8.25 + (((tickAnim - 100) / 8) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 100) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 8) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 117) {
            xx = 8.25 + (((tickAnim - 108) / 9) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 108) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 9) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = 8.25 + (((tickAnim - 117) / 18) * (10.5-(8.25)));
            yy = 0 + (((tickAnim - 117) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 18) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 178) {
            xx = 10.5 + (((tickAnim - 135) / 43) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 135) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 43) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 205) {
            xx = 10.5 + (((tickAnim - 178) / 27) * (0-(10.5)));
            yy = 0 + (((tickAnim - 178) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-51.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 72) {
            xx = -51.5 + (((tickAnim - 20) / 52) * (-51.5-(-51.5)));
            yy = 0 + (((tickAnim - 20) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 52) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 82) {
            xx = -51.5 + (((tickAnim - 72) / 10) * (-40.75-(-51.5)));
            yy = 0 + (((tickAnim - 72) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 10) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 90) {
            xx = -40.75 + (((tickAnim - 82) / 8) * (-40.75-(-40.75)));
            yy = 0 + (((tickAnim - 82) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 8) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -40.75 + (((tickAnim - 90) / 10) * (-40.75-(-40.75)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 108) {
            xx = -40.75 + (((tickAnim - 100) / 8) * (-40.75-(-40.75)));
            yy = 0 + (((tickAnim - 100) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 8) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 117) {
            xx = -40.75 + (((tickAnim - 108) / 9) * (-40.75-(-40.75)));
            yy = 0 + (((tickAnim - 108) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 9) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = -40.75 + (((tickAnim - 117) / 18) * (-51.5-(-40.75)));
            yy = 0 + (((tickAnim - 117) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 18) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 178) {
            xx = -51.5 + (((tickAnim - 135) / 43) * (-51.5-(-51.5)));
            yy = 0 + (((tickAnim - 135) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 43) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 205) {
            xx = -51.5 + (((tickAnim - 178) / 27) * (0-(-51.5)));
            yy = 0 + (((tickAnim - 178) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.15-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 20) / 52) * (0-(0)));
            yy = -0.5 + (((tickAnim - 20) / 52) * (-0.5-(-0.5)));
            zz = -0.15 + (((tickAnim - 20) / 52) * (-0.15-(-0.15)));
        }
        else if (tickAnim >= 72 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 72) / 45) * (0-(0)));
            yy = -0.5 + (((tickAnim - 72) / 45) * (-0.5-(-0.5)));
            zz = -0.15 + (((tickAnim - 72) / 45) * (-0.15-(-0.15)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 117) / 18) * (0-(0)));
            yy = -0.5 + (((tickAnim - 117) / 18) * (-0.5-(-0.5)));
            zz = -0.15 + (((tickAnim - 117) / 18) * (-0.15-(-0.15)));
        }
        else if (tickAnim >= 135 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 135) / 43) * (0-(0)));
            yy = -0.5 + (((tickAnim - 135) / 43) * (-0.5-(-0.5)));
            zz = -0.15 + (((tickAnim - 135) / 43) * (-0.15-(-0.15)));
        }
        else if (tickAnim >= 178 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 178) / 27) * (0-(0)));
            yy = -0.5 + (((tickAnim - 178) / 27) * (0-(-0.5)));
            zz = -0.15 + (((tickAnim - 178) / 27) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (41.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 72) {
            xx = 41.25 + (((tickAnim - 20) / 52) * (41.25-(41.25)));
            yy = 0 + (((tickAnim - 20) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 52) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 82) {
            xx = 41.25 + (((tickAnim - 72) / 10) * (33-(41.25)));
            yy = 0 + (((tickAnim - 72) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 10) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 90) {
            xx = 33 + (((tickAnim - 82) / 8) * (33-(33)));
            yy = 0 + (((tickAnim - 82) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 8) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 33 + (((tickAnim - 90) / 10) * (33-(33)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 108) {
            xx = 33 + (((tickAnim - 100) / 8) * (33-(33)));
            yy = 0 + (((tickAnim - 100) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 8) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 117) {
            xx = 33 + (((tickAnim - 108) / 9) * (33-(33)));
            yy = 0 + (((tickAnim - 108) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 9) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = 33 + (((tickAnim - 117) / 18) * (41.25-(33)));
            yy = 0 + (((tickAnim - 117) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 18) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 178) {
            xx = 41.25 + (((tickAnim - 135) / 43) * (41.25-(41.25)));
            yy = 0 + (((tickAnim - 135) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 43) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 205) {
            xx = 41.25 + (((tickAnim - 178) / 27) * (0-(41.25)));
            yy = 0 + (((tickAnim - 178) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 27) * (0-(0)));
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
    public void animSand(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYuanyanglong entity = (EntityPrehistoricFloraYuanyanglong) entitylivingbaseIn;
        int animCycle = 450;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = -19.75 + (((tickAnim - 30) / 25) * (4-(-19.75)));
            yy = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 107) {
            xx = 4 + (((tickAnim - 55) / 52) * (4-(4)));
            yy = 0 + (((tickAnim - 55) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 52) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 160) {
            xx = 4 + (((tickAnim - 107) / 53) * (4-(4)));
            yy = 0 + (((tickAnim - 107) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 53) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = 4 + (((tickAnim - 160) / 10) * (4.02529-(4)));
            yy = 0 + (((tickAnim - 160) / 10) * (0.89258-(0)));
            zz = 0 + (((tickAnim - 160) / 10) * (-21.4115+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*35-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 195) {
            xx = 4.02529 + (((tickAnim - 170) / 25) * (0.12514-(4.02529)));
            yy = 0.89258 + (((tickAnim - 170) / 25) * (4.12101-(0.89258)));
            zz = -21.4115+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*35 + (((tickAnim - 170) / 25) * (-68.36341-(-21.4115+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*35)));
        }
        else if (tickAnim >= 195 && tickAnim < 390) {
            xx = 0.12514 + (((tickAnim - 195) / 195) * (0.12514-(0.12514)));
            yy = 4.12101 + (((tickAnim - 195) / 195) * (4.12101-(4.12101)));
            zz = -68.36341 + (((tickAnim - 195) / 195) * (-68.36341-(-68.36341)));
        }
        else if (tickAnim >= 390 && tickAnim < 405) {
            xx = 0.12514 + (((tickAnim - 390) / 15) * (-1.06976-(0.12514)));
            yy = 4.12101 + (((tickAnim - 390) / 15) * (3.98194-(4.12101)));
            zz = -68.36341 + (((tickAnim - 390) / 15) * (-85.1551-(-68.36341)));
        }
        else if (tickAnim >= 405 && tickAnim < 411) {
            xx = -1.06976 + (((tickAnim - 405) / 6) * (0.06246-(-1.06976)));
            yy = 3.98194 + (((tickAnim - 405) / 6) * (2.91981-(3.98194)));
            zz = -85.1551 + (((tickAnim - 405) / 6) * (-44.04795-(-85.1551)));
        }
        else if (tickAnim >= 411 && tickAnim < 418) {
            xx = 0.06246 + (((tickAnim - 411) / 7) * (0.36693-(0.06246)));
            yy = 2.91981 + (((tickAnim - 411) / 7) * (1.50197-(2.91981)));
            zz = -44.04795 + (((tickAnim - 411) / 7) * (-10.81514-(-44.04795)));
        }
        else if (tickAnim >= 418 && tickAnim < 425) {
            xx = 0.36693 + (((tickAnim - 418) / 7) * (0-(0.36693)));
            yy = 1.50197 + (((tickAnim - 418) / 7) * (0-(1.50197)));
            zz = -10.81514 + (((tickAnim - 418) / 7) * (0-(-10.81514)));
        }
        else if (tickAnim >= 425 && tickAnim < 438) {
            xx = 0 + (((tickAnim - 425) / 13) * (11.75-(0)));
            yy = 0 + (((tickAnim - 425) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 13) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 450) {
            xx = 11.75 + (((tickAnim - 438) / 12) * (0-(11.75)));
            yy = 0 + (((tickAnim - 438) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 438) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-8.525-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (5.4-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            yy = -8.525 + (((tickAnim - 30) / 25) * (-11.97-(-8.525)));
            zz = 5.4 + (((tickAnim - 30) / 25) * (5.4-(5.4)));
        }
        else if (tickAnim >= 55 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 55) / 52) * (0-(0)));
            yy = -11.97 + (((tickAnim - 55) / 52) * (-11.97-(-11.97)));
            zz = 5.4 + (((tickAnim - 55) / 52) * (5.4-(5.4)));
        }
        else if (tickAnim >= 107 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 107) / 53) * (0-(0)));
            yy = -11.97 + (((tickAnim - 107) / 53) * (-11.97-(-11.97)));
            zz = 5.4 + (((tickAnim - 107) / 53) * (5.4-(5.4)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            yy = -11.97 + (((tickAnim - 160) / 10) * (-11.97-(-11.97)));
            zz = 5.4 + (((tickAnim - 160) / 10) * (5.4-(5.4)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 170) / 15) * (-4.475-(0)));
            yy = -11.97 + (((tickAnim - 170) / 15) * (-16.345-(-11.97)));
            zz = 5.4 + (((tickAnim - 170) / 15) * (5.4-(5.4)));
        }
        else if (tickAnim >= 185 && tickAnim < 195) {
            xx = -4.475 + (((tickAnim - 185) / 10) * (-5.245-(-4.475)));
            yy = -16.345 + (((tickAnim - 185) / 10) * (-17.44-(-16.345)));
            zz = 5.4 + (((tickAnim - 185) / 10) * (5.4-(5.4)));
        }
        else if (tickAnim >= 195 && tickAnim < 390) {
            xx = -5.245 + (((tickAnim - 195) / 195) * (-5.245-(-5.245)));
            yy = -17.44 + (((tickAnim - 195) / 195) * (-17.44-(-17.44)));
            zz = 5.4 + (((tickAnim - 195) / 195) * (5.4-(5.4)));
        }
        else if (tickAnim >= 390 && tickAnim < 405) {
            xx = -5.245 + (((tickAnim - 390) / 15) * (-5.245-(-5.245)));
            yy = -17.44 + (((tickAnim - 390) / 15) * (-17.44-(-17.44)));
            zz = 5.4 + (((tickAnim - 390) / 15) * (5.4-(5.4)));
        }
        else if (tickAnim >= 405 && tickAnim < 411) {
            xx = -5.245 + (((tickAnim - 405) / 6) * (-3.695-(-5.245)));
            yy = -17.44 + (((tickAnim - 405) / 6) * (-15.695-(-17.44)));
            zz = 5.4 + (((tickAnim - 405) / 6) * (4.87-(5.4)));
        }
        else if (tickAnim >= 411 && tickAnim < 418) {
            xx = -3.695 + (((tickAnim - 411) / 7) * (-0.36-(-3.695)));
            yy = -15.695 + (((tickAnim - 411) / 7) * (-12.19-(-15.695)));
            zz = 4.87 + (((tickAnim - 411) / 7) * (4.25-(4.87)));
        }
        else if (tickAnim >= 418 && tickAnim < 425) {
            xx = -0.36 + (((tickAnim - 418) / 7) * (0-(-0.36)));
            yy = -12.19 + (((tickAnim - 418) / 7) * (-11.55-(-12.19)));
            zz = 4.25 + (((tickAnim - 418) / 7) * (3.55-(4.25)));
        }
        else if (tickAnim >= 425 && tickAnim < 438) {
            xx = 0 + (((tickAnim - 425) / 13) * (0-(0)));
            yy = -11.55 + (((tickAnim - 425) / 13) * (-5.39-(-11.55)));
            zz = 3.55 + (((tickAnim - 425) / 13) * (-0.54-(3.55)));
        }
        else if (tickAnim >= 438 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 438) / 12) * (0-(0)));
            yy = -5.39 + (((tickAnim - 438) / 12) * (0-(-5.39)));
            zz = -0.54 + (((tickAnim - 438) / 12) * (0-(-0.54)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = -17 + (((tickAnim - 30) / 25) * (-46.05488-(-17)));
            yy = 0 + (((tickAnim - 30) / 25) * (-1.68754-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (-3.17287-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 160) {
            xx = -46.05488 + (((tickAnim - 55) / 105) * (-46.05488-(-46.05488)));
            yy = -1.68754 + (((tickAnim - 55) / 105) * (-1.68754-(-1.68754)));
            zz = -3.17287 + (((tickAnim - 55) / 105) * (-3.17287-(-3.17287)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = -46.05488 + (((tickAnim - 160) / 8) * (-45.30797-(-46.05488)));
            yy = -1.68754 + (((tickAnim - 160) / 8) * (-7.31335-(-1.68754)));
            zz = -3.17287 + (((tickAnim - 160) / 8) * (-12.65859-(-3.17287)));
        }
        else if (tickAnim >= 168 && tickAnim < 172) {
            xx = -45.30797 + (((tickAnim - 168) / 4) * (-45.30734-(-45.30797)));
            yy = -7.31335 + (((tickAnim - 168) / 4) * (-4.6563-(-7.31335)));
            zz = -12.65859 + (((tickAnim - 168) / 4) * (-20.91855-(-12.65859)));
        }
        else if (tickAnim >= 172 && tickAnim < 174) {
            xx = -45.30734 + (((tickAnim - 172) / 2) * (-45.56621-(-45.30734)));
            yy = -4.6563 + (((tickAnim - 172) / 2) * (-4.74822-(-4.6563)));
            zz = -20.91855 + (((tickAnim - 172) / 2) * (-17.08727-(-20.91855)));
        }
        else if (tickAnim >= 174 && tickAnim < 185) {
            xx = -45.56621 + (((tickAnim - 174) / 11) * (-14.7876-(-45.56621)));
            yy = -4.74822 + (((tickAnim - 174) / 11) * (-7.34956-(-4.74822)));
            zz = -17.08727 + (((tickAnim - 174) / 11) * (-7.72325-(-17.08727)));
        }
        else if (tickAnim >= 185 && tickAnim < 194) {
            xx = -14.7876 + (((tickAnim - 185) / 9) * (-45.54888-(-14.7876)));
            yy = -7.34956 + (((tickAnim - 185) / 9) * (-13.50294-(-7.34956)));
            zz = -7.72325 + (((tickAnim - 185) / 9) * (-4.90066-(-7.72325)));
        }
        else if (tickAnim >= 194 && tickAnim < 202) {
            xx = -45.54888 + (((tickAnim - 194) / 8) * (-44.50347-(-45.54888)));
            yy = -13.50294 + (((tickAnim - 194) / 8) * (3.49013-(-13.50294)));
            zz = -4.90066 + (((tickAnim - 194) / 8) * (-10.98996-(-4.90066)));
        }
        else if (tickAnim >= 202 && tickAnim < 208) {
            xx = -44.50347 + (((tickAnim - 202) / 6) * (13.24653-(-44.50347)));
            yy = 3.49013 + (((tickAnim - 202) / 6) * (3.49013-(3.49013)));
            zz = -10.98996 + (((tickAnim - 202) / 6) * (-10.98996-(-10.98996)));
        }
        else if (tickAnim >= 208 && tickAnim < 212) {
            xx = 13.24653 + (((tickAnim - 208) / 4) * (-28.46151-(13.24653)));
            yy = 3.49013 + (((tickAnim - 208) / 4) * (-3.31267-(3.49013)));
            zz = -10.98996 + (((tickAnim - 208) / 4) * (-18.17773-(-10.98996)));
        }
        else if (tickAnim >= 212 && tickAnim < 216) {
            xx = -28.46151 + (((tickAnim - 212) / 4) * (-44.50347-(-28.46151)));
            yy = -3.31267 + (((tickAnim - 212) / 4) * (3.49013-(-3.31267)));
            zz = -18.17773 + (((tickAnim - 212) / 4) * (-10.98996-(-18.17773)));
        }
        else if (tickAnim >= 216 && tickAnim < 223) {
            xx = -44.50347 + (((tickAnim - 216) / 7) * (13.24653-(-44.50347)));
            yy = 3.49013 + (((tickAnim - 216) / 7) * (3.49013-(3.49013)));
            zz = -10.98996 + (((tickAnim - 216) / 7) * (-10.98996-(-10.98996)));
        }
        else if (tickAnim >= 223 && tickAnim < 227) {
            xx = 13.24653 + (((tickAnim - 223) / 4) * (-28.46151-(13.24653)));
            yy = 3.49013 + (((tickAnim - 223) / 4) * (-3.31267-(3.49013)));
            zz = -10.98996 + (((tickAnim - 223) / 4) * (-18.17773-(-10.98996)));
        }
        else if (tickAnim >= 227 && tickAnim < 230) {
            xx = -28.46151 + (((tickAnim - 227) / 3) * (-44.50347-(-28.46151)));
            yy = -3.31267 + (((tickAnim - 227) / 3) * (3.49013-(-3.31267)));
            zz = -18.17773 + (((tickAnim - 227) / 3) * (-10.98996-(-18.17773)));
        }
        else if (tickAnim >= 230 && tickAnim < 237) {
            xx = -44.50347 + (((tickAnim - 230) / 7) * (13.24653-(-44.50347)));
            yy = 3.49013 + (((tickAnim - 230) / 7) * (3.49013-(3.49013)));
            zz = -10.98996 + (((tickAnim - 230) / 7) * (-10.98996-(-10.98996)));
        }
        else if (tickAnim >= 237 && tickAnim < 241) {
            xx = 13.24653 + (((tickAnim - 237) / 4) * (-28.46151-(13.24653)));
            yy = 3.49013 + (((tickAnim - 237) / 4) * (-3.31267-(3.49013)));
            zz = -10.98996 + (((tickAnim - 237) / 4) * (-18.17773-(-10.98996)));
        }
        else if (tickAnim >= 241 && tickAnim < 244) {
            xx = -28.46151 + (((tickAnim - 241) / 3) * (-44.50347-(-28.46151)));
            yy = -3.31267 + (((tickAnim - 241) / 3) * (3.49013-(-3.31267)));
            zz = -18.17773 + (((tickAnim - 241) / 3) * (-10.98996-(-18.17773)));
        }
        else if (tickAnim >= 244 && tickAnim < 251) {
            xx = -44.50347 + (((tickAnim - 244) / 7) * (13.24653-(-44.50347)));
            yy = 3.49013 + (((tickAnim - 244) / 7) * (3.49013-(3.49013)));
            zz = -10.98996 + (((tickAnim - 244) / 7) * (-10.98996-(-10.98996)));
        }
        else if (tickAnim >= 251 && tickAnim < 254) {
            xx = 13.24653 + (((tickAnim - 251) / 3) * (-28.46151-(13.24653)));
            yy = 3.49013 + (((tickAnim - 251) / 3) * (-3.31267-(3.49013)));
            zz = -10.98996 + (((tickAnim - 251) / 3) * (-18.17773-(-10.98996)));
        }
        else if (tickAnim >= 254 && tickAnim < 258) {
            xx = -28.46151 + (((tickAnim - 254) / 4) * (-44.50347-(-28.46151)));
            yy = -3.31267 + (((tickAnim - 254) / 4) * (3.49013-(-3.31267)));
            zz = -18.17773 + (((tickAnim - 254) / 4) * (-10.98996-(-18.17773)));
        }
        else if (tickAnim >= 258 && tickAnim < 265) {
            xx = -44.50347 + (((tickAnim - 258) / 7) * (13.24653-(-44.50347)));
            yy = 3.49013 + (((tickAnim - 258) / 7) * (3.49013-(3.49013)));
            zz = -10.98996 + (((tickAnim - 258) / 7) * (-10.98996-(-10.98996)));
        }
        else if (tickAnim >= 265 && tickAnim < 269) {
            xx = 13.24653 + (((tickAnim - 265) / 4) * (-28.46151-(13.24653)));
            yy = 3.49013 + (((tickAnim - 265) / 4) * (-3.31267-(3.49013)));
            zz = -10.98996 + (((tickAnim - 265) / 4) * (-18.17773-(-10.98996)));
        }
        else if (tickAnim >= 269 && tickAnim < 273) {
            xx = -28.46151 + (((tickAnim - 269) / 4) * (-44.50347-(-28.46151)));
            yy = -3.31267 + (((tickAnim - 269) / 4) * (3.49013-(-3.31267)));
            zz = -18.17773 + (((tickAnim - 269) / 4) * (-10.98996-(-18.17773)));
        }
        else if (tickAnim >= 273 && tickAnim < 283) {
            xx = -44.50347 + (((tickAnim - 273) / 10) * (-29.6785+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-20))*50-(-44.50347)));
            yy = 3.49013 + (((tickAnim - 273) / 10) * (3.49013-(3.49013)));
            zz = -10.98996 + (((tickAnim - 273) / 10) * (-10.98996-(-10.98996)));
        }
        else if (tickAnim >= 283 && tickAnim < 315) {
            xx = -29.6785+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-20))*50 + (((tickAnim - 283) / 32) * (4.14557-(-29.6785+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-20))*50)));
            yy = 3.49013 + (((tickAnim - 283) / 32) * (1.53303-(3.49013)));
            zz = -10.98996 + (((tickAnim - 283) / 32) * (-5.31238-(-10.98996)));
        }
        else if (tickAnim >= 315 && tickAnim < 390) {
            xx = 4.14557 + (((tickAnim - 315) / 75) * (4.14557-(4.14557)));
            yy = 1.53303 + (((tickAnim - 315) / 75) * (1.53303-(1.53303)));
            zz = -5.31238 + (((tickAnim - 315) / 75) * (-5.31238-(-5.31238)));
        }
        else if (tickAnim >= 390 && tickAnim < 405) {
            xx = 4.14557 + (((tickAnim - 390) / 15) * (-13.57753-(4.14557)));
            yy = 1.53303 + (((tickAnim - 390) / 15) * (-11.8868-(1.53303)));
            zz = -5.31238 + (((tickAnim - 390) / 15) * (-13.96305-(-5.31238)));
        }
        else if (tickAnim >= 405 && tickAnim < 414) {
            xx = -13.57753 + (((tickAnim - 405) / 9) * (-1.72518-(-13.57753)));
            yy = -11.8868 + (((tickAnim - 405) / 9) * (-5.43882-(-11.8868)));
            zz = -13.96305 + (((tickAnim - 405) / 9) * (-49.70161-(-13.96305)));
        }
        else if (tickAnim >= 414 && tickAnim < 418) {
            xx = -1.72518 + (((tickAnim - 414) / 4) * (-29.66524-(-1.72518)));
            yy = -5.43882 + (((tickAnim - 414) / 4) * (-4.23771-(-5.43882)));
            zz = -49.70161 + (((tickAnim - 414) / 4) * (-38.7255-(-49.70161)));
        }
        else if (tickAnim >= 418 && tickAnim < 422) {
            xx = -29.66524 + (((tickAnim - 418) / 4) * (-55.74011-(-29.66524)));
            yy = -4.23771 + (((tickAnim - 418) / 4) * (-1.88343-(-4.23771)));
            zz = -38.7255 + (((tickAnim - 418) / 4) * (-17.21133-(-38.7255)));
        }
        else if (tickAnim >= 422 && tickAnim < 425) {
            xx = -55.74011 + (((tickAnim - 422) / 3) * (-48.25-(-55.74011)));
            yy = -1.88343 + (((tickAnim - 422) / 3) * (0-(-1.88343)));
            zz = -17.21133 + (((tickAnim - 422) / 3) * (0-(-17.21133)));
        }
        else if (tickAnim >= 425 && tickAnim < 450) {
            xx = -48.25 + (((tickAnim - 425) / 25) * (0-(-48.25)));
            yy = 0 + (((tickAnim - 425) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (26-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 26 + (((tickAnim - 30) / 25) * (45.2435-(26)));
            yy = 0 + (((tickAnim - 30) / 25) * (-0.26571-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (-0.2758-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 160) {
            xx = 45.2435 + (((tickAnim - 55) / 105) * (45.2435-(45.2435)));
            yy = -0.26571 + (((tickAnim - 55) / 105) * (-0.26571-(-0.26571)));
            zz = -0.2758 + (((tickAnim - 55) / 105) * (-0.2758-(-0.2758)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = 45.2435 + (((tickAnim - 160) / 8) * (45.2435-(45.2435)));
            yy = -0.26571 + (((tickAnim - 160) / 8) * (-0.26571-(-0.26571)));
            zz = -0.2758 + (((tickAnim - 160) / 8) * (-0.2758-(-0.2758)));
        }
        else if (tickAnim >= 168 && tickAnim < 174) {
            xx = 45.2435 + (((tickAnim - 168) / 6) * (31.4935-(45.2435)));
            yy = -0.26571 + (((tickAnim - 168) / 6) * (-0.26571-(-0.26571)));
            zz = -0.2758 + (((tickAnim - 168) / 6) * (-0.2758-(-0.2758)));
        }
        else if (tickAnim >= 174 && tickAnim < 185) {
            xx = 31.4935 + (((tickAnim - 174) / 11) * (23.7435-(31.4935)));
            yy = -0.26571 + (((tickAnim - 174) / 11) * (-0.26571-(-0.26571)));
            zz = -0.2758 + (((tickAnim - 174) / 11) * (-0.2758-(-0.2758)));
        }
        else if (tickAnim >= 185 && tickAnim < 202) {
            xx = 23.7435 + (((tickAnim - 185) / 17) * (7.8934-(23.7435)));
            yy = -0.26571 + (((tickAnim - 185) / 17) * (-1.33164-(-0.26571)));
            zz = -0.2758 + (((tickAnim - 185) / 17) * (6.89621-(-0.2758)));
        }
        else if (tickAnim >= 202 && tickAnim < 208) {
            xx = 7.8934 + (((tickAnim - 202) / 6) * (31.8934-(7.8934)));
            yy = -1.33164 + (((tickAnim - 202) / 6) * (-1.33164-(-1.33164)));
            zz = 6.89621 + (((tickAnim - 202) / 6) * (6.89621-(6.89621)));
        }
        else if (tickAnim >= 208 && tickAnim < 212) {
            xx = 31.8934 + (((tickAnim - 208) / 4) * (28.8934-(31.8934)));
            yy = -1.33164 + (((tickAnim - 208) / 4) * (-1.33164-(-1.33164)));
            zz = 6.89621 + (((tickAnim - 208) / 4) * (6.89621-(6.89621)));
        }
        else if (tickAnim >= 212 && tickAnim < 216) {
            xx = 28.8934 + (((tickAnim - 212) / 4) * (7.8934-(28.8934)));
            yy = -1.33164 + (((tickAnim - 212) / 4) * (-1.33164-(-1.33164)));
            zz = 6.89621 + (((tickAnim - 212) / 4) * (6.89621-(6.89621)));
        }
        else if (tickAnim >= 216 && tickAnim < 223) {
            xx = 7.8934 + (((tickAnim - 216) / 7) * (31.8934-(7.8934)));
            yy = -1.33164 + (((tickAnim - 216) / 7) * (-1.33164-(-1.33164)));
            zz = 6.89621 + (((tickAnim - 216) / 7) * (6.89621-(6.89621)));
        }
        else if (tickAnim >= 223 && tickAnim < 227) {
            xx = 31.8934 + (((tickAnim - 223) / 4) * (28.8934-(31.8934)));
            yy = -1.33164 + (((tickAnim - 223) / 4) * (-1.33164-(-1.33164)));
            zz = 6.89621 + (((tickAnim - 223) / 4) * (6.89621-(6.89621)));
        }
        else if (tickAnim >= 227 && tickAnim < 230) {
            xx = 28.8934 + (((tickAnim - 227) / 3) * (7.8934-(28.8934)));
            yy = -1.33164 + (((tickAnim - 227) / 3) * (-1.33164-(-1.33164)));
            zz = 6.89621 + (((tickAnim - 227) / 3) * (6.89621-(6.89621)));
        }
        else if (tickAnim >= 230 && tickAnim < 237) {
            xx = 7.8934 + (((tickAnim - 230) / 7) * (31.8934-(7.8934)));
            yy = -1.33164 + (((tickAnim - 230) / 7) * (-1.33164-(-1.33164)));
            zz = 6.89621 + (((tickAnim - 230) / 7) * (6.89621-(6.89621)));
        }
        else if (tickAnim >= 237 && tickAnim < 241) {
            xx = 31.8934 + (((tickAnim - 237) / 4) * (28.8934-(31.8934)));
            yy = -1.33164 + (((tickAnim - 237) / 4) * (-1.33164-(-1.33164)));
            zz = 6.89621 + (((tickAnim - 237) / 4) * (6.89621-(6.89621)));
        }
        else if (tickAnim >= 241 && tickAnim < 244) {
            xx = 28.8934 + (((tickAnim - 241) / 3) * (7.8934-(28.8934)));
            yy = -1.33164 + (((tickAnim - 241) / 3) * (-1.33164-(-1.33164)));
            zz = 6.89621 + (((tickAnim - 241) / 3) * (6.89621-(6.89621)));
        }
        else if (tickAnim >= 244 && tickAnim < 251) {
            xx = 7.8934 + (((tickAnim - 244) / 7) * (31.8934-(7.8934)));
            yy = -1.33164 + (((tickAnim - 244) / 7) * (-1.33164-(-1.33164)));
            zz = 6.89621 + (((tickAnim - 244) / 7) * (6.89621-(6.89621)));
        }
        else if (tickAnim >= 251 && tickAnim < 254) {
            xx = 31.8934 + (((tickAnim - 251) / 3) * (28.8934-(31.8934)));
            yy = -1.33164 + (((tickAnim - 251) / 3) * (-1.33164-(-1.33164)));
            zz = 6.89621 + (((tickAnim - 251) / 3) * (6.89621-(6.89621)));
        }
        else if (tickAnim >= 254 && tickAnim < 258) {
            xx = 28.8934 + (((tickAnim - 254) / 4) * (7.8934-(28.8934)));
            yy = -1.33164 + (((tickAnim - 254) / 4) * (-1.33164-(-1.33164)));
            zz = 6.89621 + (((tickAnim - 254) / 4) * (6.89621-(6.89621)));
        }
        else if (tickAnim >= 258 && tickAnim < 265) {
            xx = 7.8934 + (((tickAnim - 258) / 7) * (31.8934-(7.8934)));
            yy = -1.33164 + (((tickAnim - 258) / 7) * (-1.33164-(-1.33164)));
            zz = 6.89621 + (((tickAnim - 258) / 7) * (6.89621-(6.89621)));
        }
        else if (tickAnim >= 265 && tickAnim < 269) {
            xx = 31.8934 + (((tickAnim - 265) / 4) * (28.8934-(31.8934)));
            yy = -1.33164 + (((tickAnim - 265) / 4) * (-1.33164-(-1.33164)));
            zz = 6.89621 + (((tickAnim - 265) / 4) * (6.89621-(6.89621)));
        }
        else if (tickAnim >= 269 && tickAnim < 273) {
            xx = 28.8934 + (((tickAnim - 269) / 4) * (7.8934-(28.8934)));
            yy = -1.33164 + (((tickAnim - 269) / 4) * (-1.33164-(-1.33164)));
            zz = 6.89621 + (((tickAnim - 269) / 4) * (6.89621-(6.89621)));
        }
        else if (tickAnim >= 273 && tickAnim < 283) {
            xx = 7.8934 + (((tickAnim - 273) / 10) * (31.8934-(7.8934)));
            yy = -1.33164 + (((tickAnim - 273) / 10) * (-1.33164-(-1.33164)));
            zz = 6.89621 + (((tickAnim - 273) / 10) * (6.89621-(6.89621)));
        }
        else if (tickAnim >= 283 && tickAnim < 305) {
            xx = 31.8934 + (((tickAnim - 283) / 22) * (29.1434-(31.8934)));
            yy = -1.33164 + (((tickAnim - 283) / 22) * (-1.33164-(-1.33164)));
            zz = 6.89621 + (((tickAnim - 283) / 22) * (6.89621-(6.89621)));
        }
        else if (tickAnim >= 305 && tickAnim < 390) {
            xx = 29.1434 + (((tickAnim - 305) / 85) * (29.1434-(29.1434)));
            yy = -1.33164 + (((tickAnim - 305) / 85) * (-1.33164-(-1.33164)));
            zz = 6.89621 + (((tickAnim - 305) / 85) * (6.89621-(6.89621)));
        }
        else if (tickAnim >= 390 && tickAnim < 405) {
            xx = 29.1434 + (((tickAnim - 390) / 15) * (31.8934-(29.1434)));
            yy = -1.33164 + (((tickAnim - 390) / 15) * (-1.33164-(-1.33164)));
            zz = 6.89621 + (((tickAnim - 390) / 15) * (6.89621-(6.89621)));
        }
        else if (tickAnim >= 405 && tickAnim < 414) {
            xx = 31.8934 + (((tickAnim - 405) / 9) * (7.72907-(31.8934)));
            yy = -1.33164 + (((tickAnim - 405) / 9) * (-1.33164-(-1.33164)));
            zz = 6.89621 + (((tickAnim - 405) / 9) * (6.89621-(6.89621)));
        }
        else if (tickAnim >= 414 && tickAnim < 418) {
            xx = 7.72907 + (((tickAnim - 414) / 4) * (44.91577-(7.72907)));
            yy = -1.33164 + (((tickAnim - 414) / 4) * (4.74464-(-1.33164)));
            zz = 6.89621 + (((tickAnim - 414) / 4) * (1.17564-(6.89621)));
        }
        else if (tickAnim >= 418 && tickAnim < 425) {
            xx = 44.91577 + (((tickAnim - 418) / 7) * (47.34822-(44.91577)));
            yy = 4.74464 + (((tickAnim - 418) / 7) * (1.62306-(4.74464)));
            zz = 1.17564 + (((tickAnim - 418) / 7) * (-0.87763-(1.17564)));
        }
        else if (tickAnim >= 425 && tickAnim < 450) {
            xx = 47.34822 + (((tickAnim - 425) / 25) * (0-(47.34822)));
            yy = 1.62306 + (((tickAnim - 425) / 25) * (0-(1.62306)));
            zz = -0.87763 + (((tickAnim - 425) / 25) * (0-(-0.87763)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 25) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (-1.25-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 55) / 105) * (0-(0)));
            yy = -0.075 + (((tickAnim - 55) / 105) * (-0.075-(-0.075)));
            zz = -1.25 + (((tickAnim - 55) / 105) * (-1.25-(-1.25)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 160) / 8) * (0-(0)));
            yy = -0.075 + (((tickAnim - 160) / 8) * (-0.075-(-0.075)));
            zz = -1.25 + (((tickAnim - 160) / 8) * (-1.25-(-1.25)));
        }
        else if (tickAnim >= 168 && tickAnim < 174) {
            xx = 0 + (((tickAnim - 168) / 6) * (0-(0)));
            yy = -0.075 + (((tickAnim - 168) / 6) * (0.305-(-0.075)));
            zz = -1.25 + (((tickAnim - 168) / 6) * (-0.825-(-1.25)));
        }
        else if (tickAnim >= 174 && tickAnim < 414) {
            xx = 0 + (((tickAnim - 174) / 240) * (0-(0)));
            yy = 0.305 + (((tickAnim - 174) / 240) * (0.305-(0.305)));
            zz = -0.825 + (((tickAnim - 174) / 240) * (-0.825-(-0.825)));
        }
        else if (tickAnim >= 414 && tickAnim < 418) {
            xx = 0 + (((tickAnim - 414) / 4) * (0-(0)));
            yy = 0.305 + (((tickAnim - 414) / 4) * (0.985-(0.305)));
            zz = -0.825 + (((tickAnim - 414) / 4) * (-1.47-(-0.825)));
        }
        else if (tickAnim >= 418 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 418) / 7) * (0-(0)));
            yy = 0.985 + (((tickAnim - 418) / 7) * (0.55-(0.985)));
            zz = -1.47 + (((tickAnim - 418) / 7) * (-0.25-(-1.47)));
        }
        else if (tickAnim >= 425 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 425) / 25) * (0-(0)));
            yy = 0.55 + (((tickAnim - 425) / 25) * (0-(0.55)));
            zz = -0.25 + (((tickAnim - 425) / 25) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-55-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = -55 + (((tickAnim - 30) / 25) * (-66.25-(-55)));
            yy = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 160) {
            xx = -66.25 + (((tickAnim - 55) / 105) * (-66.25-(-66.25)));
            yy = 0 + (((tickAnim - 55) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 105) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = -66.25 + (((tickAnim - 160) / 8) * (-66.25-(-66.25)));
            yy = 0 + (((tickAnim - 160) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 8) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 170) {
            xx = -66.25 + (((tickAnim - 168) / 2) * (-63.22884-(-66.25)));
            yy = 0 + (((tickAnim - 168) / 2) * (-5.65793-(0)));
            zz = 0 + (((tickAnim - 168) / 2) * (-10.73406-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 174) {
            xx = -63.22884 + (((tickAnim - 170) / 4) * (-47.71082-(-63.22884)));
            yy = -5.65793 + (((tickAnim - 170) / 4) * (-2.12173-(-5.65793)));
            zz = -10.73406 + (((tickAnim - 170) / 4) * (-4.02527-(-10.73406)));
        }
        else if (tickAnim >= 174 && tickAnim < 185) {
            xx = -47.71082 + (((tickAnim - 174) / 11) * (8.25-(-47.71082)));
            yy = -2.12173 + (((tickAnim - 174) / 11) * (0-(-2.12173)));
            zz = -4.02527 + (((tickAnim - 174) / 11) * (0-(-4.02527)));
        }
        else if (tickAnim >= 185 && tickAnim < 202) {
            xx = 8.25 + (((tickAnim - 185) / 17) * (-14.5-(8.25)));
            yy = 0 + (((tickAnim - 185) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 17) * (0-(0)));
        }
        else if (tickAnim >= 202 && tickAnim < 208) {
            xx = -14.5 + (((tickAnim - 202) / 6) * (-25-(-14.5)));
            yy = 0 + (((tickAnim - 202) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 202) / 6) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 212) {
            xx = -25 + (((tickAnim - 208) / 4) * (-39.75-(-25)));
            yy = 0 + (((tickAnim - 208) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 4) * (0-(0)));
        }
        else if (tickAnim >= 212 && tickAnim < 216) {
            xx = -39.75 + (((tickAnim - 212) / 4) * (-14.5-(-39.75)));
            yy = 0 + (((tickAnim - 212) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 212) / 4) * (0-(0)));
        }
        else if (tickAnim >= 216 && tickAnim < 223) {
            xx = -14.5 + (((tickAnim - 216) / 7) * (-25-(-14.5)));
            yy = 0 + (((tickAnim - 216) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 216) / 7) * (0-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 227) {
            xx = -25 + (((tickAnim - 223) / 4) * (-39.75-(-25)));
            yy = 0 + (((tickAnim - 223) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 223) / 4) * (0-(0)));
        }
        else if (tickAnim >= 227 && tickAnim < 230) {
            xx = -39.75 + (((tickAnim - 227) / 3) * (-14.5-(-39.75)));
            yy = 0 + (((tickAnim - 227) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 227) / 3) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 237) {
            xx = -14.5 + (((tickAnim - 230) / 7) * (-25-(-14.5)));
            yy = 0 + (((tickAnim - 230) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 7) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 241) {
            xx = -25 + (((tickAnim - 237) / 4) * (-39.75-(-25)));
            yy = 0 + (((tickAnim - 237) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 4) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 244) {
            xx = -39.75 + (((tickAnim - 241) / 3) * (-14.5-(-39.75)));
            yy = 0 + (((tickAnim - 241) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 3) * (0-(0)));
        }
        else if (tickAnim >= 244 && tickAnim < 251) {
            xx = -14.5 + (((tickAnim - 244) / 7) * (-25-(-14.5)));
            yy = 0 + (((tickAnim - 244) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 244) / 7) * (0-(0)));
        }
        else if (tickAnim >= 251 && tickAnim < 254) {
            xx = -25 + (((tickAnim - 251) / 3) * (-39.75-(-25)));
            yy = 0 + (((tickAnim - 251) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 251) / 3) * (0-(0)));
        }
        else if (tickAnim >= 254 && tickAnim < 258) {
            xx = -39.75 + (((tickAnim - 254) / 4) * (-14.5-(-39.75)));
            yy = 0 + (((tickAnim - 254) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 254) / 4) * (0-(0)));
        }
        else if (tickAnim >= 258 && tickAnim < 265) {
            xx = -14.5 + (((tickAnim - 258) / 7) * (-25-(-14.5)));
            yy = 0 + (((tickAnim - 258) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 258) / 7) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 269) {
            xx = -25 + (((tickAnim - 265) / 4) * (-39.75-(-25)));
            yy = 0 + (((tickAnim - 265) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 4) * (0-(0)));
        }
        else if (tickAnim >= 269 && tickAnim < 273) {
            xx = -39.75 + (((tickAnim - 269) / 4) * (-14.5-(-39.75)));
            yy = 0 + (((tickAnim - 269) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 269) / 4) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 283) {
            xx = -14.5 + (((tickAnim - 273) / 10) * (-25-(-14.5)));
            yy = 0 + (((tickAnim - 273) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 10) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 305) {
            xx = -25 + (((tickAnim - 283) / 22) * (-54.25-(-25)));
            yy = 0 + (((tickAnim - 283) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 22) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 390) {
            xx = -54.25 + (((tickAnim - 305) / 85) * (-54.25-(-54.25)));
            yy = 0 + (((tickAnim - 305) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 305) / 85) * (0-(0)));
        }
        else if (tickAnim >= 390 && tickAnim < 405) {
            xx = -54.25 + (((tickAnim - 390) / 15) * (-60-(-54.25)));
            yy = 0 + (((tickAnim - 390) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 390) / 15) * (0-(0)));
        }
        else if (tickAnim >= 405 && tickAnim < 414) {
            xx = -60 + (((tickAnim - 405) / 9) * (-10.14-(-60)));
            yy = 0 + (((tickAnim - 405) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 405) / 9) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 418) {
            xx = -10.14 + (((tickAnim - 414) / 4) * (-47.04-(-10.14)));
            yy = 0 + (((tickAnim - 414) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 414) / 4) * (0-(0)));
        }
        else if (tickAnim >= 418 && tickAnim < 421) {
            xx = -47.04 + (((tickAnim - 418) / 3) * (-55.44-(-47.04)));
            yy = 0 + (((tickAnim - 418) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 418) / 3) * (0-(0)));
        }
        else if (tickAnim >= 421 && tickAnim < 425) {
            xx = -55.44 + (((tickAnim - 421) / 4) * (-64.75-(-55.44)));
            yy = 0 + (((tickAnim - 421) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 421) / 4) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 438) {
            xx = -64.75 + (((tickAnim - 425) / 13) * (-42.97-(-64.75)));
            yy = 0 + (((tickAnim - 425) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 13) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 450) {
            xx = -42.97 + (((tickAnim - 438) / 12) * (0-(-42.97)));
            yy = 0 + (((tickAnim - 438) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 438) / 12) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 30) * (-0.325-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 25) * (0.5-(0)));
            zz = -0.325 + (((tickAnim - 30) / 25) * (-0.92-(-0.325)));
        }
        else if (tickAnim >= 55 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 55) / 105) * (0-(0)));
            yy = 0.5 + (((tickAnim - 55) / 105) * (0.5-(0.5)));
            zz = -0.92 + (((tickAnim - 55) / 105) * (-0.92-(-0.92)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 160) / 8) * (0-(0)));
            yy = 0.5 + (((tickAnim - 160) / 8) * (0.5-(0.5)));
            zz = -0.92 + (((tickAnim - 160) / 8) * (-0.92-(-0.92)));
        }
        else if (tickAnim >= 168 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 168) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 168) / 2) * (1.05-(0.5)));
            zz = -0.92 + (((tickAnim - 168) / 2) * (-0.92-(-0.92)));
        }
        else if (tickAnim >= 170 && tickAnim < 174) {
            xx = 0 + (((tickAnim - 170) / 4) * (0-(0)));
            yy = 1.05 + (((tickAnim - 170) / 4) * (1.035-(1.05)));
            zz = -0.92 + (((tickAnim - 170) / 4) * (-0.66-(-0.92)));
        }
        else if (tickAnim >= 174 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 174) / 11) * (0-(0)));
            yy = 1.035 + (((tickAnim - 174) / 11) * (0-(1.035)));
            zz = -0.66 + (((tickAnim - 174) / 11) * (0-(-0.66)));
        }
        else if (tickAnim >= 185 && tickAnim < 202) {
            xx = 0 + (((tickAnim - 185) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 185) / 17) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 185) / 17) * (0-(0)));
        }
        else if (tickAnim >= 202 && tickAnim < 216) {
            xx = 0 + (((tickAnim - 202) / 14) * (0-(0)));
            yy = -0.475 + (((tickAnim - 202) / 14) * (-0.475-(-0.475)));
            zz = 0 + (((tickAnim - 202) / 14) * (0-(0)));
        }
        else if (tickAnim >= 216 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 216) / 14) * (0-(0)));
            yy = -0.475 + (((tickAnim - 216) / 14) * (-0.475-(-0.475)));
            zz = 0 + (((tickAnim - 216) / 14) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 244) {
            xx = 0 + (((tickAnim - 230) / 14) * (0-(0)));
            yy = -0.475 + (((tickAnim - 230) / 14) * (-0.475-(-0.475)));
            zz = 0 + (((tickAnim - 230) / 14) * (0-(0)));
        }
        else if (tickAnim >= 244 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 244) / 14) * (0-(0)));
            yy = -0.475 + (((tickAnim - 244) / 14) * (-0.475-(-0.475)));
            zz = 0 + (((tickAnim - 244) / 14) * (0-(0)));
        }
        else if (tickAnim >= 258 && tickAnim < 273) {
            xx = 0 + (((tickAnim - 258) / 15) * (0-(0)));
            yy = -0.475 + (((tickAnim - 258) / 15) * (-0.475-(-0.475)));
            zz = 0 + (((tickAnim - 258) / 15) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 273) / 32) * (0-(0)));
            yy = -0.475 + (((tickAnim - 273) / 32) * (-0.77-(-0.475)));
            zz = 0 + (((tickAnim - 273) / 32) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 390) {
            xx = 0 + (((tickAnim - 305) / 85) * (0-(0)));
            yy = -0.77 + (((tickAnim - 305) / 85) * (-0.77-(-0.77)));
            zz = 0 + (((tickAnim - 305) / 85) * (0-(0)));
        }
        else if (tickAnim >= 390 && tickAnim < 405) {
            xx = 0 + (((tickAnim - 390) / 15) * (0-(0)));
            yy = -0.77 + (((tickAnim - 390) / 15) * (0-(-0.77)));
            zz = 0 + (((tickAnim - 390) / 15) * (0-(0)));
        }
        else if (tickAnim >= 405 && tickAnim < 414) {
            xx = 0 + (((tickAnim - 405) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 405) / 9) * (-0.17-(0)));
            zz = 0 + (((tickAnim - 405) / 9) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 418) {
            xx = 0 + (((tickAnim - 414) / 4) * (0-(0)));
            yy = -0.17 + (((tickAnim - 414) / 4) * (-0.195-(-0.17)));
            zz = 0 + (((tickAnim - 414) / 4) * (0-(0)));
        }
        else if (tickAnim >= 418 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 418) / 7) * (0-(0)));
            yy = -0.195 + (((tickAnim - 418) / 7) * (-0.64-(-0.195)));
            zz = 0 + (((tickAnim - 418) / 7) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 425) / 25) * (0-(0)));
            yy = -0.64 + (((tickAnim - 425) / 25) * (0-(-0.64)));
            zz = 0 + (((tickAnim - 425) / 25) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 30) * (66-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 66 + (((tickAnim - 30) / 25) * (61-(66)));
            yy = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 160) {
            xx = 61 + (((tickAnim - 55) / 105) * (61-(61)));
            yy = 0 + (((tickAnim - 55) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 105) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = 61 + (((tickAnim - 160) / 8) * (61-(61)));
            yy = 0 + (((tickAnim - 160) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 8) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 170) {
            xx = 61 + (((tickAnim - 168) / 2) * (70.05834-(61)));
            yy = 0 + (((tickAnim - 168) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 2) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 177) {
            xx = 70.05834 + (((tickAnim - 170) / 7) * (62.30834-(70.05834)));
            yy = 0 + (((tickAnim - 170) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 7) * (0-(0)));
        }
        else if (tickAnim >= 177 && tickAnim < 185) {
            xx = 62.30834 + (((tickAnim - 177) / 8) * (89.5-(62.30834)));
            yy = 0 + (((tickAnim - 177) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 177) / 8) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 202) {
            xx = 89.5 + (((tickAnim - 185) / 17) * (70.5-(89.5)));
            yy = 0 + (((tickAnim - 185) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 17) * (0-(0)));
        }
        else if (tickAnim >= 202 && tickAnim < 208) {
            xx = 70.5 + (((tickAnim - 202) / 6) * (75.25-(70.5)));
            yy = 0 + (((tickAnim - 202) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 202) / 6) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 212) {
            xx = 75.25 + (((tickAnim - 208) / 4) * (91.88-(75.25)));
            yy = 0 + (((tickAnim - 208) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 4) * (0-(0)));
        }
        else if (tickAnim >= 212 && tickAnim < 216) {
            xx = 91.88 + (((tickAnim - 212) / 4) * (70.5-(91.88)));
            yy = 0 + (((tickAnim - 212) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 212) / 4) * (0-(0)));
        }
        else if (tickAnim >= 216 && tickAnim < 223) {
            xx = 70.5 + (((tickAnim - 216) / 7) * (75.25-(70.5)));
            yy = 0 + (((tickAnim - 216) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 216) / 7) * (0-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 227) {
            xx = 75.25 + (((tickAnim - 223) / 4) * (91.88-(75.25)));
            yy = 0 + (((tickAnim - 223) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 223) / 4) * (0-(0)));
        }
        else if (tickAnim >= 227 && tickAnim < 230) {
            xx = 91.88 + (((tickAnim - 227) / 3) * (70.5-(91.88)));
            yy = 0 + (((tickAnim - 227) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 227) / 3) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 237) {
            xx = 70.5 + (((tickAnim - 230) / 7) * (75.25-(70.5)));
            yy = 0 + (((tickAnim - 230) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 7) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 241) {
            xx = 75.25 + (((tickAnim - 237) / 4) * (91.88-(75.25)));
            yy = 0 + (((tickAnim - 237) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 4) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 244) {
            xx = 91.88 + (((tickAnim - 241) / 3) * (70.5-(91.88)));
            yy = 0 + (((tickAnim - 241) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 3) * (0-(0)));
        }
        else if (tickAnim >= 244 && tickAnim < 251) {
            xx = 70.5 + (((tickAnim - 244) / 7) * (75.25-(70.5)));
            yy = 0 + (((tickAnim - 244) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 244) / 7) * (0-(0)));
        }
        else if (tickAnim >= 251 && tickAnim < 254) {
            xx = 75.25 + (((tickAnim - 251) / 3) * (91.88-(75.25)));
            yy = 0 + (((tickAnim - 251) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 251) / 3) * (0-(0)));
        }
        else if (tickAnim >= 254 && tickAnim < 258) {
            xx = 91.88 + (((tickAnim - 254) / 4) * (70.5-(91.88)));
            yy = 0 + (((tickAnim - 254) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 254) / 4) * (0-(0)));
        }
        else if (tickAnim >= 258 && tickAnim < 265) {
            xx = 70.5 + (((tickAnim - 258) / 7) * (75.25-(70.5)));
            yy = 0 + (((tickAnim - 258) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 258) / 7) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 269) {
            xx = 75.25 + (((tickAnim - 265) / 4) * (91.88-(75.25)));
            yy = 0 + (((tickAnim - 265) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 4) * (0-(0)));
        }
        else if (tickAnim >= 269 && tickAnim < 273) {
            xx = 91.88 + (((tickAnim - 269) / 4) * (70.5-(91.88)));
            yy = 0 + (((tickAnim - 269) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 269) / 4) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 283) {
            xx = 70.5 + (((tickAnim - 273) / 10) * (75.25-(70.5)));
            yy = 0 + (((tickAnim - 273) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 10) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 305) {
            xx = 75.25 + (((tickAnim - 283) / 22) * (67-(75.25)));
            yy = 0 + (((tickAnim - 283) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 22) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 390) {
            xx = 67 + (((tickAnim - 305) / 85) * (78.75-(67)));
            yy = 0 + (((tickAnim - 305) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 305) / 85) * (0-(0)));
        }
        else if (tickAnim >= 390 && tickAnim < 405) {
            xx = 78.75 + (((tickAnim - 390) / 15) * (96.5-(78.75)));
            yy = 0 + (((tickAnim - 390) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 390) / 15) * (0-(0)));
        }
        else if (tickAnim >= 405 && tickAnim < 408) {
            xx = 96.5 + (((tickAnim - 405) / 3) * (46.04-(96.5)));
            yy = 0 + (((tickAnim - 405) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 405) / 3) * (0-(0)));
        }
        else if (tickAnim >= 408 && tickAnim < 414) {
            xx = 46.04 + (((tickAnim - 408) / 6) * (69.17-(46.04)));
            yy = 0 + (((tickAnim - 408) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 408) / 6) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 425) {
            xx = 69.17 + (((tickAnim - 414) / 11) * (69.25-(69.17)));
            yy = 0 + (((tickAnim - 414) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 414) / 11) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 450) {
            xx = 69.25 + (((tickAnim - 425) / 25) * (0-(69.25)));
            yy = 0 + (((tickAnim - 425) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            yy = 0.575 + (((tickAnim - 14) / 16) * (0-(0.575)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 30) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = -17 + (((tickAnim - 30) / 25) * (-46.05488-(-17)));
            yy = 0 + (((tickAnim - 30) / 25) * (1.68754-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (3.17287-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 160) {
            xx = -46.05488 + (((tickAnim - 55) / 105) * (-46.05488-(-46.05488)));
            yy = 1.68754 + (((tickAnim - 55) / 105) * (1.68754-(1.68754)));
            zz = 3.17287 + (((tickAnim - 55) / 105) * (3.17287-(3.17287)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = -46.05488 + (((tickAnim - 160) / 8) * (-45.55748-(-46.05488)));
            yy = 1.68754 + (((tickAnim - 160) / 8) * (2.28166-(1.68754)));
            zz = 3.17287 + (((tickAnim - 160) / 8) * (-9.7782-(3.17287)));
        }
        else if (tickAnim >= 168 && tickAnim < 174) {
            xx = -45.55748 + (((tickAnim - 168) / 6) * (-63.24759-(-45.55748)));
            yy = 2.28166 + (((tickAnim - 168) / 6) * (4.66859-(2.28166)));
            zz = -9.7782 + (((tickAnim - 168) / 6) * (-14.9669-(-9.7782)));
        }
        else if (tickAnim >= 174 && tickAnim < 185) {
            xx = -63.24759 + (((tickAnim - 174) / 11) * (-59.93726-(-63.24759)));
            yy = 4.66859 + (((tickAnim - 174) / 11) * (10.33083-(4.66859)));
            zz = -14.9669 + (((tickAnim - 174) / 11) * (-34.42947-(-14.9669)));
        }
        else if (tickAnim >= 185 && tickAnim < 390) {
            xx = -59.93726 + (((tickAnim - 185) / 205) * (-59.93726-(-59.93726)));
            yy = 10.33083 + (((tickAnim - 185) / 205) * (10.33083-(10.33083)));
            zz = -34.42947 + (((tickAnim - 185) / 205) * (-34.42947-(-34.42947)));
        }
        else if (tickAnim >= 390 && tickAnim < 405) {
            xx = -59.93726 + (((tickAnim - 390) / 15) * (-54.28343-(-59.93726)));
            yy = 10.33083 + (((tickAnim - 390) / 15) * (11.64959-(10.33083)));
            zz = -34.42947 + (((tickAnim - 390) / 15) * (-14.08692-(-34.42947)));
        }
        else if (tickAnim >= 405 && tickAnim < 416) {
            xx = -54.28343 + (((tickAnim - 405) / 11) * (-64.34141-(-54.28343)));
            yy = 11.64959 + (((tickAnim - 405) / 11) * (-2.05925-(11.64959)));
            zz = -14.08692 + (((tickAnim - 405) / 11) * (19.18678-(-14.08692)));
        }
        else if (tickAnim >= 416 && tickAnim < 425) {
            xx = -64.34141 + (((tickAnim - 416) / 9) * (-49.31245-(-64.34141)));
            yy = -2.05925 + (((tickAnim - 416) / 9) * (11.56144-(-2.05925)));
            zz = 19.18678 + (((tickAnim - 416) / 9) * (-0.28502-(19.18678)));
        }
        else if (tickAnim >= 425 && tickAnim < 450) {
            xx = -49.31245 + (((tickAnim - 425) / 25) * (0-(-49.31245)));
            yy = 11.56144 + (((tickAnim - 425) / 25) * (0-(11.56144)));
            zz = -0.28502 + (((tickAnim - 425) / 25) * (0-(-0.28502)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));

        animSandHelper(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, animTick, tickAnim, xx, yy, zz);

    }
    public void animSandHelper(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick, double tickAnim, double xx, double yy, double zz) {



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (26-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 26 + (((tickAnim - 30) / 25) * (45.2435-(26)));
            yy = 0 + (((tickAnim - 30) / 25) * (-0.26571-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (-0.2758-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 160) {
            xx = 45.2435 + (((tickAnim - 55) / 105) * (45.2435-(45.2435)));
            yy = -0.26571 + (((tickAnim - 55) / 105) * (-0.26571-(-0.26571)));
            zz = -0.2758 + (((tickAnim - 55) / 105) * (-0.2758-(-0.2758)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = 45.2435 + (((tickAnim - 160) / 8) * (45.2435-(45.2435)));
            yy = -0.26571 + (((tickAnim - 160) / 8) * (-0.26571-(-0.26571)));
            zz = -0.2758 + (((tickAnim - 160) / 8) * (-0.2758-(-0.2758)));
        }
        else if (tickAnim >= 168 && tickAnim < 177) {
            xx = 45.2435 + (((tickAnim - 168) / 9) * (46.85418-(45.2435)));
            yy = -0.26571 + (((tickAnim - 168) / 9) * (-2.7507-(-0.26571)));
            zz = -0.2758 + (((tickAnim - 168) / 9) * (-7.40972-(-0.2758)));
        }
        else if (tickAnim >= 177 && tickAnim < 185) {
            xx = 46.85418 + (((tickAnim - 177) / 8) * (47.2577-(46.85418)));
            yy = -2.7507 + (((tickAnim - 177) / 8) * (-17.90579-(-2.7507)));
            zz = -7.40972 + (((tickAnim - 177) / 8) * (-3.98276-(-7.40972)));
        }
        else if (tickAnim >= 185 && tickAnim < 391) {
            xx = 47.2577 + (((tickAnim - 185) / 206) * (49.90435-(47.2577)));
            yy = -17.90579 + (((tickAnim - 185) / 206) * (-18.40886-(-17.90579)));
            zz = -3.98276 + (((tickAnim - 185) / 206) * (-2.00432-(-3.98276)));
        }
        else if (tickAnim >= 391 && tickAnim < 405) {
            xx = 49.90435 + (((tickAnim - 391) / 14) * (49.90435-(49.90435)));
            yy = -18.40886 + (((tickAnim - 391) / 14) * (-18.40886-(-18.40886)));
            zz = -2.00432 + (((tickAnim - 391) / 14) * (-2.00432-(-2.00432)));
        }
        else if (tickAnim >= 405 && tickAnim < 410) {
            xx = 49.90435 + (((tickAnim - 405) / 5) * (49.64471-(49.90435)));
            yy = -18.40886 + (((tickAnim - 405) / 5) * (0.98709-(-18.40886)));
            zz = -2.00432 + (((tickAnim - 405) / 5) * (-7.12367-(-2.00432)));
        }
        else if (tickAnim >= 410 && tickAnim < 425) {
            xx = 49.64471 + (((tickAnim - 410) / 15) * (48.75-(49.64471)));
            yy = 0.98709 + (((tickAnim - 410) / 15) * (0-(0.98709)));
            zz = -7.12367 + (((tickAnim - 410) / 15) * (0-(-7.12367)));
        }
        else if (tickAnim >= 425 && tickAnim < 450) {
            xx = 48.75 + (((tickAnim - 425) / 25) * (0-(48.75)));
            yy = 0 + (((tickAnim - 425) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 30 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 25) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (-1.25-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 55) / 105) * (0-(0)));
            yy = -0.075 + (((tickAnim - 55) / 105) * (-0.075-(-0.075)));
            zz = -1.25 + (((tickAnim - 55) / 105) * (-1.25-(-1.25)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 160) / 8) * (0-(0)));
            yy = -0.075 + (((tickAnim - 160) / 8) * (-0.075-(-0.075)));
            zz = -1.25 + (((tickAnim - 160) / 8) * (-1.25-(-1.25)));
        }
        else if (tickAnim >= 168 && tickAnim < 174) {
            xx = 0 + (((tickAnim - 168) / 6) * (0-(0)));
            yy = -0.075 + (((tickAnim - 168) / 6) * (0.505-(-0.075)));
            zz = -1.25 + (((tickAnim - 168) / 6) * (-0.375-(-1.25)));
        }
        else if (tickAnim >= 174 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 174) / 251) * (0-(0)));
            yy = 0.505 + (((tickAnim - 174) / 251) * (0.505-(0.505)));
            zz = -0.375 + (((tickAnim - 174) / 251) * (-0.375-(-0.375)));
        }
        else if (tickAnim >= 425 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 425) / 25) * (0-(0)));
            yy = 0.505 + (((tickAnim - 425) / 25) * (0-(0.505)));
            zz = -0.375 + (((tickAnim - 425) / 25) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-55-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = -55 + (((tickAnim - 30) / 25) * (-66.25-(-55)));
            yy = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 160) {
            xx = -66.25 + (((tickAnim - 55) / 105) * (-66.25-(-66.25)));
            yy = 0 + (((tickAnim - 55) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 105) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = -66.25 + (((tickAnim - 160) / 8) * (-66.25-(-66.25)));
            yy = 0 + (((tickAnim - 160) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 8) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 171) {
            xx = -66.25 + (((tickAnim - 168) / 3) * (-57.88-(-66.25)));
            yy = 0 + (((tickAnim - 168) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 3) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 174) {
            xx = -57.88 + (((tickAnim - 171) / 3) * (-56-(-57.88)));
            yy = 0 + (((tickAnim - 171) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 3) * (0-(0)));
        }
        else if (tickAnim >= 174 && tickAnim < 185) {
            xx = -56 + (((tickAnim - 174) / 11) * (-48.5-(-56)));
            yy = 0 + (((tickAnim - 174) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 174) / 11) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 418) {
            xx = -48.5 + (((tickAnim - 185) / 233) * (-52.55-(-48.5)));
            yy = 0 + (((tickAnim - 185) / 233) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 233) * (0-(0)));
        }
        else if (tickAnim >= 418 && tickAnim < 425) {
            xx = -52.55 + (((tickAnim - 418) / 7) * (-63-(-52.55)));
            yy = 0 + (((tickAnim - 418) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 418) / 7) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 438) {
            xx = -63 + (((tickAnim - 425) / 13) * (-41.15-(-63)));
            yy = 0 + (((tickAnim - 425) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 13) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 450) {
            xx = -41.15 + (((tickAnim - 438) / 12) * (0-(-41.15)));
            yy = 0 + (((tickAnim - 438) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 438) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.325-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 25) * (0.5-(0)));
            zz = -0.325 + (((tickAnim - 30) / 25) * (-0.92-(-0.325)));
        }
        else if (tickAnim >= 55 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 55) / 105) * (0-(0)));
            yy = 0.5 + (((tickAnim - 55) / 105) * (0.5-(0.5)));
            zz = -0.92 + (((tickAnim - 55) / 105) * (-0.92-(-0.92)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 160) / 8) * (0-(0)));
            yy = 0.5 + (((tickAnim - 160) / 8) * (0.5-(0.5)));
            zz = -0.92 + (((tickAnim - 160) / 8) * (-0.92-(-0.92)));
        }
        else if (tickAnim >= 168 && tickAnim < 174) {
            xx = 0 + (((tickAnim - 168) / 6) * (0-(0)));
            yy = 0.5 + (((tickAnim - 168) / 6) * (-0.475-(0.5)));
            zz = -0.92 + (((tickAnim - 168) / 6) * (-0.92-(-0.92)));
        }
        else if (tickAnim >= 174 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 174) / 11) * (0-(0)));
            yy = -0.475 + (((tickAnim - 174) / 11) * (-0.55-(-0.475)));
            zz = -0.92 + (((tickAnim - 174) / 11) * (0-(-0.92)));
        }
        else if (tickAnim >= 185 && tickAnim < 401) {
            xx = 0 + (((tickAnim - 185) / 216) * (0-(0)));
            yy = -0.55 + (((tickAnim - 185) / 216) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 185) / 216) * (0-(0)));
        }
        else if (tickAnim >= 401 && tickAnim < 406) {
            xx = 0 + (((tickAnim - 401) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 401) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 401) / 5) * (0-(0)));
        }
        else if (tickAnim >= 406 && tickAnim < 410) {
            xx = 0 + (((tickAnim - 406) / 4) * (1.375-(0)));
            yy = 0 + (((tickAnim - 406) / 4) * (2.81-(0)));
            zz = 0 + (((tickAnim - 406) / 4) * (0-(0)));
        }
        else if (tickAnim >= 410 && tickAnim < 413) {
            xx = 1.375 + (((tickAnim - 410) / 3) * (0-(1.375)));
            yy = 2.81 + (((tickAnim - 410) / 3) * (2.58-(2.81)));
            zz = 0 + (((tickAnim - 410) / 3) * (0-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 416) {
            xx = 0 + (((tickAnim - 413) / 3) * (0-(0)));
            yy = 2.58 + (((tickAnim - 413) / 3) * (0.75-(2.58)));
            zz = 0 + (((tickAnim - 413) / 3) * (0-(0)));
        }
        else if (tickAnim >= 416 && tickAnim < 418) {
            xx = 0 + (((tickAnim - 416) / 2) * (0-(0)));
            yy = 0.75 + (((tickAnim - 416) / 2) * (-0.115-(0.75)));
            zz = 0 + (((tickAnim - 416) / 2) * (0-(0)));
        }
        else if (tickAnim >= 418 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 418) / 7) * (0-(0)));
            yy = -0.115 + (((tickAnim - 418) / 7) * (-0.575-(-0.115)));
            zz = 0 + (((tickAnim - 418) / 7) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 425) / 25) * (0-(0)));
            yy = -0.575 + (((tickAnim - 425) / 25) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 425) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (66-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 66 + (((tickAnim - 30) / 25) * (61-(66)));
            yy = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 160) {
            xx = 61 + (((tickAnim - 55) / 105) * (61-(61)));
            yy = 0 + (((tickAnim - 55) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 105) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = 61 + (((tickAnim - 160) / 8) * (61-(61)));
            yy = 0 + (((tickAnim - 160) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 8) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 174) {
            xx = 61 + (((tickAnim - 168) / 6) * (64.74212-(61)));
            yy = 0 + (((tickAnim - 168) / 6) * (-7.92465-(0)));
            zz = 0 + (((tickAnim - 168) / 6) * (3.72169-(0)));
        }
        else if (tickAnim >= 174 && tickAnim < 418) {
            xx = 64.74212 + (((tickAnim - 174) / 244) * (67.39675-(64.74212)));
            yy = -7.92465 + (((tickAnim - 174) / 244) * (2.51624-(-7.92465)));
            zz = 3.72169 + (((tickAnim - 174) / 244) * (-0.71101-(3.72169)));
        }
        else if (tickAnim >= 418 && tickAnim < 425) {
            xx = 67.39675 + (((tickAnim - 418) / 7) * (61-(67.39675)));
            yy = 2.51624 + (((tickAnim - 418) / 7) * (0-(2.51624)));
            zz = -0.71101 + (((tickAnim - 418) / 7) * (0-(-0.71101)));
        }
        else if (tickAnim >= 425 && tickAnim < 450) {
            xx = 61 + (((tickAnim - 425) / 25) * (0-(61)));
            yy = 0 + (((tickAnim - 425) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            yy = 0.575 + (((tickAnim - 14) / 16) * (0-(0.575)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 30) / 420) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 420) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 420) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (-31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 117) {
            xx = -31.75 + (((tickAnim - 55) / 62) * (-24-(-31.75)));
            yy = 0 + (((tickAnim - 55) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 62) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -24 + (((tickAnim - 117) / 43) * (-24-(-24)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = -24 + (((tickAnim - 160) / 8) * (-24.10757-(-24)));
            yy = 0 + (((tickAnim - 160) / 8) * (-5.25142-(0)));
            zz = 0 + (((tickAnim - 160) / 8) * (2.34531-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 195) {
            xx = -24.10757 + (((tickAnim - 168) / 27) * (-29.32601-(-24.10757)));
            yy = -5.25142 + (((tickAnim - 168) / 27) * (-11.38812-(-5.25142)));
            zz = 2.34531 + (((tickAnim - 168) / 27) * (7.17358-(2.34531)));
        }
        else if (tickAnim >= 195 && tickAnim < 205) {
            xx = -29.32601 + (((tickAnim - 195) / 10) * (-0.57601-(-29.32601)));
            yy = -11.38812 + (((tickAnim - 195) / 10) * (-11.38812-(-11.38812)));
            zz = 7.17358 + (((tickAnim - 195) / 10) * (7.17358-(7.17358)));
        }
        else if (tickAnim >= 205 && tickAnim < 303) {
            xx = -0.57601 + (((tickAnim - 205) / 98) * (-0.57601-(-0.57601)));
            yy = -11.38812 + (((tickAnim - 205) / 98) * (-11.38812-(-11.38812)));
            zz = 7.17358 + (((tickAnim - 205) / 98) * (7.17358-(7.17358)));
        }
        else if (tickAnim >= 303 && tickAnim < 360) {
            xx = -0.57601 + (((tickAnim - 303) / 57) * (-29.07601-(-0.57601)));
            yy = -11.38812 + (((tickAnim - 303) / 57) * (-11.38812-(-11.38812)));
            zz = 7.17358 + (((tickAnim - 303) / 57) * (7.17358-(7.17358)));
        }
        else if (tickAnim >= 360 && tickAnim < 390) {
            xx = -29.07601 + (((tickAnim - 360) / 30) * (-11.82601-(-29.07601)));
            yy = -11.38812 + (((tickAnim - 360) / 30) * (-11.38812-(-11.38812)));
            zz = 7.17358 + (((tickAnim - 360) / 30) * (7.17358-(7.17358)));
        }
        else if (tickAnim >= 390 && tickAnim < 405) {
            xx = -11.82601 + (((tickAnim - 390) / 15) * (4.38211-(-11.82601)));
            yy = -11.38812 + (((tickAnim - 390) / 15) * (-23.11833-(-11.38812)));
            zz = 7.17358 + (((tickAnim - 390) / 15) * (9.82904-(7.17358)));
        }
        else if (tickAnim >= 405 && tickAnim < 425) {
            xx = 4.38211 + (((tickAnim - 405) / 20) * (0-(4.38211)));
            yy = -23.11833 + (((tickAnim - 405) / 20) * (0-(-23.11833)));
            zz = 9.82904 + (((tickAnim - 405) / 20) * (0-(9.82904)));
        }
        else if (tickAnim >= 425 && tickAnim < 438) {
            xx = 0 + (((tickAnim - 425) / 13) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 425) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 13) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 450) {
            xx = -6.75 + (((tickAnim - 438) / 12) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 438) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 438) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 55) {
            xx = -7 + (((tickAnim - 20) / 35) * (-7.5-(-7)));
            yy = 0 + (((tickAnim - 20) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 35) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 117) {
            xx = -7.5 + (((tickAnim - 55) / 62) * (-16-(-7.5)));
            yy = 0 + (((tickAnim - 55) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 62) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -16 + (((tickAnim - 117) / 43) * (-16-(-16)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = -16 + (((tickAnim - 160) / 8) * (-16.04185-(-16)));
            yy = 0 + (((tickAnim - 160) / 8) * (4.08508-(0)));
            zz = 0 + (((tickAnim - 160) / 8) * (-1.17345-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 195) {
            xx = -16.04185 + (((tickAnim - 168) / 27) * (-32.34761-(-16.04185)));
            yy = 4.08508 + (((tickAnim - 168) / 27) * (23.73418-(4.08508)));
            zz = -1.17345 + (((tickAnim - 168) / 27) * (-3.72354-(-1.17345)));
        }
        else if (tickAnim >= 195 && tickAnim < 205) {
            xx = -32.34761 + (((tickAnim - 195) / 10) * (2.65696-(-32.34761)));
            yy = 23.73418 + (((tickAnim - 195) / 10) * (0.76047-(23.73418)));
            zz = -3.72354 + (((tickAnim - 195) / 10) * (-4.85729-(-3.72354)));
        }
        else if (tickAnim >= 205 && tickAnim < 210) {
            xx = 2.65696 + (((tickAnim - 205) / 5) * (9.90696-(2.65696)));
            yy = 0.76047 + (((tickAnim - 205) / 5) * (0.76047-(0.76047)));
            zz = -4.85729 + (((tickAnim - 205) / 5) * (-4.85729-(-4.85729)));
        }
        else if (tickAnim >= 210 && tickAnim < 216) {
            xx = 9.90696 + (((tickAnim - 210) / 6) * (9.15696-(9.90696)));
            yy = 0.76047 + (((tickAnim - 210) / 6) * (0.76047-(0.76047)));
            zz = -4.85729 + (((tickAnim - 210) / 6) * (-4.85729-(-4.85729)));
        }
        else if (tickAnim >= 216 && tickAnim < 303) {
            xx = 9.15696 + (((tickAnim - 216) / 87) * (9.15696-(9.15696)));
            yy = 0.76047 + (((tickAnim - 216) / 87) * (0.76047-(0.76047)));
            zz = -4.85729 + (((tickAnim - 216) / 87) * (-4.85729-(-4.85729)));
        }
        else if (tickAnim >= 303 && tickAnim < 360) {
            xx = 9.15696 + (((tickAnim - 303) / 57) * (-24.09304-(9.15696)));
            yy = 0.76047 + (((tickAnim - 303) / 57) * (0.76047-(0.76047)));
            zz = -4.85729 + (((tickAnim - 303) / 57) * (-4.85729-(-4.85729)));
        }
        else if (tickAnim >= 360 && tickAnim < 390) {
            xx = -24.09304 + (((tickAnim - 360) / 30) * (-10.22112-(-24.09304)));
            yy = 0.76047 + (((tickAnim - 360) / 30) * (-11.53474-(0.76047)));
            zz = -4.85729 + (((tickAnim - 360) / 30) * (-22.21149-(-4.85729)));
        }
        else if (tickAnim >= 390 && tickAnim < 405) {
            xx = -10.22112 + (((tickAnim - 390) / 15) * (7.02888-(-10.22112)));
            yy = -11.53474 + (((tickAnim - 390) / 15) * (-11.53474-(-11.53474)));
            zz = -22.21149 + (((tickAnim - 390) / 15) * (-22.21149-(-22.21149)));
        }
        else if (tickAnim >= 405 && tickAnim < 425) {
            xx = 7.02888 + (((tickAnim - 405) / 20) * (0-(7.02888)));
            yy = -11.53474 + (((tickAnim - 405) / 20) * (0-(-11.53474)));
            zz = -22.21149 + (((tickAnim - 405) / 20) * (0-(-22.21149)));
        }
        else if (tickAnim >= 425 && tickAnim < 438) {
            xx = 0 + (((tickAnim - 425) / 13) * (-10-(0)));
            yy = 0 + (((tickAnim - 425) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 13) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 450) {
            xx = -10 + (((tickAnim - 438) / 12) * (0-(-10)));
            yy = 0 + (((tickAnim - 438) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 438) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (43.2-(0)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 43.2 + (((tickAnim - 30) / 25) * (37.5-(43.2)));
            yy = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 117) {
            xx = 37.5 + (((tickAnim - 55) / 62) * (37.5-(37.5)));
            yy = 0 + (((tickAnim - 55) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 62) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 37.5 + (((tickAnim - 117) / 43) * (37.5-(37.5)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = 37.5 + (((tickAnim - 160) / 8) * (37.63647-(37.5)));
            yy = 0 + (((tickAnim - 160) / 8) * (5.19377-(0)));
            zz = 0 + (((tickAnim - 160) / 8) * (3.00825-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 195) {
            xx = 37.63647 + (((tickAnim - 168) / 27) * (4.29746-(37.63647)));
            yy = 5.19377 + (((tickAnim - 168) / 27) * (12.70346-(5.19377)));
            zz = 3.00825 + (((tickAnim - 168) / 27) * (-0.34662-(3.00825)));
        }
        else if (tickAnim >= 195 && tickAnim < 200) {
            xx = 4.29746 + (((tickAnim - 195) / 5) * (-4.6258-(4.29746)));
            yy = 12.70346 + (((tickAnim - 195) / 5) * (0.85884-(12.70346)));
            zz = -0.34662 + (((tickAnim - 195) / 5) * (-3.49482-(-0.34662)));
        }
        else if (tickAnim >= 200 && tickAnim < 205) {
            xx = -4.6258 + (((tickAnim - 200) / 5) * (22.45094-(-4.6258)));
            yy = 0.85884 + (((tickAnim - 200) / 5) * (-10.98579-(0.85884)));
            zz = -3.49482 + (((tickAnim - 200) / 5) * (-6.64303-(-3.49482)));
        }
        else if (tickAnim >= 205 && tickAnim < 210) {
            xx = 22.45094 + (((tickAnim - 205) / 5) * (33.70094-(22.45094)));
            yy = -10.98579 + (((tickAnim - 205) / 5) * (-10.98579-(-10.98579)));
            zz = -6.64303 + (((tickAnim - 205) / 5) * (-6.64303-(-6.64303)));
        }
        else if (tickAnim >= 210 && tickAnim < 216) {
            xx = 33.70094 + (((tickAnim - 210) / 6) * (26.95094-(33.70094)));
            yy = -10.98579 + (((tickAnim - 210) / 6) * (-10.98579-(-10.98579)));
            zz = -6.64303 + (((tickAnim - 210) / 6) * (-6.64303-(-6.64303)));
        }
        else if (tickAnim >= 216 && tickAnim < 303) {
            xx = 26.95094 + (((tickAnim - 216) / 87) * (26.95094-(26.95094)));
            yy = -10.98579 + (((tickAnim - 216) / 87) * (-10.98579-(-10.98579)));
            zz = -6.64303 + (((tickAnim - 216) / 87) * (-6.64303-(-6.64303)));
        }
        else if (tickAnim >= 303 && tickAnim < 342) {
            xx = 26.95094 + (((tickAnim - 303) / 39) * (32.40437-(26.95094)));
            yy = -10.98579 + (((tickAnim - 303) / 39) * (-0.1281-(-10.98579)));
            zz = -6.64303 + (((tickAnim - 303) / 39) * (-2.82306-(-6.64303)));
        }
        else if (tickAnim >= 342 && tickAnim < 360) {
            xx = 32.40437 + (((tickAnim - 342) / 18) * (-0.85-(32.40437)));
            yy = -0.1281 + (((tickAnim - 342) / 18) * (13.56203-(-0.1281)));
            zz = -2.82306 + (((tickAnim - 342) / 18) * (1.99343-(-2.82306)));
        }
        else if (tickAnim >= 360 && tickAnim < 370) {
            xx = -0.85 + (((tickAnim - 360) / 10) * (-15.42063-(-0.85)));
            yy = 13.56203 + (((tickAnim - 360) / 10) * (4.35121-(13.56203)));
            zz = 1.99343 + (((tickAnim - 360) / 10) * (-11.74463-(1.99343)));
        }
        else if (tickAnim >= 370 && tickAnim < 390) {
            xx = -15.42063 + (((tickAnim - 370) / 20) * (-14.77323-(-15.42063)));
            yy = 4.35121 + (((tickAnim - 370) / 20) * (-10.48468-(4.35121)));
            zz = -11.74463 + (((tickAnim - 370) / 20) * (-28.78174-(-11.74463)));
        }
        else if (tickAnim >= 390 && tickAnim < 405) {
            xx = -14.77323 + (((tickAnim - 390) / 15) * (-18.58745-(-14.77323)));
            yy = -10.48468 + (((tickAnim - 390) / 15) * (-3.08644-(-10.48468)));
            zz = -28.78174 + (((tickAnim - 390) / 15) * (-32.46101-(-28.78174)));
        }
        else if (tickAnim >= 405 && tickAnim < 425) {
            xx = -18.58745 + (((tickAnim - 405) / 20) * (0-(-18.58745)));
            yy = -3.08644 + (((tickAnim - 405) / 20) * (0-(-3.08644)));
            zz = -32.46101 + (((tickAnim - 405) / 20) * (0-(-32.46101)));
        }
        else if (tickAnim >= 425 && tickAnim < 438) {
            xx = 0 + (((tickAnim - 425) / 13) * (-16.25-(0)));
            yy = 0 + (((tickAnim - 425) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 13) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 450) {
            xx = -16.25 + (((tickAnim - 438) / 12) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 438) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 438) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 12.25 + (((tickAnim - 30) / 25) * (13.5-(12.25)));
            yy = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 13.5 + (((tickAnim - 55) / 3) * (16-(13.5)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 16 + (((tickAnim - 58) / 2) * (13.5-(16)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 13.5 + (((tickAnim - 60) / 3) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 13.5 + (((tickAnim - 63) / 2) * (16-(13.5)));
            yy = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 2) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = 16 + (((tickAnim - 65) / 3) * (13.5-(16)));
            yy = 0 + (((tickAnim - 65) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 3) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = 13.5 + (((tickAnim - 68) / 2) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 68) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 2) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 13.5 + (((tickAnim - 70) / 3) * (16-(13.5)));
            yy = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = 16 + (((tickAnim - 73) / 2) * (13.5-(16)));
            yy = 0 + (((tickAnim - 73) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 2) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 13.5 + (((tickAnim - 75) / 3) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = 13.5 + (((tickAnim - 78) / 2) * (16-(13.5)));
            yy = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 2) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = 16 + (((tickAnim - 80) / 3) * (13.5-(16)));
            yy = 0 + (((tickAnim - 80) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 3) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 86) {
            xx = 13.5 + (((tickAnim - 83) / 3) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 83) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 3) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 88) {
            xx = 13.5 + (((tickAnim - 86) / 2) * (16-(13.5)));
            yy = 0 + (((tickAnim - 86) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 2) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 91) {
            xx = 16 + (((tickAnim - 88) / 3) * (13.5-(16)));
            yy = 0 + (((tickAnim - 88) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 3) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 93) {
            xx = 13.5 + (((tickAnim - 91) / 2) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 91) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 2) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 96) {
            xx = 13.5 + (((tickAnim - 93) / 3) * (16-(13.5)));
            yy = 0 + (((tickAnim - 93) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 3) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 98) {
            xx = 16 + (((tickAnim - 96) / 2) * (13.5-(16)));
            yy = 0 + (((tickAnim - 96) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 2) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 101) {
            xx = 13.5 + (((tickAnim - 98) / 3) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 98) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 3) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 103) {
            xx = 13.5 + (((tickAnim - 101) / 2) * (16-(13.5)));
            yy = 0 + (((tickAnim - 101) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 2) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 106) {
            xx = 16 + (((tickAnim - 103) / 3) * (13.5-(16)));
            yy = 0 + (((tickAnim - 103) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 3) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 108) {
            xx = 13.5 + (((tickAnim - 106) / 2) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 106) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 2) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 111) {
            xx = 13.5 + (((tickAnim - 108) / 3) * (16-(13.5)));
            yy = 0 + (((tickAnim - 108) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 3) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 113) {
            xx = 16 + (((tickAnim - 111) / 2) * (13.5-(16)));
            yy = 0 + (((tickAnim - 111) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 2) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 117) {
            xx = 13.5 + (((tickAnim - 113) / 4) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 113) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 4) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 13.5 + (((tickAnim - 117) / 43) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = 13.5 + (((tickAnim - 160) / 8) * (13.28436-(13.5)));
            yy = 0 + (((tickAnim - 160) / 8) * (3.01136-(0)));
            zz = 0 + (((tickAnim - 160) / 8) * (-3.74674-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = 13.28436 + (((tickAnim - 168) / 17) * (13.69211-(13.28436)));
            yy = 3.01136 + (((tickAnim - 168) / 17) * (-0.00908-(3.01136)));
            zz = -3.74674 + (((tickAnim - 168) / 17) * (11.71806-(-3.74674)));
        }
        else if (tickAnim >= 185 && tickAnim < 202) {
            xx = 13.69211 + (((tickAnim - 185) / 17) * (13.69211-(13.69211)));
            yy = -0.00908 + (((tickAnim - 185) / 17) * (-0.00908-(-0.00908)));
            zz = 11.71806 + (((tickAnim - 185) / 17) * (11.71806-(11.71806)));
        }
        else if (tickAnim >= 202 && tickAnim < 208) {
            xx = 13.69211 + (((tickAnim - 202) / 6) * (15.44211-(13.69211)));
            yy = -0.00908 + (((tickAnim - 202) / 6) * (-0.00908-(-0.00908)));
            zz = 11.71806 + (((tickAnim - 202) / 6) * (11.71806-(11.71806)));
        }
        else if (tickAnim >= 208 && tickAnim < 216) {
            xx = 15.44211 + (((tickAnim - 208) / 8) * (13.69211-(15.44211)));
            yy = -0.00908 + (((tickAnim - 208) / 8) * (-0.00908-(-0.00908)));
            zz = 11.71806 + (((tickAnim - 208) / 8) * (11.71806-(11.71806)));
        }
        else if (tickAnim >= 216 && tickAnim < 223) {
            xx = 13.69211 + (((tickAnim - 216) / 7) * (15.44211-(13.69211)));
            yy = -0.00908 + (((tickAnim - 216) / 7) * (-0.00908-(-0.00908)));
            zz = 11.71806 + (((tickAnim - 216) / 7) * (11.71806-(11.71806)));
        }
        else if (tickAnim >= 223 && tickAnim < 230) {
            xx = 15.44211 + (((tickAnim - 223) / 7) * (13.69211-(15.44211)));
            yy = -0.00908 + (((tickAnim - 223) / 7) * (-0.00908-(-0.00908)));
            zz = 11.71806 + (((tickAnim - 223) / 7) * (11.71806-(11.71806)));
        }
        else if (tickAnim >= 230 && tickAnim < 237) {
            xx = 13.69211 + (((tickAnim - 230) / 7) * (15.44211-(13.69211)));
            yy = -0.00908 + (((tickAnim - 230) / 7) * (-0.00908-(-0.00908)));
            zz = 11.71806 + (((tickAnim - 230) / 7) * (11.71806-(11.71806)));
        }
        else if (tickAnim >= 237 && tickAnim < 244) {
            xx = 15.44211 + (((tickAnim - 237) / 7) * (13.69211-(15.44211)));
            yy = -0.00908 + (((tickAnim - 237) / 7) * (-0.00908-(-0.00908)));
            zz = 11.71806 + (((tickAnim - 237) / 7) * (11.71806-(11.71806)));
        }
        else if (tickAnim >= 244 && tickAnim < 251) {
            xx = 13.69211 + (((tickAnim - 244) / 7) * (15.44211-(13.69211)));
            yy = -0.00908 + (((tickAnim - 244) / 7) * (-0.00908-(-0.00908)));
            zz = 11.71806 + (((tickAnim - 244) / 7) * (11.71806-(11.71806)));
        }
        else if (tickAnim >= 251 && tickAnim < 258) {
            xx = 15.44211 + (((tickAnim - 251) / 7) * (13.69211-(15.44211)));
            yy = -0.00908 + (((tickAnim - 251) / 7) * (-0.00908-(-0.00908)));
            zz = 11.71806 + (((tickAnim - 251) / 7) * (11.71806-(11.71806)));
        }
        else if (tickAnim >= 258 && tickAnim < 425) {
            xx = 13.69211 + (((tickAnim - 258) / 167) * (19.25-(13.69211)));
            yy = -0.00908 + (((tickAnim - 258) / 167) * (0-(-0.00908)));
            zz = 11.71806 + (((tickAnim - 258) / 167) * (0-(11.71806)));
        }
        else if (tickAnim >= 425 && tickAnim < 450) {
            xx = 19.25 + (((tickAnim - 425) / 25) * (0-(19.25)));
            yy = 0 + (((tickAnim - 425) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));

        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 10 + (((tickAnim - 30) / 12) * (10.97-(10)));
            yy = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 12) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 10.97 + (((tickAnim - 42) / 13) * (18.5-(10.97)));
            yy = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 18.5 + (((tickAnim - 55) / 3) * (12.5-(18.5)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 12.5 + (((tickAnim - 58) / 2) * (18.5-(12.5)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 18.5 + (((tickAnim - 60) / 3) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 18.5 + (((tickAnim - 63) / 2) * (12.5-(18.5)));
            yy = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 2) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = 12.5 + (((tickAnim - 65) / 3) * (18.5-(12.5)));
            yy = 0 + (((tickAnim - 65) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 3) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = 18.5 + (((tickAnim - 68) / 2) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 68) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 2) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 18.5 + (((tickAnim - 70) / 3) * (12.5-(18.5)));
            yy = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = 12.5 + (((tickAnim - 73) / 2) * (18.5-(12.5)));
            yy = 0 + (((tickAnim - 73) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 2) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 18.5 + (((tickAnim - 75) / 3) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = 18.5 + (((tickAnim - 78) / 2) * (12.5-(18.5)));
            yy = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 2) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = 12.5 + (((tickAnim - 80) / 3) * (18.5-(12.5)));
            yy = 0 + (((tickAnim - 80) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 3) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 86) {
            xx = 18.5 + (((tickAnim - 83) / 3) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 83) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 3) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 88) {
            xx = 18.5 + (((tickAnim - 86) / 2) * (12.5-(18.5)));
            yy = 0 + (((tickAnim - 86) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 2) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 91) {
            xx = 12.5 + (((tickAnim - 88) / 3) * (18.5-(12.5)));
            yy = 0 + (((tickAnim - 88) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 3) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 93) {
            xx = 18.5 + (((tickAnim - 91) / 2) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 91) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 2) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 96) {
            xx = 18.5 + (((tickAnim - 93) / 3) * (12.5-(18.5)));
            yy = 0 + (((tickAnim - 93) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 3) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 98) {
            xx = 12.5 + (((tickAnim - 96) / 2) * (18.5-(12.5)));
            yy = 0 + (((tickAnim - 96) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 2) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 101) {
            xx = 18.5 + (((tickAnim - 98) / 3) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 98) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 3) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 103) {
            xx = 18.5 + (((tickAnim - 101) / 2) * (12.5-(18.5)));
            yy = 0 + (((tickAnim - 101) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 2) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 106) {
            xx = 12.5 + (((tickAnim - 103) / 3) * (18.5-(12.5)));
            yy = 0 + (((tickAnim - 103) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 3) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 108) {
            xx = 18.5 + (((tickAnim - 106) / 2) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 106) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 2) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 111) {
            xx = 18.5 + (((tickAnim - 108) / 3) * (12.5-(18.5)));
            yy = 0 + (((tickAnim - 108) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 3) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 113) {
            xx = 12.5 + (((tickAnim - 111) / 2) * (18.5-(12.5)));
            yy = 0 + (((tickAnim - 111) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 2) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 18.5 + (((tickAnim - 113) / 7) * (-10.4005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-20))*20-(18.5)));
            yy = 0 + (((tickAnim - 113) / 7) * (-2.68797-(0)));
            zz = 0 + (((tickAnim - 113) / 7) * (0.15556-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 129) {
            xx = -10.4005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-20))*20 + (((tickAnim - 120) / 9) * (9.72453-(-10.4005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-20))*20)));
            yy = -2.68797 + (((tickAnim - 120) / 9) * (-2.68797-(-2.68797)));
            zz = 0.15556 + (((tickAnim - 120) / 9) * (0.15556-(0.15556)));
        }
        else if (tickAnim >= 129 && tickAnim < 136) {
            xx = 9.72453 + (((tickAnim - 129) / 7) * (12.3737+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15-(9.72453)));
            yy = -2.68797 + (((tickAnim - 129) / 7) * (-5.18794-(-2.68797)));
            zz = 0.15556 + (((tickAnim - 129) / 7) * (0.16762-(0.15556)));
        }
        else if (tickAnim >= 136 && tickAnim < 140) {
            xx = 12.3737+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15 + (((tickAnim - 136) / 4) * (0.4737-(12.3737+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15)));
            yy = -5.18794 + (((tickAnim - 136) / 4) * (-5.18794-(-5.18794)));
            zz = 0.16762 + (((tickAnim - 136) / 4) * (0.16762-(0.16762)));
        }
        else if (tickAnim >= 140 && tickAnim < 143) {
            xx = 0.4737 + (((tickAnim - 140) / 3) * (0.4737-(0.4737)));
            yy = -5.18794 + (((tickAnim - 140) / 3) * (-5.18794-(-5.18794)));
            zz = 0.16762 + (((tickAnim - 140) / 3) * (0.16762-(0.16762)));
        }
        else if (tickAnim >= 143 && tickAnim < 170) {
            xx = 0.4737 + (((tickAnim - 143) / 27) * (-3.7423-(0.4737)));
            yy = -5.18794 + (((tickAnim - 143) / 27) * (-9.28634-(-5.18794)));
            zz = 0.16762 + (((tickAnim - 143) / 27) * (-7.72125-(0.16762)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = -3.7423 + (((tickAnim - 170) / 15) * (5.23878-(-3.7423)));
            yy = -9.28634 + (((tickAnim - 170) / 15) * (-39.01387-(-9.28634)));
            zz = -7.72125 + (((tickAnim - 170) / 15) * (8.4047-(-7.72125)));
        }
        else if (tickAnim >= 185 && tickAnim < 195) {
            xx = 5.23878 + (((tickAnim - 185) / 10) * (4.08213-(5.23878)));
            yy = -39.01387 + (((tickAnim - 185) / 10) * (-22.28558-(-39.01387)));
            zz = 8.4047 + (((tickAnim - 185) / 10) * (38.81036-(8.4047)));
        }
        else if (tickAnim >= 195 && tickAnim < 202) {
            xx = 4.08213 + (((tickAnim - 195) / 7) * (4.17736-(4.08213)));
            yy = -22.28558 + (((tickAnim - 195) / 7) * (-25.2778-(-22.28558)));
            zz = 38.81036 + (((tickAnim - 195) / 7) * (38.57429-(38.81036)));
        }
        else if (tickAnim >= 202 && tickAnim < 208) {
            xx = 4.17736 + (((tickAnim - 202) / 6) * (3.53642-(4.17736)));
            yy = -25.2778 + (((tickAnim - 202) / 6) * (-23.36636-(-25.2778)));
            zz = 38.57429 + (((tickAnim - 202) / 6) * (40.09045-(38.57429)));
        }
        else if (tickAnim >= 208 && tickAnim < 216) {
            xx = 3.53642 + (((tickAnim - 208) / 8) * (4.17736-(3.53642)));
            yy = -23.36636 + (((tickAnim - 208) / 8) * (-25.2778-(-23.36636)));
            zz = 40.09045 + (((tickAnim - 208) / 8) * (38.57429-(40.09045)));
        }
        else if (tickAnim >= 216 && tickAnim < 223) {
            xx = 4.17736 + (((tickAnim - 216) / 7) * (3.53642-(4.17736)));
            yy = -25.2778 + (((tickAnim - 216) / 7) * (-23.36636-(-25.2778)));
            zz = 38.57429 + (((tickAnim - 216) / 7) * (40.09045-(38.57429)));
        }
        else if (tickAnim >= 223 && tickAnim < 230) {
            xx = 3.53642 + (((tickAnim - 223) / 7) * (4.17736-(3.53642)));
            yy = -23.36636 + (((tickAnim - 223) / 7) * (-25.2778-(-23.36636)));
            zz = 40.09045 + (((tickAnim - 223) / 7) * (38.57429-(40.09045)));
        }
        else if (tickAnim >= 230 && tickAnim < 237) {
            xx = 4.17736 + (((tickAnim - 230) / 7) * (3.53642-(4.17736)));
            yy = -25.2778 + (((tickAnim - 230) / 7) * (-23.36636-(-25.2778)));
            zz = 38.57429 + (((tickAnim - 230) / 7) * (40.09045-(38.57429)));
        }
        else if (tickAnim >= 237 && tickAnim < 244) {
            xx = 3.53642 + (((tickAnim - 237) / 7) * (4.17736-(3.53642)));
            yy = -23.36636 + (((tickAnim - 237) / 7) * (-25.2778-(-23.36636)));
            zz = 40.09045 + (((tickAnim - 237) / 7) * (38.57429-(40.09045)));
        }
        else if (tickAnim >= 244 && tickAnim < 251) {
            xx = 4.17736 + (((tickAnim - 244) / 7) * (3.53642-(4.17736)));
            yy = -25.2778 + (((tickAnim - 244) / 7) * (-23.36636-(-25.2778)));
            zz = 38.57429 + (((tickAnim - 244) / 7) * (40.09045-(38.57429)));
        }
        else if (tickAnim >= 251 && tickAnim < 258) {
            xx = 3.53642 + (((tickAnim - 251) / 7) * (4.17736-(3.53642)));
            yy = -23.36636 + (((tickAnim - 251) / 7) * (-25.2778-(-23.36636)));
            zz = 40.09045 + (((tickAnim - 251) / 7) * (38.57429-(40.09045)));
        }
        else if (tickAnim >= 258 && tickAnim < 265) {
            xx = 4.17736 + (((tickAnim - 258) / 7) * (3.53642-(4.17736)));
            yy = -25.2778 + (((tickAnim - 258) / 7) * (-23.36636-(-25.2778)));
            zz = 38.57429 + (((tickAnim - 258) / 7) * (40.09045-(38.57429)));
        }
        else if (tickAnim >= 265 && tickAnim < 273) {
            xx = 3.53642 + (((tickAnim - 265) / 8) * (4.17736-(3.53642)));
            yy = -23.36636 + (((tickAnim - 265) / 8) * (-25.2778-(-23.36636)));
            zz = 40.09045 + (((tickAnim - 265) / 8) * (38.57429-(40.09045)));
        }
        else if (tickAnim >= 273 && tickAnim < 283) {
            xx = 4.17736 + (((tickAnim - 273) / 10) * (4.17736-(4.17736)));
            yy = -25.2778 + (((tickAnim - 273) / 10) * (-25.2778-(-25.2778)));
            zz = 38.57429 + (((tickAnim - 273) / 10) * (38.57429-(38.57429)));
        }
        else if (tickAnim >= 283 && tickAnim < 305) {
            xx = 4.17736 + (((tickAnim - 283) / 22) * (4.17736-(4.17736)));
            yy = -25.2778 + (((tickAnim - 283) / 22) * (-25.2778-(-25.2778)));
            zz = 38.57429 + (((tickAnim - 283) / 22) * (38.57429-(38.57429)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = 4.17736 + (((tickAnim - 305) / 10) * (3.57435-(4.17736)));
            yy = -25.2778 + (((tickAnim - 305) / 10) * (-23.36681-(-25.2778)));
            zz = 38.57429 + (((tickAnim - 305) / 10) * (40.09106-(38.57429)));
        }
        else if (tickAnim >= 315 && tickAnim < 323) {
            xx = 3.57435 + (((tickAnim - 315) / 8) * (3.57435-(3.57435)));
            yy = -23.36681 + (((tickAnim - 315) / 8) * (-23.36681-(-23.36681)));
            zz = 40.09106 + (((tickAnim - 315) / 8) * (40.09106-(40.09106)));
        }
        else if (tickAnim >= 323 && tickAnim < 334) {
            xx = 3.57435 + (((tickAnim - 323) / 11) * (3.57435-(3.57435)));
            yy = -23.36681 + (((tickAnim - 323) / 11) * (-23.36681-(-23.36681)));
            zz = 40.09106 + (((tickAnim - 323) / 11) * (40.09106-(40.09106)));
        }
        else if (tickAnim >= 334 && tickAnim < 350) {
            xx = 3.57435 + (((tickAnim - 334) / 16) * (48.3607+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*35-(3.57435)));
            yy = -23.36681 + (((tickAnim - 334) / 16) * (0.34671-(-23.36681)));
            zz = 40.09106 + (((tickAnim - 334) / 16) * (2.22146-(40.09106)));
        }
        else if (tickAnim >= 350 && tickAnim < 365) {
            xx = 48.3607+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*35 + (((tickAnim - 350) / 15) * (32.9579+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-15-(48.3607+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*35)));
            yy = 0.34671 + (((tickAnim - 350) / 15) * (3.83423-(0.34671)));
            zz = 2.22146 + (((tickAnim - 350) / 15) * (-4.6877+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-20))*-30-(2.22146)));
        }
        else if (tickAnim >= 365 && tickAnim < 405) {
            xx = 32.9579+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-15 + (((tickAnim - 365) / 40) * (19.00539-(32.9579+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-15)));
            yy = 3.83423 + (((tickAnim - 365) / 40) * (-0.20557-(3.83423)));
            zz = -4.6877+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-20))*-30 + (((tickAnim - 365) / 40) * (8.05307-(-4.6877+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-20))*-30)));
        }
        else if (tickAnim >= 405 && tickAnim < 425) {
            xx = 19.00539 + (((tickAnim - 405) / 20) * (0-(19.00539)));
            yy = -0.20557 + (((tickAnim - 405) / 20) * (0-(-0.20557)));
            zz = 8.05307 + (((tickAnim - 405) / 20) * (0-(8.05307)));
        }
        else if (tickAnim >= 425 && tickAnim < 438) {
            xx = 0 + (((tickAnim - 425) / 13) * (-1.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*10-(0)));
            yy = 0 + (((tickAnim - 425) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 13) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 450) {
            xx = -1.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*10 + (((tickAnim - 438) / 12) * (0-(-1.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*10)));
            yy = 0 + (((tickAnim - 438) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 438) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 0) / 136) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 136) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 136) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 136) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 136) / 4) * (0.45-(0.45)));
            zz = 0 + (((tickAnim - 136) / 4) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            yy = 0.45 + (((tickAnim - 140) / 30) * (0.45-(0.45)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 195) {
            xx = 0 + (((tickAnim - 170) / 25) * (1.175-(0)));
            yy = 0.45 + (((tickAnim - 170) / 25) * (0.45-(0.45)));
            zz = 0 + (((tickAnim - 170) / 25) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 283) {
            xx = 1.175 + (((tickAnim - 195) / 88) * (1.175-(1.175)));
            yy = 0.45 + (((tickAnim - 195) / 88) * (0.45-(0.45)));
            zz = 0 + (((tickAnim - 195) / 88) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 305) {
            xx = 1.175 + (((tickAnim - 283) / 22) * (1.175-(1.175)));
            yy = 0.45 + (((tickAnim - 283) / 22) * (0.45-(0.45)));
            zz = 0 + (((tickAnim - 283) / 22) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 334) {
            xx = 1.175 + (((tickAnim - 305) / 29) * (1.175-(1.175)));
            yy = 0.45 + (((tickAnim - 305) / 29) * (0.45-(0.45)));
            zz = 0 + (((tickAnim - 305) / 29) * (0-(0)));
        }
        else if (tickAnim >= 334 && tickAnim < 365) {
            xx = 1.175 + (((tickAnim - 334) / 31) * (-0.445-(1.175)));
            yy = 0.45 + (((tickAnim - 334) / 31) * (0.45-(0.45)));
            zz = 0 + (((tickAnim - 334) / 31) * (0-(0)));
        }
        else if (tickAnim >= 365 && tickAnim < 425) {
            xx = -0.445 + (((tickAnim - 365) / 60) * (0-(-0.445)));
            yy = 0.45 + (((tickAnim - 365) / 60) * (0-(0.45)));
            zz = 0 + (((tickAnim - 365) / 60) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 425) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 425) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 30) / 12) * (-7.48-(0)));
            yy = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 12) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = -7.48 + (((tickAnim - 42) / 13) * (-4.25-(-7.48)));
            yy = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = -4.25 + (((tickAnim - 55) / 3) * (-0.25-(-4.25)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = -0.25 + (((tickAnim - 58) / 2) * (-4.25-(-0.25)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = -4.25 + (((tickAnim - 60) / 3) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = -4.25 + (((tickAnim - 63) / 2) * (-0.25-(-4.25)));
            yy = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 2) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = -0.25 + (((tickAnim - 65) / 3) * (-4.25-(-0.25)));
            yy = 0 + (((tickAnim - 65) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 3) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = -4.25 + (((tickAnim - 68) / 2) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 68) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 2) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = -4.25 + (((tickAnim - 70) / 3) * (-0.25-(-4.25)));
            yy = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = -0.25 + (((tickAnim - 73) / 2) * (-4.25-(-0.25)));
            yy = 0 + (((tickAnim - 73) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 2) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = -4.25 + (((tickAnim - 75) / 3) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = -4.25 + (((tickAnim - 78) / 2) * (-0.25-(-4.25)));
            yy = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 2) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = -0.25 + (((tickAnim - 80) / 3) * (-4.25-(-0.25)));
            yy = 0 + (((tickAnim - 80) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 3) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 86) {
            xx = -4.25 + (((tickAnim - 83) / 3) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 83) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 3) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 88) {
            xx = -4.25 + (((tickAnim - 86) / 2) * (-0.25-(-4.25)));
            yy = 0 + (((tickAnim - 86) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 2) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 91) {
            xx = -0.25 + (((tickAnim - 88) / 3) * (-4.25-(-0.25)));
            yy = 0 + (((tickAnim - 88) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 3) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 93) {
            xx = -4.25 + (((tickAnim - 91) / 2) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 91) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 2) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 96) {
            xx = -4.25 + (((tickAnim - 93) / 3) * (-0.25-(-4.25)));
            yy = 0 + (((tickAnim - 93) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 3) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 98) {
            xx = -0.25 + (((tickAnim - 96) / 2) * (-4.25-(-0.25)));
            yy = 0 + (((tickAnim - 96) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 2) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 101) {
            xx = -4.25 + (((tickAnim - 98) / 3) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 98) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 3) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 103) {
            xx = -4.25 + (((tickAnim - 101) / 2) * (-0.25-(-4.25)));
            yy = 0 + (((tickAnim - 101) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 2) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 106) {
            xx = -0.25 + (((tickAnim - 103) / 3) * (-4.25-(-0.25)));
            yy = 0 + (((tickAnim - 103) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 3) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 108) {
            xx = -4.25 + (((tickAnim - 106) / 2) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 106) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 2) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 111) {
            xx = -4.25 + (((tickAnim - 108) / 3) * (-0.25-(-4.25)));
            yy = 0 + (((tickAnim - 108) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 3) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 113) {
            xx = -0.25 + (((tickAnim - 111) / 2) * (-4.25-(-0.25)));
            yy = 0 + (((tickAnim - 111) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 2) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = -4.25 + (((tickAnim - 113) / 7) * (-11.13353-(-4.25)));
            yy = 0 + (((tickAnim - 113) / 7) * (-6.88831-(0)));
            zz = 0 + (((tickAnim - 113) / 7) * (1.45639-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 129) {
            xx = -11.13353 + (((tickAnim - 120) / 9) * (-11.13353-(-11.13353)));
            yy = -6.88831 + (((tickAnim - 120) / 9) * (-6.88831-(-6.88831)));
            zz = 1.45639 + (((tickAnim - 120) / 9) * (1.45639-(1.45639)));
        }
        else if (tickAnim >= 129 && tickAnim < 136) {
            xx = -11.13353 + (((tickAnim - 129) / 7) * (-10.83813-(-11.13353)));
            yy = -6.88831 + (((tickAnim - 129) / 7) * (-12.25321-(-6.88831)));
            zz = 1.45639 + (((tickAnim - 129) / 7) * (2.68556-(1.45639)));
        }
        else if (tickAnim >= 136 && tickAnim < 140) {
            xx = -10.83813 + (((tickAnim - 136) / 4) * (-11.08813-(-10.83813)));
            yy = -12.25321 + (((tickAnim - 136) / 4) * (-12.25321-(-12.25321)));
            zz = 2.68556 + (((tickAnim - 136) / 4) * (2.68556-(2.68556)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = -11.08813 + (((tickAnim - 140) / 30) * (-17.06346-(-11.08813)));
            yy = -12.25321 + (((tickAnim - 140) / 30) * (-14.1458-(-12.25321)));
            zz = 2.68556 + (((tickAnim - 140) / 30) * (-2.89179-(2.68556)));
        }
        else if (tickAnim >= 170 && tickAnim < 178) {
            xx = -17.06346 + (((tickAnim - 170) / 8) * (-12.78955-(-17.06346)));
            yy = -14.1458 + (((tickAnim - 170) / 8) * (-13.00457-(-14.1458)));
            zz = -2.89179 + (((tickAnim - 170) / 8) * (12.33632-(-2.89179)));
        }
        else if (tickAnim >= 178 && tickAnim < 195) {
            xx = -12.78955 + (((tickAnim - 178) / 17) * (-14.35106-(-12.78955)));
            yy = -13.00457 + (((tickAnim - 178) / 17) * (-13.38267-(-13.00457)));
            zz = 12.33632 + (((tickAnim - 178) / 17) * (20.9516-(12.33632)));
        }
        else if (tickAnim >= 195 && tickAnim < 202) {
            xx = -14.35106 + (((tickAnim - 195) / 7) * (-14.35106-(-14.35106)));
            yy = -13.38267 + (((tickAnim - 195) / 7) * (-13.38267-(-13.38267)));
            zz = 20.9516 + (((tickAnim - 195) / 7) * (20.9516-(20.9516)));
        }
        else if (tickAnim >= 202 && tickAnim < 208) {
            xx = -14.35106 + (((tickAnim - 202) / 6) * (-18.95589-(-14.35106)));
            yy = -13.38267 + (((tickAnim - 202) / 6) * (-13.38267-(-13.38267)));
            zz = 20.9516 + (((tickAnim - 202) / 6) * (20.9516-(20.9516)));
        }
        else if (tickAnim >= 208 && tickAnim < 216) {
            xx = -18.95589 + (((tickAnim - 208) / 8) * (-14.35106-(-18.95589)));
            yy = -13.38267 + (((tickAnim - 208) / 8) * (-13.38267-(-13.38267)));
            zz = 20.9516 + (((tickAnim - 208) / 8) * (20.9516-(20.9516)));
        }
        else if (tickAnim >= 216 && tickAnim < 223) {
            xx = -14.35106 + (((tickAnim - 216) / 7) * (-18.95589-(-14.35106)));
            yy = -13.38267 + (((tickAnim - 216) / 7) * (-13.38267-(-13.38267)));
            zz = 20.9516 + (((tickAnim - 216) / 7) * (20.9516-(20.9516)));
        }
        else if (tickAnim >= 223 && tickAnim < 230) {
            xx = -18.95589 + (((tickAnim - 223) / 7) * (-14.35106-(-18.95589)));
            yy = -13.38267 + (((tickAnim - 223) / 7) * (-13.38267-(-13.38267)));
            zz = 20.9516 + (((tickAnim - 223) / 7) * (20.9516-(20.9516)));
        }
        else if (tickAnim >= 230 && tickAnim < 237) {
            xx = -14.35106 + (((tickAnim - 230) / 7) * (-18.95589-(-14.35106)));
            yy = -13.38267 + (((tickAnim - 230) / 7) * (-13.38267-(-13.38267)));
            zz = 20.9516 + (((tickAnim - 230) / 7) * (20.9516-(20.9516)));
        }
        else if (tickAnim >= 237 && tickAnim < 244) {
            xx = -18.95589 + (((tickAnim - 237) / 7) * (-14.35106-(-18.95589)));
            yy = -13.38267 + (((tickAnim - 237) / 7) * (-13.38267-(-13.38267)));
            zz = 20.9516 + (((tickAnim - 237) / 7) * (20.9516-(20.9516)));
        }
        else if (tickAnim >= 244 && tickAnim < 251) {
            xx = -14.35106 + (((tickAnim - 244) / 7) * (-18.95589-(-14.35106)));
            yy = -13.38267 + (((tickAnim - 244) / 7) * (-13.38267-(-13.38267)));
            zz = 20.9516 + (((tickAnim - 244) / 7) * (20.9516-(20.9516)));
        }
        else if (tickAnim >= 251 && tickAnim < 258) {
            xx = -18.95589 + (((tickAnim - 251) / 7) * (-14.35106-(-18.95589)));
            yy = -13.38267 + (((tickAnim - 251) / 7) * (-13.38267-(-13.38267)));
            zz = 20.9516 + (((tickAnim - 251) / 7) * (20.9516-(20.9516)));
        }
        else if (tickAnim >= 258 && tickAnim < 265) {
            xx = -14.35106 + (((tickAnim - 258) / 7) * (-18.95589-(-14.35106)));
            yy = -13.38267 + (((tickAnim - 258) / 7) * (-13.38267-(-13.38267)));
            zz = 20.9516 + (((tickAnim - 258) / 7) * (20.9516-(20.9516)));
        }
        else if (tickAnim >= 265 && tickAnim < 273) {
            xx = -18.95589 + (((tickAnim - 265) / 8) * (-14.35106-(-18.95589)));
            yy = -13.38267 + (((tickAnim - 265) / 8) * (-13.38267-(-13.38267)));
            zz = 20.9516 + (((tickAnim - 265) / 8) * (20.9516-(20.9516)));
        }
        else if (tickAnim >= 273 && tickAnim < 279) {
            xx = -14.35106 + (((tickAnim - 273) / 6) * (-18.95589-(-14.35106)));
            yy = -13.38267 + (((tickAnim - 273) / 6) * (-13.38267-(-13.38267)));
            zz = 20.9516 + (((tickAnim - 273) / 6) * (20.9516-(20.9516)));
        }
        else if (tickAnim >= 279 && tickAnim < 297) {
            xx = -18.95589 + (((tickAnim - 279) / 18) * (-13.91412-(-18.95589)));
            yy = -13.38267 + (((tickAnim - 279) / 18) * (-1.34151-(-13.38267)));
            zz = 20.9516 + (((tickAnim - 279) / 18) * (17.56149-(20.9516)));
        }
        else if (tickAnim >= 297 && tickAnim < 305) {
            xx = -13.91412 + (((tickAnim - 297) / 8) * (-13.91412-(-13.91412)));
            yy = -1.34151 + (((tickAnim - 297) / 8) * (-1.34151-(-1.34151)));
            zz = 17.56149 + (((tickAnim - 297) / 8) * (17.56149-(17.56149)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = -13.91412 + (((tickAnim - 305) / 10) * (-13.90513-(-13.91412)));
            yy = -1.34151 + (((tickAnim - 305) / 10) * (0.71943-(-1.34151)));
            zz = 17.56149 + (((tickAnim - 305) / 10) * (17.51204-(17.56149)));
        }
        else if (tickAnim >= 315 && tickAnim < 323) {
            xx = -13.90513 + (((tickAnim - 315) / 8) * (-13.90513-(-13.90513)));
            yy = 0.71943 + (((tickAnim - 315) / 8) * (0.75556-(0.71943)));
            zz = 17.51204 + (((tickAnim - 315) / 8) * (17.51204-(17.51204)));
        }
        else if (tickAnim >= 323 && tickAnim < 331) {
            xx = -13.90513 + (((tickAnim - 323) / 8) * (-13.90889-(-13.90513)));
            yy = 0.75556 + (((tickAnim - 323) / 8) * (1.44247-(0.75556)));
            zz = 17.51204 + (((tickAnim - 323) / 8) * (17.31275-(17.51204)));
        }
        else if (tickAnim >= 331 && tickAnim < 334) {
            xx = -13.90889 + (((tickAnim - 331) / 3) * (-13.90889-(-13.90889)));
            yy = 1.44247 + (((tickAnim - 331) / 3) * (1.44247-(1.44247)));
            zz = 17.31275 + (((tickAnim - 331) / 3) * (17.31275-(17.31275)));
        }
        else if (tickAnim >= 334 && tickAnim < 350) {
            xx = -13.90889 + (((tickAnim - 334) / 16) * (23.4001-(-13.90889)));
            yy = 1.44247 + (((tickAnim - 334) / 16) * (-19.57404-(1.44247)));
            zz = 17.31275 + (((tickAnim - 334) / 16) * (-4.97062-(17.31275)));
        }
        else if (tickAnim >= 350 && tickAnim < 365) {
            xx = 23.4001 + (((tickAnim - 350) / 15) * (5.8614290319+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-15-(23.4001)));
            yy = -19.57404 + (((tickAnim - 350) / 15) * (-1.65269-(-19.57404)));
            zz = -4.97062 + (((tickAnim - 350) / 15) * (-8.3892+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*25-(-4.97062)));
        }
        else if (tickAnim >= 365 && tickAnim < 405) {
            xx = 5.8614290319+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-15 + (((tickAnim - 365) / 40) * (-4.21758-(5.8614290319+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-15)));
            yy = -1.65269 + (((tickAnim - 365) / 40) * (-21.28468-(-1.65269)));
            zz = -8.3892+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*25 + (((tickAnim - 365) / 40) * (26.94539-(-8.3892+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*25)));
        }
        else if (tickAnim >= 405 && tickAnim < 425) {
            xx = -4.21758 + (((tickAnim - 405) / 20) * (-13.5-(-4.21758)));
            yy = -21.28468 + (((tickAnim - 405) / 20) * (0-(-21.28468)));
            zz = 26.94539 + (((tickAnim - 405) / 20) * (0-(26.94539)));
        }
        else if (tickAnim >= 425 && tickAnim < 438) {
            xx = -13.5 + (((tickAnim - 425) / 13) * (-5.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-15-(-13.5)));
            yy = 0 + (((tickAnim - 425) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 13) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 450) {
            xx = -5.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-15 + (((tickAnim - 438) / 12) * (0-(-5.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-15)));
            yy = 0 + (((tickAnim - 438) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 438) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 0) / 170) * (-0.375-(0)));
            yy = 0 + (((tickAnim - 0) / 170) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 170) * (0.375-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 195) {
            xx = -0.375 + (((tickAnim - 170) / 25) * (0.03-(-0.375)));
            yy = 0.2 + (((tickAnim - 170) / 25) * (0.2-(0.2)));
            zz = 0.375 + (((tickAnim - 170) / 25) * (0.38-(0.375)));
        }
        else if (tickAnim >= 195 && tickAnim < 202) {
            xx = 0.03 + (((tickAnim - 195) / 7) * (0.03-(0.03)));
            yy = 0.2 + (((tickAnim - 195) / 7) * (0.2-(0.2)));
            zz = 0.38 + (((tickAnim - 195) / 7) * (0.38-(0.38)));
        }
        else if (tickAnim >= 202 && tickAnim < 216) {
            xx = 0.03 + (((tickAnim - 202) / 14) * (0.03-(0.03)));
            yy = 0.2 + (((tickAnim - 202) / 14) * (0.2-(0.2)));
            zz = 0.38 + (((tickAnim - 202) / 14) * (0.38-(0.38)));
        }
        else if (tickAnim >= 216 && tickAnim < 230) {
            xx = 0.03 + (((tickAnim - 216) / 14) * (0.03-(0.03)));
            yy = 0.2 + (((tickAnim - 216) / 14) * (0.2-(0.2)));
            zz = 0.38 + (((tickAnim - 216) / 14) * (0.38-(0.38)));
        }
        else if (tickAnim >= 230 && tickAnim < 244) {
            xx = 0.03 + (((tickAnim - 230) / 14) * (0.03-(0.03)));
            yy = 0.2 + (((tickAnim - 230) / 14) * (0.2-(0.2)));
            zz = 0.38 + (((tickAnim - 230) / 14) * (0.38-(0.38)));
        }
        else if (tickAnim >= 244 && tickAnim < 258) {
            xx = 0.03 + (((tickAnim - 244) / 14) * (0.03-(0.03)));
            yy = 0.2 + (((tickAnim - 244) / 14) * (0.2-(0.2)));
            zz = 0.38 + (((tickAnim - 244) / 14) * (0.38-(0.38)));
        }
        else if (tickAnim >= 258 && tickAnim < 273) {
            xx = 0.03 + (((tickAnim - 258) / 15) * (0.03-(0.03)));
            yy = 0.2 + (((tickAnim - 258) / 15) * (0.2-(0.2)));
            zz = 0.38 + (((tickAnim - 258) / 15) * (0.38-(0.38)));
        }
        else if (tickAnim >= 273 && tickAnim < 290) {
            xx = 0.03 + (((tickAnim - 273) / 17) * (0.03-(0.03)));
            yy = 0.2 + (((tickAnim - 273) / 17) * (-0.075-(0.2)));
            zz = 0.38 + (((tickAnim - 273) / 17) * (0.38-(0.38)));
        }
        else if (tickAnim >= 290 && tickAnim < 297) {
            xx = 0.03 + (((tickAnim - 290) / 7) * (0.03-(0.03)));
            yy = -0.075 + (((tickAnim - 290) / 7) * (0.2-(-0.075)));
            zz = 0.38 + (((tickAnim - 290) / 7) * (0.38-(0.38)));
        }
        else if (tickAnim >= 297 && tickAnim < 305) {
            xx = 0.03 + (((tickAnim - 297) / 8) * (0.03-(0.03)));
            yy = 0.2 + (((tickAnim - 297) / 8) * (0.2-(0.2)));
            zz = 0.38 + (((tickAnim - 297) / 8) * (0.38-(0.38)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = 0.03 + (((tickAnim - 305) / 10) * (0.205-(0.03)));
            yy = 0.2 + (((tickAnim - 305) / 10) * (0.2-(0.2)));
            zz = 0.38 + (((tickAnim - 305) / 10) * (0.38-(0.38)));
        }
        else if (tickAnim >= 315 && tickAnim < 323) {
            xx = 0.205 + (((tickAnim - 315) / 8) * (0.205-(0.205)));
            yy = 0.2 + (((tickAnim - 315) / 8) * (0.2-(0.2)));
            zz = 0.38 + (((tickAnim - 315) / 8) * (0.38-(0.38)));
        }
        else if (tickAnim >= 323 && tickAnim < 334) {
            xx = 0.205 + (((tickAnim - 323) / 11) * (0.205-(0.205)));
            yy = 0.2 + (((tickAnim - 323) / 11) * (0.2-(0.2)));
            zz = 0.38 + (((tickAnim - 323) / 11) * (0.38-(0.38)));
        }
        else if (tickAnim >= 334 && tickAnim < 350) {
            xx = 0.205 + (((tickAnim - 334) / 16) * (0.15-(0.205)));
            yy = 0.2 + (((tickAnim - 334) / 16) * (0.2-(0.2)));
            zz = 0.38 + (((tickAnim - 334) / 16) * (-0.87-(0.38)));
        }
        else if (tickAnim >= 350 && tickAnim < 425) {
            xx = 0.15 + (((tickAnim - 350) / 75) * (0-(0.15)));
            yy = 0.2 + (((tickAnim - 350) / 75) * (0-(0.2)));
            zz = -0.87 + (((tickAnim - 350) / 75) * (0-(-0.87)));
        }
        else if (tickAnim >= 425 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 425) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 425) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 25) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 30) / 12) * (-10.57-(0)));
            yy = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 12) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = -10.57 + (((tickAnim - 42) / 13) * (-13-(-10.57)));
            yy = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 113) {
            xx = -13 + (((tickAnim - 55) / 58) * (-13-(-13)));
            yy = 0 + (((tickAnim - 55) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 58) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = -13 + (((tickAnim - 113) / 7) * (-13.17046-(-13)));
            yy = 0 + (((tickAnim - 113) / 7) * (-11.84516-(0)));
            zz = 0 + (((tickAnim - 113) / 7) * (4.75152-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 129) {
            xx = -13.17046 + (((tickAnim - 120) / 9) * (-13.17046-(-13.17046)));
            yy = -11.84516 + (((tickAnim - 120) / 9) * (-11.84516-(-11.84516)));
            zz = 4.75152 + (((tickAnim - 120) / 9) * (4.75152-(4.75152)));
        }
        else if (tickAnim >= 129 && tickAnim < 136) {
            xx = -13.17046 + (((tickAnim - 129) / 7) * (-13.35791-(-13.17046)));
            yy = -11.84516 + (((tickAnim - 129) / 7) * (-17.45865-(-11.84516)));
            zz = 4.75152 + (((tickAnim - 129) / 7) * (5.77619-(4.75152)));
        }
        else if (tickAnim >= 136 && tickAnim < 140) {
            xx = -13.35791 + (((tickAnim - 136) / 4) * (-13.35791-(-13.35791)));
            yy = -17.45865 + (((tickAnim - 136) / 4) * (-17.45865-(-17.45865)));
            zz = 5.77619 + (((tickAnim - 136) / 4) * (5.77619-(5.77619)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = -13.35791 + (((tickAnim - 140) / 20) * (-13.35791-(-13.35791)));
            yy = -17.45865 + (((tickAnim - 140) / 20) * (-17.45865-(-17.45865)));
            zz = 5.77619 + (((tickAnim - 140) / 20) * (5.77619-(5.77619)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = -13.35791 + (((tickAnim - 160) / 10) * (-6.60791-(-13.35791)));
            yy = -17.45865 + (((tickAnim - 160) / 10) * (-17.45865-(-17.45865)));
            zz = 5.77619 + (((tickAnim - 160) / 10) * (5.77619-(5.77619)));
        }
        else if (tickAnim >= 170 && tickAnim < 178) {
            xx = -6.60791 + (((tickAnim - 170) / 8) * (-11.32294-(-6.60791)));
            yy = -17.45865 + (((tickAnim - 170) / 8) * (-13.26744-(-17.45865)));
            zz = 5.77619 + (((tickAnim - 170) / 8) * (14.74785-(5.77619)));
        }
        else if (tickAnim >= 178 && tickAnim < 185) {
            xx = -11.32294 + (((tickAnim - 178) / 7) * (21.75126-(-11.32294)));
            yy = -13.26744 + (((tickAnim - 178) / 7) * (-17.54988-(-13.26744)));
            zz = 14.74785 + (((tickAnim - 178) / 7) * (11.73506-(14.74785)));
        }
        else if (tickAnim >= 185 && tickAnim < 195) {
            xx = 21.75126 + (((tickAnim - 185) / 10) * (-0.51243-(21.75126)));
            yy = -17.54988 + (((tickAnim - 185) / 10) * (-23.97354-(-17.54988)));
            zz = 11.73506 + (((tickAnim - 185) / 10) * (7.21589-(11.73506)));
        }
        else if (tickAnim >= 195 && tickAnim < 202) {
            xx = -0.51243 + (((tickAnim - 195) / 7) * (-0.14747-(-0.51243)));
            yy = -23.97354 + (((tickAnim - 195) / 7) * (-19.82146-(-23.97354)));
            zz = 7.21589 + (((tickAnim - 195) / 7) * (6.23798-(7.21589)));
        }
        else if (tickAnim >= 202 && tickAnim < 283) {
            xx = -0.14747 + (((tickAnim - 202) / 81) * (-0.14747-(-0.14747)));
            yy = -19.82146 + (((tickAnim - 202) / 81) * (-19.82146-(-19.82146)));
            zz = 6.23798 + (((tickAnim - 202) / 81) * (6.23798-(6.23798)));
        }
        else if (tickAnim >= 283 && tickAnim < 290) {
            xx = -0.14747 + (((tickAnim - 283) / 7) * (-9.66024-(-0.14747)));
            yy = -19.82146 + (((tickAnim - 283) / 7) * (-8.597-(-19.82146)));
            zz = 6.23798 + (((tickAnim - 283) / 7) * (5.40817-(6.23798)));
        }
        else if (tickAnim >= 290 && tickAnim < 297) {
            xx = -9.66024 + (((tickAnim - 290) / 7) * (-0.1721-(-9.66024)));
            yy = -8.597 + (((tickAnim - 290) / 7) * (1.82572-(-8.597)));
            zz = 5.40817 + (((tickAnim - 290) / 7) * (4.63763-(5.40817)));
        }
        else if (tickAnim >= 297 && tickAnim < 305) {
            xx = -0.1721 + (((tickAnim - 297) / 8) * (-0.1721-(-0.1721)));
            yy = 1.82572 + (((tickAnim - 297) / 8) * (1.82572-(1.82572)));
            zz = 4.63763 + (((tickAnim - 297) / 8) * (4.63763-(4.63763)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = -0.1721 + (((tickAnim - 305) / 10) * (0.62721-(-0.1721)));
            yy = 1.82572 + (((tickAnim - 305) / 10) * (10.77497-(1.82572)));
            zz = 4.63763 + (((tickAnim - 305) / 10) * (8.40117-(4.63763)));
        }
        else if (tickAnim >= 315 && tickAnim < 323) {
            xx = 0.62721 + (((tickAnim - 315) / 8) * (0.62721-(0.62721)));
            yy = 10.77497 + (((tickAnim - 315) / 8) * (11.1-(10.77497)));
            zz = 8.40117 + (((tickAnim - 315) / 8) * (8.40117-(8.40117)));
        }
        else if (tickAnim >= 323 && tickAnim < 331) {
            xx = 0.62721 + (((tickAnim - 323) / 8) * (0.60799-(0.62721)));
            yy = 11.1 + (((tickAnim - 323) / 8) * (11.26513-(11.1)));
            zz = 8.40117 + (((tickAnim - 323) / 8) * (8.30063-(8.40117)));
        }
        else if (tickAnim >= 331 && tickAnim < 334) {
            xx = 0.60799 + (((tickAnim - 331) / 3) * (0.60799-(0.60799)));
            yy = 11.26513 + (((tickAnim - 331) / 3) * (11.26513-(11.26513)));
            zz = 8.30063 + (((tickAnim - 331) / 3) * (8.30063-(8.30063)));
        }
        else if (tickAnim >= 334 && tickAnim < 350) {
            xx = 0.60799 + (((tickAnim - 334) / 16) * (26.34373-(0.60799)));
            yy = 11.26513 + (((tickAnim - 334) / 16) * (9.57978-(11.26513)));
            zz = 8.30063 + (((tickAnim - 334) / 16) * (-4.36713-(8.30063)));
        }
        else if (tickAnim >= 350 && tickAnim < 365) {
            xx = 26.34373 + (((tickAnim - 350) / 15) * (4.87752-(26.34373)));
            yy = 9.57978 + (((tickAnim - 350) / 15) * (-8.44257-(9.57978)));
            zz = -4.36713 + (((tickAnim - 350) / 15) * (-1.38096-(-4.36713)));
        }
        else if (tickAnim >= 365 && tickAnim < 405) {
            xx = 4.87752 + (((tickAnim - 365) / 40) * (3.64388-(4.87752)));
            yy = -8.44257 + (((tickAnim - 365) / 40) * (-6.06976-(-8.44257)));
            zz = -1.38096 + (((tickAnim - 365) / 40) * (40.01107-(-1.38096)));
        }
        else if (tickAnim >= 405 && tickAnim < 425) {
            xx = 3.64388 + (((tickAnim - 405) / 20) * (0-(3.64388)));
            yy = -6.06976 + (((tickAnim - 405) / 20) * (0-(-6.06976)));
            zz = 40.01107 + (((tickAnim - 405) / 20) * (0-(40.01107)));
        }
        else if (tickAnim >= 425 && tickAnim < 438) {
            xx = 0 + (((tickAnim - 425) / 13) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 425) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 13) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 450) {
            xx = -4.75 + (((tickAnim - 438) / 12) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 438) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 438) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 12) * (-0.405-(0)));
            zz = 0 + (((tickAnim - 30) / 12) * (0.06-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            yy = -0.405 + (((tickAnim - 42) / 13) * (-0.5-(-0.405)));
            zz = 0.06 + (((tickAnim - 42) / 13) * (0.125-(0.06)));
        }
        else if (tickAnim >= 55 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 55) / 58) * (0-(0)));
            yy = -0.5 + (((tickAnim - 55) / 58) * (-0.5-(-0.5)));
            zz = 0.125 + (((tickAnim - 55) / 58) * (0.125-(0.125)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 113) / 7) * (-0.275-(0)));
            yy = -0.5 + (((tickAnim - 113) / 7) * (-0.5-(-0.5)));
            zz = 0.125 + (((tickAnim - 113) / 7) * (0.125-(0.125)));
        }
        else if (tickAnim >= 120 && tickAnim < 129) {
            xx = -0.275 + (((tickAnim - 120) / 9) * (-0.275-(-0.275)));
            yy = -0.5 + (((tickAnim - 120) / 9) * (-0.5-(-0.5)));
            zz = 0.125 + (((tickAnim - 120) / 9) * (0.125-(0.125)));
        }
        else if (tickAnim >= 129 && tickAnim < 185) {
            xx = -0.275 + (((tickAnim - 129) / 56) * (-0.28-(-0.275)));
            yy = -0.5 + (((tickAnim - 129) / 56) * (-0.5-(-0.5)));
            zz = 0.125 + (((tickAnim - 129) / 56) * (0.455-(0.125)));
        }
        else if (tickAnim >= 185 && tickAnim < 283) {
            xx = -0.28 + (((tickAnim - 185) / 98) * (-0.28-(-0.28)));
            yy = -0.5 + (((tickAnim - 185) / 98) * (-0.5-(-0.5)));
            zz = 0.455 + (((tickAnim - 185) / 98) * (0.455-(0.455)));
        }
        else if (tickAnim >= 283 && tickAnim < 290) {
            xx = -0.28 + (((tickAnim - 283) / 7) * (-0.1-(-0.28)));
            yy = -0.5 + (((tickAnim - 283) / 7) * (-0.575-(-0.5)));
            zz = 0.455 + (((tickAnim - 283) / 7) * (0.46-(0.455)));
        }
        else if (tickAnim >= 290 && tickAnim < 297) {
            xx = -0.1 + (((tickAnim - 290) / 7) * (0.07-(-0.1)));
            yy = -0.575 + (((tickAnim - 290) / 7) * (-0.4-(-0.575)));
            zz = 0.46 + (((tickAnim - 290) / 7) * (0.46-(0.46)));
        }
        else if (tickAnim >= 297 && tickAnim < 305) {
            xx = 0.07 + (((tickAnim - 297) / 8) * (0.07-(0.07)));
            yy = -0.4 + (((tickAnim - 297) / 8) * (-0.4-(-0.4)));
            zz = 0.46 + (((tickAnim - 297) / 8) * (0.46-(0.46)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = 0.07 + (((tickAnim - 305) / 10) * (0.195-(0.07)));
            yy = -0.4 + (((tickAnim - 305) / 10) * (-0.4-(-0.4)));
            zz = 0.46 + (((tickAnim - 305) / 10) * (0.46-(0.46)));
        }
        else if (tickAnim >= 315 && tickAnim < 323) {
            xx = 0.195 + (((tickAnim - 315) / 8) * (0.195-(0.195)));
            yy = -0.4 + (((tickAnim - 315) / 8) * (-0.4-(-0.4)));
            zz = 0.46 + (((tickAnim - 315) / 8) * (0.46-(0.46)));
        }
        else if (tickAnim >= 323 && tickAnim < 365) {
            xx = 0.195 + (((tickAnim - 323) / 42) * (0.2-(0.195)));
            yy = -0.4 + (((tickAnim - 323) / 42) * (-0.425-(-0.4)));
            zz = 0.46 + (((tickAnim - 323) / 42) * (-0.09-(0.46)));
        }
        else if (tickAnim >= 365 && tickAnim < 405) {
            xx = 0.2 + (((tickAnim - 365) / 40) * (-0.025-(0.2)));
            yy = -0.425 + (((tickAnim - 365) / 40) * (-0.42-(-0.425)));
            zz = -0.09 + (((tickAnim - 365) / 40) * (-0.09-(-0.09)));
        }
        else if (tickAnim >= 405 && tickAnim < 425) {
            xx = -0.025 + (((tickAnim - 405) / 20) * (0-(-0.025)));
            yy = -0.42 + (((tickAnim - 405) / 20) * (0-(-0.42)));
            zz = -0.09 + (((tickAnim - 405) / 20) * (0-(-0.09)));
        }
        else if (tickAnim >= 425 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 425) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 425) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 30) / 12) * (4.6-(0)));
            yy = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 12) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 4.6 + (((tickAnim - 42) / 13) * (-18-(4.6)));
            yy = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 113) {
            xx = -18 + (((tickAnim - 55) / 58) * (-18-(-18)));
            yy = 0 + (((tickAnim - 55) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 58) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = -18 + (((tickAnim - 113) / 7) * (-18.00132-(-18)));
            yy = 0 + (((tickAnim - 113) / 7) * (-3.66521-(0)));
            zz = 0 + (((tickAnim - 113) / 7) * (-3.06241-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 123) {
            xx = -18.00132 + (((tickAnim - 120) / 3) * (-18.00132-(-18.00132)));
            yy = -3.66521 + (((tickAnim - 120) / 3) * (-3.66521-(-3.66521)));
            zz = -3.06241 + (((tickAnim - 120) / 3) * (-3.06241-(-3.06241)));
        }
        else if (tickAnim >= 123 && tickAnim < 124) {
            xx = -18.00132 + (((tickAnim - 123) / 1) * (-17.25132-(-18.00132)));
            yy = -3.66521 + (((tickAnim - 123) / 1) * (-3.66521-(-3.66521)));
            zz = -3.06241 + (((tickAnim - 123) / 1) * (-3.06241-(-3.06241)));
        }
        else if (tickAnim >= 124 && tickAnim < 126) {
            xx = -17.25132 + (((tickAnim - 124) / 2) * (-18.00132-(-17.25132)));
            yy = -3.66521 + (((tickAnim - 124) / 2) * (-3.66521-(-3.66521)));
            zz = -3.06241 + (((tickAnim - 124) / 2) * (-3.06241-(-3.06241)));
        }
        else if (tickAnim >= 126 && tickAnim < 128) {
            xx = -18.00132 + (((tickAnim - 126) / 2) * (-17.25132-(-18.00132)));
            yy = -3.66521 + (((tickAnim - 126) / 2) * (-3.66521-(-3.66521)));
            zz = -3.06241 + (((tickAnim - 126) / 2) * (-3.06241-(-3.06241)));
        }
        else if (tickAnim >= 128 && tickAnim < 129) {
            xx = -17.25132 + (((tickAnim - 128) / 1) * (-18.00132-(-17.25132)));
            yy = -3.66521 + (((tickAnim - 128) / 1) * (-3.66521-(-3.66521)));
            zz = -3.06241 + (((tickAnim - 128) / 1) * (-3.06241-(-3.06241)));
        }
        else if (tickAnim >= 129 && tickAnim < 136) {
            xx = -18.00132 + (((tickAnim - 129) / 7) * (-25.00132-(-18.00132)));
            yy = -3.66521 + (((tickAnim - 129) / 7) * (-3.66521-(-3.66521)));
            zz = -3.06241 + (((tickAnim - 129) / 7) * (-3.06241-(-3.06241)));
        }
        else if (tickAnim >= 136 && tickAnim < 140) {
            xx = -25.00132 + (((tickAnim - 136) / 4) * (-25.00132-(-25.00132)));
            yy = -3.66521 + (((tickAnim - 136) / 4) * (-3.66521-(-3.66521)));
            zz = -3.06241 + (((tickAnim - 136) / 4) * (-3.06241-(-3.06241)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = -25.00132 + (((tickAnim - 140) / 30) * (-14.25132-(-25.00132)));
            yy = -3.66521 + (((tickAnim - 140) / 30) * (-3.66521-(-3.66521)));
            zz = -3.06241 + (((tickAnim - 140) / 30) * (-3.06241-(-3.06241)));
        }
        else if (tickAnim >= 170 && tickAnim < 178) {
            xx = -14.25132 + (((tickAnim - 170) / 8) * (6.49868-(-14.25132)));
            yy = -3.66521 + (((tickAnim - 170) / 8) * (-3.66521-(-3.66521)));
            zz = -3.06241 + (((tickAnim - 170) / 8) * (-3.06241-(-3.06241)));
        }
        else if (tickAnim >= 178 && tickAnim < 185) {
            xx = 6.49868 + (((tickAnim - 178) / 7) * (-10.05132-(6.49868)));
            yy = -3.66521 + (((tickAnim - 178) / 7) * (-3.66521-(-3.66521)));
            zz = -3.06241 + (((tickAnim - 178) / 7) * (-3.06241-(-3.06241)));
        }
        else if (tickAnim >= 185 && tickAnim < 195) {
            xx = -10.05132 + (((tickAnim - 185) / 10) * (-19.75132-(-10.05132)));
            yy = -3.66521 + (((tickAnim - 185) / 10) * (-3.66521-(-3.66521)));
            zz = -3.06241 + (((tickAnim - 185) / 10) * (-3.06241-(-3.06241)));
        }
        else if (tickAnim >= 195 && tickAnim < 283) {
            xx = -19.75132 + (((tickAnim - 195) / 88) * (-19.75132-(-19.75132)));
            yy = -3.66521 + (((tickAnim - 195) / 88) * (-3.66521-(-3.66521)));
            zz = -3.06241 + (((tickAnim - 195) / 88) * (-3.06241-(-3.06241)));
        }
        else if (tickAnim >= 283 && tickAnim < 290) {
            xx = -19.75132 + (((tickAnim - 283) / 7) * (-14.26983-(-19.75132)));
            yy = -3.66521 + (((tickAnim - 283) / 7) * (-3.66521-(-3.66521)));
            zz = -3.06241 + (((tickAnim - 283) / 7) * (-3.06241-(-3.06241)));
        }
        else if (tickAnim >= 290 && tickAnim < 297) {
            xx = -14.26983 + (((tickAnim - 290) / 7) * (-34.25132-(-14.26983)));
            yy = -3.66521 + (((tickAnim - 290) / 7) * (-3.66521-(-3.66521)));
            zz = -3.06241 + (((tickAnim - 290) / 7) * (-3.06241-(-3.06241)));
        }
        else if (tickAnim >= 297 && tickAnim < 305) {
            xx = -34.25132 + (((tickAnim - 297) / 8) * (-34.25132-(-34.25132)));
            yy = -3.66521 + (((tickAnim - 297) / 8) * (-3.66521-(-3.66521)));
            zz = -3.06241 + (((tickAnim - 297) / 8) * (-3.06241-(-3.06241)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = -34.25132 + (((tickAnim - 305) / 10) * (-34.59959-(-34.25132)));
            yy = -3.66521 + (((tickAnim - 305) / 10) * (6.63004-(-3.66521)));
            zz = -3.06241 + (((tickAnim - 305) / 10) * (-1.66856-(-3.06241)));
        }
        else if (tickAnim >= 315 && tickAnim < 323) {
            xx = -34.59959 + (((tickAnim - 315) / 8) * (-34.59959-(-34.59959)));
            yy = 6.63004 + (((tickAnim - 315) / 8) * (6.63004-(6.63004)));
            zz = -1.66856 + (((tickAnim - 315) / 8) * (-1.66856-(-1.66856)));
        }
        else if (tickAnim >= 323 && tickAnim < 331) {
            xx = -34.59959 + (((tickAnim - 323) / 8) * (-34.09959-(-34.59959)));
            yy = 6.63004 + (((tickAnim - 323) / 8) * (6.63004-(6.63004)));
            zz = -1.66856 + (((tickAnim - 323) / 8) * (-1.66856-(-1.66856)));
        }
        else if (tickAnim >= 331 && tickAnim < 334) {
            xx = -34.09959 + (((tickAnim - 331) / 3) * (-34.09959-(-34.09959)));
            yy = 6.63004 + (((tickAnim - 331) / 3) * (6.63004-(6.63004)));
            zz = -1.66856 + (((tickAnim - 331) / 3) * (-1.66856-(-1.66856)));
        }
        else if (tickAnim >= 334 && tickAnim < 341) {
            xx = -34.09959 + (((tickAnim - 334) / 7) * (-12.06028-(-34.09959)));
            yy = 6.63004 + (((tickAnim - 334) / 7) * (6.63004-(6.63004)));
            zz = -1.66856 + (((tickAnim - 334) / 7) * (-1.66856-(-1.66856)));
        }
        else if (tickAnim >= 341 && tickAnim < 350) {
            xx = -12.06028 + (((tickAnim - 341) / 9) * (-20.84959-(-12.06028)));
            yy = 6.63004 + (((tickAnim - 341) / 9) * (6.63004-(6.63004)));
            zz = -1.66856 + (((tickAnim - 341) / 9) * (-1.66856-(-1.66856)));
        }
        else if (tickAnim >= 350 && tickAnim < 355) {
            xx = -20.84959 + (((tickAnim - 350) / 5) * (7.65041-(-20.84959)));
            yy = 6.63004 + (((tickAnim - 350) / 5) * (6.63004-(6.63004)));
            zz = -1.66856 + (((tickAnim - 350) / 5) * (-1.66856-(-1.66856)));
        }
        else if (tickAnim >= 355 && tickAnim < 365) {
            xx = 7.65041 + (((tickAnim - 355) / 10) * (-14.59959-(7.65041)));
            yy = 6.63004 + (((tickAnim - 355) / 10) * (6.63004-(6.63004)));
            zz = -1.66856 + (((tickAnim - 355) / 10) * (-1.66856-(-1.66856)));
        }
        else if (tickAnim >= 365 && tickAnim < 377) {
            xx = -14.59959 + (((tickAnim - 365) / 12) * (-22.3629-(-14.59959)));
            yy = 6.63004 + (((tickAnim - 365) / 12) * (6.29033-(6.63004)));
            zz = -1.66856 + (((tickAnim - 365) / 12) * (13.67569-(-1.66856)));
        }
        else if (tickAnim >= 377 && tickAnim < 390) {
            xx = -22.3629 + (((tickAnim - 377) / 13) * (-23.50296-(-22.3629)));
            yy = 6.29033 + (((tickAnim - 377) / 13) * (4.62812-(6.29033)));
            zz = 13.67569 + (((tickAnim - 377) / 13) * (1.7366-(13.67569)));
        }
        else if (tickAnim >= 390 && tickAnim < 425) {
            xx = -23.50296 + (((tickAnim - 390) / 35) * (0-(-23.50296)));
            yy = 4.62812 + (((tickAnim - 390) / 35) * (0-(4.62812)));
            zz = 1.7366 + (((tickAnim - 390) / 35) * (0-(1.7366)));
        }
        else if (tickAnim >= 425 && tickAnim < 438) {
            xx = 0 + (((tickAnim - 425) / 13) * (-18.75-(0)));
            yy = 0 + (((tickAnim - 425) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 13) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 450) {
            xx = -18.75 + (((tickAnim - 438) / 12) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 438) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 438) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 170) * (-0.15-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 170) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 280) * (0-(0)));
            zz = -0.15 + (((tickAnim - 170) / 280) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 113 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 113) / 7) * (14.5-(0)));
            yy = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 123) {
            xx = 14.5 + (((tickAnim - 120) / 3) * (14.5-(14.5)));
            yy = 0 + (((tickAnim - 120) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 3) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 124) {
            xx = 14.5 + (((tickAnim - 123) / 1) * (12.75-(14.5)));
            yy = 0 + (((tickAnim - 123) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 1) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 126) {
            xx = 12.75 + (((tickAnim - 124) / 2) * (14.5-(12.75)));
            yy = 0 + (((tickAnim - 124) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 2) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 128) {
            xx = 14.5 + (((tickAnim - 126) / 2) * (12.75-(14.5)));
            yy = 0 + (((tickAnim - 126) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 2) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 129) {
            xx = 12.75 + (((tickAnim - 128) / 1) * (14.5-(12.75)));
            yy = 0 + (((tickAnim - 128) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 1) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 136) {
            xx = 14.5 + (((tickAnim - 129) / 7) * (27.5-(14.5)));
            yy = 0 + (((tickAnim - 129) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 7) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 140) {
            xx = 27.5 + (((tickAnim - 136) / 4) * (27.5-(27.5)));
            yy = 0 + (((tickAnim - 136) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 4) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 142) {
            xx = 27.5 + (((tickAnim - 140) / 2) * (25.75-(27.5)));
            yy = 0 + (((tickAnim - 140) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 2) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 143) {
            xx = 25.75 + (((tickAnim - 142) / 1) * (27.5-(25.75)));
            yy = 0 + (((tickAnim - 142) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 1) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 145) {
            xx = 27.5 + (((tickAnim - 143) / 2) * (25.75-(27.5)));
            yy = 0 + (((tickAnim - 143) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 2) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 147) {
            xx = 25.75 + (((tickAnim - 145) / 2) * (27.5-(25.75)));
            yy = 0 + (((tickAnim - 145) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 2) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 148) {
            xx = 27.5 + (((tickAnim - 147) / 1) * (25.75-(27.5)));
            yy = 0 + (((tickAnim - 147) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 1) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 150) {
            xx = 25.75 + (((tickAnim - 148) / 2) * (27.5-(25.75)));
            yy = 0 + (((tickAnim - 148) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 2) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 27.5 + (((tickAnim - 150) / 20) * (35-(27.5)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 178) {
            xx = 35 + (((tickAnim - 170) / 8) * (19.24144-(35)));
            yy = 0 + (((tickAnim - 170) / 8) * (-5.82977-(0)));
            zz = 0 + (((tickAnim - 170) / 8) * (2.85106-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 195) {
            xx = 19.24144 + (((tickAnim - 178) / 17) * (22-(19.24144)));
            yy = -5.82977 + (((tickAnim - 178) / 17) * (0-(-5.82977)));
            zz = 2.85106 + (((tickAnim - 178) / 17) * (0-(2.85106)));
        }
        else if (tickAnim >= 195 && tickAnim < 283) {
            xx = 22 + (((tickAnim - 195) / 88) * (22-(22)));
            yy = 0 + (((tickAnim - 195) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 88) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 297) {
            xx = 22 + (((tickAnim - 283) / 14) * (41-(22)));
            yy = 0 + (((tickAnim - 283) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 14) * (0-(0)));
        }
        else if (tickAnim >= 297 && tickAnim < 298) {
            xx = 41 + (((tickAnim - 297) / 1) * (38.75-(41)));
            yy = 0 + (((tickAnim - 297) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 297) / 1) * (0-(0)));
        }
        else if (tickAnim >= 298 && tickAnim < 300) {
            xx = 38.75 + (((tickAnim - 298) / 2) * (41-(38.75)));
            yy = 0 + (((tickAnim - 298) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 298) / 2) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 302) {
            xx = 41 + (((tickAnim - 300) / 2) * (38.75-(41)));
            yy = 0 + (((tickAnim - 300) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 2) * (0-(0)));
        }
        else if (tickAnim >= 302 && tickAnim < 303) {
            xx = 38.75 + (((tickAnim - 302) / 1) * (41-(38.75)));
            yy = 0 + (((tickAnim - 302) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 302) / 1) * (0-(0)));
        }
        else if (tickAnim >= 303 && tickAnim < 305) {
            xx = 41 + (((tickAnim - 303) / 2) * (41-(41)));
            yy = 0 + (((tickAnim - 303) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 303) / 2) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 323) {
            xx = 41 + (((tickAnim - 305) / 18) * (41-(41)));
            yy = 0 + (((tickAnim - 305) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 305) / 18) * (0-(0)));
        }
        else if (tickAnim >= 323 && tickAnim < 331) {
            xx = 41 + (((tickAnim - 323) / 8) * (40.25-(41)));
            yy = 0 + (((tickAnim - 323) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 323) / 8) * (0-(0)));
        }
        else if (tickAnim >= 331 && tickAnim < 334) {
            xx = 40.25 + (((tickAnim - 331) / 3) * (40.25-(40.25)));
            yy = 0 + (((tickAnim - 331) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 331) / 3) * (0-(0)));
        }
        else if (tickAnim >= 334 && tickAnim < 341) {
            xx = 40.25 + (((tickAnim - 334) / 7) * (9.28295-(40.25)));
            yy = 0 + (((tickAnim - 334) / 7) * (-9.2329-(0)));
            zz = 0 + (((tickAnim - 334) / 7) * (-0.91354-(0)));
        }
        else if (tickAnim >= 341 && tickAnim < 350) {
            xx = 9.28295 + (((tickAnim - 341) / 9) * (10.22738-(9.28295)));
            yy = -9.2329 + (((tickAnim - 341) / 9) * (-16.17313-(-9.2329)));
            zz = -0.91354 + (((tickAnim - 341) / 9) * (-1.60023-(-0.91354)));
        }
        else if (tickAnim >= 350 && tickAnim < 425) {
            xx = 10.22738 + (((tickAnim - 350) / 75) * (0-(10.22738)));
            yy = -16.17313 + (((tickAnim - 350) / 75) * (0-(-16.17313)));
            zz = -1.60023 + (((tickAnim - 350) / 75) * (0-(-1.60023)));
        }
        else if (tickAnim >= 425 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 425) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 425) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 25) * (0-(0)));
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



        if (tickAnim >= 88 && tickAnim < 92) {
            xx = 1 + (((tickAnim - 88) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 88) / 4) * (0.0025-(1)));
            zz = 1 + (((tickAnim - 88) / 4) * (1-(1)));
        }
        else if (tickAnim >= 92 && tickAnim < 95) {
            xx = 1 + (((tickAnim - 92) / 3) * (1-(1)));
            yy = 0.0025 + (((tickAnim - 92) / 3) * (1-(0.0025)));
            zz = 1 + (((tickAnim - 92) / 3) * (1-(1)));
        }
        else if (tickAnim >= 95 && tickAnim < 113) {
            xx = 1 + (((tickAnim - 95) / 18) * (1-(1)));
            yy = 1 + (((tickAnim - 95) / 18) * (1-(1)));
            zz = 1 + (((tickAnim - 95) / 18) * (1-(1)));
        }
        else if (tickAnim >= 113 && tickAnim < 117) {
            xx = 1 + (((tickAnim - 113) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 113) / 4) * (0.0025-(1)));
            zz = 1 + (((tickAnim - 113) / 4) * (1-(1)));
        }
        else if (tickAnim >= 117 && tickAnim < 120) {
            xx = 1 + (((tickAnim - 117) / 3) * (1-(1)));
            yy = 0.0025 + (((tickAnim - 117) / 3) * (1-(0.0025)));
            zz = 1 + (((tickAnim - 117) / 3) * (1-(1)));
        }
        else if (tickAnim >= 120 && tickAnim < 129) {
            xx = 1 + (((tickAnim - 120) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 120) / 9) * (1-(1)));
            zz = 1 + (((tickAnim - 120) / 9) * (1-(1)));
        }
        else if (tickAnim >= 129 && tickAnim < 133) {
            xx = 1 + (((tickAnim - 129) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 129) / 4) * (0.0025-(1)));
            zz = 1 + (((tickAnim - 129) / 4) * (1-(1)));
        }
        else if (tickAnim >= 133 && tickAnim < 136) {
            xx = 1 + (((tickAnim - 133) / 3) * (1-(1)));
            yy = 0.0025 + (((tickAnim - 133) / 3) * (1-(0.0025)));
            zz = 1 + (((tickAnim - 133) / 3) * (1-(1)));
        }
        else if (tickAnim >= 136 && tickAnim < 150) {
            xx = 1 + (((tickAnim - 136) / 14) * (1-(1)));
            yy = 1 + (((tickAnim - 136) / 14) * (1-(1)));
            zz = 1 + (((tickAnim - 136) / 14) * (1-(1)));
        }
        else if (tickAnim >= 150 && tickAnim < 153) {
            xx = 1 + (((tickAnim - 150) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 150) / 3) * (0.0025-(1)));
            zz = 1 + (((tickAnim - 150) / 3) * (1-(1)));
        }
        else if (tickAnim >= 153 && tickAnim < 157) {
            xx = 1 + (((tickAnim - 153) / 4) * (1-(1)));
            yy = 0.0025 + (((tickAnim - 153) / 4) * (1-(0.0025)));
            zz = 1 + (((tickAnim - 153) / 4) * (1-(1)));
        }
        else if (tickAnim >= 157 && tickAnim < 233) {
            xx = 1 + (((tickAnim - 157) / 76) * (1-(1)));
            yy = 1 + (((tickAnim - 157) / 76) * (1-(1)));
            zz = 1 + (((tickAnim - 157) / 76) * (1-(1)));
        }
        else if (tickAnim >= 233 && tickAnim < 237) {
            xx = 1 + (((tickAnim - 233) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 233) / 4) * (0.0025-(1)));
            zz = 1 + (((tickAnim - 233) / 4) * (1-(1)));
        }
        else if (tickAnim >= 237 && tickAnim < 240) {
            xx = 1 + (((tickAnim - 237) / 3) * (1-(1)));
            yy = 0.0025 + (((tickAnim - 237) / 3) * (1-(0.0025)));
            zz = 1 + (((tickAnim - 237) / 3) * (1-(1)));
        }
        else if (tickAnim >= 240 && tickAnim < 287) {
            xx = 1 + (((tickAnim - 240) / 47) * (1-(1)));
            yy = 1 + (((tickAnim - 240) / 47) * (1-(1)));
            zz = 1 + (((tickAnim - 240) / 47) * (1-(1)));
        }
        else if (tickAnim >= 287 && tickAnim < 290) {
            xx = 1 + (((tickAnim - 287) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 287) / 3) * (0.0025-(1)));
            zz = 1 + (((tickAnim - 287) / 3) * (1-(1)));
        }
        else if (tickAnim >= 290 && tickAnim < 293) {
            xx = 1 + (((tickAnim - 290) / 3) * (1-(1)));
            yy = 0.0025 + (((tickAnim - 290) / 3) * (1-(0.0025)));
            zz = 1 + (((tickAnim - 290) / 3) * (1-(1)));
        }
        else if (tickAnim >= 293 && tickAnim < 305) {
            xx = 1 + (((tickAnim - 293) / 12) * (1-(1)));
            yy = 1 + (((tickAnim - 293) / 12) * (1-(1)));
            zz = 1 + (((tickAnim - 293) / 12) * (1-(1)));
        }
        else if (tickAnim >= 305 && tickAnim < 308) {
            xx = 1 + (((tickAnim - 305) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 305) / 3) * (0.0025-(1)));
            zz = 1 + (((tickAnim - 305) / 3) * (1-(1)));
        }
        else if (tickAnim >= 308 && tickAnim < 312) {
            xx = 1 + (((tickAnim - 308) / 4) * (1-(1)));
            yy = 0.0025 + (((tickAnim - 308) / 4) * (1-(0.0025)));
            zz = 1 + (((tickAnim - 308) / 4) * (1-(1)));
        }
        else if (tickAnim >= 312 && tickAnim < 323) {
            xx = 1 + (((tickAnim - 312) / 11) * (1-(1)));
            yy = 1 + (((tickAnim - 312) / 11) * (1-(1)));
            zz = 1 + (((tickAnim - 312) / 11) * (1-(1)));
        }
        else if (tickAnim >= 323 && tickAnim < 327) {
            xx = 1 + (((tickAnim - 323) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 323) / 4) * (0.0025-(1)));
            zz = 1 + (((tickAnim - 323) / 4) * (1-(1)));
        }
        else if (tickAnim >= 327 && tickAnim < 330) {
            xx = 1 + (((tickAnim - 327) / 3) * (1-(1)));
            yy = 0.0025 + (((tickAnim - 327) / 3) * (1-(0.0025)));
            zz = 1 + (((tickAnim - 327) / 3) * (1-(1)));
        }
        else if (tickAnim >= 330 && tickAnim < 343) {
            xx = 1 + (((tickAnim - 330) / 13) * (1-(1)));
            yy = 1 + (((tickAnim - 330) / 13) * (1-(1)));
            zz = 1 + (((tickAnim - 330) / 13) * (1-(1)));
        }
        else if (tickAnim >= 343 && tickAnim < 350) {
            xx = 1 + (((tickAnim - 343) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 343) / 7) * (0.525-(1)));
            zz = 1 + (((tickAnim - 343) / 7) * (1-(1)));
        }
        else if (tickAnim >= 350 && tickAnim < 355) {
            xx = 1 + (((tickAnim - 350) / 5) * (1-(1)));
            yy = 0.525 + (((tickAnim - 350) / 5) * (0-(0.525)));
            zz = 1 + (((tickAnim - 350) / 5) * (1-(1)));
        }
        else if (tickAnim >= 355 && tickAnim < 365) {
            xx = 1 + (((tickAnim - 355) / 10) * (1-(1)));
            yy = 0 + (((tickAnim - 355) / 10) * (0-(0)));
            zz = 1 + (((tickAnim - 355) / 10) * (1-(1)));
        }
        else if (tickAnim >= 365 && tickAnim < 377) {
            xx = 1 + (((tickAnim - 365) / 12) * (1-(1)));
            yy = 0 + (((tickAnim - 365) / 12) * (1-(0)));
            zz = 1 + (((tickAnim - 365) / 12) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 30) / 25) * (9.59051-(0)));
            yy = 0 + (((tickAnim - 30) / 25) * (23.16125-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (-34.55903-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 9.59051 + (((tickAnim - 55) / 3) * (-51.84259-(9.59051)));
            yy = 23.16125 + (((tickAnim - 55) / 3) * (13.58262-(23.16125)));
            zz = -34.55903 + (((tickAnim - 55) / 3) * (-46.96356-(-34.55903)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = -51.84259 + (((tickAnim - 58) / 2) * (11.4948-(-51.84259)));
            yy = 13.58262 + (((tickAnim - 58) / 2) * (33.09867-(13.58262)));
            zz = -46.96356 + (((tickAnim - 58) / 2) * (-5.18032-(-46.96356)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 11.4948 + (((tickAnim - 60) / 3) * (9.59051-(11.4948)));
            yy = 33.09867 + (((tickAnim - 60) / 3) * (23.16125-(33.09867)));
            zz = -5.18032 + (((tickAnim - 60) / 3) * (-34.55903-(-5.18032)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 9.59051 + (((tickAnim - 63) / 2) * (-51.84259-(9.59051)));
            yy = 23.16125 + (((tickAnim - 63) / 2) * (13.58262-(23.16125)));
            zz = -34.55903 + (((tickAnim - 63) / 2) * (-46.96356-(-34.55903)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = -51.84259 + (((tickAnim - 65) / 3) * (11.4948-(-51.84259)));
            yy = 13.58262 + (((tickAnim - 65) / 3) * (33.09867-(13.58262)));
            zz = -46.96356 + (((tickAnim - 65) / 3) * (-5.18032-(-46.96356)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = 11.4948 + (((tickAnim - 68) / 2) * (9.59051-(11.4948)));
            yy = 33.09867 + (((tickAnim - 68) / 2) * (23.16125-(33.09867)));
            zz = -5.18032 + (((tickAnim - 68) / 2) * (-34.55903-(-5.18032)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 9.59051 + (((tickAnim - 70) / 3) * (-51.84259-(9.59051)));
            yy = 23.16125 + (((tickAnim - 70) / 3) * (13.58262-(23.16125)));
            zz = -34.55903 + (((tickAnim - 70) / 3) * (-46.96356-(-34.55903)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = -51.84259 + (((tickAnim - 73) / 2) * (11.4948-(-51.84259)));
            yy = 13.58262 + (((tickAnim - 73) / 2) * (33.09867-(13.58262)));
            zz = -46.96356 + (((tickAnim - 73) / 2) * (-5.18032-(-46.96356)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 11.4948 + (((tickAnim - 75) / 3) * (9.59051-(11.4948)));
            yy = 33.09867 + (((tickAnim - 75) / 3) * (23.16125-(33.09867)));
            zz = -5.18032 + (((tickAnim - 75) / 3) * (-34.55903-(-5.18032)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = 9.59051 + (((tickAnim - 78) / 2) * (-51.84259-(9.59051)));
            yy = 23.16125 + (((tickAnim - 78) / 2) * (13.58262-(23.16125)));
            zz = -34.55903 + (((tickAnim - 78) / 2) * (-46.96356-(-34.55903)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = -51.84259 + (((tickAnim - 80) / 3) * (11.4948-(-51.84259)));
            yy = 13.58262 + (((tickAnim - 80) / 3) * (33.09867-(13.58262)));
            zz = -46.96356 + (((tickAnim - 80) / 3) * (-5.18032-(-46.96356)));
        }
        else if (tickAnim >= 83 && tickAnim < 86) {
            xx = 11.4948 + (((tickAnim - 83) / 3) * (9.59051-(11.4948)));
            yy = 33.09867 + (((tickAnim - 83) / 3) * (23.16125-(33.09867)));
            zz = -5.18032 + (((tickAnim - 83) / 3) * (-34.55903-(-5.18032)));
        }
        else if (tickAnim >= 86 && tickAnim < 88) {
            xx = 9.59051 + (((tickAnim - 86) / 2) * (-51.84259-(9.59051)));
            yy = 23.16125 + (((tickAnim - 86) / 2) * (13.58262-(23.16125)));
            zz = -34.55903 + (((tickAnim - 86) / 2) * (-46.96356-(-34.55903)));
        }
        else if (tickAnim >= 88 && tickAnim < 91) {
            xx = -51.84259 + (((tickAnim - 88) / 3) * (11.4948-(-51.84259)));
            yy = 13.58262 + (((tickAnim - 88) / 3) * (33.09867-(13.58262)));
            zz = -46.96356 + (((tickAnim - 88) / 3) * (-5.18032-(-46.96356)));
        }
        else if (tickAnim >= 91 && tickAnim < 93) {
            xx = 11.4948 + (((tickAnim - 91) / 2) * (9.59051-(11.4948)));
            yy = 33.09867 + (((tickAnim - 91) / 2) * (23.16125-(33.09867)));
            zz = -5.18032 + (((tickAnim - 91) / 2) * (-34.55903-(-5.18032)));
        }
        else if (tickAnim >= 93 && tickAnim < 96) {
            xx = 9.59051 + (((tickAnim - 93) / 3) * (-51.84259-(9.59051)));
            yy = 23.16125 + (((tickAnim - 93) / 3) * (13.58262-(23.16125)));
            zz = -34.55903 + (((tickAnim - 93) / 3) * (-46.96356-(-34.55903)));
        }
        else if (tickAnim >= 96 && tickAnim < 98) {
            xx = -51.84259 + (((tickAnim - 96) / 2) * (11.4948-(-51.84259)));
            yy = 13.58262 + (((tickAnim - 96) / 2) * (33.09867-(13.58262)));
            zz = -46.96356 + (((tickAnim - 96) / 2) * (-5.18032-(-46.96356)));
        }
        else if (tickAnim >= 98 && tickAnim < 101) {
            xx = 11.4948 + (((tickAnim - 98) / 3) * (9.59051-(11.4948)));
            yy = 33.09867 + (((tickAnim - 98) / 3) * (23.16125-(33.09867)));
            zz = -5.18032 + (((tickAnim - 98) / 3) * (-34.55903-(-5.18032)));
        }
        else if (tickAnim >= 101 && tickAnim < 103) {
            xx = 9.59051 + (((tickAnim - 101) / 2) * (-51.84259-(9.59051)));
            yy = 23.16125 + (((tickAnim - 101) / 2) * (13.58262-(23.16125)));
            zz = -34.55903 + (((tickAnim - 101) / 2) * (-46.96356-(-34.55903)));
        }
        else if (tickAnim >= 103 && tickAnim < 106) {
            xx = -51.84259 + (((tickAnim - 103) / 3) * (11.4948-(-51.84259)));
            yy = 13.58262 + (((tickAnim - 103) / 3) * (33.09867-(13.58262)));
            zz = -46.96356 + (((tickAnim - 103) / 3) * (-5.18032-(-46.96356)));
        }
        else if (tickAnim >= 106 && tickAnim < 108) {
            xx = 11.4948 + (((tickAnim - 106) / 2) * (9.59051-(11.4948)));
            yy = 33.09867 + (((tickAnim - 106) / 2) * (23.16125-(33.09867)));
            zz = -5.18032 + (((tickAnim - 106) / 2) * (-34.55903-(-5.18032)));
        }
        else if (tickAnim >= 108 && tickAnim < 111) {
            xx = 9.59051 + (((tickAnim - 108) / 3) * (-51.84259-(9.59051)));
            yy = 23.16125 + (((tickAnim - 108) / 3) * (13.58262-(23.16125)));
            zz = -34.55903 + (((tickAnim - 108) / 3) * (-46.96356-(-34.55903)));
        }
        else if (tickAnim >= 111 && tickAnim < 113) {
            xx = -51.84259 + (((tickAnim - 111) / 2) * (11.4948-(-51.84259)));
            yy = 13.58262 + (((tickAnim - 111) / 2) * (33.09867-(13.58262)));
            zz = -46.96356 + (((tickAnim - 111) / 2) * (-5.18032-(-46.96356)));
        }
        else if (tickAnim >= 113 && tickAnim < 143) {
            xx = 11.4948 + (((tickAnim - 113) / 30) * (26.94101-(11.4948)));
            yy = 33.09867 + (((tickAnim - 113) / 30) * (13.13564-(33.09867)));
            zz = -5.18032 + (((tickAnim - 113) / 30) * (6.31045-(-5.18032)));
        }
        else if (tickAnim >= 143 && tickAnim < 160) {
            xx = 26.94101 + (((tickAnim - 143) / 17) * (26.94101-(26.94101)));
            yy = 13.13564 + (((tickAnim - 143) / 17) * (13.13564-(13.13564)));
            zz = 6.31045 + (((tickAnim - 143) / 17) * (6.31045-(6.31045)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = 26.94101 + (((tickAnim - 160) / 10) * (22.81621-(26.94101)));
            yy = 13.13564 + (((tickAnim - 160) / 10) * (35.64448-(13.13564)));
            zz = 6.31045 + (((tickAnim - 160) / 10) * (2.76952-(6.31045)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = 22.81621 + (((tickAnim - 170) / 15) * (14.77536-(22.81621)));
            yy = 35.64448 + (((tickAnim - 170) / 15) * (29.32302-(35.64448)));
            zz = 2.76952 + (((tickAnim - 170) / 15) * (-8.32648-(2.76952)));
        }
        else if (tickAnim >= 185 && tickAnim < 195) {
            xx = 14.77536 + (((tickAnim - 185) / 10) * (21.35381-(14.77536)));
            yy = 29.32302 + (((tickAnim - 185) / 10) * (47.19299-(29.32302)));
            zz = -8.32648 + (((tickAnim - 185) / 10) * (0.37586-(-8.32648)));
        }
        else if (tickAnim >= 195 && tickAnim < 202) {
            xx = 21.35381 + (((tickAnim - 195) / 7) * (14.82791-(21.35381)));
            yy = 47.19299 + (((tickAnim - 195) / 7) * (29.56472-(47.19299)));
            zz = 0.37586 + (((tickAnim - 195) / 7) * (-8.24378-(0.37586)));
        }
        else if (tickAnim >= 202 && tickAnim < 208) {
            xx = 14.82791 + (((tickAnim - 202) / 6) * (13.0529-(14.82791)));
            yy = 29.56472 + (((tickAnim - 202) / 6) * (19.12832-(29.56472)));
            zz = -8.24378 + (((tickAnim - 202) / 6) * (-11.3763-(-8.24378)));
        }
        else if (tickAnim >= 208 && tickAnim < 212) {
            xx = 13.0529 + (((tickAnim - 208) / 4) * (16.09316-(13.0529)));
            yy = 19.12832 + (((tickAnim - 208) / 4) * (34.62531-(19.12832)));
            zz = -11.3763 + (((tickAnim - 208) / 4) * (-6.3583-(-11.3763)));
        }
        else if (tickAnim >= 212 && tickAnim < 216) {
            xx = 16.09316 + (((tickAnim - 212) / 4) * (14.82791-(16.09316)));
            yy = 34.62531 + (((tickAnim - 212) / 4) * (29.56472-(34.62531)));
            zz = -6.3583 + (((tickAnim - 212) / 4) * (-8.24378-(-6.3583)));
        }
        else if (tickAnim >= 216 && tickAnim < 223) {
            xx = 14.82791 + (((tickAnim - 216) / 7) * (13.0529-(14.82791)));
            yy = 29.56472 + (((tickAnim - 216) / 7) * (19.12832-(29.56472)));
            zz = -8.24378 + (((tickAnim - 216) / 7) * (-11.3763-(-8.24378)));
        }
        else if (tickAnim >= 223 && tickAnim < 227) {
            xx = 13.0529 + (((tickAnim - 223) / 4) * (16.09316-(13.0529)));
            yy = 19.12832 + (((tickAnim - 223) / 4) * (34.62531-(19.12832)));
            zz = -11.3763 + (((tickAnim - 223) / 4) * (-6.3583-(-11.3763)));
        }
        else if (tickAnim >= 227 && tickAnim < 230) {
            xx = 16.09316 + (((tickAnim - 227) / 3) * (14.82791-(16.09316)));
            yy = 34.62531 + (((tickAnim - 227) / 3) * (29.56472-(34.62531)));
            zz = -6.3583 + (((tickAnim - 227) / 3) * (-8.24378-(-6.3583)));
        }
        else if (tickAnim >= 230 && tickAnim < 237) {
            xx = 14.82791 + (((tickAnim - 230) / 7) * (13.0529-(14.82791)));
            yy = 29.56472 + (((tickAnim - 230) / 7) * (19.12832-(29.56472)));
            zz = -8.24378 + (((tickAnim - 230) / 7) * (-11.3763-(-8.24378)));
        }
        else if (tickAnim >= 237 && tickAnim < 241) {
            xx = 13.0529 + (((tickAnim - 237) / 4) * (16.09316-(13.0529)));
            yy = 19.12832 + (((tickAnim - 237) / 4) * (34.62531-(19.12832)));
            zz = -11.3763 + (((tickAnim - 237) / 4) * (-6.3583-(-11.3763)));
        }
        else if (tickAnim >= 241 && tickAnim < 244) {
            xx = 16.09316 + (((tickAnim - 241) / 3) * (14.82791-(16.09316)));
            yy = 34.62531 + (((tickAnim - 241) / 3) * (29.56472-(34.62531)));
            zz = -6.3583 + (((tickAnim - 241) / 3) * (-8.24378-(-6.3583)));
        }
        else if (tickAnim >= 244 && tickAnim < 251) {
            xx = 14.82791 + (((tickAnim - 244) / 7) * (13.0529-(14.82791)));
            yy = 29.56472 + (((tickAnim - 244) / 7) * (19.12832-(29.56472)));
            zz = -8.24378 + (((tickAnim - 244) / 7) * (-11.3763-(-8.24378)));
        }
        else if (tickAnim >= 251 && tickAnim < 254) {
            xx = 13.0529 + (((tickAnim - 251) / 3) * (16.09316-(13.0529)));
            yy = 19.12832 + (((tickAnim - 251) / 3) * (34.62531-(19.12832)));
            zz = -11.3763 + (((tickAnim - 251) / 3) * (-6.3583-(-11.3763)));
        }
        else if (tickAnim >= 254 && tickAnim < 258) {
            xx = 16.09316 + (((tickAnim - 254) / 4) * (14.82791-(16.09316)));
            yy = 34.62531 + (((tickAnim - 254) / 4) * (29.56472-(34.62531)));
            zz = -6.3583 + (((tickAnim - 254) / 4) * (-8.24378-(-6.3583)));
        }
        else if (tickAnim >= 258 && tickAnim < 265) {
            xx = 14.82791 + (((tickAnim - 258) / 7) * (13.0529-(14.82791)));
            yy = 29.56472 + (((tickAnim - 258) / 7) * (19.12832-(29.56472)));
            zz = -8.24378 + (((tickAnim - 258) / 7) * (-11.3763-(-8.24378)));
        }
        else if (tickAnim >= 265 && tickAnim < 269) {
            xx = 13.0529 + (((tickAnim - 265) / 4) * (16.09316-(13.0529)));
            yy = 19.12832 + (((tickAnim - 265) / 4) * (34.62531-(19.12832)));
            zz = -11.3763 + (((tickAnim - 265) / 4) * (-6.3583-(-11.3763)));
        }
        else if (tickAnim >= 269 && tickAnim < 273) {
            xx = 16.09316 + (((tickAnim - 269) / 4) * (14.82791-(16.09316)));
            yy = 34.62531 + (((tickAnim - 269) / 4) * (29.56472-(34.62531)));
            zz = -6.3583 + (((tickAnim - 269) / 4) * (-8.24378-(-6.3583)));
        }
        else if (tickAnim >= 273 && tickAnim < 283) {
            xx = 14.82791 + (((tickAnim - 273) / 10) * (13.0529-(14.82791)));
            yy = 29.56472 + (((tickAnim - 273) / 10) * (19.12832-(29.56472)));
            zz = -8.24378 + (((tickAnim - 273) / 10) * (-11.3763-(-8.24378)));
        }
        else if (tickAnim >= 283 && tickAnim < 305) {
            xx = 13.0529 + (((tickAnim - 283) / 22) * (11.05731-(13.0529)));
            yy = 19.12832 + (((tickAnim - 283) / 22) * (15.40492-(19.12832)));
            zz = -11.3763 + (((tickAnim - 283) / 22) * (-16.00658-(-11.3763)));
        }
        else if (tickAnim >= 305 && tickAnim < 391) {
            xx = 11.05731 + (((tickAnim - 305) / 86) * (11.05731-(11.05731)));
            yy = 15.40492 + (((tickAnim - 305) / 86) * (15.40492-(15.40492)));
            zz = -16.00658 + (((tickAnim - 305) / 86) * (-16.00658-(-16.00658)));
        }
        else if (tickAnim >= 391 && tickAnim < 405) {
            xx = 11.05731 + (((tickAnim - 391) / 14) * (16.31938-(11.05731)));
            yy = 15.40492 + (((tickAnim - 391) / 14) * (41.93561-(15.40492)));
            zz = -16.00658 + (((tickAnim - 391) / 14) * (-7.81798-(-16.00658)));
        }
        else if (tickAnim >= 405 && tickAnim < 416) {
            xx = 16.31938 + (((tickAnim - 405) / 11) * (22.7327-(16.31938)));
            yy = 41.93561 + (((tickAnim - 405) / 11) * (55.56348-(41.93561)));
            zz = -7.81798 + (((tickAnim - 405) / 11) * (6.60619-(-7.81798)));
        }
        else if (tickAnim >= 416 && tickAnim < 450) {
            xx = 22.7327 + (((tickAnim - 416) / 34) * (0-(22.7327)));
            yy = 55.56348 + (((tickAnim - 416) / 34) * (0-(55.56348)));
            zz = 6.60619 + (((tickAnim - 416) / 34) * (0-(6.60619)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 55) / 3) * (23-(0)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 23 + (((tickAnim - 58) / 2) * (50.25-(23)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 50.25 + (((tickAnim - 60) / 3) * (0-(50.25)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 63) / 2) * (23-(0)));
            yy = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 2) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = 23 + (((tickAnim - 65) / 3) * (50.25-(23)));
            yy = 0 + (((tickAnim - 65) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 3) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = 50.25 + (((tickAnim - 68) / 2) * (0-(50.25)));
            yy = 0 + (((tickAnim - 68) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 2) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 70) / 3) * (23-(0)));
            yy = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = 23 + (((tickAnim - 73) / 2) * (50.25-(23)));
            yy = 0 + (((tickAnim - 73) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 2) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 50.25 + (((tickAnim - 75) / 3) * (0-(50.25)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 78) / 2) * (23-(0)));
            yy = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 2) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = 23 + (((tickAnim - 80) / 3) * (50.25-(23)));
            yy = 0 + (((tickAnim - 80) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 3) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 86) {
            xx = 50.25 + (((tickAnim - 83) / 3) * (0-(50.25)));
            yy = 0 + (((tickAnim - 83) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 3) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 86) / 2) * (23-(0)));
            yy = 0 + (((tickAnim - 86) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 2) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 91) {
            xx = 23 + (((tickAnim - 88) / 3) * (50.25-(23)));
            yy = 0 + (((tickAnim - 88) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 3) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 93) {
            xx = 50.25 + (((tickAnim - 91) / 2) * (0-(50.25)));
            yy = 0 + (((tickAnim - 91) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 2) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 93) / 3) * (23-(0)));
            yy = 0 + (((tickAnim - 93) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 3) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 98) {
            xx = 23 + (((tickAnim - 96) / 2) * (50.25-(23)));
            yy = 0 + (((tickAnim - 96) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 2) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 101) {
            xx = 50.25 + (((tickAnim - 98) / 3) * (0-(50.25)));
            yy = 0 + (((tickAnim - 98) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 3) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 101) / 2) * (23-(0)));
            yy = 0 + (((tickAnim - 101) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 2) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 106) {
            xx = 23 + (((tickAnim - 103) / 3) * (50.25-(23)));
            yy = 0 + (((tickAnim - 103) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 3) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 108) {
            xx = 50.25 + (((tickAnim - 106) / 2) * (0-(50.25)));
            yy = 0 + (((tickAnim - 106) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 2) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 108) / 3) * (23-(0)));
            yy = 0 + (((tickAnim - 108) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 3) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 113) {
            xx = 23 + (((tickAnim - 111) / 2) * (50.25-(23)));
            yy = 0 + (((tickAnim - 111) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 2) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 126) {
            xx = 50.25 + (((tickAnim - 113) / 13) * (0-(50.25)));
            yy = 0 + (((tickAnim - 113) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 13) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 126) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 126) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 34) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 10) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 170) / 15) * (47.6356-(0)));
            yy = 0 + (((tickAnim - 170) / 15) * (-13.28301-(0)));
            zz = 0 + (((tickAnim - 170) / 15) * (1.06293-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 195) {
            xx = 47.6356 + (((tickAnim - 185) / 10) * (19.6356-(47.6356)));
            yy = -13.28301 + (((tickAnim - 185) / 10) * (-13.28301-(-13.28301)));
            zz = 1.06293 + (((tickAnim - 185) / 10) * (1.06293-(1.06293)));
        }
        else if (tickAnim >= 195 && tickAnim < 405) {
            xx = 19.6356 + (((tickAnim - 195) / 210) * (19.6356-(19.6356)));
            yy = -13.28301 + (((tickAnim - 195) / 210) * (-13.28301-(-13.28301)));
            zz = 1.06293 + (((tickAnim - 195) / 210) * (1.06293-(1.06293)));
        }
        else if (tickAnim >= 405 && tickAnim < 450) {
            xx = 19.6356 + (((tickAnim - 405) / 45) * (0-(19.6356)));
            yy = -13.28301 + (((tickAnim - 405) / 45) * (0-(-13.28301)));
            zz = 1.06293 + (((tickAnim - 405) / 45) * (0-(1.06293)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 55) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = -10 + (((tickAnim - 58) / 2) * (15.75-(-10)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 15.75 + (((tickAnim - 60) / 3) * (0-(15.75)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 63) / 2) * (-10-(0)));
            yy = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 2) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = -10 + (((tickAnim - 65) / 3) * (15.75-(-10)));
            yy = 0 + (((tickAnim - 65) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 3) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = 15.75 + (((tickAnim - 68) / 2) * (0-(15.75)));
            yy = 0 + (((tickAnim - 68) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 2) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 70) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = -10 + (((tickAnim - 73) / 2) * (15.75-(-10)));
            yy = 0 + (((tickAnim - 73) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 2) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 15.75 + (((tickAnim - 75) / 3) * (0-(15.75)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 78) / 2) * (-10-(0)));
            yy = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 2) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = -10 + (((tickAnim - 80) / 3) * (15.75-(-10)));
            yy = 0 + (((tickAnim - 80) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 3) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 86) {
            xx = 15.75 + (((tickAnim - 83) / 3) * (0-(15.75)));
            yy = 0 + (((tickAnim - 83) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 3) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 86) / 2) * (-10-(0)));
            yy = 0 + (((tickAnim - 86) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 2) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 91) {
            xx = -10 + (((tickAnim - 88) / 3) * (15.75-(-10)));
            yy = 0 + (((tickAnim - 88) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 3) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 93) {
            xx = 15.75 + (((tickAnim - 91) / 2) * (0-(15.75)));
            yy = 0 + (((tickAnim - 91) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 2) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 93) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 93) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 3) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 98) {
            xx = -10 + (((tickAnim - 96) / 2) * (15.75-(-10)));
            yy = 0 + (((tickAnim - 96) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 2) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 101) {
            xx = 15.75 + (((tickAnim - 98) / 3) * (0-(15.75)));
            yy = 0 + (((tickAnim - 98) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 3) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 101) / 2) * (-10-(0)));
            yy = 0 + (((tickAnim - 101) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 2) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 106) {
            xx = -10 + (((tickAnim - 103) / 3) * (15.75-(-10)));
            yy = 0 + (((tickAnim - 103) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 3) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 108) {
            xx = 15.75 + (((tickAnim - 106) / 2) * (0-(15.75)));
            yy = 0 + (((tickAnim - 106) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 2) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 108) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 108) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 3) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 113) {
            xx = -10 + (((tickAnim - 111) / 2) * (15.75-(-10)));
            yy = 0 + (((tickAnim - 111) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 2) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 126) {
            xx = 15.75 + (((tickAnim - 113) / 13) * (0-(15.75)));
            yy = 0 + (((tickAnim - 113) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 13) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 126) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 126) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 34) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 160) / 25) * (23.75899-(0)));
            yy = 0 + (((tickAnim - 160) / 25) * (-6.16145-(0)));
            zz = 0 + (((tickAnim - 160) / 25) * (13.70269-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 405) {
            xx = 23.75899 + (((tickAnim - 185) / 220) * (23.75899-(23.75899)));
            yy = -6.16145 + (((tickAnim - 185) / 220) * (-6.16145-(-6.16145)));
            zz = 13.70269 + (((tickAnim - 185) / 220) * (13.70269-(13.70269)));
        }
        else if (tickAnim >= 405 && tickAnim < 450) {
            xx = 23.75899 + (((tickAnim - 405) / 45) * (0-(23.75899)));
            yy = -6.16145 + (((tickAnim - 405) / 45) * (0-(-6.16145)));
            zz = 13.70269 + (((tickAnim - 405) / 45) * (0-(13.70269)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 30) / 25) * (9.59051-(0)));
            yy = 0 + (((tickAnim - 30) / 25) * (-23.16125-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (34.55903-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 9.59051 + (((tickAnim - 55) / 3) * (-51.84259-(9.59051)));
            yy = -23.16125 + (((tickAnim - 55) / 3) * (-13.58262-(-23.16125)));
            zz = 34.55903 + (((tickAnim - 55) / 3) * (46.96356-(34.55903)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = -51.84259 + (((tickAnim - 58) / 2) * (-7.04562-(-51.84259)));
            yy = -13.58262 + (((tickAnim - 58) / 2) * (-24.23603-(-13.58262)));
            zz = 46.96356 + (((tickAnim - 58) / 2) * (11.71029-(46.96356)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = -7.04562 + (((tickAnim - 60) / 3) * (9.59051-(-7.04562)));
            yy = -24.23603 + (((tickAnim - 60) / 3) * (-23.16125-(-24.23603)));
            zz = 11.71029 + (((tickAnim - 60) / 3) * (34.55903-(11.71029)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 9.59051 + (((tickAnim - 63) / 2) * (-51.84259-(9.59051)));
            yy = -23.16125 + (((tickAnim - 63) / 2) * (-13.58262-(-23.16125)));
            zz = 34.55903 + (((tickAnim - 63) / 2) * (46.96356-(34.55903)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = -51.84259 + (((tickAnim - 65) / 3) * (-7.04562-(-51.84259)));
            yy = -13.58262 + (((tickAnim - 65) / 3) * (-24.23603-(-13.58262)));
            zz = 46.96356 + (((tickAnim - 65) / 3) * (11.71029-(46.96356)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = -7.04562 + (((tickAnim - 68) / 2) * (9.59051-(-7.04562)));
            yy = -24.23603 + (((tickAnim - 68) / 2) * (-23.16125-(-24.23603)));
            zz = 11.71029 + (((tickAnim - 68) / 2) * (34.55903-(11.71029)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 9.59051 + (((tickAnim - 70) / 3) * (-51.84259-(9.59051)));
            yy = -23.16125 + (((tickAnim - 70) / 3) * (-13.58262-(-23.16125)));
            zz = 34.55903 + (((tickAnim - 70) / 3) * (46.96356-(34.55903)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = -51.84259 + (((tickAnim - 73) / 2) * (-7.04562-(-51.84259)));
            yy = -13.58262 + (((tickAnim - 73) / 2) * (-24.23603-(-13.58262)));
            zz = 46.96356 + (((tickAnim - 73) / 2) * (11.71029-(46.96356)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = -7.04562 + (((tickAnim - 75) / 3) * (9.59051-(-7.04562)));
            yy = -24.23603 + (((tickAnim - 75) / 3) * (-23.16125-(-24.23603)));
            zz = 11.71029 + (((tickAnim - 75) / 3) * (34.55903-(11.71029)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = 9.59051 + (((tickAnim - 78) / 2) * (-51.84259-(9.59051)));
            yy = -23.16125 + (((tickAnim - 78) / 2) * (-13.58262-(-23.16125)));
            zz = 34.55903 + (((tickAnim - 78) / 2) * (46.96356-(34.55903)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = -51.84259 + (((tickAnim - 80) / 3) * (-7.04562-(-51.84259)));
            yy = -13.58262 + (((tickAnim - 80) / 3) * (-24.23603-(-13.58262)));
            zz = 46.96356 + (((tickAnim - 80) / 3) * (11.71029-(46.96356)));
        }
        else if (tickAnim >= 83 && tickAnim < 86) {
            xx = -7.04562 + (((tickAnim - 83) / 3) * (9.59051-(-7.04562)));
            yy = -24.23603 + (((tickAnim - 83) / 3) * (-23.16125-(-24.23603)));
            zz = 11.71029 + (((tickAnim - 83) / 3) * (34.55903-(11.71029)));
        }
        else if (tickAnim >= 86 && tickAnim < 88) {
            xx = 9.59051 + (((tickAnim - 86) / 2) * (-51.84259-(9.59051)));
            yy = -23.16125 + (((tickAnim - 86) / 2) * (-13.58262-(-23.16125)));
            zz = 34.55903 + (((tickAnim - 86) / 2) * (46.96356-(34.55903)));
        }
        else if (tickAnim >= 88 && tickAnim < 91) {
            xx = -51.84259 + (((tickAnim - 88) / 3) * (-7.04562-(-51.84259)));
            yy = -13.58262 + (((tickAnim - 88) / 3) * (-24.23603-(-13.58262)));
            zz = 46.96356 + (((tickAnim - 88) / 3) * (11.71029-(46.96356)));
        }
        else if (tickAnim >= 91 && tickAnim < 93) {
            xx = -7.04562 + (((tickAnim - 91) / 2) * (9.59051-(-7.04562)));
            yy = -24.23603 + (((tickAnim - 91) / 2) * (-23.16125-(-24.23603)));
            zz = 11.71029 + (((tickAnim - 91) / 2) * (34.55903-(11.71029)));
        }
        else if (tickAnim >= 93 && tickAnim < 96) {
            xx = 9.59051 + (((tickAnim - 93) / 3) * (-51.84259-(9.59051)));
            yy = -23.16125 + (((tickAnim - 93) / 3) * (-13.58262-(-23.16125)));
            zz = 34.55903 + (((tickAnim - 93) / 3) * (46.96356-(34.55903)));
        }
        else if (tickAnim >= 96 && tickAnim < 98) {
            xx = -51.84259 + (((tickAnim - 96) / 2) * (-7.04562-(-51.84259)));
            yy = -13.58262 + (((tickAnim - 96) / 2) * (-24.23603-(-13.58262)));
            zz = 46.96356 + (((tickAnim - 96) / 2) * (11.71029-(46.96356)));
        }
        else if (tickAnim >= 98 && tickAnim < 101) {
            xx = -7.04562 + (((tickAnim - 98) / 3) * (9.59051-(-7.04562)));
            yy = -24.23603 + (((tickAnim - 98) / 3) * (-23.16125-(-24.23603)));
            zz = 11.71029 + (((tickAnim - 98) / 3) * (34.55903-(11.71029)));
        }
        else if (tickAnim >= 101 && tickAnim < 103) {
            xx = 9.59051 + (((tickAnim - 101) / 2) * (-51.84259-(9.59051)));
            yy = -23.16125 + (((tickAnim - 101) / 2) * (-13.58262-(-23.16125)));
            zz = 34.55903 + (((tickAnim - 101) / 2) * (46.96356-(34.55903)));
        }
        else if (tickAnim >= 103 && tickAnim < 106) {
            xx = -51.84259 + (((tickAnim - 103) / 3) * (-7.04562-(-51.84259)));
            yy = -13.58262 + (((tickAnim - 103) / 3) * (-24.23603-(-13.58262)));
            zz = 46.96356 + (((tickAnim - 103) / 3) * (11.71029-(46.96356)));
        }
        else if (tickAnim >= 106 && tickAnim < 108) {
            xx = -7.04562 + (((tickAnim - 106) / 2) * (9.59051-(-7.04562)));
            yy = -24.23603 + (((tickAnim - 106) / 2) * (-23.16125-(-24.23603)));
            zz = 11.71029 + (((tickAnim - 106) / 2) * (34.55903-(11.71029)));
        }
        else if (tickAnim >= 108 && tickAnim < 111) {
            xx = 9.59051 + (((tickAnim - 108) / 3) * (-51.84259-(9.59051)));
            yy = -23.16125 + (((tickAnim - 108) / 3) * (-13.58262-(-23.16125)));
            zz = 34.55903 + (((tickAnim - 108) / 3) * (46.96356-(34.55903)));
        }
        else if (tickAnim >= 111 && tickAnim < 113) {
            xx = -51.84259 + (((tickAnim - 111) / 2) * (8.95438-(-51.84259)));
            yy = -13.58262 + (((tickAnim - 111) / 2) * (-24.23603-(-13.58262)));
            zz = 46.96356 + (((tickAnim - 111) / 2) * (11.71029-(46.96356)));
        }
        else if (tickAnim >= 113 && tickAnim < 143) {
            xx = 8.95438 + (((tickAnim - 113) / 30) * (26.94101-(8.95438)));
            yy = -24.23603 + (((tickAnim - 113) / 30) * (-13.13564-(-24.23603)));
            zz = 11.71029 + (((tickAnim - 113) / 30) * (-6.31045-(11.71029)));
        }
        else if (tickAnim >= 143 && tickAnim < 160) {
            xx = 26.94101 + (((tickAnim - 143) / 17) * (26.94101-(26.94101)));
            yy = -13.13564 + (((tickAnim - 143) / 17) * (-13.13564-(-13.13564)));
            zz = -6.31045 + (((tickAnim - 143) / 17) * (-6.31045-(-6.31045)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = 26.94101 + (((tickAnim - 160) / 10) * (14.31508-(26.94101)));
            yy = -13.13564 + (((tickAnim - 160) / 10) * (-20.17475-(-13.13564)));
            zz = -6.31045 + (((tickAnim - 160) / 10) * (-8.25499-(-6.31045)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = 14.31508 + (((tickAnim - 170) / 15) * (18.3962-(14.31508)));
            yy = -20.17475 + (((tickAnim - 170) / 15) * (-22.4193-(-20.17475)));
            zz = -8.25499 + (((tickAnim - 170) / 15) * (-41.23203-(-8.25499)));
        }
        else if (tickAnim >= 185 && tickAnim < 425) {
            xx = 18.3962 + (((tickAnim - 185) / 240) * (-3.93236-(18.3962)));
            yy = -22.4193 + (((tickAnim - 185) / 240) * (-32.53338-(-22.4193)));
            zz = -41.23203 + (((tickAnim - 185) / 240) * (34.49295-(-41.23203)));
        }
        else if (tickAnim >= 425 && tickAnim < 438) {
            xx = -3.93236 + (((tickAnim - 425) / 13) * (21-(-3.93236)));
            yy = -32.53338 + (((tickAnim - 425) / 13) * (-43.25-(-32.53338)));
            zz = 34.49295 + (((tickAnim - 425) / 13) * (0-(34.49295)));
        }
        else if (tickAnim >= 438 && tickAnim < 450) {
            xx = 21 + (((tickAnim - 438) / 12) * (0-(21)));
            yy = -43.25 + (((tickAnim - 438) / 12) * (0-(-43.25)));
            zz = 0 + (((tickAnim - 438) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 55 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 55) / 3) * (23-(0)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 23 + (((tickAnim - 58) / 2) * (50.25-(23)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 50.25 + (((tickAnim - 60) / 3) * (0-(50.25)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 63) / 2) * (23-(0)));
            yy = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 2) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = 23 + (((tickAnim - 65) / 3) * (50.25-(23)));
            yy = 0 + (((tickAnim - 65) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 3) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = 50.25 + (((tickAnim - 68) / 2) * (0-(50.25)));
            yy = 0 + (((tickAnim - 68) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 2) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 70) / 3) * (23-(0)));
            yy = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = 23 + (((tickAnim - 73) / 2) * (50.25-(23)));
            yy = 0 + (((tickAnim - 73) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 2) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 50.25 + (((tickAnim - 75) / 3) * (0-(50.25)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 78) / 2) * (23-(0)));
            yy = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 2) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = 23 + (((tickAnim - 80) / 3) * (50.25-(23)));
            yy = 0 + (((tickAnim - 80) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 3) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 86) {
            xx = 50.25 + (((tickAnim - 83) / 3) * (0-(50.25)));
            yy = 0 + (((tickAnim - 83) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 3) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 86) / 2) * (23-(0)));
            yy = 0 + (((tickAnim - 86) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 2) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 91) {
            xx = 23 + (((tickAnim - 88) / 3) * (50.25-(23)));
            yy = 0 + (((tickAnim - 88) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 3) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 93) {
            xx = 50.25 + (((tickAnim - 91) / 2) * (0-(50.25)));
            yy = 0 + (((tickAnim - 91) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 2) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 93) / 3) * (23-(0)));
            yy = 0 + (((tickAnim - 93) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 3) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 98) {
            xx = 23 + (((tickAnim - 96) / 2) * (50.25-(23)));
            yy = 0 + (((tickAnim - 96) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 2) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 101) {
            xx = 50.25 + (((tickAnim - 98) / 3) * (0-(50.25)));
            yy = 0 + (((tickAnim - 98) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 3) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 101) / 2) * (23-(0)));
            yy = 0 + (((tickAnim - 101) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 2) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 106) {
            xx = 23 + (((tickAnim - 103) / 3) * (50.25-(23)));
            yy = 0 + (((tickAnim - 103) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 3) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 108) {
            xx = 50.25 + (((tickAnim - 106) / 2) * (0-(50.25)));
            yy = 0 + (((tickAnim - 106) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 2) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 108) / 3) * (23-(0)));
            yy = 0 + (((tickAnim - 108) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 3) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 113) {
            xx = 23 + (((tickAnim - 111) / 2) * (50.25-(23)));
            yy = 0 + (((tickAnim - 111) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 2) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 126) {
            xx = 50.25 + (((tickAnim - 113) / 13) * (0-(50.25)));
            yy = 0 + (((tickAnim - 113) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 13) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 126) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 126) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 34) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 10) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 170) / 15) * (2.25-(0)));
            yy = 0 + (((tickAnim - 170) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 15) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 450) {
            xx = 2.25 + (((tickAnim - 185) / 265) * (0-(2.25)));
            yy = 0 + (((tickAnim - 185) / 265) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 265) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 55 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 55) / 3) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = -5.5 + (((tickAnim - 58) / 2) * (50.25-(-5.5)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 50.25 + (((tickAnim - 60) / 3) * (0-(50.25)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 63) / 2) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 2) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = -5.5 + (((tickAnim - 65) / 3) * (50.25-(-5.5)));
            yy = 0 + (((tickAnim - 65) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 3) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = 50.25 + (((tickAnim - 68) / 2) * (0-(50.25)));
            yy = 0 + (((tickAnim - 68) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 2) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 70) / 3) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = -5.5 + (((tickAnim - 73) / 2) * (50.25-(-5.5)));
            yy = 0 + (((tickAnim - 73) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 2) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 50.25 + (((tickAnim - 75) / 3) * (0-(50.25)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 78) / 2) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 2) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = -5.5 + (((tickAnim - 80) / 3) * (50.25-(-5.5)));
            yy = 0 + (((tickAnim - 80) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 3) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 86) {
            xx = 50.25 + (((tickAnim - 83) / 3) * (0-(50.25)));
            yy = 0 + (((tickAnim - 83) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 3) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 86) / 2) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 86) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 2) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 91) {
            xx = -5.5 + (((tickAnim - 88) / 3) * (50.25-(-5.5)));
            yy = 0 + (((tickAnim - 88) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 3) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 93) {
            xx = 50.25 + (((tickAnim - 91) / 2) * (0-(50.25)));
            yy = 0 + (((tickAnim - 91) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 2) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 93) / 3) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 93) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 3) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 98) {
            xx = -5.5 + (((tickAnim - 96) / 2) * (50.25-(-5.5)));
            yy = 0 + (((tickAnim - 96) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 2) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 101) {
            xx = 50.25 + (((tickAnim - 98) / 3) * (0-(50.25)));
            yy = 0 + (((tickAnim - 98) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 3) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 101) / 2) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 101) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 2) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 106) {
            xx = -5.5 + (((tickAnim - 103) / 3) * (50.25-(-5.5)));
            yy = 0 + (((tickAnim - 103) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 3) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 108) {
            xx = 50.25 + (((tickAnim - 106) / 2) * (0-(50.25)));
            yy = 0 + (((tickAnim - 106) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 2) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 108) / 3) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 108) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 3) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 113) {
            xx = -5.5 + (((tickAnim - 111) / 2) * (25.5-(-5.5)));
            yy = 0 + (((tickAnim - 111) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 2) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 126) {
            xx = 25.5 + (((tickAnim - 113) / 13) * (0-(25.5)));
            yy = 0 + (((tickAnim - 113) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 13) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 126) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 126) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 34) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 10) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 170) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 280) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 160 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 160) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 160) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 8) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 174) {
            xx = 0 + (((tickAnim - 168) / 6) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 168) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 6) * (0-(0)));
        }
        else if (tickAnim >= 174 && tickAnim < 177) {
            xx = -15.75 + (((tickAnim - 174) / 3) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 174) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 174) / 3) * (0-(0)));
        }
        else if (tickAnim >= 177 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 177) / 8) * (34.25-(0)));
            yy = 0 + (((tickAnim - 177) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 177) / 8) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 202) {
            xx = 34.25 + (((tickAnim - 185) / 17) * (0-(34.25)));
            yy = 0 + (((tickAnim - 185) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 17) * (0-(0)));
        }
        else if (tickAnim >= 202 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 202) / 8) * (40-(0)));
            yy = 0 + (((tickAnim - 202) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 202) / 8) * (0-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 220) {
            xx = 40 + (((tickAnim - 210) / 10) * (0-(40)));
            yy = 0 + (((tickAnim - 210) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 210) / 10) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 283) {
            xx = 0 + (((tickAnim - 220) / 63) * (0-(0)));
            yy = 0 + (((tickAnim - 220) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 63) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 283) / 22) * (28.5-(0)));
            yy = 0 + (((tickAnim - 283) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 22) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 405) {
            xx = 28.5 + (((tickAnim - 305) / 100) * (0-(28.5)));
            yy = 0 + (((tickAnim - 305) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 305) / 100) * (0-(0)));
        }
        else if (tickAnim >= 405 && tickAnim < 408) {
            xx = 0 + (((tickAnim - 405) / 3) * (-29.18-(0)));
            yy = 0 + (((tickAnim - 405) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 405) / 3) * (0-(0)));
        }
        else if (tickAnim >= 408 && tickAnim < 414) {
            xx = -29.18 + (((tickAnim - 408) / 6) * (23.5-(-29.18)));
            yy = 0 + (((tickAnim - 408) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 408) / 6) * (0-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 425) {
            xx = 23.5 + (((tickAnim - 414) / 11) * (0-(23.5)));
            yy = 0 + (((tickAnim - 414) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 414) / 11) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 438) {
            xx = 0 + (((tickAnim - 425) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 425) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 0) / 168) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 168) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 168) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 177) {
            xx = 0 + (((tickAnim - 168) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 168) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 9) * (0-(0)));
        }
        else if (tickAnim >= 177 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 177) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 177) / 8) * (0.075-(0)));
            zz = 0 + (((tickAnim - 177) / 8) * (0.075-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 202) {
            xx = 0 + (((tickAnim - 185) / 17) * (0-(0)));
            yy = 0.075 + (((tickAnim - 185) / 17) * (0-(0.075)));
            zz = 0.075 + (((tickAnim - 185) / 17) * (0-(0.075)));
        }
        else if (tickAnim >= 202 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 202) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 202) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 202) / 8) * (0.225-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 210) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 210) / 10) * (0-(0)));
            zz = 0.225 + (((tickAnim - 210) / 10) * (0-(0.225)));
        }
        else if (tickAnim >= 220 && tickAnim < 283) {
            xx = 0 + (((tickAnim - 220) / 63) * (0-(0)));
            yy = 0 + (((tickAnim - 220) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 63) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 283) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 283) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 22) * (0.25-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 405) {
            xx = 0 + (((tickAnim - 305) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 305) / 100) * (0-(0)));
            zz = 0.25 + (((tickAnim - 305) / 100) * (0-(0.25)));
        }
        else if (tickAnim >= 405 && tickAnim < 414) {
            xx = 0 + (((tickAnim - 405) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 405) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 405) / 9) * (0.425-(0)));
        }
        else if (tickAnim >= 414 && tickAnim < 438) {
            xx = 0 + (((tickAnim - 414) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 414) / 24) * (0-(0)));
            zz = 0.425 + (((tickAnim - 414) / 24) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(0), rightToes.rotateAngleY + (float) Math.toRadians(0), rightToes.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 370 && tickAnim < 378) {
            xx = 0 + (((tickAnim - 370) / 8) * (16.5-(0)));
            yy = 0 + (((tickAnim - 370) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 370) / 8) * (0-(0)));
        }
        else if (tickAnim >= 378 && tickAnim < 384) {
            xx = 16.5 + (((tickAnim - 378) / 6) * (0-(16.5)));
            yy = 0 + (((tickAnim - 378) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 378) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraYuanyanglong e = (EntityPrehistoricFloraYuanyanglong) entity;
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
