package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCaudipteryx;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCaudipteryx extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer rightToes;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;


    private ModelAnimator animator;

    public ModelCaudipteryx() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 5.6532F, 2.7656F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -4.9719F, -5.3167F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1484F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 38, -4.0F, -0.8F, 0.4F, 7, 2, 7, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -3.5681F, -8.6752F);
        this.root.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2531F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 13, -3.0F, -2.8F, 3.4F, 7, 9, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, -0.072F, 2.5348F);
        this.root.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2094F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 60, 37, -3.0F, 3.6F, -3.1F, 4, 1, 4, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 48, -4.0F, -3.4F, -3.1F, 6, 7, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 0.128F, 2.5348F);
        this.root.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2967F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 54, 54, -4.0F, -3.8F, -3.1F, 6, 2, 5, 0.01F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-2.9F, -1.6208F, 0.2083F);
        this.root.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.2356F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.7F, -3.0F);
        this.rightLeg1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.8203F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 80, -0.8F, -3.0898F, 6.3441F, 0, 9, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 55, -1.3F, -3.0898F, 1.3441F, 3, 9, 5, 0.01F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 4.4264F, -5.2903F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.288F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -4.9F, 1.8F);
        this.rightLeg2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 37, 75, -0.8F, 10.0451F, -3.3785F, 2, 5, 2, -0.01F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 53, 72, -1.3F, 10.0451F, -3.3785F, 3, 1, 3, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 55, 62, -1.3F, 4.0451F, -3.3785F, 3, 6, 3, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.2F, 10.0984F, 2.4698F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.4451F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 2.4F, -5.1F);
        this.rightLeg3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5672F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 73, 43, -0.5F, -5.2386F, 2.1848F, 2, 8, 1, -0.02F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 5.8504F, -4.0212F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.0262F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 2.1806F, 3.2861F);
        this.rightFoot.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1047F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 71, 16, -1.5F, -2.2F, -6.2F, 3, 1, 3, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, -0.1531F, -2.6972F);
        this.rightFoot.addChild(rightToes);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 2.1351F, 4.0938F);
        this.rightToes.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1047F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 73, 33, -1.5F, -2.2F, -6.2F, 3, 1, 2, -0.01F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(2.9F, -1.6208F, 0.2083F);
        this.root.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.2356F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.7F, -3.0F);
        this.leftLeg1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.8203F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 80, 0.8F, -3.0898F, 6.3441F, 0, 9, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 21, 55, -1.7F, -3.0898F, 1.3441F, 3, 9, 5, 0.01F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 4.4264F, -5.2903F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.288F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -4.9F, 1.8F);
        this.leftLeg2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 37, 75, -1.2F, 10.0451F, -3.3785F, 2, 5, 2, -0.01F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 53, 72, -1.7F, 10.0451F, -3.3785F, 3, 1, 3, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 55, 62, -1.7F, 4.0451F, -3.3785F, 3, 6, 3, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.2F, 10.0984F, 2.4698F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.4451F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 2.4F, -5.1F);
        this.leftLeg3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.5672F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 73, 43, -1.5F, -5.2386F, 2.1848F, 2, 8, 1, -0.02F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 5.8504F, -4.0212F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.0262F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.1806F, 3.2861F);
        this.leftFoot.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1047F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 71, 16, -1.5F, -2.2F, -6.2F, 3, 1, 3, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, -0.1531F, -2.6972F);
        this.leftFoot.addChild(leftToes);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 2.1351F, 4.0938F);
        this.leftToes.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1047F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 73, 33, -1.5F, -2.2F, -6.2F, 3, 1, 2, -0.01F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -4.972F, 4.1348F);
        this.root.addChild(tail1);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 5.1F, -0.9F);
        this.tail1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1047F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 68, 69, -2.0F, 0.9F, -0.8F, 3, 1, 4, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 56, 28, -2.5F, -3.1F, -0.4F, 4, 4, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 2.9F, 2.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.2618F, 0.0F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 1.6F, -3.3F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2793F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 75, -1.0F, -0.7F, 2.6F, 1, 1, 4, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 68, 62, -2.0F, -2.7F, 2.6F, 3, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.01F, 1.4892F, 3.2371F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1309F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.01F, 1.382F, 4.9816F);
        this.tail3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2457F, -0.1022F, -0.4065F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, -5.0F, 0.0F, -5.5F, 5, 0, 12, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.01F, 1.382F, 4.9816F);
        this.tail3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2457F, 0.1022F, 0.4065F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, 0.0F, 0.0F, -5.5F, 5, 0, 12, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.01F, 1.5413F, 5.4475F);
        this.tail3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.5934F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 29, 38, -4.5F, 0.0F, 0.0F, 9, 0, 6, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.99F, 0.4991F, -9.6414F);
        this.tail3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.2967F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 26, 70, 1.0F, -2.7441F, 8.7299F, 0, 1, 5, -0.005F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 67, 0.5F, -3.7441F, 8.7299F, 1, 1, 6, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -4.5F, -4.9F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, -0.0436F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.5F, 1.9319F, -3.7752F);
        this.chest.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.5498F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 64, 6, -1.0F, 2.4F, 5.7F, 5, 2, 1, 0.01F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 29, 45, -1.5F, 2.4F, -1.3F, 6, 2, 7, 0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, 0.9319F, -3.7752F);
        this.chest.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0785F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 56, 10, -4.0F, 5.3F, 1.5F, 6, 1, 4, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 29, -4.0F, 4.3F, -0.5F, 6, 1, 6, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 35, 0, -4.0F, 3.3F, -2.5F, 6, 1, 8, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 27, 13, -4.0F, -1.7F, -2.5F, 6, 5, 8, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, 0.9319F, -3.7752F);
        this.chest.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0436F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 27, 27, -4.0F, -2.2F, -2.5F, 6, 2, 8, 0.01F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 1.0224F, -5.228F);
        this.chest.addChild(neck1);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 1.162F, -2.926F);
        this.neck1.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.8465F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 60, -2.0F, -1.2762F, -1.1567F, 4, 2, 4, 0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -1.338F, -3.426F);
        this.neck1.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1134F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 64, 0, -2.0F, -0.7696F, 0.6685F, 4, 1, 4, 0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -1.338F, -3.426F);
        this.neck1.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.4102F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 56, 45, -2.0F, -1.2696F, 0.6685F, 4, 3, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.2942F, -1.8687F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.0262F, 0.0F, 0.0F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, 1.2018F, -4.475F);
        this.neck2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -1.0908F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 71, 21, -1.0F, -2.7849F, -1.2774F, 3, 1, 3, 0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, 0.2018F, -4.475F);
        this.neck2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.9512F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 38, 68, -1.0F, -3.9478F, -0.0325F, 3, 2, 4, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.3006F, -1.582F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2094F, 0.0F, 0.0F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -2.2015F, -0.8104F);
        this.neck3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -1.1956F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 77, 11, -1.0F, -0.5F, -0.5F, 2, 1, 3, 0.003F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -2.6383F, -2.9991F);
        this.neck3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -1.0908F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 66, 75, -1.0F, -1.9398F, 0.8981F, 2, 2, 3, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -2.6383F, -2.9991F);
        this.neck3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -1.1956F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 76, 53, -1.0F, -0.7398F, 0.7981F, 2, 1, 3, 0.03F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -2.9966F, -1.2244F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.2618F, 0.0F, 0.0F);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 1.4078F, -6.0035F);
        this.neck4.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.5236F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 76, 58, -1.0F, -3.5776F, 2.3871F, 2, 1, 2, -0.05F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -0.3854F, -2.0971F);
        this.neck4.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -1.0908F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 64, 81, -1.0F, -2.2116F, -0.0155F, 2, 1, 2, 0.005F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -0.3854F, -2.0971F);
        this.neck4.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.9163F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 46, 77, -1.0F, -1.4116F, 0.0845F, 2, 2, 2, -0.02F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -1.0274F, -0.9615F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, -0.0785F, 0.0F, 0.0F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.5F, 1.4527F, -3.1883F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.7243F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 42, 10, -1.0F, -1.1928F, 0.5702F, 2, 1, 1, -0.01F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.0F, 1.247F, -5.0418F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.4887F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 80, 42, -1.0F, -0.2062F, -0.3884F, 1, 1, 3, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.5F, 1.402F, -4.1315F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.2356F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 83, 68, -0.5F, -0.3F, -0.9F, 1, 1, 1, -0.04F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 23, 83, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.005F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.5F, 2.0307F, -2.8879F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.7854F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 35, 10, -1.0F, -1.1F, -0.8F, 2, 1, 1, -0.06F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.5F, -0.1215F, 0.0771F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0873F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 80, 47, -1.0F, 0.5856F, -3.6413F, 2, 1, 2, 0.0F, false));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 49, 10, -1.0F, -0.0144F, -3.6413F, 2, 1, 1, -0.005F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.5F, 0.1047F, 0.0899F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.2793F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 81, 0, -1.0F, -0.8231F, -1.3414F, 2, 1, 2, 0.01F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.5F, 0.1047F, 0.0899F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.0524F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 30, 83, -1.0F, -0.4231F, -0.9414F, 2, 2, 1, -0.005F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.5F, -0.5511F, -2.8699F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.3054F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 81, -1.0F, 0.0769F, 0.0586F, 2, 1, 2, 0.02F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.5F, 0.1F, 0.0F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.0524F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 55, 77, -1.0F, -0.4231F, -2.8414F, 2, 2, 2, -0.005F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.25F, 1.5453F, -1.5103F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.4102F, 0.0F, 0.0F);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.25F, -0.1913F, -1.479F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.8116F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 83, 65, 0.0F, -0.1F, -2.5F, 1, 1, 1, -0.015F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.25F, 0.1507F, -1.7173F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.6632F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 83, 62, 0.0F, 0.0F, -1.1F, 1, 1, 1, -0.01F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.75F, -0.5F, 0.4F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.2967F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 77, 75, 0.0F, -0.7F, -1.7F, 2, 2, 2, -0.05F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.75F, -0.5F, 0.4F);
        this.jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.2269F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 77, 80, 0.0F, 0.2F, -2.3F, 2, 1, 2, -0.02F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.25F, 0.7011F, -0.3693F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, 0.3927F, 0.0F, 0.0F);


        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 0.1888F, -3.1624F);
        this.throat.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.5236F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 77, 6, -1.0F, -2.6776F, 2.5871F, 2, 1, 3, -0.03F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.5F, 0.5877F, -2.7833F);
        this.head.addChild(eye);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.7F, 0.0F, 0.0F);
        this.eye.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.1134F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 37, 83, -0.4F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 15, 67, 0.8F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-2.9919F, 2.7226F, -4.8899F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.0F, -0.1745F, 0.1309F);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.3885F, 0.5154F, -2.0454F);
        this.rightArm1.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.1222F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 56, 16, -0.2791F, -3.5601F, 1.6324F, 0, 4, 7, 0.0F, true));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 73, 26, -0.4791F, -1.5601F, 1.6324F, 1, 2, 4, 0.0F, true));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-0.8885F, 1.1388F, -3.5325F);
        this.rightArm1.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.6632F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 46, 82, 0.0209F, -4.2189F, 2.7281F, 1, 2, 2, -0.02F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.1655F, 1.0727F, 3.0046F);
        this.rightArm1.addChild(rightArm2);


        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-0.554F, -0.2573F, -5.05F);
        this.rightArm2.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.7941F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 15, 70, -0.2791F, 3.3072F, 0.5708F, 0, 4, 5, -0.01F, true));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 11, 80, -0.4791F, 3.3072F, 0.5708F, 1, 1, 3, -0.01F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-1.2033F, 2.2394F, -5.8218F);
        this.rightArm2.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 1.1257F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 77, 37, 0.1702F, 2.6117F, 1.9994F, 1, 1, 3, -0.03F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.0096F, 1.6101F, -2.3894F);
        this.rightArm2.addChild(rightArm3);


        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-1.2887F, 0.0522F, -2.4774F);
        this.rightArm3.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 2.1031F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 53, 82, 0.8652F, 2.0861F, -4.3828F, 0, 1, 3, 0.0F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-1.2887F, 0.0522F, -2.4774F);
        this.rightArm3.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 1.946F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 38, 55, 0.6652F, 2.6893F, -8.9661F, 0, 4, 8, 0.0F, true));
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 26, 77, 0.7652F, 2.1893F, -4.9661F, 0, 1, 4, 0.0F, true));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(-0.7235F, 0.336F, 0.3199F);
        this.rightArm3.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 1.5446F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 21, 48, 0.0F, -0.5F, -2.6F, 0, 1, 3, 0.0F, true));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(2.9919F, 2.7226F, -4.8899F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.0F, 0.1745F, -0.1309F);


        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.3885F, 0.5154F, -2.0454F);
        this.leftArm1.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.1222F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 56, 16, 0.2791F, -3.5601F, 1.6324F, 0, 4, 7, 0.0F, false));
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 73, 26, -0.5209F, -1.5601F, 1.6324F, 1, 2, 4, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.8885F, 1.1388F, -3.5325F);
        this.leftArm1.addChild(cube_r58);
        this.setRotateAngle(cube_r58, -0.6632F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 46, 82, -1.0209F, -4.2189F, 2.7281F, 1, 2, 2, -0.02F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.1655F, 1.0727F, 3.0046F);
        this.leftArm1.addChild(leftArm2);


        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.554F, -0.2573F, -5.05F);
        this.leftArm2.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.7941F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 15, 70, 0.2791F, 3.3072F, 0.5708F, 0, 4, 5, -0.01F, false));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 11, 80, -0.5209F, 3.3072F, 0.5708F, 1, 1, 3, -0.01F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(1.2033F, 2.2394F, -5.8218F);
        this.leftArm2.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 1.1257F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 77, 37, -1.1702F, 2.6117F, 1.9994F, 1, 1, 3, -0.03F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0096F, 1.6101F, -2.3894F);
        this.leftArm2.addChild(leftArm3);


        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(1.2887F, 0.0522F, -2.4774F);
        this.leftArm3.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 2.1031F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 53, 82, -0.8652F, 2.0861F, -4.3828F, 0, 1, 3, 0.0F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(1.2887F, 0.0522F, -2.4774F);
        this.leftArm3.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 1.946F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 38, 55, -0.6652F, 2.6893F, -8.9661F, 0, 4, 8, 0.0F, false));
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 26, 77, -0.7652F, 2.1893F, -4.9661F, 0, 1, 4, 0.0F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(0.7235F, 0.336F, 0.3199F);
        this.leftArm3.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 1.5446F, 0.0F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 21, 48, 0.0F, -0.5F, -2.6F, 0, 1, 3, 0.0F, false));

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

        EntityPrehistoricFloraCaudipteryx entityCaudipteryx = (EntityPrehistoricFloraCaudipteryx) e;

        this.faceTarget(f3, f4, 12, neck1);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, neck3);
        this.faceTarget(f3, f4, 12, neck4);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityCaudipteryx.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityCaudipteryx.getAnimation() == entityCaudipteryx.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        } else {
            if (!entityCaudipteryx.isReallyInWater()) {

                if (f3 == 0.0F || !entityCaudipteryx.getIsMoving()) {
                    if (entityCaudipteryx.getAnimation() != entityCaudipteryx.EAT_ANIMATION
                            && entityCaudipteryx.getAnimation() != entityCaudipteryx.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityCaudipteryx.getIsFast()) { //Running


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
        EntityPrehistoricFloraCaudipteryx ee = (EntityPrehistoricFloraCaudipteryx) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCaudipteryx entity = (EntityPrehistoricFloraCaudipteryx) entitylivingbaseIn;
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
            xx = 24.5 + (((tickAnim - 30) / 3) * (13.05165-(24.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (-2.24805-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (-0.91145-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 13.05165 + (((tickAnim - 33) / 1) * (10.1948-(13.05165)));
            yy = -2.24805 + (((tickAnim - 33) / 1) * (-2.90963-(-2.24805)));
            zz = -0.91145 + (((tickAnim - 33) / 1) * (-1.05162-(-0.91145)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = 10.1948 + (((tickAnim - 34) / 2) * (4.48675-(10.1948)));
            yy = -2.90963 + (((tickAnim - 34) / 2) * (-4.52714-(-2.90963)));
            zz = -1.05162 + (((tickAnim - 34) / 2) * (-0.91092-(-1.05162)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 4.48675 + (((tickAnim - 36) / 2) * (-0.79758-(4.48675)));
            yy = -4.52714 + (((tickAnim - 36) / 2) * (-6.7399-(-4.52714)));
            zz = -0.91092 + (((tickAnim - 36) / 2) * (0.12423-(-0.91092)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -0.79758 + (((tickAnim - 38) / 2) * (7.77612-(-0.79758)));
            yy = -6.7399 + (((tickAnim - 38) / 2) * (-10.91499-(-6.7399)));
            zz = 0.12423 + (((tickAnim - 38) / 2) * (-0.38156-(0.12423)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 7.77612 + (((tickAnim - 40) / 3) * (16.69721-(7.77612)));
            yy = -10.91499 + (((tickAnim - 40) / 3) * (-14.3829-(-10.91499)));
            zz = -0.38156 + (((tickAnim - 40) / 3) * (-2.92764-(-0.38156)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 16.69721 + (((tickAnim - 43) / 2) * (25.83778-(16.69721)));
            yy = -14.3829 + (((tickAnim - 43) / 2) * (-17.347-(-14.3829)));
            zz = -2.92764 + (((tickAnim - 43) / 2) * (-6.36498-(-2.92764)));
        }
        else if (tickAnim >= 45 && tickAnim < 105) {
            xx = 25.83778 + (((tickAnim - 45) / 60) * (25.83778-(25.83778)));
            yy = -17.347 + (((tickAnim - 45) / 60) * (-17.347-(-17.347)));
            zz = -6.36498 + (((tickAnim - 45) / 60) * (-6.36498-(-6.36498)));
        }
        else if (tickAnim >= 105 && tickAnim < 113) {
            xx = 25.83778 + (((tickAnim - 105) / 8) * (12.63109-(25.83778)));
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
            xx = 7 + (((tickAnim - 30) / 8) * (3-(7)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 105) {
            xx = 3 + (((tickAnim - 38) / 67) * (3-(3)));
            yy = 0 + (((tickAnim - 38) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 67) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 3 + (((tickAnim - 105) / 15) * (0-(3)));
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
            yy = 0.675 + (((tickAnim - 30) / 8) * (0.505-(0.675)));
            zz = 0.55 + (((tickAnim - 30) / 8) * (0.55-(0.55)));
        }
        else if (tickAnim >= 38 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 38) / 67) * (0-(0)));
            yy = 0.505 + (((tickAnim - 38) / 67) * (0.505-(0.505)));
            zz = 0.55 + (((tickAnim - 38) / 67) * (0.55-(0.55)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            yy = 0.505 + (((tickAnim - 105) / 15) * (0-(0.505)));
            zz = 0.55 + (((tickAnim - 105) / 15) * (0-(0.55)));
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

       
    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCaudipteryx entity = (EntityPrehistoricFloraCaudipteryx) entitylivingbaseIn;
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


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCaudipteryx entity = (EntityPrehistoricFloraCaudipteryx) entitylivingbaseIn;
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
            xx = 0 + (((tickAnim - 0) / 15) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -8.25 + (((tickAnim - 15) / 15) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -8.25 + (((tickAnim - 30) / 8) * (-19.44-(-8.25)));
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


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCaudipteryx entity = (EntityPrehistoricFloraCaudipteryx) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -3.5 + (((tickAnim - 13) / 5) * (1-(-3.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 1 + (((tickAnim - 18) / 9) * (-5.5-(1)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -5.5 + (((tickAnim - 27) / 13) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(0);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(0);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -9.5 + (((tickAnim - 13) / 5) * (-19.75-(-9.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = -19.75 + (((tickAnim - 18) / 9) * (-1.75-(-19.75)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -1.75 + (((tickAnim - 27) / 13) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.15-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.45 + (((tickAnim - 13) / 5) * (-0.9-(-0.45)));
            zz = 0.15 + (((tickAnim - 13) / 5) * (0.45-(0.15)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            yy = -0.9 + (((tickAnim - 18) / 9) * (0-(-0.9)));
            zz = 0.45 + (((tickAnim - 18) / 9) * (0-(0.45)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -3.25 + (((tickAnim - 18) / 22) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
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



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = -13.75 + (((tickAnim - 13) / 27) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 27) * (0-(0)));
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



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -12.25 + (((tickAnim - 13) / 5) * (-1-(-12.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = -1 + (((tickAnim - 18) / 9) * (-16.25-(-1)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -16.25 + (((tickAnim - 27) / 13) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (42.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 42.25 + (((tickAnim - 13) / 5) * (24.5-(42.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 24.5 + (((tickAnim - 18) / 5) * (0-(24.5)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (42.25-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 42.25 + (((tickAnim - 27) / 6) * (0-(42.25)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCaudipteryx entity = (EntityPrehistoricFloraCaudipteryx) entitylivingbaseIn;
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


    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCaudipteryx entity = (EntityPrehistoricFloraCaudipteryx) entitylivingbaseIn;
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
        else if (tickAnim >= 111 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 111) / 6) * (0-(0)));
            yy = 2.98 + (((tickAnim - 111) / 6) * (0-(2.98)));
            zz = 1.86 + (((tickAnim - 111) / 6) * (0-(1.86)));
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


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCaudipteryx entity = (EntityPrehistoricFloraCaudipteryx) entitylivingbaseIn;
        int animCycle = 13;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-50))*6), root.rotateAngleY + (float) Math.toRadians(0), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*549+50))*4));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-80))*1.8);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5))*2);


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
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(-0.525+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-50))*0.2);
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



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 39.3717 + (((tickAnim - 0) / 7) * (-16.29055-(39.3717)));
            yy = 4.17452 + (((tickAnim - 0) / 7) * (-1.9367-(4.17452)));
            zz = -1.60356 + (((tickAnim - 0) / 7) * (2.30513-(-1.60356)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -16.29055 + (((tickAnim - 7) / 6) * (39.3717-(-16.29055)));
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
            xx = 14.75 + (((tickAnim - 0) / 7) * (-26-(14.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -26 + (((tickAnim - 7) / 6) * (14.75-(-26)));
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
            yy = 1.025 + (((tickAnim - 0) / 3) * (1.4-(1.025)));
            zz = 0.475 + (((tickAnim - 0) / 3) * (0.7-(0.475)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.4 + (((tickAnim - 3) / 2) * (1.4-(1.4)));
            zz = 0.7 + (((tickAnim - 3) / 2) * (0.7-(0.7)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 1.4 + (((tickAnim - 5) / 2) * (1.1-(1.4)));
            zz = 0.7 + (((tickAnim - 5) / 2) * (0.425-(0.7)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.1 + (((tickAnim - 7) / 1) * (2.5-(1.1)));
            zz = 0.425 + (((tickAnim - 7) / 1) * (1.35-(0.425)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 2.5 + (((tickAnim - 8) / 0) * (1.625-(2.5)));
            zz = 1.35 + (((tickAnim - 8) / 0) * (0.75-(1.35)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.625 + (((tickAnim - 8) / 1) * (-0.1-(1.625)));
            zz = 0.75 + (((tickAnim - 8) / 1) * (-0.025-(0.75)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 9) / 1) * (-0.03-(-0.1)));
            zz = -0.025 + (((tickAnim - 9) / 1) * (0.07-(-0.025)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = -0.03 + (((tickAnim - 10) / 1) * (-0.125-(-0.03)));
            zz = 0.07 + (((tickAnim - 10) / 1) * (-0.155-(0.07)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = -0.125 + (((tickAnim - 11) / 1) * (0.92-(-0.125)));
            zz = -0.155 + (((tickAnim - 11) / 1) * (0.775-(-0.155)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.92 + (((tickAnim - 12) / 1) * (1.025-(0.92)));
            zz = 0.775 + (((tickAnim - 12) / 1) * (0.475-(0.775)));
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




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -16.29055 + (((tickAnim - 0) / 6) * (39.3717-(-16.29055)));
            yy = -1.9367 + (((tickAnim - 0) / 6) * (-4.17452-(-1.9367)));
            zz = 2.30513 + (((tickAnim - 0) / 6) * (1.60356-(2.30513)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 39.3717 + (((tickAnim - 6) / 7) * (-16.29055-(39.3717)));
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
            xx = -26 + (((tickAnim - 0) / 6) * (15.75-(-26)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 15.75 + (((tickAnim - 6) / 7) * (-26-(15.75)));
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
            xx = 20.12313 + (((tickAnim - 0) / 2) * (-16.2889-(20.12313)));
            yy = 2.40417 + (((tickAnim - 0) / 2) * (-1.85766-(2.40417)));
            zz = -6.04081 + (((tickAnim - 0) / 2) * (-6.22999-(-6.04081)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -16.2889 + (((tickAnim - 2) / 1) * (37.42-(-16.2889)));
            yy = -1.85766 + (((tickAnim - 2) / 1) * (0-(-1.85766)));
            zz = -6.22999 + (((tickAnim - 2) / 1) * (0-(-6.22999)));
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
            xx = 64.88 + (((tickAnim - 12) / 1) * (20.12313-(64.88)));
            yy = 0 + (((tickAnim - 12) / 1) * (2.40417-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (-6.04081-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.9 + (((tickAnim - 0) / 1) * (2.36-(0.9)));
            zz = 0.35 + (((tickAnim - 0) / 1) * (0.83-(0.35)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 2.36 + (((tickAnim - 1) / 1) * (1.425-(2.36)));
            zz = 0.83 + (((tickAnim - 1) / 1) * (0.7-(0.83)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.425 + (((tickAnim - 2) / 1) * (0.65-(1.425)));
            zz = 0.7 + (((tickAnim - 2) / 1) * (0.3-(0.7)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.65 + (((tickAnim - 3) / 0) * (-0.2-(0.65)));
            zz = 0.3 + (((tickAnim - 3) / 0) * (-0.325-(0.3)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 3) / 3) * (0.875-(-0.2)));
            zz = -0.325 + (((tickAnim - 3) / 3) * (0.4-(-0.325)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.875 + (((tickAnim - 6) / 2) * (1.09-(0.875)));
            zz = 0.4 + (((tickAnim - 6) / 2) * (0.62-(0.4)));
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
            yy = 1.4 + (((tickAnim - 12) / 1) * (0.9-(1.4)));
            zz = 0.7 + (((tickAnim - 12) / 1) * (0.35-(0.7)));
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



        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(-0.1543+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-170))*10), rightArm1.rotateAngleY + (float) Math.toRadians(-15.24246), rightArm1.rotateAngleZ + (float) Math.toRadians(-0.5048+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*549+150))*-4));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-0.0833+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-100))*-15), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(-0.3207+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*549+150))*-4));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(-0.1543+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-170))*10), leftArm1.rotateAngleY + (float) Math.toRadians(15.24246), leftArm1.rotateAngleZ + (float) Math.toRadians(-0.5048+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*549+150))*-4));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-0.0833+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-100))*-15), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(-0.3207+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*549+150))*4));


        this.eye.setScale((float)1,(float)(0.92+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5))*0.1),(float)1);

       
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCaudipteryx entity = (EntityPrehistoricFloraCaudipteryx) entitylivingbaseIn;
        int animCycle = 22;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+50))*3), root.rotateAngleY + (float) Math.toRadians(0), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+80))*3));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-70))*-0.5);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-50))*0.5);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5))*2), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+80))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-50))*4), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+80))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-100))*7), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+80))*3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+100))*-4), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+120))*-4));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+150))*6), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+120))*-4));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+200))*-7), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+150))*5));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(-0.3);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+250))*6), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(-0.15);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0);


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+300))*-9), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+300))*8), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+200))*1));



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
            xx = 15 + (((tickAnim - 0) / 12) * (-29.5-(15)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = -29.5 + (((tickAnim - 12) / 11) * (15-(-29.5)));
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
            xx = -12.3 + (((tickAnim - 10) / 2) * (30.25-(-12.3)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 30.25 + (((tickAnim - 12) / 11) * (0-(30.25)));
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
            xx = 64.61 + (((tickAnim - 10) / 2) * (12.73728-(64.61)));
            yy = 0 + (((tickAnim - 10) / 2) * (-0.36571-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (3.98327-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 12.73728 + (((tickAnim - 12) / 3) * (-7.5-(12.73728)));
            yy = -0.36571 + (((tickAnim - 12) / 3) * (0-(-0.36571)));
            zz = 3.98327 + (((tickAnim - 12) / 3) * (0-(3.98327)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -7.5 + (((tickAnim - 15) / 3) * (23.83-(-7.5)));
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


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.875-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (1.425-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.875 + (((tickAnim - 3) / 2) * (2.175-(1.875)));
            zz = 1.425 + (((tickAnim - 3) / 2) * (1.35-(1.425)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 2.175 + (((tickAnim - 5) / 7) * (0.475-(2.175)));
            zz = 1.35 + (((tickAnim - 5) / 7) * (0.175-(1.35)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.475 + (((tickAnim - 12) / 1) * (1.39-(0.475)));
            zz = 0.175 + (((tickAnim - 12) / 1) * (0.62-(0.175)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.39 + (((tickAnim - 13) / 2) * (1.835-(1.39)));
            zz = 0.62 + (((tickAnim - 13) / 2) * (0.925-(0.62)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 1.835 + (((tickAnim - 15) / 3) * (1.865-(1.835)));
            zz = 0.925 + (((tickAnim - 15) / 3) * (0.845-(0.925)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 1.865 + (((tickAnim - 18) / 5) * (0-(1.865)));
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
            xx = -29.5 + (((tickAnim - 0) / 13) * (15-(-29.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 15 + (((tickAnim - 13) / 10) * (-29.5-(15)));
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
            xx = 30.25 + (((tickAnim - 0) / 13) * (0-(30.25)));
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
            xx = -12.3 + (((tickAnim - 21) / 2) * (30.25-(-12.3)));
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
            xx = 12.73728 + (((tickAnim - 0) / 3) * (1.63-(12.73728)));
            yy = 0.36571 + (((tickAnim - 0) / 3) * (0-(0.36571)));
            zz = -3.98327 + (((tickAnim - 0) / 3) * (0-(-3.98327)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.63 + (((tickAnim - 3) / 2) * (-3.25-(1.63)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -3.25 + (((tickAnim - 5) / 2) * (13.54-(-3.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 13.54 + (((tickAnim - 7) / 1) * (23.83-(13.54)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
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
            xx = 64.61 + (((tickAnim - 21) / 2) * (12.73728-(64.61)));
            yy = 0 + (((tickAnim - 21) / 2) * (0.36571-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (-3.98327-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 0) / 3) * (1.765-(0.175)));
            zz = 0.175 + (((tickAnim - 0) / 3) * (0.52-(0.175)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.765 + (((tickAnim - 3) / 2) * (1.835-(1.765)));
            zz = 0.52 + (((tickAnim - 3) / 2) * (0.825-(0.52)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 1.835 + (((tickAnim - 5) / 2) * (1.93-(1.835)));
            zz = 0.825 + (((tickAnim - 5) / 2) * (0.64-(0.825)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.93 + (((tickAnim - 7) / 1) * (1.38-(1.93)));
            zz = 0.64 + (((tickAnim - 7) / 1) * (1.085-(0.64)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 1.38 + (((tickAnim - 8) / 5) * (0.55-(1.38)));
            zz = 1.085 + (((tickAnim - 8) / 5) * (0.425-(1.085)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.55 + (((tickAnim - 13) / 2) * (2.21-(0.55)));
            zz = 0.425 + (((tickAnim - 13) / 2) * (1.505-(0.425)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 2.21 + (((tickAnim - 15) / 2) * (1.975-(2.21)));
            zz = 1.505 + (((tickAnim - 15) / 2) * (1.1-(1.505)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 1.975 + (((tickAnim - 17) / 6) * (0.175-(1.975)));
            zz = 1.1 + (((tickAnim - 17) / 6) * (0.175-(1.1)));
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



        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+120))*-2), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+200))*4), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+120))*-2), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+200))*4), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCaudipteryx e = (EntityPrehistoricFloraCaudipteryx) entity;
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
